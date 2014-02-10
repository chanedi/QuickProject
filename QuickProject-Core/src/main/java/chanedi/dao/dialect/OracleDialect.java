package chanedi.dao.dialect;

public class OracleDialect extends Dialect {

	@Override
	public String getLimitString(String sql, int offset, int limit) {
		sql = sql.trim();
		boolean isForUpdate = false;
		if (sql.toLowerCase().endsWith(" FOR UPDATE")) {
			sql = sql.substring(0, sql.length() - 11);
			isForUpdate = true;
		}

		StringBuffer pagingSelect = new StringBuffer(sql.length() + 100);

		pagingSelect.append("SELECT * FROM ( SELECT ROW_.*, ROWNUM ROWNUM_ FROM ( ");

		pagingSelect.append(sql);

		pagingSelect.append(" ) ROW_ ) WHERE ROWNUM_ > " + offset + " AND ROWNUM_ <= " + (offset + limit));

		if (isForUpdate) {
			pagingSelect.append(" FOR UPDATE");
		}

		return pagingSelect.toString();
	}

}