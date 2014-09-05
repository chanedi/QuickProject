package chanedi.generator;

import chanedi.generator.exception.ConfigException;
import lombok.Getter;
import lombok.Setter;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.File;
import java.io.IOException;

/**
 * Created by jijy on 2014/7/29.
 */
public class GlobalConfig {

    @Setter@Getter
    private String outProjectPath; // TODO 合适的默认值？
    @Setter
    private String inputSqlPath = "classpath:/sql";
    @Setter
    private String tmplPath = "classpath:/tmpl";
    @Setter@Getter
    private String beanNameRegex = "(\\w+)$";
    private ResourceLoader resourceLoader = new PathMatchingResourcePatternResolver();

    public File getInputSqlFile() throws ConfigException {
        return getFileByConfig("inputSqlPath", inputSqlPath);
    }

    public File getTmplFile() throws ConfigException {
        return getFileByConfig("tmplPath", tmplPath);
    }

    private File getFileByConfig(String configParamName, String configPath) throws ConfigException {
        Resource resource = resourceLoader.getResource(configPath);
        if (!resource.exists()) {
            throw new ConfigException(configParamName, "路径不存在");
        }
        try {
            return resource.getFile();
        } catch (IOException e) {
            throw new ConfigException(configParamName, e);
        }
    }

}
