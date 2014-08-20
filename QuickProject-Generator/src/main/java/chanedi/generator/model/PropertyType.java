package chanedi.generator.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chanedi on 2014/6/10.
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
