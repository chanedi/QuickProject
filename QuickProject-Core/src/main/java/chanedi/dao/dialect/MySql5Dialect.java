package chanedi.dao.dialect;

public class MySql5Dialect extends Dialect {

	public String getLimitString(String sql, boolean hasOffset) {
		return MySql5PageHepler.getLimitString(sql, -1, -1);
	}

	@Override
	public String getLimitString(String sql, int offset, int limit) {
		return MySql5PageHepler.getLimitString(sql, offset, limit);
	}

	public boolean supportsLimit() {
		return true;
	}

}