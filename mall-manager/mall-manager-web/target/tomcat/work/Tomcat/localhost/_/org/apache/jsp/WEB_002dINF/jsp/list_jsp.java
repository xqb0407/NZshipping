/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-26 05:29:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>后台管理员</title>\n");
      out.write("  <meta name=\"renderer\" content=\"webkit\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"../layuiadmin/layui/css/layui.css\" media=\"all\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"../layuiadmin/style/admin.css\" media=\"all\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <div class=\"layui-fluid\">   \n");
      out.write("    <div class=\"layui-card\">\n");
      out.write("      <div class=\"layui-form layui-card-header layuiadmin-card-header-auto\">\n");
      out.write("        <div class=\"layui-form-item\">\n");
      out.write("          <div class=\"layui-inline\">\n");
      out.write("            <label class=\"layui-form-label\">登录名</label>\n");
      out.write("            <div class=\"layui-input-block\">\n");
      out.write("              <input type=\"text\" name=\"loginname\" placeholder=\"请输入\" autocomplete=\"off\" class=\"layui-input\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"layui-inline\">\n");
      out.write("            <label class=\"layui-form-label\">手机</label>\n");
      out.write("            <div class=\"layui-input-block\">\n");
      out.write("              <input type=\"text\" name=\"telphone\" placeholder=\"请输入\" autocomplete=\"off\" class=\"layui-input\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"layui-inline\">\n");
      out.write("            <label class=\"layui-form-label\">邮箱</label>\n");
      out.write("            <div class=\"layui-input-block\">\n");
      out.write("              <input type=\"text\" name=\"email\" placeholder=\"请输入\" autocomplete=\"off\" class=\"layui-input\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"layui-inline\">\n");
      out.write("            <label class=\"layui-form-label\">角色</label>\n");
      out.write("            <div class=\"layui-input-block\">\n");
      out.write("              <select name=\"role\">\n");
      out.write("                <option value=\"0\">管理员</option>\n");
      out.write("                <option value=\"1\">超级管理员</option>\n");
      out.write("                <option value=\"2\">纠错员</option>\n");
      out.write("                <option value=\"3\">采购员</option>\n");
      out.write("                <option value=\"4\">推销员</option>\n");
      out.write("                <option value=\"5\">运营人员</option>\n");
      out.write("                <option value=\"6\">编辑</option>\n");
      out.write("              </select>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"layui-inline\">\n");
      out.write("            <button class=\"layui-btn layuiadmin-btn-admin\" lay-submit lay-filter=\"LAY-user-back-search\">\n");
      out.write("              <i class=\"layui-icon layui-icon-search layuiadmin-button-btn\"></i>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"layui-card-body\">\n");
      out.write("        <div style=\"padding-bottom: 10px;\">\n");
      out.write("          <button class=\"layui-btn layuiadmin-btn-admin\" data-type=\"batchdel\">删除</button>\n");
      out.write("          <button class=\"layui-btn layuiadmin-btn-admin\" data-type=\"add\">添加</button>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <table id=\"admindemo\" lay-filter=\"demo\"></table>  \n");
      out.write("        <script type=\"text/html\" id=\"buttonTpl\">\n");
      out.write("          {{#  if(d.check == true){ }}\n");
      out.write("            <button class=\"layui-btn layui-btn-xs\">已审核</button>\n");
      out.write("          {{#  } else { }}\n");
      out.write("            <button class=\"layui-btn layui-btn-primary layui-btn-xs\">未审核</button>\n");
      out.write("          {{#  } }}\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/html\" id=\"table-useradmin-admin\">\n");
      out.write("          <a class=\"layui-btn layui-btn-normal layui-btn-xs\" lay-event=\"edit\"><i class=\"layui-icon layui-icon-edit\"></i>编辑</a>\n");
      out.write("          {{#  if(d.role == '超级管理员'){ }}\n");
      out.write("            <a class=\"layui-btn layui-btn-disabled layui-btn-xs\"><i class=\"layui-icon layui-icon-delete\"></i>删除</a>\n");
      out.write("          {{#  } else { }}\n");
      out.write("            <a class=\"layui-btn layui-btn-danger layui-btn-xs\" lay-event=\"del\"><i class=\"layui-icon layui-icon-delete\"></i>删除</a>\n");
      out.write("          {{#  } }}\n");
      out.write("        </script>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write(" <script src=\"../../../layuiadmin/layui/layui.js\"></script>  \n");
      out.write("  <script>\n");
      out.write("  layui.config({\n");
      out.write("    base: '../../../layuiadmin/' //静态资源所在路径\n");
      out.write("  }).extend({\n");
      out.write("    index: 'lib/index' //主入口模块\n");
      out.write("  }).use(['index', 'useradmin', 'table'], function(){\n");
      out.write("    var $ = layui.$\n");
      out.write("    ,form = layui.form\n");
      out.write("    ,table = layui.table;\n");
      out.write("    \n");
      out.write("    //监听搜索\n");
      out.write("    form.on('submit(LAY-user-back-search)', function(data){\n");
      out.write("      var field = data.field;\n");
      out.write("      \n");
      out.write("      //执行重载\n");
      out.write("      table.reload('LAY-user-back-manage', {\n");
      out.write("        where: field\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("  \n");
      out.write("    //事件\n");
      out.write("    var active = {\n");
      out.write("      batchdel: function(){\n");
      out.write("        var checkStatus = table.checkStatus('LAY-user-back-manage')\n");
      out.write("        ,checkData = checkStatus.data; //得到选中的数据\n");
      out.write("\n");
      out.write("        if(checkData.length === 0){\n");
      out.write("          return layer.msg('请选择数据');\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        layer.prompt({\n");
      out.write("          formType: 1\n");
      out.write("          ,title: '敏感操作，请验证口令'\n");
      out.write("        }, function(value, index){\n");
      out.write("          layer.close(index);\n");
      out.write("          \n");
      out.write("          layer.confirm('确定删除吗？', function(index) {\n");
      out.write("            \n");
      out.write("            //执行 Ajax 后重载\n");
      out.write("            /*\n");
      out.write("            admin.req({\n");
      out.write("              url: 'xxx'\n");
      out.write("              //,……\n");
      out.write("            });\n");
      out.write("            */\n");
      out.write("            table.reload('LAY-user-back-manage');\n");
      out.write("            layer.msg('已删除');\n");
      out.write("          });\n");
      out.write("        }); \n");
      out.write("      }\n");
      out.write("      ,add: function(){\n");
      out.write("        layer.open({\n");
      out.write("          type: 2\n");
      out.write("          ,title: '添加管理员'\n");
      out.write("          ,content: '../admin/adminform.html'\n");
      out.write("          ,area: ['420px', '420px']\n");
      out.write("          ,btn: ['确定', '取消']\n");
      out.write("          ,yes: function(index, layero){\n");
      out.write("            var iframeWindow = window['layui-layer-iframe'+ index]\n");
      out.write("            ,submitID = 'LAY-user-back-submit'\n");
      out.write("            ,submit = layero.find('iframe').contents().find('#'+ submitID);\n");
      out.write("\n");
      out.write("            //监听提交\n");
      out.write("            iframeWindow.layui.form.on('submit('+ submitID +')', function(data){\n");
      out.write("              var field = data.field; //获取提交的字段\n");
      out.write("              \n");
      out.write("              //提交 Ajax 成功后，静态更新表格中的数据\n");
      out.write("              //$.ajax({});\n");
      out.write("              table.reload('LAY-user-front-submit'); //数据刷新\n");
      out.write("              layer.close(index); //关闭弹层\n");
      out.write("            });  \n");
      out.write("            \n");
      out.write("            submit.trigger('click');\n");
      out.write("          }\n");
      out.write("        }); \n");
      out.write("      }\n");
      out.write("    }  \n");
      out.write("    $('.layui-btn.layuiadmin-btn-admin').on('click', function(){\n");
      out.write("      var type = $(this).data('type');\n");
      out.write("      active[type] ? active[type].call(this) : '';\n");
      out.write("    });\n");
      out.write("  });\r\n");
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
      out.write("            layui.laytpl.fn = function (value)\n");
      out.write("            {\n");
      out.write("                //json日期格式转换为正常格式\n");
      out.write("                var date = new Date(parseInt(value.replace(\"/Date(\", \"\").replace(\")/\", \"\"), 10));\n");
      out.write("                var month = date.getMonth() + 1 < 10 ? \"0\" + (date.getMonth() + 1) : date.getMonth() + 1;\n");
      out.write("                var day = date.getDate() < 10 ? \"0\" + date.getDate() : date.getDate();\n");
      out.write("                return date.getFullYear() + \"-\" + month + \"-\" + day;\n");
      out.write("            }\n");
      out.write("            var uploadInst = upload.render({\n");
      out.write("                elem: '#uploadbannerImg' //绑定元素\n");
      out.write("                ,url: 'banner/uploadBannerImg' //上传接口\n");
      out.write("                ,data:'json'\n");
      out.write("                ,done: function(res){\n");
      out.write("                  layer.msg(\"上传图片成功！\",{icon:1,shade:0.4,time:1000});\n");
      out.write("                  var str=\"<img style='width:230px;height:130px;' src='\"+res.url+\"' /><input type='hidden' name='image' value='\"+res.url+\"' />\";\n");
      out.write("                  $(\"#newImg\").html(str);\n");
      out.write("                }\n");
      out.write("                ,error: function(){\n");
      out.write("                  layer.msg(\"图片上传失败！请重试！\",{icon:5,shade:0.4,time:1000});\n");
      out.write("                }\n");
      out.write("              });\n");
      out.write("            //--------------方法渲染TABLE----------------\n");
      out.write("             table.render({\n");
      out.write("                elem: '#admindemo'\n");
      out.write("                , id: 'admindemo'\n");
      out.write("                , url: 'admin/adminuserlist'\n");
      out.write("\t\t\t\t//class=\"layui-table-cell laytable-cell-1-undefined laytable-cell-undefined\"\n");
      out.write("                , cols: [[\n");
      out.write("                     { checkbox: true, LAY_CHECKED: false, fixed: true } //其它参数在此省略\n");
      out.write("                    ,{ field: 'id', title: '用户ID', width: 100, align: 'center',fixed: true}\n");
      out.write("                    , { field: 'username', title: '用户名', width: 212, align: 'center'}\r\n");
      out.write("\t\t\t\t\t,{field:'face', title: '头像', width: 250,height:100, align: 'center',templet: function(d){\r\n");
      out.write("\t\t\t\t\t    var str=\"<img src='\"+d.face+ \"' class='img-pic' />\"\r\n");
      out.write("\t\t\t\t\t\t\treturn str;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\n");
      out.write("                    , { field: 'sex', title: '性别', width: 80, align: 'center' }\r\n");
      out.write("\t\t\t\t\t, { field: 'phone', title:'电话', width: 120, align: 'center' }\r\n");
      out.write("\t\t\t\t\t, { field: 'email', title: '邮箱',width:120 }\n");
      out.write("                    , { field: 'created', title:'注册时间', width: 260, align: 'center',\r\n");
      out.write("\t\t\t\t\t\ttemplet: \"<div>{{layui.util.toDateString(d.createTime, 'yyyy-MM-dd HH:mm:ss')}}</div>\" }\r\n");
      out.write("\t\t\t\t  ,{title: '操作', fixed: 'right', width: 160, align: 'center', toolbar: '#bar'}\n");
      out.write("                ]]\r\n");
      out.write("\t\t\t\t,id:'testReload'\n");
      out.write("                , page: true\n");
      out.write("                , limits: [5, 10, 15]\n");
      out.write("                , limit: 10 //默认采用10\n");
      out.write("                , done: function (res, curr, count)\r\n");
      out.write("\t\t\t\t\n");
      out.write("                {\n");
      out.write("                    $(\"#curPageIndex\").val(curr);\n");
      out.write("                }\n");
      out.write("            });\r\n");
      out.write("});\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
