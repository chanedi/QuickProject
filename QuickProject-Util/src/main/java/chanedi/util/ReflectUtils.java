package chanedi.util;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * Created by Chanedi
 */
public class ReflectUtils {

	public static PropertyDescriptor[] getBeanSetters(Class<?> type) {
		return org.springframework.cglib.core.ReflectUtils.getBeanSetters(type);
	}

	public static PropertyDescriptor[] getBeanGetters(Class<?> type) {
		return org.springframework.cglib.core.ReflectUtils.getBeanGetters(type);
	}

	public static Method getBeanGetter(Class<?> beanClass, String propertyName) throws IntrospectionException {
		return new PropertyDescriptor(propertyName, beanClass).getReadMethod();
	}

	public static Method getBeanSetter(Class<?> beanClass, String propertyName) throws IntrospectionException {
		return new PropertyDescriptor(propertyName, beanClass).getWriteMethod();
	}

}