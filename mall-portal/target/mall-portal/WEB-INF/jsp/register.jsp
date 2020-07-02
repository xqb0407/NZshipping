<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>登录</title>
<link rel="stylesheet" type="text/css" href="themes/css/loaders.min.css" />
<link rel="stylesheet" type="text/css" href="themes/css/loading.css" />
<link rel="stylesheet" type="text/css" href="themes/css/base.css" />
<link rel="stylesheet" type="text/css" href="themes/css/style.css" />
<script src="themes/js/jquery.min.js" type="text/javascript"
	charset="utf-8"></script>
<script type="text/javascript">
	$(window).load(function() {
		$(".loading").addClass("loader-chanage")
		$(".loading").fadeOut(300)
	})
</script>
</head>
<!--loading页开始-->
<div class="loading">
	<div class="loader">
		<div class="loader-inner pacman">
			<div></div>
			<div></div>
			<div></div>
			<div></div>
			<div></div>
		</div>
	</div>
</div>
<!--loading页结束-->
<body>
	<header class="top-header">
		<!-- href="index.html" -->
		<a class="text texta" href="javascript:window.history.back()">取消</a>
		<h3>注册</h3>
		<a class="text" href="login.html">登录</a>
	</header>
	<div class="login">
		<form id="form1" onsubmit="return false" method="post">
			<ul>
				<li>
					<img src="themes/img/icon/login.png" /> 
					<label>账号</label>
					<input type="text" placeholder="请输入账号" name="username" />
				</li>
				<li>
					<img src="themes/img/icon/password.png" /> 
					<label>密码</label>
					<input type="password" placeholder="请输入密码" name="password" />
				</li>
				<li>
					<img src="themes/img/icon/icon_radio4.png" /> 
					<label>邮箱</label>
					<input type="email" placeholder="请输入邮箱" name="email" />
				</li>
				<li>
					<img src="themes/img/icon/icon_radio4.png" /> 
					<label>手机号</label>
					<input type="tel" maxlength="11" placeholder="请输入手机号" name="phone" />
				</li>
			</ul>
			<input type="submit" value="注册" onclick="register()" />
		</form>
	</div>

	<script type="text/javascript">
	
		function register(){
			$.post("/user/doReg.do", {
				username : form1.username.value,
				password : form1.password.value,
				email : form1.email.value,
				phone : form1.phone.value
			}, function(result) {
				console.log("测试:" + result.msg);
				if (result.status == 200) {
					alert("注册成功，前去登录")
					window.location.href = "login.html";
				} else {	
					alert(result.msg);
				}
			})
		}
	</script>

</body>
</html>