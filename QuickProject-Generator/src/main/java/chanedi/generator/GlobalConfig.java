package chanedi.generator;

import chanedi.enums.DBDialectType;
import chanedi.generator.exception.GlobalConfigException;
import lombok.Getter;
import lombok.Setter;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.File;
import java.io.IOException;

/**
 * @author Chanedi
 * 单例
 */
public final class GlobalConfig {

    @Getter
    private static GlobalConfig instance = new GlobalConfig();
    private ResourceLoader resourceLoader = new PathMatchingResourcePatternResolver();
    @Setter@Getter
    private String outProjectPath = "D:/gen";
    @Setter
    private String inputSqlPath = "classpath:/sql";
    @Setter
    private String tmplPath = "classpath:/tmpl";
    @Setter@Getter
    private String javaPackageName = "com.";
    @Setter@Getter
    private String javaPackagePath = "com/";
    @Setter@Getter
    private String typeMatchConfigPath = "classpath:/typeMatch";
    /** 表名命名法则（正则表达式），java类名请用"(\\w+)"表示。如："^T_(\w+)$"则表名为T_USER_INFO，java类名为UserInfo。默认为"(\\w+)$"（表名即类名，没有前缀） */
    @Setter@Getter
    private String beanNameRegex = "(\\w+)$";
    /** 为true则已存在的文件不重新生成。默认为true。 */
    @Setter@Getter
    private boolean ignoreExists = true;
    /**
     * 数据库方言，默认为ORACLE。
     * @see DBDialectType
     */
    @Setter@Getter
    private DBDialectType dbDialectType = DBDialectType.ORACLE;

    private GlobalConfig() {
        super();
    }

    public File getInputSqlFile() throws GlobalConfigException {
        return getFileByConfig("inputSqlPath", inputSqlPath);
    }

    public File getTmplFile() throws GlobalConfigException {
        return getFileByConfig("tmplPath", tmplPath);
    }

    private File getFileByConfig(String configParamName, String configPath) throws GlobalConfigException {
        Resource resource = resourceLoader.getResource(configPath);
        if (!resource.exists()) {
            throw new GlobalConfigException(configParamName, "路径不存在");
        }
        try {
            return resource.getFile();
        } catch (IOException e) {
            throw new GlobalConfigException(configParamName, e);
        }
    }

}
