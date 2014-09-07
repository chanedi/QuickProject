<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="chanedi.${module.name}.dao.${bean.capitalizeName}DAO">
    <resultMap type="chanedi.${module.name}.model.${bean.capitalizeName}" id="getMap">
    </resultMap>
    <sql id="queryColumns">
        <#list bean.properties as prop>
        a.${prop.columnName}<#if prop_has_next>,</#if>
        </#list>
    </sql>
</mapper>