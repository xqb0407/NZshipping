/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-08 13:23:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>layui</title>\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"layui/css/layui.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"../layui/js/jquery.js\"></script>\n");
      out.write("<script src=\"layui/layui.js\"></script>\r\n");
      out.write("<script src=\"../layui/js/IP.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("\t\r\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t  <form class=\"layui-form\">\r\n");
      out.write("\t\t\t  <div class=\"layui-form-item\" style=\"margin:15px;height:30px; padding-top:30px ;\" >\r\n");
      out.write("\t\t\t  \t    \t<div style=\"height:40px;width:80px;float:left;line-height:40px;\">订单编号</div>\r\n");
      out.write("\t\t\t  \t        <input type=\"text\" class=\"layui-input\" style=\"width:200px;float:left;\" id=\"title\" name=\"title\" value=\"\" lay-verify=\"\" placeholder=\"请输入订单编号\" autocomplete=\"off\">\r\n");
      out.write("\t\t\t  \t\t    <div class=\"layui-input-inline\" style=\"width:150px;text-align:center;\" id=\"btn\">\r\n");
      out.write("\t\t\t  \t\t       <button class=\"layui-btn but_  layui-btn layui-btn-normal \" data-type=\"reload\"  onclick=\"return false;\"  id=\"btn1\">搜索</button>\r\n");
      out.write("\t\t\t  \t\t    </div> \r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t\t </form>\r\n");
      out.write("<!-- \t<fieldset class=\"layui-elem-field layui-field-title\" id=\"zdytitle\">\r\n");
      out.write("\t\t<legend>广告位置</legend>\r\n");
      out.write("\t</fieldset> -->\n");
      out.write("<!-- <form class=\"layui-form\">\n");
      out.write("<div class=\"layui-form-item\" style=\"margin:15px;height:30px;\">\n");
      out.write("    \t\n");
      out.write("        <input type=\"text\" class=\"layui-input\" style=\"display:inline-block;width:250px;float:left;\" id=\"keyword\" name=\"keyword\" value=\"\" lay-verify=\"\" placeholder=\"搜索\" autocomplete=\"off\">\n");
      out.write("\t    <div class=\"layui-input-inline\" style=\"width:150px;text-align:center;\">\n");
      out.write("\t        <a class=\"layui-btn\" id=\"search\" data-type=\"reload\" name=\"search\">\n");
      out.write("\t            <i class=\"layui-icon\"></i>搜索\n");
      out.write("\t        </a>\n");
      out.write("\t    </div> \n");
      out.write("\t    <div style=\"float:left;width:380px;height:40px;\">\n");
      out.write("\t    \t<!-- <div class=\"layui-input-inline\" style=\"width:100px;margin-right:20px;\">\n");
      out.write("\t\t     \t<a class=\"layui-btn layui-btn-normal\" id=\"add\" name=\"add\">\n");
      out.write("\t\t            <i class=\"layui-icon\">&#xe654;</i>添加广告\n");
      out.write("\t\t        </a>\n");
      out.write("\t\t    </div> -->\n");
      out.write("\t\t<!--    <div class=\"layui-input-inline\" style=\"width:100px;\">\n");
      out.write("\t\t     \t<a class=\"layui-btn layui-btn-normal\" id=\"delete\" name=\"delete\">\n");
      out.write("\t\t            <i class=\"layui-icon\">&#x1006;</i>批量删除\n");
      out.write("\t\t        </a>\n");
      out.write("\t\t    </div>\n");
      out.write("    \t</div>\n");
      out.write("</div>\n");
      out.write("</form> --> \n");
      out.write("<div>\n");
      out.write("    <table id=\"type\" lay-filter=\"type\"></table>\n");
      out.write("</div>\n");
      out.write("<div id=\"formData\" style=\"width:300px;display:none;padding-top:15px;\">\n");
      out.write("\t<form class=\"layui-form\" id=\"typeForm\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"id\" id=\"typeId\" />\n");
      out.write("\t\t<div class=\"layui-form-item\">\n");
      out.write("\t\t\t    <label class=\"layui-form-label\">广告位置</label>\n");
      out.write("\t\t\t    <div class=\"layui-input-block\">\n");
      out.write("\t\t\t      <input type=\"text\" name=\"name\" id=\"typeName\" required lay-verify=\"required\" value=\"\" class=\"layui-input\" />\n");
      out.write("\t\t\t    </div>\t\t\t    \n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write("<div id=\"addData\" style=\"width:300px;display:none;padding-top:15px;\">\n");
      out.write("\t<form class=\"layui-form\" id=\"addTypeForm\">\n");
      out.write("\t\t<div class=\"layui-form-item\">\n");
      out.write("\t\t\t    <label class=\"layui-form-label\">广告名称</label>\n");
      out.write("\t\t\t    <div class=\"layui-input-block\">\n");
      out.write("\t\t\t      <input type=\"text\" name=\"typeName\" required lay-verify=\"required\" value=\"\" class=\"layui-input\" />\n");
      out.write("\t\t\t    </div>\t\t\t    \n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("</div>\r\n");
      out.write("\n");
      out.write("<script type=\"text/html\" id=\"bar\">\n");
      out.write("    <!-- <a class=\"layui-btn layui-btn-xs layui-btn-normal\" title=\"编辑\" lay-event=\"edit\">编辑</a> -->\n");
      out.write("    <a class=\"layui-btn layui-btn-xs layui-bg-red\" title=\"刪除\" lay-event=\"delete\">刪除</a>\n");
      out.write("</script>\n");
      out.write("<script type=\"text/html\" id=\"dateTpl\">\n");
      out.write("    {{ layui.laytpl.fn(d.editdate) }}\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var table;\n");
      out.write("var layer;\n");
      out.write("var form;\n");
      out.write("        layui.use(['layer', 'table','form'], function ()\n");
      out.write("        {\n");
      out.write("            table = layui.table;\n");
      out.write("            layer = layui.layer;\n");
      out.write("            form =layui.form;\n");
      out.write("            //--------------方法渲染TABLE----------------\n");
      out.write("            var tableIns = table.render({\n");
      out.write("                elem: '#type'\n");
      out.write("                , id: 'type'\n");
      out.write("                , url: 'test/category'\n");
      out.write("                ,width:790\n");
      out.write("                , cols: [[\n");
      out.write("                     { checkbox: true, LAY_CHECKED: false } //其它参数在此省略\n");
      out.write("                     ,{ field: 'id', title: '对应的类型编号', width: 130, align: 'center' }\r\n");
      out.write("\t\t\t\t\t ,{ field: 'parentId', title: '父类目ID', width: 100, align: 'center' }\n");
      out.write("                     , { field: 'name', title: '类型名称', width: 300, align: 'center'}\n");
      out.write("\t\t\t\t\t ,{ field:'status', title: '广告状态', width: 112, align: 'center',templet: function(d){\n");
      out.write("                          if(d.typeState==1){\n");
      out.write("                        \t  return \"<input type='checkbox' lay-filter='switchTest' name='\"+d.status+\"' lay-skin='switch' lay-text='禁用|正常'>\";\n");
      out.write("                          }else{\n");
      out.write("                        \t  return \"<input type='checkbox' lay-filter='switchTest' name='\"+d.status+\"' lay-skin='switch' lay-text='正常|禁用' checked>\";\n");
      out.write("                          }\n");
      out.write("                \t }\n");
      out.write("                  },{title: '操作', fixed: 'right',  align: 'center', toolbar: '#bar'}\n");
      out.write("                ]]\n");
      out.write("                , page: true\n");
      out.write("                , limits: [5, 10, 15]\n");
      out.write("                , limit: 10 //默认采用10\n");
      out.write("                , done: function (res, curr, count)\n");
      out.write("                {\n");
      out.write("                    //如果是异步请求数据方式，res即为你接口返回的信息。\n");
      out.write("                    //如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、count为数据总长度\n");
      out.write("                    //console.log(res);\n");
      out.write("                    //得到当前页码\n");
      out.write("                    //console.log(curr);\n");
      out.write("                    $(\"#curPageIndex\").val(curr);\n");
      out.write("                    //得到数据总量\n");
      out.write("                    //console.log(count);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("            $(\"#add\").click(function(){\n");
      out.write("            \tlayer.open({\n");
      out.write("                    type: 1,\n");
      out.write("                    title: '增加商品分类信息',\n");
      out.write("                    shade: 0.4,  //阴影度\n");
      out.write("                    fix: false,\n");
      out.write("                    shadeClose: true,\n");
      out.write("                    maxmin: false,\n");
      out.write("                    area: ['400px;', '200px;'],    //窗体大小（宽,高）\n");
      out.write("                    content: $('#addData'),\n");
      out.write("                    success: function (layero, index)\n");
      out.write("                    {\n");
      out.write("                        var body = layer.getChildFrame('body', index); //得到子页面层的BODY\n");
      out.write("                        form.render();\n");
      out.write("                        body.find('#hidValue').val(index); //将本层的窗口索引传给子页面层的hidValue中\n");
      out.write("                    },\n");
      out.write("                    btn:['添加','取消'],\n");
      out.write("                    yes: function(index, layero){\n");
      out.write("                    \t$.post('goodsType/addGoodsType',$('#addTypeForm').serialize(),function(data){\n");
      out.write("                            if (data == 'success')\n");
      out.write("                            {\n");
      out.write("                                parent.layer.msg('添加分类信息成功！', { icon: 1, shade: 0.4, time: 1000 });\n");
      out.write("                                $(\"#search\").click();\n");
      out.write("                            }\n");
      out.write("                            else\n");
      out.write("                            {\n");
      out.write("                                parent.layer.msg('添加分类信息失败！', { icon: 5, shade: 0.4, time: 1000 });\n");
      out.write("                            }\n");
      out.write("                            layer.close(index);\n");
      out.write("                    \t}); \n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            //#region --------------批量删除----------------\n");
      out.write("            $(\"#delete\").click(function ()\n");
      out.write("            {\n");
      out.write("                var checkStatus = table.checkStatus('type');\n");
      out.write("                var count = checkStatus.data.length;//选中的行数\n");
      out.write("                if (count > 0)\n");
      out.write("                {\n");
      out.write("                    parent.layer.confirm('确定要删除所选分类？', { icon: 3 }, function (index)\n");
      out.write("                    {\n");
      out.write("                        var data = checkStatus.data; //获取选中行的数据\n");
      out.write("                        var batchId = '';\n");
      out.write("                        for (var i = 0; i < data.length; i++)\n");
      out.write("                        {\n");
      out.write("                        \tbatchId += data[i].typeId + \",\";\n");
      out.write("                        }\n");
      out.write("                        $.ajax({\n");
      out.write("                            url: 'goodsType/batchDelete',\n");
      out.write("                            type: \"post\",\n");
      out.write("                            data: { 'batchId': batchId },\n");
      out.write("                            success: function (result){\n");
      out.write("                                if (result==\"success\"){\n");
      out.write("                                     parent.layer.msg('删除成功', { icon: 1, shade: 0.4, time: 1000 })\n");
      out.write("                                     $(\"#search\").click();//重载TABLE\n");
      out.write("                                }else{\n");
      out.write("                                     parent.layer.msg(\"删除失败\", { icon: 5, shade: [0.4], time: 1000 });\n");
      out.write("                                }\n");
      out.write("                                parent.layer.close(index);\n");
      out.write("                            }\n");
      out.write("                        })\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                    parent.layer.msg(\"请至少选择一条数据\", { icon: 5, shade: 0.4, time: 1000 });\n");
      out.write("            });\n");
      out.write("            //#region --------------搜索----------------\n");
      out.write("            $(\"#search\").click(function ()\n");
      out.write("            {\n");
      out.write("            \tvar word=$(\"#keyword\").val();\n");
      out.write("                tableIns.reload({\n");
      out.write("                    where: {\n");
      out.write("                    \tkeyword: word\n");
      out.write("                    },page: {\n");
      out.write("                    curr: 1 //重新从第 1 页开始\n");
      out.write("                  }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            //#endregion\n");
      out.write("\t\t\tform.on('switch(switchTest)',function(data){\n");
      out.write("\t\t\t\tvar id=data.elem.name;\n");
      out.write("\t\t\t\tvar flag=data.elem.checked;\n");
      out.write("\t\t\t\tif(flag){\n");
      out.write("\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\t\ttype:\"post\",\n");
      out.write("\t\t\t\t\t\turl:\"goodsType/changeTypeState\",\n");
      out.write("\t\t\t\t\t\tdata:\"id=\"+id+\"&status=\"+2,\n");
      out.write("\t\t\t\t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\t\t\t\tif(data.status==200){\n");
      out.write("\t\t\t\t\t\t\t\tlayer.msg('禁用广告成功！',{icon:1,time:2000});\n");
      out.write("\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\tlayer.msg('禁用广告失败！请重试！',{icon:5,time:2000});\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\t\ttype:\"post\",\n");
      out.write("\t\t\t\t\t\turl:\"goodsType/changeTypeState\",\n");
      out.write("\t\t\t\t\t\tdata:\"id=\"+id+\"&status=\"+1,\n");
      out.write("\t\t\t\t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\t\t\t\tif(data.status==200){\n");
      out.write("\t\t\t\t\t\t\t\tlayer.msg(\"启用广告成功！\",{icon:1,time:2000});\n");
      out.write("\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\tlayer.msg(\"启用广告失败！请重试！\",{icon:5,time:2000});\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("            //工具条事件监听\n");
      out.write("            table.on('tool(type)', function (obj)\n");
      out.write("            { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter=\"对应的值\"\n");
      out.write("                var data = obj.data; //获得当前行数据\n");
      out.write("                var layEvent = obj.event; //获得 lay-event 对应的值\n");
      out.write("                var tr = obj.tr; //获得当前行 tr 的DOM对象\n");
      out.write("                if (layEvent === 'edit')\n");
      out.write("                { //编辑\n");
      out.write("                    layer.open({\n");
      out.write("                        type: 1,\n");
      out.write("                        title: '编辑商品分类信息',\n");
      out.write("                        shade: 0.4,  //阴影度\n");
      out.write("                        fix: false,\n");
      out.write("                        shadeClose: true,\n");
      out.write("                        maxmin: false,\n");
      out.write("                        area: ['400px;', '200px;'],    //窗体大小（宽,高）\n");
      out.write("                        content: $('#formData'),\n");
      out.write("                        success: function (layero, index)\n");
      out.write("                        {\n");
      out.write("                            var body = layer.getChildFrame('body', index); //得到子页面层的BODY\n");
      out.write("                            $(\"#typeId\").val(data.typeId);\n");
      out.write("                            $(\"#typeName\").val(data.typeName);\n");
      out.write("                            form.render();\n");
      out.write("                            body.find('#hidValue').val(index); //将本层的窗口索引传给子页面层的hidValue中\n");
      out.write("                        },\n");
      out.write("                        btn:['修改','取消'],\n");
      out.write("                        yes: function(index, layero){\n");
      out.write("                        \t$.post('goodsType/updateGoodsType',$('#typeForm').serialize(),function(data){\n");
      out.write("                                if (data == 'success')\n");
      out.write("                                {\n");
      out.write("                                    parent.layer.msg('修改分类信息成功！', { icon: 1, shade: 0.4, time: 1000 });\n");
      out.write("                                    $(\"#search\").click();\n");
      out.write("                                    $(\"#handle_status\").val('');\n");
      out.write("                                }\n");
      out.write("                                else\n");
      out.write("                                {\n");
      out.write("                                    parent.layer.msg('修改分类信息失败！', { icon: 5, shade: 0.4, time: 1000 });\n");
      out.write("                                }\n");
      out.write("                                layer.close(index);\n");
      out.write("                        \t}); \n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }else if(layEvent === 'delete'){\n");
      out.write("                \tlayer.confirm('是否删除该分类？', {\n");
      out.write("                \t\t  btn: ['确认', '取消'] //可以无限个按钮\n");
      out.write("                \t\t  ,btn1: function(index, layero){\n");
      out.write("                \t\t\t  $.ajax({\n");
      out.write("                \t\t\t\t   type: \"POST\",\n");
      out.write("                \t\t\t\t   url: \"goodsType/deleteGoodsType\",\n");
      out.write("                \t\t\t\t   data: \"typeId=\"+data.typeId,\n");
      out.write("                \t\t\t\t   success: function(msg){\n");
      out.write("                \t\t\t\t     if(msg=='success'){\n");
      out.write("                \t\t\t\t    \t parent.layer.msg('删除成功', { icon: 1, shade: 0.4, time: 1000 });\n");
      out.write("                \t\t\t\t     }else{\n");
      out.write("                \t\t\t\t    \t parent.layer.msg('删除失败', { icon: 5, shade: 0.4, time: 1000 });\n");
      out.write("                \t\t\t\t     }\n");
      out.write("                \t\t\t\t   }\n");
      out.write("                \t\t\t\t});\n");
      out.write("                \t\t\t  $(tr).remove();\n");
      out.write("                \t\t\t  layer.close(index);\n");
      out.write("                \t\t  }\n");
      out.write("                \t\t});\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\r\n");
      out.write("\t\tconsole.log([\r\n");
      out.write("\t\t    \"                   _ooOoo_\",\r\n");
      out.write("\t\t    \"                  o8888888o\",\r\n");
      out.write("\t\t    \"                  88\\\" . \\\"88\",\r\n");
      out.write("\t\t    \"                  (| -_- |)\",\r\n");
      out.write("\t\t    \"                  O\\\\  =  /O\",\r\n");
      out.write("\t\t    \"               ____/`---'\\\\____\",\r\n");
      out.write("\t\t    \"             .'  \\\\\\\\|     |//  `.\",\r\n");
      out.write("\t\t    \"            /  \\\\\\\\|||  :  |||//  \\\\\",\r\n");
      out.write("\t\t    \"           /  _||||| -:- |||||-  \\\\\",\r\n");
      out.write("\t\t    \"           |   | \\\\\\\\\\\\  -  /// |   |\",\r\n");
      out.write("\t\t    \"           | \\\\_|  ''\\\\---/''  |   |\",\r\n");
      out.write("\t\t    \"           \\\\  .-\\\\__  `-`  ___/-. /\",\r\n");
      out.write("\t\t    \"         ___`. .'  /--.--\\\\  `. . __\",\r\n");
      out.write("\t\t    \"      .\\\"\\\" '<  `.___\\\\_<|>_/___.'  >'\\\"\\\".\",\r\n");
      out.write("\t\t    \"     | | :  `- \\\\`.;`\\\\ _ /`;.`/ - ` : | |\",\r\n");
      out.write("\t\t    \"     \\\\  \\\\ `-.   \\\\_ __\\\\ /__ _/   .-` /  /\",\r\n");
      out.write("\t\t    \"======`-.____`-.___\\\\_____/___.-`____.-'======\",\r\n");
      out.write("\t\t    \"                   `=---='\",\r\n");
      out.write("\t\t    \"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\",\r\n");
      out.write("\t\t    \"        佛祖保佑       永不宕机      永无BUG\"\r\n");
      out.write("\t\t].join('\\n'));\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}