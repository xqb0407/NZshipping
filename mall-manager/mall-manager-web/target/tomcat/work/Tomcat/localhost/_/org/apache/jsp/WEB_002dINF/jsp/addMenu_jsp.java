/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-28 13:40:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<title>编辑菜单</title>\r\n");
      out.write("\t<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\t<meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../layuiadmin/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t.layui-form-item .layui-inline{ width:33.333%; float:left; margin-right:0; }\r\n");
      out.write("\t\t@media(max-width:1240px){\r\n");
      out.write("\t\t\t.layui-form-item .layui-inline{ width:100%; float:none; }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"childrenBody\">\r\n");
      out.write("\t<form class=\"layui-form\" style=\"width: 80%; padding-top: 30px;\" id=\"addMenu\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"parentId\" />\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">菜单名</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"title\" class=\"layui-input userName\"\r\n");
      out.write("\t\t\t\t\t\tlay-verify=\"required\" placeholder=\"请输入菜单名\" name=\"title\" value=\"\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">图标</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"icon\" class=\"layui-input userName\"\r\n");
      out.write("\t\t\t\t\t\t placeholder=\"请填写图标代码\" name=\"icon\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t<label>（例：<text>&amp;#xe642;</text>）</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t<!-- \t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">资源路径</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"href\" name=\"href\" class=\"layui-input userName\"\r\n");
      out.write("\t\t\t\t\t\t placeholder=\"请输入资源路径\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t<label>（<span style=\"color: red\">*</span>例：log/logList）</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div> -->\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">排序</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"number\" id=\"sorting\" name=\"sorting\" class=\"layui-input userName\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"排序(整数)\" lay-verify=\"require\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t<label>（<span style=\"color: red\">*</span>例：999）</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">权限标识</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"perms\" name=\"perms\" class=\"layui-input userName\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"权限标识\" value=\"\">\r\n");
      out.write("\t\t\t\t\t<label>（例：sys:role:list）</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<button class=\"layui-btn\" lay-submit=\"\" lay-filter=\"editRole\">立即提交</button>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"../layui/js/layui-xtree.js\"></script>\n");
      out.write("<script src=\"../layui/js/jquery.js\"></script>\r\n");
      out.write("<script src=\"../../../layuiadmin/layui/layui.js\"></script>  \r\n");
      out.write("<script>\r\n");
      out.write("var table;\r\n");
      out.write("var layer;\r\n");
      out.write("var form;\r\n");
      out.write("var upload;\r\n");
      out.write("var laydate;\r\n");
      out.write("\tlayui.config({\r\n");
      out.write("\t  base: '../../../layuiadmin/' //静态资源所在路径\r\n");
      out.write("\t}).extend({\r\n");
      out.write("\t  index: 'lib/index' //主入口模块\r\n");
      out.write("\t}).use(['jquery','index','useradmin', 'table','layer'], function(){\r\n");
      out.write("\t table = layui.table;\r\n");
      out.write("\t layer = layui.layer;\r\n");
      out.write("\t form =layui.form;\r\n");
      out.write("\t laydate=layui.laydate\r\n");
      out.write("\t layer = layui.layer;\r\n");
      out.write("\t \r\n");
      out.write("\t function child(obj){\r\n");
      out.write("\t\t console.log(\"zhi\"+obj);\r\n");
      out.write("\t }\r\n");
      out.write("\r\n");
      out.write("\t form.on(\"submit(editRole)\",function(data){\r\n");
      out.write("\t\t var title=$('#title').val();\r\n");
      out.write("\t\t var icon=$('#icon').val();\r\n");
      out.write("\t\t/* var href=$('#href').val(); */\r\n");
      out.write("\t\t var sorting=$('#sorting').val();\r\n");
      out.write("\t\t var gperms=$('#gperms').val();\r\n");
      out.write("\t\t $.ajax({\r\n");
      out.write("\t\t      type: \"POST\",\r\n");
      out.write("\t\t      url: \"/addTbmenus\",\r\n");
      out.write("\t\t      data:{\r\n");
      out.write("\t\t\t\t  title:title,\r\n");
      out.write("\t\t\t\t  icon:icon,\r\n");
      out.write("\t\t\t\t/*  href:href, */\r\n");
      out.write("\t\t\t\t  sorting:sorting,\r\n");
      out.write("\t\t\t\t  gperms:gperms\r\n");
      out.write("\t\t\t  },\r\n");
      out.write("\t\t      success:function(data){\r\n");
      out.write("\t\t \t\tif(data.status==200){\r\n");
      out.write("\t\t \t\t\tmsg=\"添加成功\";\r\n");
      out.write("\t\t \t\t}else{\r\n");
      out.write("\t\t \t\t\tmsg=\"添加失败\";\r\n");
      out.write("\t\t \t\t}\r\n");
      out.write("\t\t \t}\r\n");
      out.write("\t\t  });\r\n");
      out.write("\t })\r\n");
      out.write("\t \r\n");
      out.write("})\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</html>\n");
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
