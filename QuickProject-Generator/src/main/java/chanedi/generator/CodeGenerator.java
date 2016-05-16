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

    public static void generateDaoGetMethod(boolean isReturnList, String dtoPackageName, String tableName, String beanName, String... attrs) throws IOException, TemplateException {
        File dir = resourceLoader.getResource("classpath:/tmpl").getFile();

        Bean bean = new Bean();
        bean.setCapitalizeName(beanName);

        for (String attr : attrs) {
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
        dataMap.put("dtoPackageName", dtoPackageName);
        dataMap.put("tableName", tableName);
        Writer out = new OutputStreamWriter(System.out);
        temp.process(dataMap, out);
        out.flush();
        out.close();

//        String methodName = "getBy";
//        for (int i = 0; i < attrNames.length - 2; i++) {
//            methodName = methodName + StringUtils.capitalize(attrNames[i]) + "And";
//        }
//        methodName = methodName + StringUtils.capitalize(attrNames[attrNames.length - 1]);
//
//        System.out.print("public " + returnType + " " + methodName);
//
//        System.out.print("(");
//        for (int i = 0; i < attrNames.length - 2; i++) {
//            System.out.print("String " + attrNames[i] + ", ");
//        }
//        System.out.print("String " + attrNames[attrNames.length - 1]);
//        System.out.println(") {");
//
//        System.out.print("    Map map = MapUtils.buildKeyValueMap(");
//        for (String attrName : attrNames) {
//            System.out.print("\"" + attrName + "\", " + attrName);
//        }
//        System.out.println(");");
//
//        System.out.println("    return queryForObject(\"" + returnType.replace("DAO", "") + "." + methodName + "\", sellRequestId, bizType);");
    }

}
