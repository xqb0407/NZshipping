/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-12 01:16:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class userform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<title>添加用户</title>\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"layui/css/layui.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"layui/js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"layui/layui.js\"></script>\r\n");
      out.write("\t<script src=\"../layui/js/IP.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div id=\"editForm\" style=\"width: 700px; padding-top: 20px;\">\n");
      out.write("\t\t<form id=\"formData\" class=\"layui-form\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"roleId\" value=\"64\" id=\"roleId\" />\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">用户名</label>\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"username\" id=\"bannerName\" required\n");
      out.write("\t\t\t\t\t\tlay-verify=\"required\" placeholder=\"请输用户名\" value=\"\"\n");
      out.write("\t\t\t\t\t\tclass=\"layui-input\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">密码</label>\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"bannerUrl\" required\n");
      out.write("\t\t\t\t\t\tlay-verify=\"required\" placeholder=\"请输入密码\" value=\"\"\n");
      out.write("\t\t\t\t\t\tclass=\"layui-input\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">电话</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"phone\" lay-verify=\"phone\" placeholder=\"请输入号码\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">邮箱</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"email\" lay-verify=\"email\" placeholder=\"请输入邮箱\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\" pane=\"\">\r\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">性别</label>\r\n");
      out.write("\t\t\t\t<div class=\"layui-input-block userSex\" id=\"sex\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"sex\" value=\"男\" title=\"男\" checked=\"\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"sex\" value=\"女\" title=\"女\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"sex\" value=\"保密\" title=\"保密\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"layui-form-item\" lay-filter=\"test\" >\r\n");
      out.write("\t\t\t\t\t<label class=\"layui-form-label\">分配权限</label> \r\n");
      out.write("\t\t\t\t<div class=\"layui-input-inline\"> \r\n");
      out.write("\t\t\t\t   <select name=\"roleId\" id=\"province\" lay-filter=\"province\"  lay-verify=\"required\" lay-search=\"\" style=\"width: 30px;\">\r\n");
      out.write("\t\t\t\t\t <option value=\"\">请选择</option>\r\n");
      out.write("\t\t\t\t   </select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"layui-form-item\">\n");
      out.write("\t\t\t\t<label class=\"layui-form-label\">头像</label> \n");
      out.write("\t\t\t\t<div class=\"layui-input-block\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"layui-btn layui-btn-normal\" id=\"test1\">\n");
      out.write("\t\t\t\t\t  <i class=\"layui-icon\">&#xe67c;</i>上传图片\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<div style=\"display:inline-block\" id=\"newImg\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"layui-form-item\" style=\"margin-left:110px;\">\n");
      out.write("\t\t\t\t<button type=\"button\" lay-submit lay-filter=\"*\" class=\"layui-btn layui-btn-lg\" style=\"margin-right:50px;\">添加</button>\n");
      out.write("\t\t\t\t<button type=\"reset\" class=\"layui-btn layui-btn-warm layui-btn-lg\">重置</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("\t$(function(){\n");
      out.write("\t\tlayui.use(['layer', 'table','form','upload'], function ()\n");
      out.write("\t\t        {\n");
      out.write("\t\t            var table = layui.table;\n");
      out.write("\t\t            var layer = layui.layer;\n");
      out.write("\t\t            var form =layui.form;\n");
      out.write("\t\t\t\t\tvar upload=layui.upload;\n");
      out.write("\t\t\t\t\tvar uploadInst = upload.render({\n");
      out.write("\t\t\t\t\t    elem: '#test1' //绑定元素\n");
      out.write("\t\t\t\t\t    ,url: '/banner/uploadBannerImg' //上传接口\n");
      out.write("\t\t\t\t\t    ,done: function(res){\n");
      out.write("\t\t\t\t\t      layer.msg(\"上传图片成功！\",{icon:1,time:1000});\n");
      out.write("\t\t\t\t\t      var str=\"<img style='width:280px;height:160px;' src='\"+res.url+\"' /><input type='hidden' value='\"+res.url+\"' name='face' />\"\n");
      out.write("\t\t\t\t\t      $(\"#newImg\").html(str);\n");
      out.write("\t\t\t\t\t    }\n");
      out.write("\t\t\t\t\t    ,error: function(){\n");
      out.write("\t\t\t\t\t      layer.msg(\"上传图片失败！请重试！\",{icon:5,anim: 6,time:1000});\n");
      out.write("\t\t\t\t\t    }\n");
      out.write("\t\t\t\t\t  });\n");
      out.write("\t\t\t\t\tform.on('submit(*)',function(){\n");
      out.write("\t\t\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\t\t\ttype:\"post\",\n");
      out.write("\t\t\t\t\t\t\turl:\"test/addUser\",\n");
      out.write("\t\t\t\t\t\t\tdata:$(\"#formData\").serialize(),\n");
      out.write("\t\t\t\t\t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\t\t\t\t\tif(data.status==200){\n");
      out.write("\t\t\t\t\t\t\t\t\tlayer.msg(\"添加用户成功！\",{icon:1,shade:0.4, anim:1,time:1000},function(){\n");
      out.write("\t\t\t\t\t\t\t\t\t\twindow.location.href=\"UserList.html\";\n");
      out.write("\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t}else if(data.status==500){\n");
      out.write("\t\t\t\t\t\t\t\t\tlayer.msg(\"用户存在！请重试！\",{icon:5,shade:0.4,anim:6,time:1000});\n");
      out.write("\t\t\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\t\t\tlayer.msg(\"添加用户失败！请重试！\",{icon:5,shade:0.4,anim:6,time:1000});\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tlayui.use(['form','layer','jquery'],function(){\r\n");
      out.write("\t\tvar form = layui.form,\r\n");
      out.write("\t\t layer = parent.layer === undefined ? layui.layer : parent.layer,\r\n");
      out.write("\t\t $ = layui.jquery;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar provinceText = \"\";\r\n");
      out.write("\t\tvar cityText = \"\";\r\n");
      out.write("\t\tvar areaText = \"\";\r\n");
      out.write("\t  //异步加载下拉框数据\r\n");
      out.write("\t  $.get(\"user/rolse\",function (data) {\r\n");
      out.write("\t\t  console.log(data.data);\r\n");
      out.write("\t    if(!data.status==200){\r\n");
      out.write("\t      layer.msg(data.msg)\r\n");
      out.write("\t    }else{\r\n");
      out.write("\t      var $html = \"\";\r\n");
      out.write("\t      if(data.data != null) {\r\n");
      out.write("\t        $.each(data.data, function (index, item) {\r\n");
      out.write("\t          $html += \"<option  value='\" + item.roleId + \"'>\" + item.roleName + \"</option>\";\r\n");
      out.write("\t        });\r\n");
      out.write("\t        $(\"#province\").append($html);\r\n");
      out.write("\t        //append后必须从新渲染\r\n");
      out.write("\t        form.render('select');\r\n");
      out.write("\t      }\r\n");
      out.write("\t    }\r\n");
      out.write("\t  });\r\n");
      out.write("\t});\r\n");
      out.write("\t\n");
      out.write("});\r\n");
      out.write("\tconsole.log([\r\n");
      out.write("\t\t\t    \"                   _ooOoo_\",\r\n");
      out.write("\t\t\t    \"                  o8888888o\",\r\n");
      out.write("\t\t\t    \"                  88\\\" . \\\"88\",\r\n");
      out.write("\t\t\t    \"                  (| -_- |)\",\r\n");
      out.write("\t\t\t    \"                  O\\\\  =  /O\",\r\n");
      out.write("\t\t\t    \"               ____/`---'\\\\____\",\r\n");
      out.write("\t\t\t    \"             .'  \\\\\\\\|     |//  `.\",\r\n");
      out.write("\t\t\t    \"            /  \\\\\\\\|||  :  |||//  \\\\\",\r\n");
      out.write("\t\t\t    \"           /  _||||| -:- |||||-  \\\\\",\r\n");
      out.write("\t\t\t    \"           |   | \\\\\\\\\\\\  -  /// |   |\",\r\n");
      out.write("\t\t\t    \"           | \\\\_|  ''\\\\---/''  |   |\",\r\n");
      out.write("\t\t\t    \"           \\\\  .-\\\\__  `-`  ___/-. /\",\r\n");
      out.write("\t\t\t    \"         ___`. .'  /--.--\\\\  `. . __\",\r\n");
      out.write("\t\t\t    \"      .\\\"\\\" '<  `.___\\\\_<|>_/___.'  >'\\\"\\\".\",\r\n");
      out.write("\t\t\t    \"     | | :  `- \\\\`.;`\\\\ _ /`;.`/ - ` : | |\",\r\n");
      out.write("\t\t\t    \"     \\\\  \\\\ `-.   \\\\_ __\\\\ /__ _/   .-` /  /\",\r\n");
      out.write("\t\t\t    \"======`-.____`-.___\\\\_____/___.-`____.-'======\",\r\n");
      out.write("\t\t\t    \"                   `=---='\",\r\n");
      out.write("\t\t\t    \"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\",\r\n");
      out.write("\t\t\t    \"        佛祖保佑       永不宕机      永无BUG\"\r\n");
      out.write("\t\t\t].join('\\n'));\n");
      out.write("</script>\n");
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
