package chanedi.generator;

import org.junit.Test;

import java.io.File;

/**
 * Created by jijingyu625 on 2016/4/24.
 */
public class LoggerGeneratorTest {

    @Test
    public void generateLogger() throws Exception {
        File file = new File("xxx.java");
        LoggerGenerator.generateLogger(file);
    }

}