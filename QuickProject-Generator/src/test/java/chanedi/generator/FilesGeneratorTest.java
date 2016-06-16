package chanedi.generator;

import chanedi.enums.DBDialectType;
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
//        globalConfig.setOutProjectPath("D:/"); // 注意修改此参数项
        globalConfig.setBeanNameRegex("^BUS_(\\w+)$");
//        globalConfig.setBeanNameRegex("^T_[A-Z]{3}_(\\w+)$");
        globalConfig.setJavaPackageName("com.xx.common.file");
        globalConfig.setJavaPackagePath("com");
        globalConfig.setDbDialectType(DBDialectType.ORACLE);
        globalConfig.setTmplPath("classpath:/tmpl/file/example2");
        globalConfig.setIgnoreExists(false);

        generator.process();
    }
}