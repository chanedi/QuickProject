package chanedi.dao.dialect;

/**
 * 数据库方言。
 */
public abstract class Dialect {

	public static enum Type {
		MYSQL, ORACLE;
	}

	public abstract String getLimitString(String sql, int skipResults, int maxResults);

}