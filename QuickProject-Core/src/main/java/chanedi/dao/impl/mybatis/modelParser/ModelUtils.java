package chanedi.dao.impl.mybatis.modelParser;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chanedi.model.Entity;
import chanedi.util.ReflectUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Chanedi
 */
public class ModelUtils {

    private final static Log logger = LogFactory.getLog(ModelUtils.class);

    public static Map<String, Property> getProperties(Entity entity, ColumnTarget columnTarget) {
        Class<?> modelClass = entity.getClass();
        Map<String, Property> properties = getProperties(modelClass, columnTarget);
        Map<String, Property> results = new HashMap<String, Property>(properties.size());
        for (Map.Entry<String, Property> propertyEntry : properties.entrySet()) {
            Property property = propertyEntry.getValue();
            if (columnTarget == ColumnTarget.INSERT || columnTarget == ColumnTarget.UPDATE || columnTarget == ColumnTarget.WHERE) {
                boolean isIgnore;
                try {
                    isIgnore = property.isNullValue(entity);
                } catch (Exception e) {
                    isIgnore = true;
                }
                if (isIgnore) { // 空值忽略
                    continue;
                }
            }

            results.put(propertyEntry.getKey(), property);
        }

        return results;
    }

    public static Map<String, Property> getProperties(Class<?> modelClass, ColumnTarget columnTarget) {
        PropertyDescriptor[] propDescriptors = ReflectUtils.getBeanGetters(modelClass);
        Map<String, Property> properties = new HashMap<String, Property>(propDescriptors.length);
        for (PropertyDescriptor propertyDescriptor : propDescriptors) {
            Property property = new Property(modelClass, propertyDescriptor);
            if (property.isTransient()) {
                continue;
            }
            if (property.isUnableForColumnTarget(columnTarget)) {
                continue;
            }
            if (columnTarget == ColumnTarget.INSERT || columnTarget == ColumnTarget.UPDATE || columnTarget == ColumnTarget.WHERE) {
                if (property.isId()) { // ID忽略
                    continue;
                }
            }
            if (columnTarget == ColumnTarget.ORDER) {
                if (!property.isOrderColumn()) { // 仅保留ordercolumn
                    continue;
                }
            }

            properties.put(property.getName(), property);
        }
        return properties;
    }

}
