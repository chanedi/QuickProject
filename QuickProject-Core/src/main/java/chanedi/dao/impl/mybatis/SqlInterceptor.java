package chanedi.dao.impl.mybatis;

import chanedi.dao.complexQuery.Sort;
import chanedi.dao.dialect.Dialect;
import chanedi.dao.dialect.H2Dialect;
import chanedi.dao.dialect.MySql5Dialect;
import chanedi.dao.dialect.OracleDialect;
import chanedi.enums.DBDialectType;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;

import java.sql.Connection;
import java.util.List;
import java.util.Properties;

/**
 * 支持物理分页。
 * Created by unknown
 * Modify by Chanedi
 */
@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
public class SqlInterceptor implements Interceptor {
	
	protected final Log logger = LogFactory.getLog(getClass());
    private static ThreadLocal<List<Sort>> sortList = new ThreadLocal<List<Sort>>();

    public static List<Sort> getSortList() {
        List<Sort> sortList = SqlInterceptor.sortList.get();
        SqlInterceptor.sortList.remove();
        return sortList;
    }

    public static void setSortList(List<Sort> sortList) {
        SqlInterceptor.sortList.set(sortList);
    }

    @Override
	public Object intercept(Invocation invocation) throws Throwable {
		StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
		BoundSql boundSql = statementHandler.getBoundSql();
		MetaObject metaStatementHandler = MetaObject.forObject(statementHandler, new DefaultObjectFactory(), new DefaultObjectWrapperFactory());
		RowBounds rowBounds = (RowBounds) metaStatementHandler.getValue("delegate.rowBounds");
		Configuration configuration = (Configuration) metaStatementHandler.getValue("delegate.configuration");
		DBDialectType databaseType = null;
		try {
			databaseType = DBDialectType.valueOf(configuration.getVariables().getProperty("dialect").toUpperCase());
		} catch (Exception e) {
			// ignore
		}
		if (databaseType == null) {
			throw new RuntimeException("the value of the dialect property in configuration.xml is not defined : " + configuration.getVariables().getProperty("dialect"));
		}
		Dialect dialect = null;
		switch (databaseType) {
		case MYSQL:
			dialect = new MySql5Dialect();
			break;
		case ORACLE:
			dialect = new OracleDialect();
			break;
		case H2:
			dialect = new H2Dialect();
			break;
		}

		String sql = (String) metaStatementHandler.getValue("delegate.boundSql.sql");
		if ((rowBounds != null) && (rowBounds != RowBounds.DEFAULT)) {
            sql = dialect.addSortString(sql, getSortList());
			sql = dialect.addLimitString(sql, rowBounds.getOffset(), rowBounds.getLimit());
		}
		
		metaStatementHandler.setValue("delegate.boundSql.sql", sql);
		metaStatementHandler.setValue("delegate.rowBounds.offset", RowBounds.NO_ROW_OFFSET);
		metaStatementHandler.setValue("delegate.rowBounds.limit", RowBounds.NO_ROW_LIMIT);
		logger.debug("SQL : " + boundSql.getSql());
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {}

}