package chanedi.generator.file;

import chanedi.util.ReflectUtils;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 非单例。
 * @author Chanedi
 */
@Data
public final class TemplateRootConfig {

    public static final String CONFIG_FILE_NAME = "config.properties";
    private static final Logger logger = LoggerFactory.getLogger(TemplateRootConfig.class);
    private String rootPath = "src";
    private String fileExtension = "java";

    private TemplateRootConfig() {
        super();
    }

    public static TemplateRootConfig getInstance(String path) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(path + "/" + CONFIG_FILE_NAME));

        TemplateRootConfig config = new TemplateRootConfig();

        Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entrySet) {
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            Method setter = null;
            try {
                setter = ReflectUtils.getBeanSetter(TemplateRootConfig.class, key);
                setter.invoke(config, value);
            } catch (Exception e) {
                logger.warn("config.properties中有无法处理的配置项：{}, 已忽略");
                continue;
            }
        }

        return config;
    }

}
