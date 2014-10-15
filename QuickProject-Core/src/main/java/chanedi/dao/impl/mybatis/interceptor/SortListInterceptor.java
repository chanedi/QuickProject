package chanedi.dao.impl.mybatis.interceptor;

import chanedi.dao.complexQuery.Sort;
import chanedi.dao.dialect.Dialect;
import chanedi.dao.impl.mybatis.DialectParser;
import chanedi.dao.impl.mybatis.session.Configuration;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Properties;

/**
 * 将sortList加入sql。
 *
 * @author Chanedi
 */
@Intercepts({ @Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}) })
public class SortListInterceptor implements Interceptor {
	
	protected final Log logger = LogFactory.getLog(getClass());
    private static ThreadLocal<List<Sort>> sortList = new ThreadLocal<List<Sort>>();

    public static List<Sort> getSortList() {
        List<Sort> sortList = SortListInterceptor.sortList.get();
        SortListInterceptor.sortList.remove();
        return sortList;
    }

    public static void setSortList(List<Sort> sortList) {
        SortListInterceptor.sortList.set(sortList);
    }

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
        List<Sort> sortList = getSortList();
        if (sortList == null || sortList.size() == 0) {
            return invocation.proceed();
        }

        Executor executor = (Executor) invocation.getTarget();
        Object[] args = invocation.getArgs();
        MappedStatement ms = (MappedStatement) args[0];
        Object parameter = args[1];
        RowBounds rowBounds = (RowBounds) args[2];
        ResultHandler resultHandler = (ResultHandler) args[3];

        // 计算修改BoundSql
        BoundSql boundSql = ms.getBoundSql(parameter);
        MetaObject boundSqlHandler = MetaObject.forObject(boundSql, new DefaultObjectFactory(), new DefaultObjectWrapperFactory());
        Dialect dialect = DialectParser.parse(ms.getConfiguration());
        String sql = (String) boundSqlHandler.getValue("sql");
        sql = dialect.addSortString(sql, sortList);
        boundSqlHandler.setValue("sql", sql);

        // 继续执行原来的代码
        CacheKey key = executor.createCacheKey(ms, parameter, rowBounds, boundSql);
        return executor.query(ms, parameter, rowBounds, resultHandler, key, boundSql);
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {}

}