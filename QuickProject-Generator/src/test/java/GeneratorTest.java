import chanedi.generator.FilesGenerator;
import chanedi.generator.GlobalConfig;
import chanedi.generator.exception.GlobalConfigException;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Chanedi
 */
@Ignore
public class GeneratorTest extends TestCase {

    @Test
    public void testGenerator() throws GlobalConfigException {
        FilesGenerator generator = new FilesGenerator();
        GlobalConfig globalConfig = generator.getGlobalConfig();
        globalConfig.setOutProjectPath("F:/IDEA/massage"); // 注意修改此参数项
        globalConfig.setBeanNameRegex("^TB_(\\w+)$");
//        globalConfig.setBeanNameRegex("^T_[A-Z]{3}_(\\w+)$");
//        globalConfig.setJavaPackageName("com.zhiyi.");
//        globalConfig.setJavaPackagePath("com/zhiyi/");
        globalConfig.setIgnoreExists(false);

        generator.process();
    }

}
