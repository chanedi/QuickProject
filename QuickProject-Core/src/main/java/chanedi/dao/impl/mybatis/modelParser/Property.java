package chanedi.dao.impl.mybatis.modelParser;

import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Chanedi
 */
public class Property {

    private final static Log logger = LogFactory.getLog(Property.class);
	
	@Getter
	private String name;
	
	private String tableName;

	private Method readMethod;

	private Field field;
	
	private Column column;

    public Property(Class<?> modelClass, PropertyDescriptor propertyDescriptor) {
        name = propertyDescriptor.getName();
        readMethod = propertyDescriptor.getReadMethod();

        // field
        try {
            field = modelClass.getDeclaredField(propertyDescriptor.getName());
        } catch (NoSuchFieldException e) {
            field = null;
        }

        if (isTransient()) {
            return;
        }

        // column
        column = (Column) getAnnotation(readMethod, Column.class);
        if (column == null) {
            column = (Column) getAnnotation(field, Column.class);
        }

        // tableName
        if (column != null) {
            tableName = column.table();
        }
        if (tableName == null) {
            if(modelClass.getAnnotation(Table.class) != null){
                tableName = modelClass.getAnnotation(Table.class).name();
            } else {
                // 代理model类
                String className = StringUtils.split(modelClass.getName(), "$")[0];
                try {
                    tableName = Class.forName(className).getAnnotation(Table.class).name();
                } catch (ClassNotFoundException e) {
                    logger.error(e.getMessage(), e);
                }
            }

        }
    }

	public boolean isId() {
		return hasAnnotation(readMethod, Id.class) || hasAnnotation(field, Id.class);
	}
	
	public boolean isOrderColumn() {
		return hasAnnotation(readMethod, OrderColumn.class) || hasAnnotation(field, OrderColumn.class);
	}

	public boolean isTransient() {
		return hasAnnotation(readMethod, Transient.class) || hasAnnotation(field, Transient.class);
	}
	
	public String getColumnName() {
		if (column == null) {
			// 大写字母前插入_
			return name.replaceAll("([A-Z])", "_$0").toUpperCase();
		} else {
			return column.name();
		}
	}
	
	public String getOrder() {
		OrderColumn orderColumn = (OrderColumn) getAnnotation(readMethod, OrderColumn.class);
		if (orderColumn == null) {
			orderColumn = (OrderColumn) getAnnotation(field, OrderColumn.class);
		}
		return getColumnName() + " " + orderColumn.name();
	}
	
	public boolean isNullValue(Object object) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		return readMethod.invoke(object) == null;
	}
	
	public boolean isUnableForColumnTarget(ColumnTarget columnTarget) {
		if (column == null) {
			return false;
		}
		
		switch (columnTarget) {
		case INSERT:
			return !column.insertable();
		case UPDATE:
			return !column.updatable();
		default:
			break;
		}
		return false;
	}

	private boolean hasAnnotation(AccessibleObject accessibleObject, Class<? extends Annotation> annotationClass) {
		return getAnnotation(accessibleObject, annotationClass) != null;
	}
	
	private Annotation getAnnotation(AccessibleObject accessibleObject, Class<? extends Annotation> annotationClass) {
		if (accessibleObject == null) {
			return null;
		}
		return accessibleObject.getAnnotation(annotationClass);
	}
	
}