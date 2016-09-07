package chanedi.generator.model;

import chanedi.util.StringUtils;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Chanedi
 */
public class Property {

    @Getter
    private String name;
    @Getter
    private String capitalizeName;
    @Getter
    private String columnName;
    @Getter@Setter
    private String comment;
    @Getter@Setter
    private PropertyType type;

    public void setColumnName(String columnName) {
        this.columnName = columnName;
        this.name = StringUtils.uncapitalizeCamelBySeparator(columnName, "_");
        this.capitalizeName = StringUtils.capitalize(name);
    }

    public void setName(String name) {
        this.name = name;
        this.columnName = name.replaceAll("([A-Z])", "_$0").toUpperCase();
        this.capitalizeName = StringUtils.capitalize(name);
    }

}
