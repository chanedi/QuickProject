<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${'$'}{pageContext.request.contextPath}"/>
<script type="application/javascript">
    $(function() {
        $("#${bean.name}Table").DataTable({
            processing: true,
            serverSide: true,
            searching: false,
            ajax: {
                url: "${bean.name}.json",
                data: function(data) {
                    var arr = $("#${bean.name}Form").serializeArray();
                    for(var i = 0; i < arr.length; i++) {
                        var param = arr[i];
                        data[param.name] = param.value;
                    }
                }
            },
            order: [[ 0, "asc" ]],
            columns: [
                <#list bean.properties as prop>
                <#if prop.name!="id"&&prop.name!="createTime"&&prop.name!="modifyTime"&&prop.name!="operator">
                { data: "${prop.name}", title: "${prop.comment!}" },
                </#if>
                </#list>
                { data: null, title: "操作", render : function(data, type, full, meta) {
                    $("#edit${bean.capitalizeName}Dialog").data("" + data.id, data);
                    return '<button name="edit" class="btn btn-warning btn-xs" type="button" onclick="openEditDialog(\'#edit${bean.capitalizeName}Dialog\', \''+ data.id +'\')">编辑</button>';
                } }
            ]
        });

        $('#edit${bean.capitalizeName}Dialog').dialog({
            width: 800,
            refreshTitleTarget : "${bean.comment!}",
            autoOpen: false
        });

        $('#edit${bean.capitalizeName}Form').validate();
    });

</script>
<div id="page-content" class="page-content">
    <div class="page-header">
        <h1>
            ${bean.comment!}管理
            <span class="pull-right">
                <span class="pull-right">
                    <button class="btn-common" onclick="openNewDialog('#edit${bean.capitalizeName}Dialog')" type="button">
                        <i class="icon-edit"></i>新增
                    </button>
                </span>
            </span>
        </h1>
    </div>
    <form id="${bean.name}Form" table="#${bean.name}Table">
        <div class="row">
            <#list bean.properties as prop>
            <#if prop.name!="id"&&prop.name!="createTime"&&prop.name!="modifyTime"&&prop.name!="operator">
            <div class="col-xs-2 form-group">
                <label class="col-xs-5">${prop.comment!}:</label>
                <input class="col-xs-7" name="${prop.name}" type="${prop.type.input}" />
            </div>
            </#if>
            </#list>
            <div class="col-xs-4 form-group">
                <div class="col-xs-1"></div>
                <button class="btn-search col-xs-3" type="button" style="width:70px;">
                    <i class="icon-edit"></i>查找
                </button>
                <div class="col-xs-1"></div>
                <button class="btn-clear col-xs-3" type="reset" style="width:70px;">
                    <i class="icon-edit"></i>清空
                </button>
            </div>
        </div>
    </form>
    <table id="${bean.name}Table" class="dataTable"></table>
</div>
<div id="edit${bean.capitalizeName}Dialog" style="display: none">
    <form id="edit${bean.capitalizeName}Form" model="${bean.name}" table="#${bean.name}Table" class="form-horizontal" action="${'$'}{ctx}/${bean.name}/save.json" enctype="multipart/form-data" method="post">
        <input name="id" type="hidden"/>
        <div class="row">
            <div class="col-xs-6 form-row">
                <#list bean.properties as prop>
                <#if prop.name!="id"&&prop.name!="createTime"&&prop.name!="modifyTime"&&prop.name!="operator">
                <div>
                    <label>${prop.comment!}:</label>
                    <input name="${prop.name}" type="${prop.type.input}" />
                </div>
                </#if>
                </#list>
            </div>
        </div>
    </form>
</div>