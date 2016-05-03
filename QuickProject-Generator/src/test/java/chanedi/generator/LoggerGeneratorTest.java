package chanedi.generator;

import chanedi.generator.log.LoggerGenerator;
import org.junit.Test;

import java.io.File;

/**
 * Created by jijingyu625 on 2016/4/24.
 */
public class LoggerGeneratorTest {

    @Test
    public void generateLogger() throws Exception {
        File file = new File("D:\\IdeaProjects\\xxx.java");
        LoggerGenerator.generateLogger(file);
    }

}