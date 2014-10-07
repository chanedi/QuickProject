package chanedi.generator.model;

import chanedi.util.StringUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Chanedi
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
    private Map<String, Property> propertyColumnNameMap = new HashMap<String, Property>();

    public void addProperty(Property property) {
        propertyColumnNameMap.put(property.getColumnName(), property);
    }

    public Property getPropertyByColumnName(String columnName) {
        return propertyColumnNameMap.get(columnName);
    }

    public Collection<Property> getProperties() {
        return propertyColumnNameMap.values();
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
