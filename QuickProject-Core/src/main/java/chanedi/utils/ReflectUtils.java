package chanedi.utils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class ReflectUtils {

	public static PropertyDescriptor[] getBeanSetters(Class<?> type) {
		return org.springframework.cglib.core.ReflectUtils.getBeanSetters(type);
	}
	
	public static PropertyDescriptor[] getBeanGetters(Class<?> type) {
		return org.springframework.cglib.core.ReflectUtils.getBeanGetters(type);
	}
	
	public static Method getBeanGetter(Class<?> type, String property) throws SecurityException, NoSuchMethodException {
		String methodName = null;
		if (property.length() == 1) {
			methodName = property.substring(0, 1).toUpperCase();
		} else {
			methodName = property.substring(0, 1).toUpperCase() + property.substring(1, property.length());
		}
		methodName = "get" + methodName;
		return type.getMethod(methodName);
	}
	
}