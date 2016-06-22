${bean.capitalizeName}DAO.java
public List<${bean.capitalizeName}> getBy<#list bean.properties as prop>${prop.capitalizeName}<#if prop_has_next>And</#if></#list>(<#list bean.properties as prop>${prop.type.java} ${prop.name}<#if prop_has_next>, </#if></#list>) {
    Map map = MapUtils.buildKeyValueMap(<#list bean.properties as prop>"${prop.name}", ${prop.name}<#if prop_has_next>, </#if></#list>);
    List<${bean.capitalizeName}> result = queryForList("${bean.capitalizeName}.getBy<#list bean.properties as prop>${prop.capitalizeName}<#if prop_has_next>And</#if></#list>", map);
    return result;
}

${bean.capitalizeName}.xml
<select id="getBy<#list bean.properties as prop>${prop.capitalizeName}<#if prop_has_next>And</#if></#list>" parameterClass="map" resultMap="resultMap">
    select <include refid="allColumn"/> from ${bean.tableName}
    <![CDATA[WHERE <#list bean.properties as prop>${prop.columnName}=#${prop.name}# <#if prop_has_next>AND </#if></#list>]]>
</select>

${bean.capitalizeName}Service.java
public List<${bean.capitalizeName}> getBy<#list bean.properties as prop>${prop.capitalizeName}<#if prop_has_next>And</#if></#list>(<#list bean.properties as prop>${prop.type.java} ${prop.name}<#if prop_has_next>, </#if></#list>) {
    List<${bean.capitalizeName}> result = ${bean.name}DAO.getBy<#list bean.properties as prop>${prop.capitalizeName}<#if prop_has_next>And</#if></#list>(<#list bean.properties as prop>${prop.name}<#if prop_has_next>, </#if></#list>);
    return result;
}

