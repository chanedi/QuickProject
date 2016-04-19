${bean.capitalizeName}DAO.java
public List<${bean.capitalizeName}DTO></DTO> getBy<#list bean.properties as prop>${prop.capitalizeName}<#if prop_has_next>And</#if></#list>(<#list bean.properties as prop>${prop.type.java} ${prop.name}<#if prop_has_next>, </#if></#list>) {
Map map = MapUtils.buildKeyValueMap(<#list bean.properties as prop>"${prop.name}", ${prop.name}</#list>);
return queryForList("${bean.capitalizeName}.getBy<#list bean.properties as prop>${prop.capitalizeName}<#if prop_has_next>And</#if></#list>", <#list bean.properties as prop>${prop.name}<#if prop_has_next>, </#if></#list>);
}

${bean.capitalizeName}.xml
<select id="getBy<#list bean.properties as prop>${prop.capitalizeName}<#if prop_has_next>And</#if></#list>" parameterClass="map"  resultClass="${packageName}${bean.capitalizeName}">
    <include refid="selectAll"/>
    <![CDATA[from BUS_FUND_BUY_REQUEST WHERE <#list bean.properties as prop>${prop.columnName}=#${prop.name}# <#if prop_has_next>AND </#if></#list>]]>
</select>

