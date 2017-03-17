<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- 引用jquery easy ui的js库及css -->
    <LINK rel="stylesheet" type="text/css"
          href="${baseurl}js/easyui/styles/default.css">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <title>用户管理</title>

    <script type="text/javascript">
        //datagrid列定义
        var columns_v = [ [ {
            field : 'sesnkey',//对应json中的key
            title : '会话名称',
            width : 120
        }, {
            field : 'f2ip',//对应json中的key
            title : '用户IP',
            width : 120
        }, {
            field : 'realnicmac',//对应json中的key
            title : '真实MAC',
            width : 120
        }, {
            field : 'slocation',//对应json中的key
            title : '地理位置',
            width : 120
        }, {
            field : 'captureTime',//对应json中的key
            title : '创建时间',
            width : 120
        }, {
            field : 'updateTime',//对应json中的key
            title : '更新时间',
            width : 120
        }, {
            field : 'f2version',//对应json中的key
            title : 'F2版本',
            width : 120
        }, {
            field : 'pcname',//对应json中的key
            title : '终端信息',
            width : 120
        }, {
            field : 'allnum',//对应json中的key
            title : '总条数',
            width : 120
        } ] ];

        //定义 datagird工具
        var toolbar_v = [ {//工具栏
            id : 'btnadd',
            text : '添加',
            iconCls : 'icon-add',
            handler : function() {
                //打开一个窗口，用户添加页面
                //参数：窗口的title、宽、高、url地址
                createmodalwindow("添加用户信息", 800, 250, '${baseurl}user/addsysuser.action');
            }
        } ];

        //加载datagrid
        $(function() {
            $('#sysuserlist').datagrid({
                title : '会话查询',//数据列表标题
                nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
                striped : true,//条纹显示效果
                url : '${baseurl}f2/queryPageSession.action',//加载数据的连接，引连接请求过来是json数据
                idField : 'id',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
                loadMsg : '',
                columns : columns_v,
                pagination : true,//是否显示分页
                rownumbers : true,//是否显示行号
                pageList:[15,30,50],
                toolbar : toolbar_v
            });
        });

        //查询方法
        function queryuser(){
            //datagrid的方法load方法要求传入json数据，最终将 json转成key/value数据传入action
            //将form表单数据提取出来，组成一个json
            var formdata = $("#sysuserqueryForm").serializeJson();
            $('#sysuserlist').datagrid('load',formdata);
        }
    </script>

</head>
<body>

<!-- html的静态布局 -->
<form id="sysuserqueryForm">
    <!-- 查询条件 -->
    <TABLE class="table_search">
        <TBODY>
        <tr>
            <td class="left">检索条件：</td>
            <td><INPUT type="text" name="sysuserCustom.userid" /></td>
            <td class="left">引擎名称：</td>
            <td><INPUT type="text" name="sysuserCustom.username" /></td>

            <td class="left">开始时间：</td>
            <td><INPUT type="text" name="sysuserCustom.sysmc" /></td>
            <td class="left">结束时间：</td>
            <td><INPUT type="text" name="sysuserCustom.sysmc" /></td>

            <td><a id="btnclear" href="#" onclick="clearuser()"
                   class="easyui-linkbutton" iconCls='icon-search'>清空</a></td>
            <td><a id="btnquery" href="#" onclick="queryuser()"
                   class="easyui-linkbutton" iconCls='icon-search'>查询</a></td>
            <td><a id="btnconfig" href="#" onclick="configuser()"
                   class="easyui-linkbutton" iconCls='icon-search'>配置</a></td>
            <td><a id="btnexport" href="#" onclick="exportuser()"
                   class="easyui-linkbutton" iconCls='icon-search'>导出</a></td>
        </tr>
        </TBODY>
    </TABLE>

    <!-- 查询列表 -->
    <TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
        <TBODY>
        <TR>
            <TD>
                <table id="sysuserlist"></table>
            </TD>
        </TR>
        </TBODY>
    </TABLE>
</form>
</body>
</html>