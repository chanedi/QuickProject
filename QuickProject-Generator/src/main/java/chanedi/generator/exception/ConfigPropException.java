package chanedi.generator.exception;

/**
 * @author Chanedi
 */
public class ConfigPropException extends ConfigException {

    private static final String errorMessage = "config.properties文件配置参数错误：";

    public ConfigPropException(String configParam) {
        super(errorMessage + configParam);
    }

    public ConfigPropException(String configParam, String message) {
        super(errorMessage + configParam + "(" + message + ")");
    }

    public ConfigPropException(String configParam, Throwable cause) {
        super(errorMessage + configParam, cause);
    }

    public ConfigPropException(String configParam, String message, Throwable cause) {
        super(errorMessage + configParam + "(" + message + ")", cause);
    }

}
