package ${config.javaPackageName}${module.name}.model;

import java.util.*;
import lombok.Data;
import javax.persistence.Table;
import com.zhiyi.common.model.EntityWithTime;

@Data
@Table(name = "${bean.tableName}")
public class ${bean.capitalizeName} extends EntityWithTime {

    ${generate.serialVersionUID}

    <#list bean.properties as prop>
    <#if prop.name!="id"&&prop.name!="createTime"&&prop.name!="modifyTime">
    private ${prop.type.java} ${prop.name}; <#if prop.comment??>// ${prop.comment}</#if>
    </#if>
    </#list>

}
