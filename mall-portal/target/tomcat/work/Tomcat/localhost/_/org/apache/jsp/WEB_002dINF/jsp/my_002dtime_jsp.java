/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-08 02:38:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class my_002dtime_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>限时抢购</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"themes/css/core.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"themes/css/icon.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"themes/css/home.css\">\n");
      out.write("\t<link rel=\"icon\" type=\"image/x-icon\" href=\"favicon.ico\">\n");
      out.write("\t<link href=\"iTunesArtwork@2x.png\" sizes=\"114x114\" rel=\"apple-touch-icon-precomposed\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<header class=\"aui-header-default aui-header-fixed aui-header-bg\">\n");
      out.write("\t\t<a href=\"javascript:history.back(-1)\" class=\"aui-header-item\">\n");
      out.write("\t\t\t<i class=\"aui-icon aui-icon-back-white\"></i>\n");
      out.write("\t\t</a>\n");
      out.write("\t\t<div class=\"aui-header-center aui-header-center-clear\">\n");
      out.write("\t\t\t<div class=\"aui-header-center-logo\">\n");
      out.write("\t\t\t\t<div class=\"aui-car-white-Typeface\">限时抢购</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<a href=\"#\" class=\"aui-header-item-icon\"   style=\"min-width:0\">\n");
      out.write("\t\t\t<i class=\"aui-icon aui-icon-search\"></i>\n");
      out.write("\t\t</a>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<section class=\"aui-myOrder-content\">\n");
      out.write("\t\t<div class=\"m-tab demo-small-pitch aui-Time-list\" data-ydui-tab>\n");
      out.write("\t\t\t<div class=\"aui-myOrder-fix\">\n");
      out.write("\t\t\t\t<ul class=\"tab-nav\">\n");
      out.write("\t\t\t\t\t<li class=\"tab-nav-item tab-active\">\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\">\n");
      out.write("\t\t\t\t\t\t\t<span>00:00</span>\n");
      out.write("\t\t\t\t\t\t\t<em>已开抢</em>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"tab-nav-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\">\n");
      out.write("\t\t\t\t\t\t\t<span>07:00</span>\n");
      out.write("\t\t\t\t\t\t\t<em>已开抢</em>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"tab-nav-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\">\n");
      out.write("\t\t\t\t\t\t\t<span>09:00</span>\n");
      out.write("\t\t\t\t\t\t\t<em>已开抢</em>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"tab-nav-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\">\n");
      out.write("\t\t\t\t\t\t\t<span>13:00</span>\n");
      out.write("\t\t\t\t\t\t\t<em>抢购中</em>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"tab-nav-item\">\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\">\n");
      out.write("\t\t\t\t\t\t\t<span>17:00</span>\n");
      out.write("\t\t\t\t\t\t\t<em>即将开抢</em>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"aui-prompt\"><i class=\"aui-icon aui-prompt-sm\"></i>还有商品的哦！可以继续抢购的哦！</div>\n");
      out.write("\t\t\t<div class=\"tab-panel\">\n");
      out.write("\t\t\t\t<div class=\"tab-panel-item tab-active\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-fl-item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"themes/img/pd/sf-11.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"aui-list-product-fl-title\">【16盒装】伊利 安慕希希腊风味常温酸奶原味205g*16盒</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-mes\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t89.99\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t¥125.65\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"aui-btn-purchase\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t仅剩19件\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"red-color\">马上抢购</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-fl-item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"themes/img/pd/sf-12.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"aui-list-product-fl-title\">Doritos 多力多滋 休闲零食 玉米片 劲浓芝士味 15g</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-mes\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t99.99\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t¥295.65\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"aui-btn-purchase\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t仅剩19件\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"red-color\">马上抢购</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-fl-item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"themes/img/pd/sf-13.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"aui-list-product-fl-title\">嘀嗒猫 芒果干 办公室休闲零食蜜饯果脯水果干 100g</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-mes\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t29.99\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t¥45.65\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"aui-btn-purchase\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t仅剩19件\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"red-color\">马上抢购</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-fl-item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"themes/img/pd/sf-14.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"aui-list-product-fl-title\">麦德好 燕麦巧克力 营养麦片力 休闲零食大礼包 婚庆喜糖果饼干 原味468g</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-mes\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t19.99\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t¥22.65\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"aui-btn-purchase\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t仅剩19件\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"red-color\">马上抢购</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"tab-panel-item\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-fl-item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"themes/img/pd/sf-19.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"aui-list-product-fl-title\">【16盒装】伊利 安慕希希腊风味常温酸奶原味205g*16盒</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-mes\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t89.99\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t¥125.65\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"aui-btn-purchase\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t仅剩19件\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"red-color\">马上抢购</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"tab-panel-item\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-fl-item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"themes/img/pd/sf-16.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"aui-list-product-fl-title\">【16盒装】伊利 安慕希希腊风味常温酸奶原味205g*16盒</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-mes\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t89.99\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t¥125.65\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"aui-btn-purchase\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t仅剩19件\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"red-color\">马上抢购</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"tab-panel-item\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-fl-item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"themes/img/pd/sf-17.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"aui-list-product-fl-title\">【16盒装】伊利 安慕希希腊风味常温酸奶原味205g*16盒</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-mes\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t89.99\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t¥125.65\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"aui-btn-purchase\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t仅剩19件\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"red-color\">马上抢购</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"tab-panel-item\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"aui-list-product-fl-item\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-img\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"themes/img/pd/sf-18.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"aui-list-product-fl-title\">【16盒装】伊利 安慕希希腊风味常温酸奶原味205g*16盒</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"aui-list-product-fl-mes\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>¥</em>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t89.99\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"aui-list-product-item-del-price\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t¥125.65\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"aui-btn-purchase\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t仅剩19件\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"aui-list-title-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"red-color\">马上抢购</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
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
