package chanedi.generator;

import chanedi.generator.file.FilesGenerator;
import chanedi.generator.file.GlobalConfig;
import org.junit.Test;

/**
 * Created by jijingyu625 on 2016/4/18.
 */
public class FilesGeneratorTest {

    @Test
    public void generate() throws Exception {
        FilesGenerator generator = new FilesGenerator();
        GlobalConfig globalConfig = generator.getGlobalConfig();
        globalConfig.setOutProjectPath("D:/"); // 注意修改此参数项
        globalConfig.setBeanNameRegex("^XXX_XXX_(\\w+)$");
//        globalConfig.setBeanNameRegex("^T_[A-Z]{3}_(\\w+)$");
        globalConfig.setJavaPackageName("com.xx");
        globalConfig.setJavaPackagePath("com/xx");
        globalConfig.setIgnoreExists(true);

        generator.process();
    }
}