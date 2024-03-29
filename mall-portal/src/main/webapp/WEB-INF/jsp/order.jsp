<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no, minimal-ui"/>
	<meta name="apple-mobile-web-app-capable" content="yes"/>
	<meta name="apple-mobile-web-app-status-bar-style" content="black"/>
	<meta name="format-detection" content="telephone=no, email=no"/>
	<meta charset="UTF-8">
	<title>购物车</title>
	<link rel="stylesheet" href="themes/css/core.css">
	<link rel="stylesheet" href="themes/css/icon.css">
	<link rel="stylesheet" href="themes/css/home.css">
	<link rel="icon" type="image/x-icon" href="favicon.ico">
	<link href="iTunesArtwork@2x.png" sizes="114x114" rel="apple-touch-icon-precomposed">
</head>
<body>
	<header class="aui-header-default aui-header-fixed aui-header-bg">
		<a href="javascript:history.back(-1)" class="aui-header-item">
			<i class="aui-icon aui-icon-back-white"></i>
		</a>
		<div class="aui-header-center aui-header-center-clear">
			<div class="aui-header-center-logo">
				<div class="aui-car-white-Typeface">填写订单</div>
			</div>
		</div>
		<a href="#" class="aui-header-item-icon"   style="min-width:0">
			<i class="aui-icon aui-icon-member"></i>
		</a>
	</header>
	<section class="aui-address-content">
		<div class="aui-address-box">
			<div class="aui-address-box-list">
				<a href="my-addres.html" class="aui-address-box-default">
					<ul>
						<li>
							<strong>够味达 185****6698</strong>
							<span class="aui-tag" id="aui-home">家里</span>
							<span class="aui-tag aui-tag-default" id="aui-default">默认</span>
						</li>
						<li>
							<i class="aui-icon aui-icon-address"></i>
							四川省广安市华蓥市双河镇望月街119号
						</li>
					</ul>
				</a>
			</div>
		</div>
		<div class="aui-dri"></div>
		<div class="aui-list-product-float-item">
			<a href="javascript:;" class="aui-list-product-fl-item">
				<div class="aui-list-product-fl-img">
					<img src="themes/img/pd/sf-10.jpg" alt="">
				</div>
				<div class="aui-list-product-fl-text">
					<h3 class="aui-list-product-fl-title">2016夏天新款男士短袖t恤青少年韩版修身印花圆领半袖男装衣服潮领半袖男装衣服潮领半袖男装衣服潮</h3>
					<div class="aui-list-product-fl-mes">
						<div>
							<span class="aui-list-product-item-price">
								<em>¥</em>
								399.99
							</span>
							<span class="aui-list-product-item-del-price">
								¥495.65
							</span>
						</div>
						<div class="aui-btn-purchase">
							<span>2.8020kgx1</span>
						</div>
					</div>
					<div class="aui-list-product-fl-bag">
						<span><img src="themes/img/icon/bag1.png" alt=""></span>
						<span><img src="themes/img/icon/bag2.png" alt=""></span>
					</div>
				</div>
			</a>
		</div>
		<div class="aui-address-well">
			<a href="#" class="aui-address-cell aui-fl-arrow">
				<div class="aui-address-cell-bd">支持配送</div>
				<div class="aui-address-cell-ft">
					<p>在线支付</p>
					<p>顺丰快递</p>
					<p class="aui-address-text"><i class="aui-icon aui-prompt-sm"></i>11月12日[周五]09:00-15:00</p>
				</div>
			</a>
			<div class="aui-prompt"><i class="aui-icon aui-prompt-sm"></i>您的收货时间为工作日，请您做好收货准备。</div>
			<a href="#" class="aui-address-cell aui-fl-arrow aui-fl-arrow-clear">
				<div class="aui-address-cell-bd">发票</div>
				<div class="aui-address-cell-ft">个人</div>
			</a>
			<div class="aui-dri"></div>
			<a href="#" class="aui-address-cell aui-fl-arrow aui-fl-arrow-clear">
				<div class="aui-address-cell-bd">
					运费险
					<p style="color:#888">7天内退货，15天内可换货</p>
				</div>
				<div class="aui-address-cell-ft">￥0.50&nbsp;&nbsp;<input class="aui-switch" type="checkbox" checked="checked"></div>
			</a>
			<div class="aui-dri"></div>
			<a href="#" class="aui-address-cell aui-fl-arrow aui-fl-arrow-clear">
				<div class="aui-address-cell-bd">优惠券</div>
				<div class="aui-address-cell-ft">不可用</div>
			</a>
			<div class="aui-dri"></div>
			<a href="#" class="aui-address-cell aui-fl-arrow aui-fl-arrow-clear">
				<div class="aui-address-cell-bd">礼品卡</div>
				<div class="aui-address-cell-ft">不可用</div>
			</a>
			<div class="aui-dri"></div>
			<a href="#" class="aui-address-cell aui-fl-arrow aui-fl-arrow-clear">
				<div class="aui-address-cell-bd">积分</div>
				<div class="aui-address-cell-ft">567890</div>
			</a>
			<div class="aui-dri"></div>
			<a href="#" class="aui-address-cell aui-fl-arrow aui-fl-arrow-clear">
				<div class="aui-address-cell-bd">
					<h3>商品金额</h3>
					<p>运费(总重:1.978kg)</p>
				</div>
				<div class="aui-address-cell-ft">
					<span class="aui-red">￥2899.00</span><br>
					<span class="aui-red">+￥0.00</span>
				</div>
			</a>
		</div>
		<div class="aui-payment-bar">
			<div class="shop-total">
				<span class="aui-red aui-size">实付款: <em>￥399.00</em></span>
			</div>
			<a href="Settlement.html" class="settlement">提交订单</a>
		</div>
	</section>

</body>
</html>