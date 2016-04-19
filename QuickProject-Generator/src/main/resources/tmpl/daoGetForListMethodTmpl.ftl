${bean.capitalizeName}DAO
public List<${bean.capitalizeName}DTO> getBy<#list bean.properties as prop>${prop.capitalizeName}<#if prop_has_next>And</#if></#list>(<#list bean.properties as prop>${prop.type.java} ${prop.name}<#if prop_has_next>,</#if></#list>) {
    Map map = MapUtils.buildKeyValueMap(<#list bean.properties as prop>"${prop.name}", ${prop.name}</#list>);
    return queryForList("SellReqToBank.getAccountById", sellRequestId, bizType);
}