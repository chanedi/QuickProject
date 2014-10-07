package chanedi.dao.impl.mybatis.modelParser;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import chanedi.dao.impl.mybatis.BaseSQLProvider;
import chanedi.dao.impl.mybatis.RowBoundsInterceptor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.binding.MapperProxy;
import org.apache.ibatis.session.RowBounds;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

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
        parseTableName(proceedingJoinPoint);
        parseRowBounds(proceedingJoinPoint);

        return proceedingJoinPoint.proceed();
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

    private String getParamNameFromAnnotation(Method method, int i, String paramName) {
        final Object[] paramAnnos = method.getParameterAnnotations()[i];
        for (Object paramAnno : paramAnnos) {
            if (paramAnno instanceof Param) {
                paramName = ((Param) paramAnno).value();
            }
        }
        return paramName;
    }

    private void parseTableName(ProceedingJoinPoint proceedingJoinPoint) {
        // 获取代理目标对象
        Object obj = proceedingJoinPoint.getTarget();
        try {
            Field h = Proxy.class.getDeclaredField("h");
            h.setAccessible(true);
            obj = h.get(proceedingJoinPoint.getTarget());
        } catch (Exception e) {
            logger.error(e.getMessage(), e); // 尝试使用原对象
        }

        // 获取dao类
        Class<?> cl = null;
        try {
            Field mapperInterface = MapperProxy.class
                    .getDeclaredField("mapperInterface");
            mapperInterface.setAccessible(true);
            cl = (Class<?>) mapperInterface.get(obj);

            // 获取model类
            String modelName = cl.getName().replace(".dao.", ".model.").replace("DAO", "");

            // 将modelClass添加到线程变量
            BaseSQLProvider.setModelClass(Class.forName(modelName));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

}
