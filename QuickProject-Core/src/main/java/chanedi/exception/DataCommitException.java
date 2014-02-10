package chanedi.exception;

/**
 * 表示数据提交失败。
 *
 * Created by chanedi on 14-2-10.
 */
public class DataCommitException extends Exception {

	private static final long serialVersionUID = 1669843560642800254L;

	public DataCommitException() {
		super("Data commit failed!");
	}

}
