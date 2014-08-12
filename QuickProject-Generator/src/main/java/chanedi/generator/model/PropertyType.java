package chanedi.generator.model;

import java.util.HashMap;

/**
 * Created by 羽霓 on 2014/6/10.
 */
public class PropertyType extends HashMap<String, String> {

    public PropertyType(String dbType) {
        super();
        put("db", dbType);
    }

}
