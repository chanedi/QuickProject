package chanedi.${module.name}.model;

import chanedi.model.Entity;

public class ${bean.capitalizeName} extends Entity {

    ${generate.serialVersionUID}

    <#list bean.properties as prop>
        private String ${prop.name};
    </#list>

}
