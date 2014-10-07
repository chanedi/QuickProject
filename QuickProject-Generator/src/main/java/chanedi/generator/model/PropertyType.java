package chanedi.generator.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chanedi
 */
public class PropertyType extends HashMap {

    public PropertyType(String javaType) {
        super();
        addType("java", javaType);
    }

    public void addType(String typeKey, String type) {
        put(typeKey, type);
    }

}
