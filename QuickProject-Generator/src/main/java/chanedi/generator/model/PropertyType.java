package chanedi.generator.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chanedi on 2014/6/10.
 */
public class PropertyType {

    private Map<String, String> types;

    public PropertyType(String javaType) {
        super();
        types = new HashMap<String, String>();
        addType("java", javaType);
    }

    public void addType(String typeKey, String type) {
        types.put(typeKey, type);
    }

}
