<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no, minimal-ui"/>
	<meta name="apple-mobile-web-app-capable" content="yes"/>
	<meta name="apple-mobile-web-app-status-bar-style" content="black"/>
	<meta name="format-detection" content="telephone=no, email=no"/>
	<meta charset="UTF-8">
	<title>搜索结果</title>
	<link rel="stylesheet" href="themes/css/core.css">
	<link rel="stylesheet" href="themes/css/icon.css">
	<link rel="stylesheet" href="themes/css/home.css">
	<link rel="stylesheet" href="themes/css/public.css">
	<link rel="icon" type="image/x-icon" href="favicon.ico">
	<link href="iTunesArtwork@2x.png" sizes="114x114" rel="apple-touch-icon-precomposed">
	<link rel="stylesheet" type="text/css" href="../../themes/css/search.css"/>
	<script src="themes/js/search.js"></script>
	
	
</head>
<body>

	<form action="goods.html" name="form" class="form1" id="form1">
		<header class="aui-header-default aui-header-fixed aui-header-bg">
			<a href="javascript:history.back(-1)" class="aui-header-item"> <i
				class="aui-icon aui-icon-code"></i>
			</a>
	
			<div class="aui-header-center aui-header-center-clear">
				<div class="aui-header-search-box">
					<i class="aui-icon aui-icon-small-search"></i> <input id="search"
						name="name" type="search" placeholder="搜索一下"
						class="aui-header-search" tabindex="1" required="required"
						onkeyup="sreach()" onblur="loseFocus()"  onfocus="sreach()">
				</div>
			</div>
			<input type="submit"
				style="text-align: center; border: none; align-items: center; display: block;"
				value="搜索" onclick="check()" class="aui-header-item-icon">
		</header>
	</form>

	
	<section class="aui-myOrder-content">
			
		<div class="m-tab demo-small-pitch" data-ydui-tab>
			
			<div class="aui-myOrder-fix">
				
				<ul class="tab-nav">
					<li class="tab-nav-item tab-active"><a href="javascript:;">全部</a></li>
					<li class="tab-nav-item"><a href="javascript:;">天猫</a></li>
					<li class="tab-nav-item"><a href="javascript:;">便宜好货</a></li>
					<li class="tab-nav-item"><a href="javascript:;">店铺</a></li>
					<li class="tab-nav-item"><a href="javascript:;">淘宝经验</a></li>
				</ul>
				<div class="d7-sousuo-mid" style="z-index: 99; background-color: white;" id="myDiv"></div>
			</div>
			<ul class="tab-nav">
				<li class="tab-nav-item1 tab-active"><a href="javascript:;">综合<sapn>&or;</span></a></li>
				<li class="tab-nav-item1"><a href="javascript:;">销量</a></li>
				<li class="tab-nav-item1"><a href="javascript:;">价格</a></li>
				<li class="tab-nav-item1"><a href="javascript:;">筛选<sapn>&or;</span></a></li>
			</ul>
			<div class="aui-prompt"><i class="aui-icon aui-prompt-sm"></i>双十一期间发货及物流时效公告</div>
			
			<div class="tab-panel">
				<div class="tab-panel-item tab-active">
					<ul>
						<c:forEach var="goods" items="${goods }">
							<li>
								<div class="aui-list-title-info">
									
									<a href="ui-product.html?id=${goods.id}" class="aui-list-product-fl-item">
										<div class="aui-list-product-fl-img">
											<img src="${goods.image }" alt="">
										</div>
										<div class="aui-list-product-fl-text">
											<h3 class="aui-list-product-fl-title">${goods.title }</h3>
											<div class="aui-list-product-fl-mes">
												<div>
													<span class="aui-list-product-item-price">
														<fmt:setLocale value="en_US"/>
														<fmt:formatNumber value="${goods.price/100 }" type="currency">
														</fmt:formatNumber>
													</span>
													<span class="aui-list-product-item-del-price">
														<fmt:setLocale value="en_US"/>
														<fmt:formatNumber value="${goods.price/100 }" type="currency">
														</fmt:formatNumber>
													</span>
												</div>
												
											</div>
										</div>
	
									</a>
								</div>
								
							</li>
						</c:forEach>
						
					</ul>
				</div>
				
			</div>
		</div>
	</section>
	


	<script type="text/javascript" src="themes/js/jquery.min.js"></script>
	<script type="text/javascript" src="themes/js/aui.js"></script>
	<script type="text/javascript" >
        /**
         * Javascript API调用Tab
         */
        !function ($) {
            var $tab = $('#J_Tab');

            $tab.tab({
                nav: '.tab-nav-item',
                panel: '.tab-panel-item',
                activeClass: 'tab-active'
            });

			/*
			 $tab.find('.tab-nav-item').on('open.ydui.tab', function (e) {
			 console.log('索引：%s - [%s]正在打开', e.index, $(this).text());
			 });
			 */

            $tab.find('.tab-nav-item').on('opened.ydui.tab', function (e) {
                console.log('索引：%s - [%s]已经打开了', e.index, $(this).text());
            });
        }(jQuery);
	</script>
<script src="themes/js/public.js" type="text/javascript" charset="utf-8"></script>
	
</body>
</html>