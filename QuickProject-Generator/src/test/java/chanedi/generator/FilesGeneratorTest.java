package chanedi.generator;

import org.junit.Test;

/**
 * Created by jijingyu625 on 2016/4/18.
 */
public class FilesGeneratorTest {

    @Test
    public void generate() throws Exception {
        FilesGenerator generator = new FilesGenerator();
        GlobalConfig globalConfig = generator.getGlobalConfig();
        globalConfig.setOutProjectPath("F:/IDEA/massage"); // 注意修改此参数项
        globalConfig.setBeanNameRegex("^TB_(\\w+)$");
//        globalConfig.setBeanNameRegex("^T_[A-Z]{3}_(\\w+)$");
        globalConfig.setJavaPackageName("com.zhiyi.");
        globalConfig.setJavaPackagePath("com/zhiyi/");
        globalConfig.setIgnoreExists(true);

        generator.process();
    }
}