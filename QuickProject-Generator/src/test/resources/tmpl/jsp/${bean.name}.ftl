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
                        data.filter = [{
                            field: "modifyTime",
                            data: {
                                comparison: "gt",
                                type: "date",
                                value: $("#${bean.name}Form input[name='earliestRunTime']").val()
                            }
                        },{
                            field: "modifyTime",
                            data: {
                                comparison: "lt",
                                type: "date",
                                value: $("#${bean.name}Form input[name='latestRunTime']").val()
                            }
                        }, {
                            field: "onlyFailure",
                            data: {
                                type: "custom",
                                value: $("#${bean.name}Form input[name='onlyFailure']").prop('checked')
                            }
                        }];
                        var arr = $("#${bean.name}Form").serializeArray();
                        for(var i = 0; i < arr.length; i++) {
                            var param = arr[i];
                            data[param.name] = param.value;
                        }
                    }
                },
                order: [[ 1, "asc" ]],
                columns: [
                    <#list bean.properties as prop>
                    <#if prop.name!="id"&&prop.name!="createTime"&&prop.name!="modifyTime">
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
            技师管理
        </h1>
    </div>
    <form id="${bean.name}Form" table="#${bean.name}Table">
        <div class="row">
            <#list bean.properties as prop>
            <#if prop.name!="id"&&prop.name!="createTime"&&prop.name!="modifyTime">
            <div class="col-sm-4" style="text-align: center;">
                <label>${prop.comment!}</label>
                <input name="${prop.name}" type="${prop.type.input}" />
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
