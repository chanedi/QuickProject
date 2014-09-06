package chanedi.generator.exception;

/**
 * Created by Chanedi
 */
public class ConfigException extends Exception {

    private static final String errorMessage = "全局配置参数错误：";

    public ConfigException(String configParam) {
        super(errorMessage + configParam);
    }

    public ConfigException(String configParam, String message) {
        super(errorMessage + configParam + "(" + message + ")");
    }

    public ConfigException(String configParam, Throwable cause) {
        super(errorMessage + configParam, cause);
    }

    public ConfigException(String configParam, String message, Throwable cause) {
        super(errorMessage + configParam + "(" + message + ")", cause);
    }

}
