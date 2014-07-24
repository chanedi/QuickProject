package chanedi.generator;

import chanedi.generator.model.Bean;
import chanedi.generator.model.Module;
import chanedi.generator.model.TemplateRoot;
import chanedi.generator.parser.CreateTableListenerImpl;
import chanedi.generator.parser.gen.CreateTableLexer;
import chanedi.generator.parser.gen.CreateTableParser;
import chanedi.utils.FileUtils;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * Created by jijy on 2014/7/9.
 */
public class FilesGenerator {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private List<Module> modules;
    private List<TemplateRoot> templateRoots;
    private String inputSqlPath = "E:\\IDEA\\QuickProject\\QuickProject-Generator\\src\\test\\resources\\sql";
    private String tmplPath = "E:\\IDEA\\QuickProject\\QuickProject-Generator\\src\\test\\resources\\tmpl";

    public FilesGenerator() {
        modules = new ArrayList<Module>();
        templateRoots = new ArrayList<TemplateRoot>();
    }

    public void parseModule() throws IOException {
        File sqlDir = new File(inputSqlPath);
        File[] files = sqlDir.listFiles();
        for (File sqlFile : files) {
            Module module = new Module(sqlFile);
            modules.add(module);
        }
    }

    public void parseTmpl() throws IOException {
        File tmplDir = new File(tmplPath);
        File[] rootDirs = tmplDir.listFiles();
        for (File rootDir : rootDirs) {
            if (!rootDir.isDirectory()) {
                continue;
            }
            TemplateRoot templateRoot = new TemplateRoot(rootDir);
            templateRoots.add(templateRoot);
        }
    }

    public void generate() throws IOException, TemplateException, InvocationTargetException {
        Configuration cfg = new Configuration();
        File tmplDir = new File(tmplPath);
        cfg.setDirectoryForTemplateLoading(tmplDir);
        cfg.setObjectWrapper(new DefaultObjectWrapper());
        for (Module module : modules) {
            for (Bean bean : module.getBeans()) {
                Map root = new HashMap();
                root.put("bean", bean);

                generate(cfg, module, bean, root);
            }

        }
    }

    private void generate(Configuration cfg, Module module, Bean bean, Map root) throws IOException, TemplateException {
        for (TemplateRoot templateRoot : templateRoots) {
            List<String> templateNames = templateRoot.getTemplateNames();
            for (String templateName : templateNames) {
                Template temp = cfg.getTemplate(templateName);

                Config config = templateRoot.getConfig();
                String destPath = parseDestPath(templateName, module, bean, config);
                File file = new File(destPath);
                if (file.exists()) {
                    continue; // TODO
                }
                file.createNewFile();

                Writer out = new FileWriter(file);
                temp.process(root, out);
                out.flush();
            }
        }
    }

    private String parseDestPath(String templateName, Module module, Bean bean, Config config) {
        String destPath = config.getRootPath();
        destPath = destPath + templateName.replaceFirst("[^/]+", "");
        destPath = destPath.replaceAll("\\$\\{bean\\.name\\}", bean.getName());// TODO
        destPath = destPath.replaceAll("\\$\\{moduleName\\}", module.getModuleName());// TODO
        destPath = FileUtils.removeFileExtension(destPath);
        destPath = destPath + "." + config.getFileExtension();

        return destPath;
    }


    public static void main(String[] args) throws IOException, InvocationTargetException, TemplateException {
        FilesGenerator filesGenerator = new FilesGenerator();
        filesGenerator.parseModule();
        filesGenerator.parseTmpl();
        filesGenerator.generate();
    }

}
