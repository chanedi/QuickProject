package cc.oit.generate.${module.name}.model;

import java.util.*;
import lombok.Data;

@Data
public class ${bean.capitalizeName} extends Base {

    ${generate.serialVersionUID}

    <#list bean.properties as prop>
    private ${prop.type.java} ${prop.name};
    </#list>

}
