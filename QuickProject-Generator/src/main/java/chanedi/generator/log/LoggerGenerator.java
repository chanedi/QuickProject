package chanedi.generator.log;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/**
 * Created by jijingyu625 on 2016/4/18.
 */
public class LoggerGenerator {

    private static ResourceLoader resourceLoader = new PathMatchingResourcePatternResolver();

    public static void generateLogger(File file) throws IOException, TemplateException {
        File tmplDir = resourceLoader.getResource("classpath:/tmpl/log").getFile();
        Configuration cfg = new Configuration();
        cfg.setDirectoryForTemplateLoading(tmplDir);
        cfg.setObjectWrapper(new DefaultObjectWrapper());
        Template logTmplIn = cfg.getTemplate("methodId.ftl");
        Template logTmplOut = cfg.getTemplate("methodOut.ftl");
        Template logTmplDaoResult = cfg.getTemplate("daoResult.ftl");

        String filePath = file.getPath();
        File tempFile = new File(filePath + ".tmp");

        BufferedWriter fileWriter = null;
        BufferedReader fileReader = null;
        try {
            fileWriter = new BufferedWriter(new FileWriter(tempFile));
            fileReader = new BufferedReader(new FileReader(file));

            MethodToLog methodToLog = null;
            LineMatcher lastLineMatcher = null;
            while (true) {
                String line = fileReader.readLine();
                if (line == null) {
                    break;
                }

                LineMatcher currentLineMatcher = LineMatcher.matcher(line);

                if (lastLineMatcher != null && methodToLog != null && (currentLineMatcher == null || currentLineMatcher.getMatcherType() != LineMatcher.MatcherType.LOG)) {
                    if (lastLineMatcher.getMatcherType() == LineMatcher.MatcherType.METHOD) { // 方法入口
                        logTmplIn.process(methodToLog, fileWriter);
                        fileWriter.newLine();
                    } else if (lastLineMatcher.getMatcherType() == LineMatcher.MatcherType.DAO_RESULT) {
                        MatchResult matcher = lastLineMatcher.getMatcher();
                        logTmplDaoResult.process(new DaoReturnToLog(matcher.group(1), matcher.group(2), methodToLog.getMethodName()), fileWriter);
                        fileWriter.newLine();
                    }
                }

                if (currentLineMatcher != null) {
                    Matcher matcher = currentLineMatcher.getMatcher();
                    if (currentLineMatcher.getMatcherType() == LineMatcher.MatcherType.METHOD) {
                        methodToLog = new MethodToLog(matcher.group(1), matcher.group(2), matcher.group(3));
                    } else if (currentLineMatcher.getMatcherType() == LineMatcher.MatcherType.METHOD) {
                        methodToLog = null;
                    } else if (currentLineMatcher.getMatcherType() == LineMatcher.MatcherType.DAO_RESULT) {
                    } else if (currentLineMatcher.getMatcherType() == LineMatcher.MatcherType.RETURN) { // 方法出口
                        if (methodToLog != null) {
                            methodToLog.setReturnValue(matcher.group(1));
                            logTmplOut.process(methodToLog, fileWriter);
                            fileWriter.newLine();
                        }
                    } else if (currentLineMatcher.getMatcherType() == LineMatcher.MatcherType.END_METHOD) { // 方法出口
                        if (methodToLog != null) {
                            logTmplOut.process(methodToLog, fileWriter);
                            fileWriter.newLine();
                        }
                    }
                }

                fileWriter.write(line);
                fileWriter.newLine();

                lastLineMatcher = currentLineMatcher;
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

}
