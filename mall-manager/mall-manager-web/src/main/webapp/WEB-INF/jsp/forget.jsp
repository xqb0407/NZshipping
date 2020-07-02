<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>忘记密码 - layuiAdmin</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="../../layuiadmin/layui/css/layui.css" media="all">
  <link rel="stylesheet" href="../../layuiadmin/style/admin.css" media="all">
  <link rel="stylesheet" href="../../layuiadmin/style/login.css" media="all">
  <script src="../layui/js/IP.js"></script>
</head>

  <div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login" style="display: none;">
    <div class="layadmin-user-login-main">
      <div class="layadmin-user-login-box layadmin-user-login-header">
        <h2>农职商城</h2>
        <p>后台管理系统</p>
      </div>
      <div class="layadmin-user-login-box layadmin-user-login-body layui-form">
      
        <script type="text/html" template>
          {{# if(layui.router().search.type === 'resetpass'){ }}
		  <input type="hidden" name="username" id="username1" value=""/>
			<div class="layui-form-item">
              <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="LAY-user-login-password"></label>
              <input type="password" name="password" id="LAY-user-login-password" lay-verify="pass" placeholder="新密码" class="layui-input">
            </div>
            <div class="layui-form-item">
              <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="LAY-user-login-repass"></label>
              <input type="password" name="repass" id="LAY-user-login-repass" lay-verify="required" placeholder="确认密码" class="layui-input">
            </div>
            <div class="layui-form-item">
              <button class="layui-btn layui-btn-fluid" lay-submit lay-filter="LAY-user-forget-resetpass">重置新密码</button>
            </div>
          {{# } else { }}
		  <div class="layui-form-item">
		    <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="LAY-user-login-username"></label>
		    <input type="text" name="username" id="LAY-user-login-username" lay-verify="required" placeholder="请输入用户名" class="layui-input">
		  </div>
            <div class="layui-form-item">
              <label class="layadmin-user-login-icon layui-icon layui-icon-cellphone" for="LAY-user-login-cellphone"></label>
              <input type="text" name="phone" id="LAY-user-login-cellphone" lay-verify="phone" placeholder="请输入注册时的手机号" class="layui-input">
            </div>
            <div class="layui-form-item">
              <div class="layui-row">
                <div class="layui-col-xs7">
                  <label class="layadmin-user-login-icon layui-icon layui-icon-vercode" for="LAY-user-login-vercode"></label>
                  <input type="text" name="verification" id="LAY-user-login-vercode" lay-verify="required" placeholder="图形验证码" class="layui-input">
                </div>
                <div class="layui-col-xs5">
                  <div style="margin-left: 10px;">
                    <img  src="/verification" class="layadmin-user-login-codeimg" onclick="vcode()" name="randImage" id="randImage" >
                  </div>
                </div>
              </div>
            </div>
            <!-- <div class="layui-form-item"> -->
              <!-- <div class="layui-row">
                <div class="layui-col-xs7">
                  <label class="layadmin-user-login-icon layui-icon layui-icon-vercode" for="LAY-user-login-smscode"></label>
                  <input type="text" name="vercode" id="LAY-user-login-smscode" lay-verify="required" placeholder="短信验证码" class="layui-input">
                </div>
                <div class="layui-col-xs5">
                  <div style="margin-left: 10px;">
                    <button type="button" class="layui-btn layui-btn-primary layui-btn-fluid" id="LAY-user-getsmscode">获取验证码</button>
                  </div>
                </div>
              </div> -->
            <!-- </div> -->
            <div class="layui-form-item">
              <button class="layui-btn layui-btn-fluid" lay-submit lay-filter="LAY-user-forget-submit">找回密码</button>
            </div>
          {{# } }}
        </script>
   
      </div>
    </div>
    <div class="layui-trans layadmin-user-login-footer">
      
      <p>© 2018 <a href="#" target="_blank">农职商城</a></p>
      <p>
        
      </p>
    </div>

  </div>
	<script src="../layui/js/jquery.js"></script>
  <script src="../../layuiadmin/layui/layui.js"></script>  
  <script>
	  var username ="";
	  function vcode() {
	  	$("#randImage").attr('src', '/verification?' + Math.random());
	  };
  layui.config({
    base: '../../layuiadmin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index', 'user'], function(){
    var $ = layui.$
    ,setter = layui.setter
    ,admin = layui.admin
    ,form = layui.form
    ,router = layui.router();

    form.render();

    //找回密码下一步
    form.on('submit(LAY-user-forget-submit)', function(obj){
      var field = obj.field;
	  admin.req({
	    url: '/userforget'  //实际使用请改成服务端真实接口
	    ,data: field
	    ,done: function(res){ 
		   $("#randImage").attr('src', '/verification?' + Math.random());
	       location.hash = '/type=resetpass'; 
		   sessionStorage.setItem("uname",res.data[0].username);
		   location.reload();
		  console.log(res);
		 
		   
	    }
	  });
		return false;
    });
    
    //重置密码
    form.on('submit(LAY-user-forget-resetpass)', function(obj){
      var field = obj.field;
	  console.log("field:" + field.username);
		var uName = sessionStorage.getItem("uname")
		 console.log("222:" +uName);
      $("#username1").val(uName);
	  field.username=uName;
	  console.log("field:" + field.username);
      //确认密码
      if(field.password !== field.repass){
        return layer.msg('两次密码输入不一致');
      }

      //请求接口
      admin.req({
        url: '/resetpass' //实际使用请改成服务端真实接口
        ,data: field
        ,done: function(res){        
          layer.msg('密码已成功重置', {
            offset: '15px'
            ,icon: 1
            ,time: 1000
          }, function(){
            location.href = 'login'; //跳转到登入页
          });
        }
      });
      
      return false;
    });
    
  });
  console.log([
      "                   _ooOoo_",
      "                  o8888888o",
      "                  88\" . \"88",
      "                  (| -_- |)",
      "                  O\\  =  /O",
      "               ____/`---'\\____",
      "             .'  \\\\|     |//  `.",
      "            /  \\\\|||  :  |||//  \\",
      "           /  _||||| -:- |||||-  \\",
      "           |   | \\\\\\  -  /// |   |",
      "           | \\_|  ''\\---/''  |   |",
      "           \\  .-\\__  `-`  ___/-. /",
      "         ___`. .'  /--.--\\  `. . __",
      "      .\"\" '<  `.___\\_<|>_/___.'  >'\"\".",
      "     | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |",
      "     \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /",
      "======`-.____`-.___\\_____/___.-`____.-'======",
      "                   `=---='",
      "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^",
      "        佛祖保佑       永不宕机      永无BUG"
  ].join('\n'));
  </script>
</body>
</html>