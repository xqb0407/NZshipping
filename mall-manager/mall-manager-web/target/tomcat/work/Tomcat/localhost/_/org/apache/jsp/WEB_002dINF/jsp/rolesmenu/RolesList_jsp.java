/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-07 06:58:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.rolesmenu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class RolesList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"../layui/css/layui.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"../layui/js/jquery.js\"></script>\n");
      out.write("<script src=\"../layui/layui.js\"></script>\r\n");
      out.write("<script src=\"../layui/js/IP.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../../layuiadmin/style/admin.css\" media=\"all\">\r\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"layui-fluid\">   \n");
      out.write("    <div class=\"layui-card\">\n");
      out.write("      <div class=\"layui-form layui-card-header layuiadmin-card-header-auto\">\n");
      out.write("        <div class=\"layui-form-item\">\n");
      out.write("          <div class=\"layui-inline\">\n");
      out.write("            角色筛选\n");
      out.write("          </div>\n");
      out.write("          <div class=\"layui-inline\">\n");
      out.write("            <select name=\"rolename\" lay-filter=\"LAY-user-adminrole-type\">\n");
      out.write("              <option value=\"-1\">全部角色</option>\n");
      out.write("              <option value=\"0\">管理员</option>\n");
      out.write("              <option value=\"1\">超级管理员</option>\n");
      out.write("              <option value=\"2\">纠错员</option>\n");
      out.write("              <option value=\"3\">采购员</option>\n");
      out.write("              <option value=\"4\">推销员</option>\n");
      out.write("              <option value=\"5\">运营人员</option>\n");
      out.write("              <option value=\"6\">编辑</option>\n");
      out.write("            </select>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"layui-card-body\">\n");
      out.write("        <div style=\"padding-bottom: 10px;\">\n");
      out.write("          <button class=\"layui-btn layuiadmin-btn-role\" id=\"add\" >添加</button>\n");
      out.write("        </div>\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<table id=\"users\" lay-filter=\"users\"></table>\r\n");
      out.write("\t\t</div>\n");
      out.write("        <script type=\"text/html\" id=\"bar\">\n");
      out.write("          <a class=\"layui-btn layui-btn-normal layui-btn-xs\" lay-event=\"edit\"><i class=\"layui-icon layui-icon-edit\"></i>编辑</a>\n");
      out.write("          <a class=\"layui-btn layui-btn-danger layui-btn-xs\" lay-event=\"delete\"><i class=\"layui-icon layui-icon-delete\"></i>删除</a>\n");
      out.write("        </script>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<script type=\"text/html\" id=\"bar\">\n");
      out.write("    <a class=\"layui-btn layui-btn-xs layui-btn-normal\" title=\"编辑\" lay-event=\"edit\">编辑</a>\n");
      out.write("    <a class=\"layui-btn layui-btn-xs\" title=\"刪除\" lay-event=\"delete\">刪除</a>\n");
      out.write("</script>\n");
      out.write("<script type=\"text/html\" id=\"dateTpl\">\n");
      out.write("    {{ layui.laytpl.fn(d.editdate) }}\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var table;\n");
      out.write("var layer;\n");
      out.write("var form;\n");
      out.write("var upload;\n");
      out.write("var laydate;\n");
      out.write("        layui.use(['layer', 'table','form','upload','laydate'], function ()\n");
      out.write("        {\n");
      out.write("            table = layui.table;\n");
      out.write("            layer = layui.layer;\n");
      out.write("            form =layui.form;\n");
      out.write("            upload=layui.upload;\n");
      out.write("            laydate=layui.laydate;\n");
      out.write("           \n");
      out.write("            //--------------方法渲染TABLE----------------\n");
      out.write("            var tableIns = table.render({\n");
      out.write("                elem: '#users'\n");
      out.write("                , id: 'users'\n");
      out.write("                , url: '/roles/rolesList'\n");
      out.write("                , cols: [[\n");
      out.write("                    { checkbox: true, LAY_CHECKED: false ,fixed: true } //其它参数在此省略\r\n");
      out.write("                    , { field: 'roleId', title: '角色ID', width: 440, align: 'center' }\r\n");
      out.write("                    , { field: 'roleName', title: '角色名称',width: 340,  align: 'center'}\r\n");
      out.write("                    , { field: 'roleRemark', title: '角色描述', width: 340,align: 'center' }\r\n");
      out.write("                    ,{title: '操作', fixed: 'right', toolbar: '#bar',width:150}\n");
      out.write("                ]]\r\n");
      out.write("\t\t\t\t, id:'testReload'\n");
      out.write("                , page: true\n");
      out.write("                , limits: [5, 10, 15]\n");
      out.write("                , limit: 10 //默认采用10\n");
      out.write("                , done: function (res, curr, count)\r\n");
      out.write("\t\t\t\t\n");
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
      out.write("            });\r\n");
      out.write("\t\t\t\r\n");
      out.write("           \r\n");
      out.write("            //工具条事件监听\n");
      out.write("            table.on('tool(users)', function (obj)\n");
      out.write("            { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter=\"对应的值\"\n");
      out.write("                var data = obj.data; //获得当前行数据\n");
      out.write("                var layEvent = obj.event; //获得 lay-event 对应的值\n");
      out.write("                var tr = obj.tr; //获得当前行 tr 的DOM对象\n");
      out.write("                if (layEvent === 'edit')\n");
      out.write("                { //编辑\n");
      out.write("                    var index = layui.layer.open({\r\n");
      out.write("                    \ttype: 2 //此处以iframe举例\r\n");
      out.write("                    \t   ,title: '编辑菜单'\r\n");
      out.write("                    \t   ,area: ['400px', '400px']\r\n");
      out.write("                    \t   ,shade: 0\r\n");
      out.write("                    \t   ,maxmin: true\r\n");
      out.write("                    \t   ,content: 'edRoles?roleId='+data.roleId+\"&roleName=\"+data.roleName+\"&roleRemark=\"+data.roleRemark\r\n");
      out.write("                    \t   ,zIndex: layer.zIndex //重点1\r\n");
      out.write("                    \t   ,success: function(layero,index){\r\n");
      out.write("                    \t   }\r\n");
      out.write("                    })\n");
      out.write("                }else if(layEvent === 'delete'){\n");
      out.write("                \tlayer.confirm('是否删除该菜单？', {\n");
      out.write("                \t\t  btn: ['确认', '取消'] //可以无限个按钮\n");
      out.write("                \t\t  ,btn1: function(index, layero){\n");
      out.write("                \t\t\t  $.ajax({\n");
      out.write("                \t\t\t\t   type: \"POST\",\n");
      out.write("                \t\t\t\t   url: \"/deletRole\",\n");
      out.write("                \t\t\t\t   data: \"roleId=\"+data.roleId,\n");
      out.write("                \t\t\t\t   success: function(msg){\n");
      out.write("                \t\t\t\t     if(msg.status==200){\n");
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
      out.write("            });\r\n");
      out.write("\t\t\t$(\"#add\").click(function(){\r\n");
      out.write("\t\t\t\tvar index = layui.layer.open({\r\n");
      out.write("\t\t\t\t\ttype: 2 //此处以iframe举例\r\n");
      out.write("\t\t\t\t\t       ,title: '添加角色'\r\n");
      out.write("\t\t\t\t\t       ,area: ['450px', '450px']\r\n");
      out.write("\t\t\t\t\t       ,shade: 0\r\n");
      out.write("\t\t\t\t\t       ,maxmin: true\r\n");
      out.write("\t\t\t\t\t       ,content: 'addRole'\r\n");
      out.write("\t\t\t\t\t\t   ,success: function (layero, index)\r\n");
      out.write("\t\t\t\t\t\t   {\r\n");
      out.write("\t\t\t\t\t\t\t   var body = layer.getChildFrame('body', index); //得到子页面层的BODY\r\n");
      out.write("\t\t\t\t\t\t\t   body.find('#hidValue').val(index); //将本层的窗口索引传给子页面层的hidValue中\r\n");
      out.write("\t\t\t\t\t\t   }\r\n");
      out.write("\t\t\t\t\t       ,zIndex: layer.zIndex //重点1\r\n");
      out.write("\t\t\t\t\t       ,success: function(layero){\r\n");
      out.write("\t\t\t\t\t         layer.setTop(layero); //重点2\r\n");
      out.write("\t\t\t\t\t       }\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t});\n");
      out.write("        });\n");
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