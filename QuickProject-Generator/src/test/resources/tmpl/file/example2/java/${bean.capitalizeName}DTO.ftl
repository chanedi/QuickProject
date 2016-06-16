package ${config.javaPackageName}.dto;

public class ${bean.capitalizeName}DTO extends FundBaseDTO {

    ${generate.serialVersionUID}

    <#list bean.properties as prop>
    <#if prop.name!="id"&&prop.name!="createdAt"&&prop.name!="createdBy"&&prop.name!="updatedAt"&&prop.name!="updatedBy">
    private ${prop.type.java} ${prop.name}; <#if prop.comment??>// ${prop.comment}</#if>
    </#if>
    </#list>

}
