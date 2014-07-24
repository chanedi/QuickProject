package chanedi.generator.model;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by 羽霓 on 2014/6/10.
 */
@Data
public class Property {

    private String name;
    private StringBuffer modelName;
    private String comment;
    private ColumnType columnType;

    public String getModelName() {
        if (modelName == null) {
            modelName = new StringBuffer();
            String[] splits = name.split("_");
            modelName.append(splits[0].toLowerCase());
            for (int i = 1; i < splits.length ; i++) {
                modelName.append(StringUtils.capitalize(splits[i].toLowerCase()));
            }
        }
        return modelName.toString();
    }

}
