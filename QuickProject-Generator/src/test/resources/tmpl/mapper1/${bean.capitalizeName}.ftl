<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE sqlMap
        PUBLIC "-//iBATIS.com//DTD SQL Map 2.0//EN"
        "http://www.ibatis.com/dtd/sql-map-2.dtd">
<sqlMap namespace="${bean.capitalizeName}">
    <resultMap id="resultMap" type="${config.javaPackageName}${module.name}.model.${bean.capitalizeName}">
    </resultMap>

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
            #${prop.name}#<#if prop_has_next>,</#if>
            </#if>
        </#list>
        )
    </insert>
    <update id="update" parameterClass="${config.javaPackageName}${module.name}.dto.${bean.capitalizeName}">
        /*${bean.capitalizeName}.update*/
        update ${bean.tableName} t set
        <#list bean.properties as prop>
            <#if prop.name!="id"&&prop.name!="createdAt"&&prop.name!="updatedAt"&&prop.name!="createdBy"&&prop.name!="updatedBy"&&prop.name!="version">
            <isNotEmpty property="${prop.name}">
                t.${prop.columnName} = #${prop.name}#,
            </isNotEmpty>
            </#if>
        </#list>
        t.VERSION = #version# + 1,
        t.UPDATED_AT = SYSDATE
        WHERE t.ID = #id#
        AND t.VERSION = #version#
    </update>

    <select id ="getById" parameterClass="long" resultMap="resultMap">
        /*${bean.capitalizeName}.getById*/
        select <include refid="allColumn"/> from ${bean.tableName} where ID=#id#
    </select>
</sqlMap>