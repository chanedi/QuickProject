package chanedi.generator.exception;

/**
 * Created by jijy on 2014/7/25.
 */
public class ConfigPropException extends Exception {

    private static final String errorMessage = "properties文件配置参数错误：";

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
