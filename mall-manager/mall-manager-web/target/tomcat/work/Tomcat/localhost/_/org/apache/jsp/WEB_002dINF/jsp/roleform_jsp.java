/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-26 14:21:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class roleform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>添加</title>\n");
      out.write("  <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../../layuiadmin/layui/css/layui.css\" media=\"all\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <div class=\"layui-form\" lay-filter=\"layuiadmin-form-role\" id=\"layuiadmin-form-role\" style=\"padding: 20px 30px 0 0;\">\n");
      out.write("    <div class=\"layui-form-item\">\n");
      out.write("      <label class=\"layui-form-label\">角色</label>\n");
      out.write("      <div class=\"layui-input-block\">\n");
      out.write("        <select name=\"rolename\">\n");
      out.write("          <option value=\"0\">管理员</option>\n");
      out.write("          <option value=\"1\">超级管理员</option>\n");
      out.write("          <option value=\"2\">纠错员</option>\n");
      out.write("          <option value=\"3\">采购员</option>\n");
      out.write("          <option value=\"4\">推销员</option>\n");
      out.write("          <option value=\"5\">运营人员</option>\n");
      out.write("          <option value=\"6\">编辑</option>\n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"layui-form-item\">\n");
      out.write("      <label class=\"layui-form-label\">权限范围</label>\n");
      out.write("      <div class=\"layui-input-block\">\n");
      out.write("        <input type=\"checkbox\" name=\"limits[]\" lay-skin=\"primary\" title=\"内容系统\">\n");
      out.write("        <input type=\"checkbox\" name=\"limits[]\" lay-skin=\"primary\" title=\"社区系统\">\n");
      out.write("        <input type=\"checkbox\" name=\"limits[]\" lay-skin=\"primary\" title=\"用户\">\n");
      out.write("        <input type=\"checkbox\" name=\"limits[]\" lay-skin=\"primary\" title=\"角色\">\n");
      out.write("        <input type=\"checkbox\" name=\"limits[]\" lay-skin=\"primary\" title=\"评论审核\">\n");
      out.write("        <input type=\"checkbox\" name=\"limits[]\" lay-skin=\"primary\" title=\"发货\">\n");
      out.write("        <input type=\"checkbox\" name=\"limits[]\" lay-skin=\"primary\" title=\"采购\">\n");
      out.write("        <input type=\"checkbox\" name=\"limits[]\" lay-skin=\"primary\" title=\"系统设置\">\n");
      out.write("        <input type=\"checkbox\" name=\"limits[]\" lay-skin=\"primary\" title=\"发邮件\">\n");
      out.write("        <input type=\"checkbox\" name=\"limits[]\" lay-skin=\"primary\" title=\"发短信\">\n");
      out.write("        <input type=\"checkbox\" name=\"limits[]\" lay-skin=\"primary\" title=\"审核\">\n");
      out.write("        <input type=\"checkbox\" name=\"limits[]\" lay-skin=\"primary\" title=\"删库跑路\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"layui-form-item\">\n");
      out.write("      <label class=\"layui-form-label\">具体描述</label>\n");
      out.write("      <div class=\"layui-input-block\">\n");
      out.write("        <textarea type=\"text\" name=\"descr\" lay-verify=\"required\" autocomplete=\"off\" class=\"layui-textarea\"></textarea>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"layui-form-item layui-hide\">\n");
      out.write("      <button class=\"layui-btn\" lay-submit lay-filter=\"LAY-user-role-submit\" id=\"LAY-user-role-submit\">提交</button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <script src=\"../../../layuiadmin/layui/layui.js\"></script>  \n");
      out.write("  <script>\n");
      out.write("  layui.config({\n");
      out.write("    base: '../../../layuiadmin/' //静态资源所在路径\n");
      out.write("  }).extend({\n");
      out.write("    index: 'lib/index' //主入口模块\n");
      out.write("  }).use(['index', 'form'], function(){\n");
      out.write("    var $ = layui.$\n");
      out.write("    ,form = layui.form ;\n");
      out.write("  })\n");
      out.write("  </script>\n");
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
