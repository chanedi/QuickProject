@Data
@Table(name = "${bean.tableName}")
public class ${bean.capitalizeName}DTO extends FundBaseDTO {

    ${generate.serialVersionUID}

    <#list bean.properties as prop>
    <#if prop.name!="id"&&prop.name!="createTime"&&prop.name!="modifyTime">
    private ${prop.type.java} ${prop.name}; <#if prop.comment??>// ${prop.comment}</#if>
    </#if>
    </#list>

}
