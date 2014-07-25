package chanedi.generator.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by 羽霓 on 2014/6/10.
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
    private ColumnType columnType;

    public void setColumnName(String columnName) {
        this.columnName = columnName;
        this.name = chanedi.utils.StringUtils.uncapitalizeCamelBySeparator(columnName, "_");
        this.capitalizeName = chanedi.utils.StringUtils.capitalize(this.name);
    }

}
