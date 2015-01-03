package ${config.javaPackageName}${module.name}.model;

import java.util.*;
import lombok.Data;
import javax.persistence.Table;
import chanedi.model.Entity;

@Data
@Table(name = "${bean.tableName}")
public class ${bean.capitalizeName} extends Entity {

    ${generate.serialVersionUID}

    <#list bean.properties as prop>
    private ${prop.type.java} ${prop.name};
    </#list>

}
