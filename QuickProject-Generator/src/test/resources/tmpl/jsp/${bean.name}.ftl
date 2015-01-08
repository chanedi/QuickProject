<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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
                        return '<button class="btn btn-warning btn-sm" type="button" onclick="edit(\''+ data.id +'\')">编辑</button>';
                    } }
                ]
            });
        });

    </script>
</head>
<body>
<div id="page-content" class="page-content">
    <div class="page-header">
        <h1>
            ${bean.comment!}管理
        </h1>
    </div>
    <form id="${bean.name}Form" table="#${bean.name}Table">
        <div class="row">
            <#list bean.properties as prop>
            <#if prop.name!="id"&&prop.name!="createTime"&&prop.name!="modifyTime"&&prop.name!="operator">
            <div class="col-sm-2">
                <label class="col-sm-3">${prop.comment!}:</label>
                <input class="col-sm-9" name="${prop.name}" type="${prop.type.input}" />
            </div>
            </#if>
            </#list>
            <div class="col-sm-3">
                <button class="btn-search" type="button">
                    <i class="icon-edit"></i>查询
                </button>
                <button class="btn-clear" type="reset">
                    <i class="icon-edit"></i>清空
                </button>
            </div>
        </div>
    </form>
    <table id="${bean.name}Table" class="dataTable"></table>
</div>
</body>
</html>
