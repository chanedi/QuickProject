package chanedi.generator.model;

import chanedi.utils.StringUtils;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 羽霓 on 2014/6/10.
 */
public class Bean {

    @Getter
    private String name;
    @Getter
    private String capitalizeName;
    @Getter
    private String tableName;
    @Getter@Setter
    private String comment;
    @Getter
    private Map<String, Property> columns = new HashMap<String, Property>();

    public void addColumn(Property column) {
        columns.put(column.getColumnName(), column);
    }

    public Property getColumn(String columnName) {
        return columns.get(columnName);
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
        this.name = StringUtils.uncapitalizeCamelBySeparator(tableName, "_");
        this.capitalizeName = StringUtils.capitalize(this.name);
    }

}
