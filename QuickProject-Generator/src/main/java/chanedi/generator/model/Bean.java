package chanedi.generator.model;

import chanedi.util.StringUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

/**
 * @author Chanedi
 */
public class Bean {

    @Getter@Setter
    private String name;
    @Getter@Setter
    private String capitalizeName;
    @Getter
    private String tableName;
    @Getter@Setter
    private String comment;
    private Map<String, Property> propertyColumnNameMap = new HashMap<String, Property>(); // 乱序
    private List<Property> propertyList = new ArrayList<Property>(); // 按加入的顺序

    public void addProperty(Property property) {
        propertyColumnNameMap.put(property.getColumnName(), property);
        propertyList.add(property);
    }

    public Property getPropertyByColumnName(String columnName) {
        return propertyColumnNameMap.get(columnName);
    }

    public Collection<Property> getProperties() {
        return propertyList;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
        setName(StringUtils.uncapitalizeCamelBySeparator(tableName, "_"));
    }

    public void setName(String name) {
        this.name = name;
        this.capitalizeName = StringUtils.capitalize(name);
    }

    public void setCapitalizeName(String capitalizeName) {
        this.capitalizeName = capitalizeName;
        this.name = StringUtils.uncapitalize(capitalizeName);;
    }

}
