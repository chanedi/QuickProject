package chanedi.generator;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.*;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jijingyu625 on 2016/4/18.
 */
public class LoggerGenerator {

    private static ResourceLoader resourceLoader = new PathMatchingResourcePatternResolver();

    public static void generateLogger(File file) throws IOException, TemplateException {
        File tmplDir = resourceLoader.getResource("classpath:/tmpl").getFile();
        Configuration cfg = new Configuration();
        cfg.setDirectoryForTemplateLoading(tmplDir);
        cfg.setObjectWrapper(new DefaultObjectWrapper());
        Template logTmplIn = cfg.getTemplate("logTmplIn.ftl");
        Template logTmplOut = cfg.getTemplate("logTmplOut.ftl");
        Pattern methodSignaturePattern = Pattern.compile("\\s+public (\\S+) ([^\\(]+)\\((.+)\\) \\{");
        Pattern privateMethodSignaturePattern = Pattern.compile("\\s+private (\\S+) ([^\\(]+)\\((.+)\\) \\{");
        Pattern returnPattern = Pattern.compile("\\s+return (.+);");

        String filePath = file.getPath();
        File tempFile = new File(filePath + ".tmp");

        BufferedWriter fileWriter = null;
        BufferedReader fileReader = null;
        try {
            fileWriter = new BufferedWriter(new FileWriter(tempFile));
            fileReader = new BufferedReader(new FileReader(file));

            MethodToLog methodToLog = null;
            boolean methodIn = false;
            String lastLine = "";
            while (true) {
                String line = fileReader.readLine();
                if (line == null) {
                    break;
                }
                boolean methodInLogLine = methodIn;
                if (methodIn) { // 方法入口
                    if (!line.contains("Log")) {
                        logTmplIn.process(methodToLog, fileWriter);
                        fileWriter.newLine();
                    }
                    methodIn = false;
                }

                Matcher methodMather = methodSignaturePattern.matcher(line);
                if (methodMather.matches()) {
                    methodToLog = new MethodToLog(methodMather.group(1), methodMather.group(2), methodMather.group(3));
                    methodIn = true;
                } else {
                    Matcher privateMethodMatcher = privateMethodSignaturePattern.matcher(line);
                    if (privateMethodMatcher.matches()) {
                        methodToLog = null;
                    }
                }
                Matcher returnMather = returnPattern.matcher(line);
                if (returnMather.matches() && !lastLine.contains("Log") && methodToLog != null) { // 方法出口
                    methodToLog.setReturnValue(returnMather.group(1));
                    logTmplOut.process(methodToLog, fileWriter);
                    fileWriter.newLine();
                }

                fileWriter.write(line);
                fileWriter.newLine();

                if (!methodInLogLine) {
                    lastLine = line;
                }
            }
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        file.delete();
        tempFile.renameTo(file);
    }

    private static class MethodToLog extends HashMap {

        public MethodToLog(String returnType, String methodName, String argStr) {
            if (returnType.contains("List")) {
                put("returnList", true);
            } else {
                put("returnList", false);
            }
            put("methodName", methodName);
            String[] argNames = argStr.split(",");
            for (int i = 0; i < argNames.length; i++) {
                String[] arg = argNames[i].split(" ");
                argNames[i] = arg[arg.length - 1];
            }
            put("argNames", argNames);
        }

        public void setReturnValue(String returnValue) {
            put("returnValue", returnValue);
        }
    }

}
