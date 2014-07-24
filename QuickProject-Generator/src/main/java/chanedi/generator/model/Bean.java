package chanedi.generator.model;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 羽霓 on 2014/6/10.
 */
@Data
public class Bean {

    private StringBuffer modelName;
    private String name;
    private String comment;
    private Map<String, Property> columns = new HashMap<String, Property>();

    public void addColumn(Property column) {
        columns.put(column.getName(), column);
    }

    public Property getColumn(String columnName) {
        return columns.get(columnName);
    }

    public String getModelName() {
        if (modelName == null) {
            modelName = new StringBuffer();
            String[] splits = name.split("_");
            for (int i = 2; i < splits.length ; i++) {
                modelName.append(StringUtils.capitalize(splits[i].toLowerCase()));
            }
        }
        return modelName.toString();
    }

}
