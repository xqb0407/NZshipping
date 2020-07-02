<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no, minimal-ui" />
<meta name="description" content="æä¸ä¸ååå">
<meta name="apple-mobile-web-app-capable" content="yes" />
<meta name="apple-mobile-web-app-status-bar-style" content="black" />
<meta name="format-detection" content="telephone=no, email=no" />
<meta charset="utf-8">
<title></title>
<link rel="stylesheet" type="text/css" href="themes/css/core.css">
<link rel="stylesheet" type="text/css" href="themes/css/icon.css">
<link rel="stylesheet" type="text/css" href="themes/css/home.css">
<link rel="stylesheet" type="text/css" href="themes/css/search.css">
<link rel="icon" type="image/x-icon" href="favicon.ico">
<link href="iTunesArtwork@2x.png" sizes="114x114"
	rel="apple-touch-icon-precomposed">

</head>
<body>
	<form action="goods.html" name="form" class="form1" id="form1">
		<header class="aui-header-default aui-header-fixed aui-header-bg">
			<a href="javascript:history.back(-1)" class="aui-header-item"> <i
				class="aui-icon aui-icon-code"></i>
			</a>

			<div class="aui-header-center aui-header-center-clear">
				<div class="aui-header-search-box">
					<i class="aui-icon aui-icon-small-search"></i> 
					<input id="search"
						name="name" type="search" placeholder="搜索一下"
						class="aui-header-search" tabindex="1" required="required"
						onkeyup="sreach()" onblur="loseFocus()" autofocus="autofocus" onfocus="sreach()">
				</div>
			</div>
			<input type="submit"
				style="text-align: center; border: none; align-items: center; display: block;"
				value="搜索" onclick="check()" class="aui-header-item-icon">
		</header>
	</form>
	 <div class="aui-content-box  ">
		 <div class="d7-sousuo-mid" id="myDiv1">
		 	<span class="d7-sousuo-tit">最近搜索</span>
		 	<span class="d7-sousuo-jl2">太古里</span>
		 	<span class="d7-sousuo-jl2" onclick="javascript:alert('测试')">Kenzo 男士</span> 
		 	<span class="d7-sousuo-tit">热门搜索</span> 
		 	<span class="d7-sousuo-jl2">Kenzo男士</span>
		 	<span class="d7-sousuo-jl2">Kenzo 男士</span> 
		 	<span class="d7-sousuo-jl2">Kenzo 男士</span> 
		 	<span class="d7-sousuo-jl2">Kenzo男士</span>
		 </div>
		<div class="d7-sousuo-mid" id="myDiv">
			
		</div>
	</div>
 
	<script src="themes/js/public.js" type="text/javascript" charset="utf-8"></script>
	<script src="themes/js/search.js"></script>
	<script type="text/javascript" src="themes/js/jquery.min.js"
		async="async"></script>
	<script type="text/javascript" src="themes/js/aui.js" async="async"></script>
</body>
</html>
