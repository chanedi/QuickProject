package chanedi.generator;

import chanedi.generator.model.Bean;
import chanedi.generator.model.Property;
import chanedi.generator.model.PropertyType;
import chanedi.util.StringUtils;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jijingyu625 on 2016/4/18.
 */
public class CodeGenerator {

    private static ResourceLoader resourceLoader = new PathMatchingResourcePatternResolver();

    public static void generateSetter(File file, String className) throws IOException {
        String variableName = StringUtils.uncapitalize(className);
        System.out.println(className + " " + variableName + " = new " + className + "();");
        BufferedReader fileReader = new BufferedReader(new FileReader(file));

        while (true) {
            String line = fileReader.readLine();
            if (line == null) {
                break;
            }
            if (!line.contains(";")) {
                continue;
            }

            String[] splits = line.split(";")[0].split(" ");
            String attrName = splits[splits.length - 1];
            System.out.println(variableName + ".set" + StringUtils.capitalize(attrName) + "(" + attrName + ");");
        }
    }

    public static void generateDaoGetMethod(boolean isReturnList, String beanNameRegex, String tableName, String attrs) throws IOException, TemplateException {
        File dir = resourceLoader.getResource("classpath:/tmpl/code").getFile();

        Bean bean = new Bean();
        bean.setTableName(tableName);

        String[] attrArray = attrs.replace(", ", ",").split(",");
        for (String attr : attrArray) {
            try {
                String[] splits = attr.split(" ");
                Property property = new Property();
                property.setType(new PropertyType(splits[0]));
                property.setName(splits[1]);
                bean.addProperty(property);
            } catch (Exception e) {
                throw new RuntimeException("attr的格式应为$Javatype$ $attrName$");
            }
        }

        Configuration cfg = new Configuration();
        cfg.setDirectoryForTemplateLoading(dir);
        cfg.setObjectWrapper(new DefaultObjectWrapper());
        Template temp = cfg.getTemplate(isReturnList ? "daoGetForListMethodTmpl.ftl" : "daoGetForObjMethodTmpl.ftl");
        Map dataMap = new HashMap();
        dataMap.put("bean", bean);
        if (beanNameRegex != null) {
            // 根据用户设置修正beanName
            Pattern pattern = Pattern.compile(beanNameRegex);
            Matcher matcher = pattern.matcher(bean.getTableName());
            matcher.find();
            String group = matcher.group(matcher.groupCount());
            bean.setName(StringUtils.uncapitalizeCamelBySeparator(group, "_"));
        }
        Writer out = new OutputStreamWriter(System.out);
        temp.process(dataMap, out);
        out.flush();
        out.close();
    }

}
