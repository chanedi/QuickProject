package chanedi.generator.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Chanedi
 */
public class Property {

    @Getter
    private String name;
    @Getter
    private String columnName;
    @Getter@Setter
    private String comment;
    @Getter@Setter
    private PropertyType type;

    public void setColumnName(String columnName) {
        this.columnName = columnName;
        this.name = chanedi.util.StringUtils.uncapitalizeCamelBySeparator(columnName, "_");
    }

}
