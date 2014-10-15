package chanedi.dao.impl.mybatis.modelParser;

import chanedi.dao.complexQuery.Sort;
import chanedi.dao.impl.mybatis.BaseSQLProvider;
import chanedi.dao.impl.mybatis.interceptor.RowBoundsInterceptor;
import chanedi.dao.impl.mybatis.interceptor.SortListInterceptor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.binding.MapperProxy;
import org.apache.ibatis.session.RowBounds;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Chanedi
 */
@Aspect
@Component
public class ParseTableNameAspect {

    private final static Log logger = LogFactory.getLog(ParseTableNameAspect.class);

    @Around("execution(* chanedi.dao.EntityDAO.*(..))")
    public Object invoke(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        Class<?> modelClass = parseModelClass(proceedingJoinPoint);
        parseRowBounds(proceedingJoinPoint);
        parseSortList(proceedingJoinPoint, modelClass);

        return proceedingJoinPoint.proceed();
    }

    private Class<?> parseModelClass(ProceedingJoinPoint proceedingJoinPoint) {
        // 获取代理目标对象
        Object obj = proceedingJoinPoint.getTarget();
        try {
            Field h = Proxy.class.getDeclaredField("h");
            h.setAccessible(true);
            obj = h.get(proceedingJoinPoint.getTarget());
        } catch (Exception e) {
            logger.error(e.getMessage(), e); // 尝试使用原对象
        }

        try {
            // 获取dao类
            Field mapperInterface = MapperProxy.class.getDeclaredField("mapperInterface");
            mapperInterface.setAccessible(true);
            Class<?> cl = (Class<?>) mapperInterface.get(obj);
            // 获取model类
            ParameterizedType type = (ParameterizedType) cl.getGenericInterfaces()[0];
            Class<?> modelClass = (Class<?>) type.getActualTypeArguments()[0];
            // 将modelClass添加到线程变量
            BaseSQLProvider.setModelClass(modelClass);
            return modelClass;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    private void parseRowBounds(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        if (!hasRowRounds(proceedingJoinPoint)) {
            RowBoundsInterceptor.setRowBounds(null);
            return;
        }

        Object[] oriArgs = proceedingJoinPoint.getArgs();
        Integer start = (Integer) oriArgs[oriArgs.length - 2];
        Integer limit = (Integer) oriArgs[oriArgs.length - 1];
        if (start != null && limit != null) {
            RowBoundsInterceptor.setRowBounds(new RowBounds(start, limit));
        } else {
            RowBoundsInterceptor.setRowBounds(null);
        }
    }

    private void parseSortList(ProceedingJoinPoint proceedingJoinPoint, Class<?> modelClass) throws Throwable {
        if (modelClass == null) {
            return;
        }
        Object[] oriArgs = proceedingJoinPoint.getArgs();
        List<Sort> sortList = null;
        for (Object oriArg : oriArgs) {
            if (!(oriArg instanceof List)) {
                continue;
            }
            List list = (List) oriArg;
            if (list == null || list.size() == 0) {
                continue;
            }
            if (list.get(0) instanceof Sort) {
                sortList = list;
                break;
            }
        }
        if (sortList == null) {
            return;
        }
        Map<String, Property> properties = ModelUtils.getProperties(modelClass, ColumnTarget.ORDER);
        List<Sort> sorts = new ArrayList<Sort>();
        for (Sort sort : sortList) {
            Property property = properties.get(sort.getProperty());
            if (property == null) {
                continue;
            }
            sort.setColumn(property.getColumnName());
            sorts.add(sort);
        }
        SortListInterceptor.setSortList(sorts);
    }

    private boolean hasRowRounds(ProceedingJoinPoint proceedingJoinPoint) {
        String signature = proceedingJoinPoint.getSignature().toString();
        if (!signature.endsWith(",Integer,Integer)")) {
            return false;
        }
        if (signature.contains(".find(")) {
            return true;
        }
        if (signature.contains(".get(")) {
            return true;
        }
        if (signature.contains(".query(")) {
            return true;
        }
        return false;
    }

}
