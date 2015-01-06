package chanedi.generator.exception;

/**
 * Created by chanedi on 2015/1/6.
 */
public class ConfigException extends Exception {

    public ConfigException() {
    }

    public ConfigException(String message) {
        super(message);
    }

    public ConfigException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigException(Throwable cause) {
        super(cause);
    }

}
