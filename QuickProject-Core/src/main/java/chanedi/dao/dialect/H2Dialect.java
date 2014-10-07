package chanedi.dao.dialect;

/**
 * @author Chanedi
 */
public class H2Dialect extends Dialect {

	@Override
	public String getLimitString(String sql, int offset, int limit) {
		return MySql5PageHepler.getLimitString(sql, offset, limit);
	}

}