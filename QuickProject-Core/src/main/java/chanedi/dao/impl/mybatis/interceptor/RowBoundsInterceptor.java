package chanedi.dao.impl.mybatis.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.lang.reflect.Field;
import java.util.Properties;

/**
 * 将分页参数加入cache条件。不使用mybatis的cache时可不使用此拦截器。
 *
 * @author Chanedi
 */
@Intercepts({ @Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}) })
public class RowBoundsInterceptor implements Interceptor {
	
	protected final Log logger = LogFactory.getLog(getClass());
	private static ThreadLocal<RowBounds> rowBounds = new ThreadLocal<RowBounds>();
	
	public static RowBounds getRowBounds() {
		RowBounds rowBounds = RowBoundsInterceptor.rowBounds.get();
		RowBoundsInterceptor.rowBounds.remove();
		return rowBounds;
	}

	public static void setRowBounds(RowBounds rowBounds) {
		RowBoundsInterceptor.rowBounds.set(rowBounds);
	}
	
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();

		RowBounds rowBounds = getRowBounds();
		if (rowBounds != null) {
            args[2] = rowBounds;
        }

        return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {}

}