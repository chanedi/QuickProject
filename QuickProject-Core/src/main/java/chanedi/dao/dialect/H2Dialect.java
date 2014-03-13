package chanedi.dao.dialect;

/**
 * Created by chanedi on 14-3-13.
 */
public class H2Dialect extends Dialect {

	@Override
	public String getLimitString(String sql, int offset, int limit) {
        // 演示用数据库，暂不考虑实现

		return sql;
	}

}