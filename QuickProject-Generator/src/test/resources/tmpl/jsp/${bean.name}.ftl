<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="hero" uri="http://www.xiaoquwuyou.com/zhiyi/tags" %>
<c:set var="ctx" value="${'$'}{pageContext.request.contextPath}"/>
<script type="application/javascript">
    $(function() {
        $("#${bean.name}Table").DataTable({
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
            order: [ 1, "asc" ],
            columns: [
                { data: "id", "orderable": false, sortable: false, title: '<input type="checkbox" class="ace" onclick="$.dataTableSelectAll(this)"/><span class="lbl"></span>', "sWidth": "2%"},
                <#list bean.properties as prop>
                <#if prop.name!="id"&&prop.name!="createTime"&&prop.name!="modifyTime"&&prop.name!="operator">
                { data: "${prop.name}", title: "${prop.comment!}" },
                </#if>
                </#list>
                { data: null, title: "操作", render : function(data, type, full, meta) {
                    $("#edit${bean.capitalizeName}Dialog").data("" + data.id, data);
                    return '<button name="edit" class="btn btn-warning btn-xs" type="button" onclick="openEditDialog(\'#edit${bean.capitalizeName}Dialog\', \''+ data.id +'\')">编辑</button>';
                } }
            ],
            createdRow: function (row, data, dataIndex) {
                $(row).dblclick(function () {
                    openEditDialog("#edit${bean.capitalizeName}Dialog", data.id + "");
                });
                $("#edit${bean.capitalizeName}Dialog").data("" + data.id, data);
            },
            fnRowCallback: function (nRow, aData, iDisplayIndex) {
                $('td:eq(0)', nRow).html("<label><input type='checkbox' class='ace' macode='" + aData["code"] + "'  mastatus='" + aData["status"] + "' " +
                "hasBinding=" + aData["hasBinding"] + " value=\"" + aData["id"] + "\"" + "/><span class='lbl'></span></label>");
            }
        });

        $('#edit${bean.capitalizeName}Dialog').dialog({
            width: 800,
            refreshTitleTarget : "${bean.comment!}",
            autoOpen: false
        });

        $('#edit${bean.capitalizeName}Form').validate();
        
        $("#add${bean.capitalizeName}Btn").click(function () {
            openNewDialog('#edit${bean.capitalizeName}Dialog');
        });
        
        $("#update${bean.capitalizeName}Btn").click(function () {
            var items = $.dataTableCheckedOneItem("${bean.name}Table", "请选择一个推拿师", "只能选择一个推拿师");
            if (items) {
                openEditDialog("#edit${bean.capitalizeName}Dialog", items[0].value);
            }
        });
    });

</script>
<div id="page-content" class="page-content">
    <div class="page-header">
        <h1>
            ${bean.comment!}管理
            <span class="pull-right">
                <hero:button permission='${r'${permissionList}'}' id="add${bean.capitalizeName}Btn" className="btn btn-sm" authorize="${bean.name}:add"/>
                <hero:button permission='${r'${permissionList}'}' id="update${bean.capitalizeName}Btn" className="btn btn-primary btn-sm" authorize="${bean.name}:update"/>
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