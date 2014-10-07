package chanedi.generator;

import chanedi.generator.exception.ConfigException;
import chanedi.generator.model.Bean;
import chanedi.generator.model.Generate;
import chanedi.generator.model.Module;
import chanedi.util.FileUtils;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Chanedi
 */
public class FilesGenerator {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Getter
    private GlobalConfig globalConfig;
    private List<Module> modules;
    private List<TemplateRoot> templateRoots;
    private Generate generate;

    public FilesGenerator() {
        globalConfig = GlobalConfig.getInstance();
        modules = new ArrayList<Module>();
        templateRoots = new ArrayList<TemplateRoot>();
        generate = Generate.getInstance();
    }

    public void process() throws ConfigException {
        parseModule();
        parseTmpl();
        generate();
    }

    public void parseModule() throws ConfigException {
        File sqlDir = globalConfig.getInputSqlFile();
        if (!sqlDir.isDirectory()) {
            throw new ConfigException("inputSqlPath", "路径必须是目录！");
        }
        File[] files = sqlDir.listFiles();
        for (File sqlFile : files) {
            if (!FileUtils.getFileExtension(sqlFile).equals("sql")) {
                continue;
            }
            Module module = null;
            try {
                module = new Module(sqlFile, globalConfig);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            modules.add(module);
        }
    }

    public void parseTmpl() throws ConfigException {
        File tmplDir = globalConfig.getTmplFile();
        if (!tmplDir.isDirectory()) {
            throw new ConfigException("tmplPath", "路径必须是目录！");
        }
        File[] rootDirs = tmplDir.listFiles();
        for (File rootDir : rootDirs) {
            if (!rootDir.isDirectory()) {
                continue;
            }
            TemplateRoot templateRoot = null;
            try {
                templateRoot = new TemplateRoot(rootDir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            templateRoots.add(templateRoot);
        }
    }

    public void generate() throws ConfigException {
        Configuration cfg = new Configuration();
        File tmplDir = globalConfig.getTmplFile();
        try {
            cfg.setDirectoryForTemplateLoading(tmplDir);
        } catch (IOException e) {
            throw new ConfigException("tmplPath", e);
        }
        cfg.setObjectWrapper(new DefaultObjectWrapper());
        for (Module module : modules) {
            for (Bean bean : module.getBeans()) {
                Map dataMap = new HashMap();
                dataMap.put("bean", bean);
                dataMap.put("module", module);
                dataMap.put("generate", generate);

                generate(cfg, dataMap);
            }

        }
    }

    private void generate(Configuration cfg, Map dataMap) {
        for (TemplateRoot templateRoot : templateRoots) {
            List<String> templateNames = templateRoot.getTemplateNames();
            for (String templateName : templateNames) {
                Template temp = null;
                try {
                    temp = cfg.getTemplate(templateName);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                TemplateRootConfig config = templateRoot.getConfig();
                String destPath = null;
                try {
                    destPath = parseDestPath(templateName, dataMap, config);
                } catch (Exception e) {
                    throw new RuntimeException("目标路径解析发生错误，模板名称：" + templateName, e);
                }
                File file = new File(destPath);
                if (file.exists() && globalConfig.isIgnoreExists()) {
                    continue;
                }
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                try {
                    Writer out = new FileWriter(file);
                    temp.process(dataMap, out);
                    out.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (TemplateException e) {
                    throw new RuntimeException("模板解析发生错误，模板名称：" + templateName, e);
                }
            }
        }
    }

    private String parseDestPath(String templateName, Map dataMap, TemplateRootConfig config) throws TemplateException {
        String destPath = config.getRootPath();
        destPath = destPath + templateName.replaceFirst("[^/]+", "");
        destPath = FileUtils.removeFileExtension(destPath);
        destPath = destPath + "." + config.getFileExtension();
        destPath = FileUtils.getFullPath(globalConfig.getOutProjectPath(), destPath);

        Template template = null;
        try {
            template = new Template(null, destPath, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Writer out = new StringWriter();
        try {
            template.process(dataMap, out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return out.toString();
    }

}
