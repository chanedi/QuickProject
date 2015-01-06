package chanedi.generator.exception;

/**
 * @author Chanedi
 */
public class GlobalConfigException extends ConfigException {

    private static final String errorMessage = "全局配置参数错误：";

    public GlobalConfigException(String configParam) {
        super(errorMessage + configParam);
    }

    public GlobalConfigException(String configParam, String message) {
        super(errorMessage + configParam + "(" + message + ")");
    }

    public GlobalConfigException(String configParam, Throwable cause) {
        super(errorMessage + configParam, cause);
    }

    public GlobalConfigException(String configParam, String message, Throwable cause) {
        super(errorMessage + configParam + "(" + message + ")", cause);
    }

}
