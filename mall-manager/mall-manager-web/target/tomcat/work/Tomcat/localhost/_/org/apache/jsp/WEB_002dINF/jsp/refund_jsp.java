/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-08 13:23:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class refund_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>退款列表</title>\n");
      out.write("<meta name=\"renderer\" content=\"webkit\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"layui/css/layui.css\">\n");
      out.write("<script type=\"text/javascript\" src=\"../layui/js/jquery.js\"></script>\n");
      out.write("<script src=\"layui/layui.js\"></script>\r\n");
      out.write("<script src=\"../layui/js/IP.js\"></script>\n");
      out.write("<style>\r\n");
      out.write("\t.layui-table-cell{\r\n");
      out.write("\t    height:45px;\r\n");
      out.write("\t    line-height: 45px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\r\n");
      out.write("<div class=\"layui-fluid\">\r\n");
      out.write("\t  <div class=\"layui-card\">\n");
      out.write("<form class=\"layui-form\">\n");
      out.write("<div class=\"layui-form-item\" style=\"margin:15px;height:30px; padding-top:30px ;\" >\n");
      out.write("    \t<div style=\"height:40px;width:80px;float:left;line-height:40px;\">订单编号</div>\n");
      out.write("        <input type=\"text\" class=\"layui-input\" style=\"width:200px;float:left;\" id=\"title\" name=\"title\" value=\"\" lay-verify=\"\" placeholder=\"请输入订单编号\" autocomplete=\"off\">\n");
      out.write("\t    <div class=\"layui-input-inline\" style=\"width:150px;text-align:center;\" id=\"btn\">\n");
      out.write("\t       <button class=\"layui-btn but_  layui-btn layui-btn-normal \" data-type=\"reload\"  onclick=\"return false;\"  id=\"btn1\">搜索</button>\n");
      out.write("\t    </div> \n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("<div>\n");
      out.write("    <table id=\"refund\" lay-filter=\"banner\"></table>\n");
      out.write("</div>\n");
      out.write("<div id=\"formData\" style=\"width:700px;display:none;padding-top:15px;\">\n");
      out.write("\t<form class=\"layui-form\" id=\"bannerForm\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"id\" id=\"bannerId\" />\n");
      out.write("\t\t<div class=\"layui-form-item\">\n");
      out.write("\t\t\t    <label class=\"layui-form-label\">商品名称</label>\n");
      out.write("\t\t\t    <div class=\"layui-input-block\">\n");
      out.write("\t\t\t      <input type=\"text\" name=\"title\" id=\"bannerName\" required lay-verify=\"required\" value=\"\" class=\"layui-input\" />\n");
      out.write("\t\t\t    </div>\t\t\t    \n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"layui-form-item\">\n");
      out.write("\t\t\t    <label class=\"layui-form-label\">商品库存</label>\n");
      out.write("\t\t\t    <div class=\"layui-input-block\">\n");
      out.write("\t\t\t      <input type=\"text\" name=\"num\" id=\"bannerUrl\" required lay-verify=\"required\" value=\"\" class=\"layui-input\" />\n");
      out.write("\t\t\t    </div>\t\t\t    \n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t    <label class=\"layui-form-label\">商品价格</label>\r\n");
      out.write("\t\t\t    <div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t      <input type=\"text\" name=\"price\" id=\"categoryId\" required lay-verify=\"required\" value=\"\" class=\"layui-input\" />\r\n");
      out.write("\t\t\t    </div>\t\t\t    \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t    <label class=\"layui-form-label\">商品条形码</label>\r\n");
      out.write("\t\t\t    <div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t      <input type=\"text\" name=\"barcode\" id=\"barcode\" required lay-verify=\"required\" value=\"\" class=\"layui-input\" />\r\n");
      out.write("\t\t\t    </div>\t\t\t    \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t    <label class=\"layui-form-label\">商品描述</label>\r\n");
      out.write("\t\t\t    <div class=\"layui-input-block\">\r\n");
      out.write("\t\t\t      <input type=\"text\" name=\"sellPoint\" id=\"sellPoint\" required lay-verify=\"required\" value=\"\" class=\"layui-input\" />\r\n");
      out.write("\t\t\t    </div>\t\t\t    \r\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"layui-form-item\">\n");
      out.write("\t\t\t    <label class=\"layui-form-label\">商品图</label>\n");
      out.write("\t\t\t    <img style=\"width:230px;height:130px;\" src=\"\" id=\"bannerImg\" name=\"pic\">\n");
      out.write("\t\t\t    <button type=\"button\" class=\"layui-btn layui-btn-warm\" id=\"uploadbannerImg\">\n");
      out.write("\t\t\t\t  <i class=\"layui-icon\">&#xe67c;</i>上传图片\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<div style=\"display:inline-block;\" id=\"newImg\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\n");
      out.write("<script type=\"text/html\" id=\"bar\">\r\n");
      out.write("\t\n");
      out.write("    <a class=\"layui-btn  layui-btn-xs layui-bg-red\" title=\"退款\" lay-event=\"edit\">退款</a>\n");
      out.write("    <a class=\"layui-btn layui-btn-xs\" title=\"拒绝\" lay-event=\"delete\">拒绝</a>\n");
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
      out.write("            layui.laytpl.fn = function (value)\n");
      out.write("            {\n");
      out.write("                //json日期格式转换为正常格式\n");
      out.write("                var date = new Date(parseInt(value.replace(\"/Date(\", \"\").replace(\")/\", \"\"), 10));\n");
      out.write("                var month = date.getMonth() + 1 < 10 ? \"0\" + (date.getMonth() + 1) : date.getMonth() + 1;\n");
      out.write("                var day = date.getDate() < 10 ? \"0\" + date.getDate() : date.getDate();\n");
      out.write("                return date.getFullYear() + \"-\" + month + \"-\" + day;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            //--------------方法渲染TABLE----------------\r\n");
      out.write("            var tableIns = table.render({\r\n");
      out.write("                elem: '#refund'\r\n");
      out.write("                , id: 'refund'\r\n");
      out.write("                , url: 'http://'+OrderIp()+':8894/order/RefundList'\r\n");
      out.write("                , cols: [[\r\n");
      out.write("                     { checkbox: true, LAY_CHECKED: false, fixed: true } //其它参数在此省略\r\n");
      out.write("                    ,{ field: 'orderId', title: '订单编号', width: 120, align: 'center',fixed: true, style:'color:#01AAED; font-size:16px;'}\r\n");
      out.write("\t\t\t\t\t,{ field: 'itemId', title: '商品编号', width: 120, align: 'center',style:'color:#009688; font-size:16px;'}\r\n");
      out.write("                    , { field: 'title', title: '产品名称', width: 200,style:'color:#FFB800; font-size:15px;'}\r\n");
      out.write("\t\t\t\t\t,{field:'picPath', title: '商品图片', width: 140,height:100, align: 'center',templet: function(d){\r\n");
      out.write("\t\t\t\t\t\t\treturn \"<img src='\"+d.picPath+ \"' class='img-pic' />\" ;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("            \t\t, { field: 'totalFee', title:'交易金额',style:'color:red; font-size:16px;', width: 150, align: 'center',\r\n");
      out.write("            \t\t\t\ttemplet:function(d){\r\n");
      out.write("            \t\t\t\t\tvar str=d.totalFee/100+'元';\r\n");
      out.write("            \t\t\t\t\treturn str;\r\n");
      out.write("            \t\t} }\r\n");
      out.write("            \t\t, { field: 'totalFee', title:'退款金额',style:'color:red; font-size:16px;', width: 150, align: 'center',\r\n");
      out.write("            \t\t\t\ttemplet:function(d){\r\n");
      out.write("            \t\t\t\t\tvar str=d.totalFee/100+'元';\r\n");
      out.write("            \t\t\t\t\treturn str;\r\n");
      out.write("            \t\t} }\r\n");
      out.write("            \t\t, { field: 'num', title: '数量',width:120,align: 'center',style:'color:red; font-size:18px;'}\r\n");
      out.write("            \t  ,{title: '操作', fixed: 'right', width: 170, align: 'center', toolbar: '#bar'}\r\n");
      out.write("                ]]\r\n");
      out.write("                , page: true\r\n");
      out.write("                , limits: [5, 10, 15]\r\n");
      out.write("                , limit: 10 //默认采用10\r\n");
      out.write("                , done: function (res, curr, count)\r\n");
      out.write("                {\r\n");
      out.write("                    //如果是异步请求数据方式，res即为你接口返回的信息。\r\n");
      out.write("                    //如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、count为数据总长度\r\n");
      out.write("                    //console.log(res);\r\n");
      out.write("                    //得到当前页码\r\n");
      out.write("                    //console.log(curr);\r\n");
      out.write("                    $(\"#curPageIndex\").val(curr);\r\n");
      out.write("                    //得到数据总量\r\n");
      out.write("                    //console.log(count);\r\n");
      out.write("                }\r\n");
      out.write("            });\n");
      out.write("            //#region --------------批量删除----------------\n");
      out.write("            $(\"#delete\").click(function ()\n");
      out.write("            {\n");
      out.write("                var checkStatus = table.checkStatus('banner');\n");
      out.write("                var count = checkStatus.data.length;//选中的行数\n");
      out.write("                if (count > 0)\n");
      out.write("                {\n");
      out.write("                    parent.layer.confirm('确定要删除所选商品？', { icon: 3 }, function (index)\n");
      out.write("                    {\n");
      out.write("                        var data = checkStatus.data; //获取选中行的数据\n");
      out.write("                        var id = '';\n");
      out.write("                        for (var i = 0; i < data.length; i++)\n");
      out.write("                        {\n");
      out.write("                        \tid += data[i].id + \",\";\n");
      out.write("                        }\n");
      out.write("                        $.ajax({\n");
      out.write("                            url: 'banner/batchDelete',\n");
      out.write("                            type: \"post\",\n");
      out.write("                            data: { 'id': id },\n");
      out.write("                            success: function (result){\n");
      out.write("                                if (result.status==200){\n");
      out.write("                                     parent.layer.msg('删除成功', { icon: 1, shade: 0.4,anim:1, time: 1000 });\n");
      out.write("                                      $(\"#search\").click();//重载TABLE\n");
      out.write("                                }else{\n");
      out.write("                                     parent.layer.msg(\"删除失败\", { icon: 5, shade: 0.4, anim:2, time: 1000 });\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  $(\"#search\").click();//重载TABLE\n");
      out.write("                                }\n");
      out.write("                                parent.layer.close(index);\n");
      out.write("                            }\n");
      out.write("                        })\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                    parent.layer.msg(\"请至少选择一条数据\", { icon: 5, shade: 0.4, time: 1000 });\n");
      out.write("            });\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\n");
      out.write("            //#region --------------搜索----------------\n");
      out.write("            $(\"#search\").click(function ()\n");
      out.write("            {\n");
      out.write("            \tvar word=$(\"#keyword\").val();\n");
      out.write("               table.reload('testReload', {\r\n");
      out.write("                   url: 'Item/findname'\r\n");
      out.write("                   ,methods:\"post\"\r\n");
      out.write("                   ,request: {\r\n");
      out.write("                    pageName: 'page' //页码的参数名称，默认：page\r\n");
      out.write("                    ,limitName: 'pageSize' //每页数据量的参数名，默认：limit\r\n");
      out.write("                   }\r\n");
      out.write("                   ,where: {\r\n");
      out.write("                    query : word\r\n");
      out.write("                   }\r\n");
      out.write("                   ,page: {\r\n");
      out.write("                    curr: 1\r\n");
      out.write("                   }\r\n");
      out.write("                  });\n");
      out.write("            });\r\n");
      out.write("\t\t\t\n");
      out.write("            //工具条事件监听\n");
      out.write("            table.on('tool(banner)', function (obj)\n");
      out.write("            { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter=\"对应的值\"\n");
      out.write("                var data = obj.data; //获得当前行数据\n");
      out.write("                var layEvent = obj.event; //获得 lay-event 对应的值\n");
      out.write("                var tr = obj.tr; //获得当前行 tr 的DOM对象\n");
      out.write("                if (layEvent === 'edit')\n");
      out.write("                { //编辑\n");
      out.write("                    layer.confirm('商品是否退款？', {\r\n");
      out.write("                    \t  btn: ['确认', '取消'] //可以无限个按钮\r\n");
      out.write("                    \t  ,btn1: function(index, layero){\r\n");
      out.write("                    \t\t  $.ajax({\r\n");
      out.write("                    \t\t\t   type: \"POST\",\r\n");
      out.write("                    \t\t\t   url: \"http://\"+OrderIp()+\":8894/order/refund\",\r\n");
      out.write("                    \t\t\t   data: \"orderId=\"+data.orderId+\"&itemId=\"+data.itemId,\r\n");
      out.write("                    \t\t\t   success: function(data){\r\n");
      out.write("                    \t\t\t     if(data.status==200){\r\n");
      out.write("                    \t\t\t    \t parent.layer.msg('退款成功', { icon: 1, shade: 0.4, time: 1000 });\r\n");
      out.write("                    \t\t\t\t\t $(\"#search\").click();//重载TABLE\r\n");
      out.write("                    \t\t\t     }else{\r\n");
      out.write("                    \t\t\t    \t parent.layer.msg('退款失败', { icon: 5, shade: 0.4, time: 1000 });\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  $(\"#search\").click();//重载TABLE\r\n");
      out.write("                    \t\t\t     }\r\n");
      out.write("                    \t\t\t   }\r\n");
      out.write("                    \t\t\t});\r\n");
      out.write("                    \t\t  $(tr).remove();\r\n");
      out.write("                    \t\t layer.close(index); \r\n");
      out.write("                    \t  }\r\n");
      out.write("                    \t});\n");
      out.write("                }else if(layEvent === 'delete'){\r\n");
      out.write("                \tlayer.confirm('是否撤销退款？', {\n");
      out.write("                \t\t  btn: ['确认', '取消'] //可以无限个按钮\n");
      out.write("                \t\t  ,btn1: function(index, layero){\n");
      out.write("                \t\t\t  $.ajax({\n");
      out.write("                \t\t\t\t   type: \"POST\",\n");
      out.write("                \t\t\t\t   url: \"http://\"+OrderIp()+\":8894/order/RevokeRefund\",\n");
      out.write("                \t\t\t\t   data: \"orderId=\"+data.orderId+\"&itemId=\"+data.itemId,\n");
      out.write("                \t\t\t\t   success: function(data){\n");
      out.write("                \t\t\t\t     if(data.status==200){\n");
      out.write("                \t\t\t\t    \t parent.layer.msg('撤销成功', { icon: 1, shade: 0.4, time: 1000 });\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  $(\"#search\").click();//重载TABLE\r\n");
      out.write("                \t\t\t\t     }else{\n");
      out.write("                \t\t\t\t    \t parent.layer.msg('撤销失败', { icon: 5, shade: 0.4, time: 1000 });\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  $(\"#search\").click();//重载TABLE\n");
      out.write("                \t\t\t\t     }\n");
      out.write("                \t\t\t\t   }\n");
      out.write("                \t\t\t\t});\n");
      out.write("                \t\t\t  $(tr).remove();\n");
      out.write("                \t\t\t layer.close(index); \n");
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
