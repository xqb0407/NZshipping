<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>页面图</title>
	<style>
		body{
			background-color: #f2f2f2;
		}
		*{margin: 0;padding-top: 20px;}
		li{list-style: none;}
		ul{
			width: 1300px;
		}
		.wrap{
			width: 790px;
			height: 340px;
			margin: 100px auto 0;
		}
		.wrap li{
			float: left;
			width: 158px;
			height: 340px;
		}
	</style>
</head>
<body>
	<div class="wrap">
		<ul>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	<script src="../layui/js/jquery.js"></script>
	<script type="text/javascript">
		$(function(){
			var lis = $('.wrap li');
			for (var i = 0; i < lis.length; i++) {
				lis.eq(i).css('backgroundImage','url(/layui/img/'+ (i+1)+'.png)');
			}
			lis.mouseenter(function(){
				$(this).stop().animate({width:790}).siblings().stop().animate({width:0})
			}).mouseleave(function(){
				lis.stop().animate({width:158})
			})
		})
	</script>
</body>
</html>