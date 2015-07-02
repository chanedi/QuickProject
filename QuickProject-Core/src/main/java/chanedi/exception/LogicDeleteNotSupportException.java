package chanedi.exception;

/**
 * Created by Chanedi
 */
public class LogicDeleteNotSupportException extends RuntimeException {

    private static final long serialVersionUID = 8688673825230163019L;

    public LogicDeleteNotSupportException() {
        super("不支持逻辑删除！请实现chanedi.model.ILogicDeletable接口！");
    }

}
