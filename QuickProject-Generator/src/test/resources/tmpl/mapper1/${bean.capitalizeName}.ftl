<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${bean.capitalizeName}">
    <sql id="allColumn">
        <#list bean.properties as prop>
        ${prop.columnName} ${prop.name}<#if prop_has_next>,</#if>
        </#list>
    </sql>
    <insert id="insert">
        <selectKey resultClass="java.lang.Long" keyProperty="id">
            SELECT SEQ_${bean.tableName}.NEXTVAL as id FROM DUAL
        </selectKey>
        /*${bean.capitalizeName}.insert*/
        insert into ${bean.tableName} (
        <#list bean.properties as prop>
            ${prop.columnName} <#if prop_has_next>,</#if>
        </#list>
        )
        values (
        <#list bean.properties as prop>
            <#if prop.name=="createdAt"||prop.name=="updatedAt">
            sysdate<#if prop_has_next>,</#if>
            <#elseif prop.name=="createdBy"||prop.name=="updatedBy">
            'SYS'<#if prop_has_next>,</#if>
            <#else>
            #${prop.columnName}#<#if prop_has_next>,</#if>
            </#if>
        </#list>
        )
    </insert>
    <update id="update" parameterClass="${config.javaPackageName}${module.name}.dto.${bean.capitalizeName}DTO">
        /*${bean.capitalizeName}.update*/
        update ${bean.tableName} t set
        <#list bean.properties as prop>
            <#if prop.name!="id"&&prop.name!="createdAt"&&prop.name!="updatedAt"&&prop.name!="createdBy"&&prop.name!="updatedBy">
            <isNotEmpty property="${prop.name}">
                t.${prop.columnName} = #${prop.name}#,
            </isNotEmpty>
            </#if>
        </#list>
        t.updated_at=sysdate
        where t.id = #id#
    </update>
</mapper>