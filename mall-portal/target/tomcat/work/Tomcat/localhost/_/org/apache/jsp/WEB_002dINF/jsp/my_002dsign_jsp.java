/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-08 02:38:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class my_002dsign_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no, minimal-ui\"/>\n");
      out.write("\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\"/>\n");
      out.write("\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\"/>\n");
      out.write("\t<meta name=\"format-detection\" content=\"telephone=no, email=no\"/>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>签到领豆</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"themes/css/core.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"themes/css/icon.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"themes/css/home.css\">\n");
      out.write("\t<link rel=\"icon\" type=\"image/x-icon\" href=\"favicon.ico\">\n");
      out.write("\t<link href=\"iTunesArtwork@2x.png\" sizes=\"114x114\" rel=\"apple-touch-icon-precomposed\">\n");
      out.write("\t<style>\n");
      out.write("\t\t.n-tabs {\n");
      out.write("\t\t\tposition: fixed;\n");
      out.write("\t\t\ttop:44px;\n");
      out.write("\t\t\tleft: 0;\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\theight: 41px;\n");
      out.write("\t\t\toverflow: hidden;\n");
      out.write("\t\t\tz-index: 1000;\n");
      out.write("\t\t\tbackground-color: #fff;\n");
      out.write("\t\t\tbox-shadow: 0 0 10PX 0PX rgba(155,143,143,0.6);\n");
      out.write("\t\t\t-webkit-box-shadow: 0 0 10PX 0PX rgba(155,143,143,0.6);\n");
      out.write("\t\t\t-moz-box-shadow: 0 0 10PX 0PX rgba(155,143,143,0.6);\n");
      out.write("\t\t}\n");
      out.write("\t\t.n-tabs .edge {\n");
      out.write("\t\t\tposition: fixed;\n");
      out.write("\t\t\ttop: 0;\n");
      out.write("\t\t\theight: 41px;\n");
      out.write("\t\t\twidth: 100%;\n");
      out.write("\t\t\tborder-bottom: 1px solid #e5e5e5;\n");
      out.write("\t\t}\n");
      out.write("\t\t.n-tabs .n-tabContainer {\n");
      out.write("\t\t\t-webkit-overflow-scrolling: touch;\n");
      out.write("\t\t\tposition: relative;\n");
      out.write("\t\t\ttop: 0;\n");
      out.write("\t\t\tleft: 0;\n");
      out.write("\t\t\toverflow-x: auto;\n");
      out.write("\t\t\toverflow-y: hidden;\n");
      out.write("\t\t\tpadding-left: 16px;\n");
      out.write("\t\t\theight: 51px;\n");
      out.write("\t\t\tfont-size: 14px;\n");
      out.write("\t\t\tcolor: #333;\n");
      out.write("\t\t\twhite-space: nowrap;\n");
      out.write("\t\t}\n");
      out.write("\t\t.n-tabs .n-tabContainer .navtab {\n");
      out.write("\t\t\tdisplay: -webkit-box;\n");
      out.write("\t\t\tdisplay: -webkit-flex;\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.n-tabs .n-tabContainer .n-tabItem {\n");
      out.write("\t\t\t-webkit-box-flex: 1;\n");
      out.write("\t\t\t-webkit-flex-grow: 1;\n");
      out.write("\t\t\tflex-grow: 1;\n");
      out.write("\t\t\t-webkit-flex-shrink: 0;\n");
      out.write("\t\t\tflex-shrink: 0;\n");
      out.write("\t\t\tdisplay: inline-block;\n");
      out.write("\t\t\theight: 41px;\n");
      out.write("\t\t\tline-height: 41px;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\tmargin-left: 20px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.n-tabs .n-tabContainer .n-tabItem:first-child {\n");
      out.write("\t\t\tmargin-left: 0;\n");
      out.write("\t\t}\n");
      out.write("\t\t.n-tabs .n-tabContainer .n-tabItem .current {\n");
      out.write("\t\t\tdisplay: inline-block;\n");
      out.write("\t\t\theight: 41px;\n");
      out.write("\t\t\tborder-bottom: 2px solid #e31436;\n");
      out.write("\t\t\tcolor: #e31436;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"background:#eee\">\n");
      out.write("\n");
      out.write("\t<header class=\"aui-header-default aui-header-fixed aui-header-bg\">\n");
      out.write("\t\t<a href=\"javascript:history.back(-1)\" class=\"aui-header-item\">\n");
      out.write("\t\t\t<i class=\"aui-icon aui-icon-back-white\"></i>\n");
      out.write("\t\t</a>\n");
      out.write("\t\t<div class=\"aui-header-center aui-header-center-clear\">\n");
      out.write("\t\t\t<div class=\"aui-header-center-logo\">\n");
      out.write("\t\t\t\t<div class=\"aui-car-white-Typeface\">签到领豆</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<a href=\"#\" class=\"aui-header-item-icon\"   style=\"min-width:0\">\n");
      out.write("\t\t\t<i class=\"aui-icon aui-icon-search\"></i>\n");
      out.write("\t\t</a>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<section class=\"aui-myOrder-content\">\n");
      out.write("\t\t<div class=\"aui-Sign-content\">\n");
      out.write("\t\t\t<div class=\"aui-Sign-btn\">\n");
      out.write("\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<img src=\"themes/img/icon/icon-sign.png\" alt=\"\">\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<section class=\"n-tabs\" style=\"position:inherit\">\n");
      out.write("\t\t<ul class=\"n-tabContainer\" id=\"auto-id-1509603311057\">\n");
      out.write("\t\t\t<li class=\"n-tabItem\" data-id=\"homepage\">\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"homepage\" class=\"current\">精选</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"n-tabItem\" data-id=\"44114\">\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"44114\" class=\"\">母婴</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"n-tabItem\" data-id=\"15394\">\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"15394\" class=\"\">美妆</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"n-tabItem\" data-id=\"01436\">\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"01436\" class=\"\">保健品</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"n-tabItem\" data-id=\"18211\">\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"18211\" class=\"\">家居生活</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"n-tabItem\" data-id=\"83651\">\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"83651\" class=\"\">生鲜</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"n-tabItem\" data-id=\"37957\">\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"37957\" class=\"\">数码</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"n-tabItem\" data-id=\"74029\">\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"74029\" class=\"\">个人洗护</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"n-tabItem\" data-id=\"73179\">\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"73179\" class=\"\">海外直邮</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"n-tabItem\" data-id=\"41804\">\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"41804\" class=\"\">服饰鞋靴</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</section>\n");
      out.write("\t<section class=\"\">\n");
      out.write("\t\t<div class=\"aui-list-product-box aui-list-product-box-clear\">\n");
      out.write("\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-item\">\n");
      out.write("\t\t\t\t<div class=\"aui-list-product-item-img\">\n");
      out.write("\t\t\t\t\t<img src=\"themes/img/pd/sf-8.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t<span class=\"aui-Purchase-tag\">5豆兑</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"aui-list-product-item-text\">\n");
      out.write("\t\t\t\t\t<h3>KOBE LETTUCE 秋冬新款 女士日系甜美纯色半高领宽松套头毛衣针织衫</h3>\n");
      out.write("\t\t\t\t\t<div class=\"aui-list-product-mes-box\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t399.99\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t¥495.65\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"aui-comment\">已兑134件</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-item\">\n");
      out.write("\t\t\t\t<div class=\"aui-list-product-item-img\">\n");
      out.write("\t\t\t\t\t<img src=\"themes/img/pd/sf-9.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t<span class=\"aui-Purchase-tag\">5豆兑</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"aui-list-product-item-text\">\n");
      out.write("\t\t\t\t\t<h3>KOBE LETTUCE 秋冬新款 女士日系甜美纯色半高领宽松套头毛衣针织衫</h3>\n");
      out.write("\t\t\t\t\t<div class=\"aui-list-product-mes-box\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t399.99\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t¥495.65\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"aui-comment\">已兑134件</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-item\">\n");
      out.write("\t\t\t\t<div class=\"aui-list-product-item-img\">\n");
      out.write("\t\t\t\t\t<img src=\"themes/img/pd/sf-10.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t<span class=\"aui-Purchase-tag\">5豆兑</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"aui-list-product-item-text\">\n");
      out.write("\t\t\t\t\t<h3>KOBE LETTUCE 秋冬新款 女士日系甜美纯色半高领宽松套头毛衣针织衫</h3>\n");
      out.write("\t\t\t\t\t<div class=\"aui-list-product-mes-box\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t399.99\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t¥495.65\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"aui-comment\">已兑134件</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-item\">\n");
      out.write("\t\t\t\t<div class=\"aui-list-product-item-img\">\n");
      out.write("\t\t\t\t\t<img src=\"themes/img/pd/sf-11.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t<span class=\"aui-Purchase-tag\">5豆兑</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"aui-list-product-item-text\">\n");
      out.write("\t\t\t\t\t<h3>KOBE LETTUCE 秋冬新款 女士日系甜美纯色半高领宽松套头毛衣针织衫</h3>\n");
      out.write("\t\t\t\t\t<div class=\"aui-list-product-mes-box\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t399.99\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t¥495.65\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"aui-comment\">已兑134件</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-item\">\n");
      out.write("\t\t\t\t<div class=\"aui-list-product-item-img\">\n");
      out.write("\t\t\t\t\t<img src=\"themes/img/pd/sf-12.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t<span class=\"aui-Purchase-tag\">5豆兑</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"aui-list-product-item-text\">\n");
      out.write("\t\t\t\t\t<h3>KOBE LETTUCE 秋冬新款 女士日系甜美纯色半高领宽松套头毛衣针织衫</h3>\n");
      out.write("\t\t\t\t\t<div class=\"aui-list-product-mes-box\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t399.99\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t¥495.65\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"aui-comment\">已兑134件</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-item\">\n");
      out.write("\t\t\t\t<div class=\"aui-list-product-item-img\">\n");
      out.write("\t\t\t\t\t<img src=\"themes/img/pd/sf-13.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t<span class=\"aui-Purchase-tag\">5豆兑</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"aui-list-product-item-text\">\n");
      out.write("\t\t\t\t\t<h3>KOBE LETTUCE 秋冬新款 女士日系甜美纯色半高领宽松套头毛衣针织衫</h3>\n");
      out.write("\t\t\t\t\t<div class=\"aui-list-product-mes-box\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t399.99\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t¥495.65\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"aui-comment\">已兑134件</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"themes/js/jquery.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"themes/js/aui.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" >\n");
      out.write("        /**\n");
      out.write("         * Javascript API调用Tab\n");
      out.write("         */\n");
      out.write("        !function ($) {\n");
      out.write("            var $tab = $('#J_Tab');\n");
      out.write("\n");
      out.write("            $tab.tab({\n");
      out.write("                nav: '.tab-nav-item',\n");
      out.write("                panel: '.tab-panel-item',\n");
      out.write("                activeClass: 'tab-active'\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\t\t\t/*\n");
      out.write("\t\t\t $tab.find('.tab-nav-item').on('open.ydui.tab', function (e) {\n");
      out.write("\t\t\t console.log('索引：%s - [%s]正在打开', e.index, $(this).text());\n");
      out.write("\t\t\t });\n");
      out.write("\t\t\t */\n");
      out.write("\n");
      out.write("            $tab.find('.tab-nav-item').on('opened.ydui.tab', function (e) {\n");
      out.write("                console.log('索引：%s - [%s]已经打开了', e.index, $(this).text());\n");
      out.write("            });\n");
      out.write("        }(jQuery);\n");
      out.write("\t</script>\n");
      out.write("\n");
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
