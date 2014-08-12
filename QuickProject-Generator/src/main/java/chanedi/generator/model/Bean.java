package chanedi.generator.model;

import chanedi.utils.StringUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 羽霓 on 2014/6/10.
 */
public class Bean {

    @Getter@Setter
    private String name;
    @Getter
    private String capitalizeName;
    @Getter
    private String tableName;
    @Getter@Setter
    private String comment;
    @Getter
    private List<Property> properties = new ArrayList<Property>();
    private Map<String, Property> propertyColumnNameMap = new HashMap<String, Property>();

    public void addProperty(Property property) {
        properties.add(property);
        propertyColumnNameMap.put(property.getColumnName(), property);
    }

    public Property getPropertyByColumnName(String columnName) {
        return propertyColumnNameMap.get(columnName);
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
        setName(StringUtils.uncapitalizeCamelBySeparator(tableName, "_"));
    }

    public void setName(String name) {
        this.name = name;
        this.capitalizeName = StringUtils.capitalize(name);
    }

}
