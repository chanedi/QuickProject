package chanedi.dao.modelParser;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import chanedi.model.Entity;
import chanedi.utils.ReflectUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by chanedi on 14-2-10.
 */
public class ModelUtils {

	private final static Log logger = LogFactory.getLog(ModelUtils.class);

	public static List<Property> getProperties(Entity object, ColumnTarget columnTarget) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Class<?> modelClass = object.getClass();
		List<Property> properties = getProperties(modelClass, columnTarget);
		List<Property> results = new ArrayList<Property>(properties.size());
		for (Property property : properties) {
			if (columnTarget == ColumnTarget.INSERT || columnTarget == ColumnTarget.SELECT) {
				if (property.isNullValue(object)) { // 空值忽略
					continue;
				}
			}
			
			results.add(property);
		}

		return results;
	}

	public static List<Property> getProperties(Class<?> modelClass, ColumnTarget columnTarget) {
		PropertyDescriptor[] propDescriptors = ReflectUtils.getBeanGetters(modelClass);
		List<Property> properties = new ArrayList<Property>(propDescriptors.length);
		for (PropertyDescriptor propertyDescriptor : propDescriptors) {
			Property property = new Property(modelClass, propertyDescriptor);
			if (property.isTransient()) {
				continue;
			}
			if (property.isUnableForColumnTarget(columnTarget)) {
				continue;
			}
			if (columnTarget == ColumnTarget.INSERT || columnTarget == ColumnTarget.SELECT) {
				if (property.isId()) { // ID忽略
					continue;
				}
			}
			if (columnTarget == ColumnTarget.ORDER) {
				if (!property.isOrderColumn()) { // 仅保留ordercolumn
					continue;
				}
			}
			
			properties.add(property);
		}
		return properties;
	}

}
