package chanedi.util;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Chanedi
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

    public static Field getFieldByGetter(Class<?> modelClass, String getterName) throws NoSuchFieldException {
        String propName = org.apache.commons.lang3.StringUtils.uncapitalize(getterName.substring(3));
        return modelClass.getDeclaredField(propName);
    }

    public static Field getFieldBySetter(Class<?> modelClass, String setterName) throws NoSuchFieldException {
        String propName = org.apache.commons.lang3.StringUtils.uncapitalize(setterName.substring(3));
        return modelClass.getDeclaredField(propName);
    }

}