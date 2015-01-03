import chanedi.generator.FilesGenerator;
import chanedi.generator.GlobalConfig;
import chanedi.generator.exception.ConfigException;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author Chanedi
 */
public class GeneratorTest extends TestCase {

    @Test
    public void testGenerator() throws ConfigException {
        FilesGenerator generator = new FilesGenerator();
        GlobalConfig globalConfig = generator.getGlobalConfig();
        globalConfig.setOutProjectPath("F:/IDEA/QuickProject/QuickProject-Core"); // 注意修改此参数项
        globalConfig.setBeanNameRegex("^T_[A-Z]{3}_(\\w+)$");
        globalConfig.setJavaPackageName("com.zhiyi.");
        globalConfig.setJavaPackagePath("com/zhiyi/");
//        globalConfig.setIgnoreExists(false);

        generator.process();
    }

}
