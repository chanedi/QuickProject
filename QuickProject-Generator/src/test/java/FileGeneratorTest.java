import chanedi.generator.FilesGenerator;
import chanedi.generator.GlobalConfig;
import chanedi.generator.exception.GlobalConfigException;

/**
 * @author Chanedi
 */
public class FileGeneratorTest {

    public static void main(String[] args) throws GlobalConfigException {
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
