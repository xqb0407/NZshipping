<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<title>规格</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="stylesheet" href="layui/css/layui.css">
	<script type="text/javascript" src="js/jquery.js"></script>
	<script src="layui/layui.js"></script>
	<script src="../layui/js/IP.js"></script>
	</head>
<body>
		<form class="layui-form">
		<div class="layui-form-item" style="margin:15px;height:30px;">
		    	<div style="height:40px;width:80px;float:left;line-height:40px;">搜索规格</div>
		        <input type="text" class="layui-input" style="width:200px;float:left;" id="keyword" name="keyword" value="" lay-verify="" placeholder="请输入轮播图名称" autocomplete="off">
			    <div class="layui-input-inline" style="width:150px;text-align:center;">
			        <a class="layui-btn" id="search" data-type="reload" name="search">
			            <i class="layui-icon"></i>搜索
			        </a>
			    </div> 
			    <div style="float:right;width:130px;height:35px;">
				    <div class="layui-input-inline" style="width:100px;">
				     	<a class="layui-btn layui-btn-normal" id="delete" name="delete">
				            <i class="layui-icon">&#x1006;</i>批量删除
				        </a>
				    </div>
		    	</div>
		</div>
		</form>
		<div>
		    <table id="banner" lay-filter="banner"></table>
		</div>
		<div id="formData" style="width:700px;display:none;padding-top:15px;">
			<form class="layui-form" id="bannerForm">
				<input type="hidden" name="id" id="bannerId" />
				<div class="layui-form-item">
					    <label class="layui-form-label">轮播名称</label>
					    <div class="layui-input-block">
					      <input type="text" name="title" id="bannerName" required lay-verify="required" value="" class="layui-input" />
					    </div>			    
				</div>
				<div class="layui-form-item">
					    <label class="layui-form-label">轮播路径</label>
					    <div class="layui-input-block">
					      <input type="text" name="url" id="bannerUrl" required lay-verify="required" value="" class="layui-input" />
					    </div>			    
				</div>
				<div class="layui-form-item">
					    <label class="layui-form-label">轮播图ID</label>
					    <div class="layui-input-block">
					      <input type="text" name="categoryId" id="categoryId" required lay-verify="required" value="" class="layui-input" />
					    </div>			    
				</div>
				<div class="layui-form-item">
					    <label class="layui-form-label">轮播图</label>
					    <img style="width:230px;height:130px;" src="" id="bannerImg" name="pic">
					    <button type="button" class="layui-btn layui-btn-warm" id="uploadbannerImg">
						  <i class="layui-icon">&#xe67c;</i>上传图片
						</button>
						<div style="display:inline-block;" id="newImg"></div>
				</div>
			</form>
		</div>
		<script type="text/html" id="bar">
		    <a class="layui-btn layui-btn-xs layui-btn-normal" title="编辑" lay-event="edit">编辑</a>
		    <a class="layui-btn layui-btn-xs" title="刪除" lay-event="delete">刪除</a>
		</script>
		<script type="text/html" id="dateTpl">
		    {{ layui.laytpl.fn(d.editdate) }}
		</script>
		<script type="text/javascript">
		var table;
		var layer;
		var form;
		var upload;
		var laydate;
		        layui.use(['layer', 'table','form','upload','laydate'], function ()
		        {
		            table = layui.table;
		            layer = layui.layer;
		            form =layui.form;
		            upload=layui.upload;
		            laydate=layui.laydate;
		            layui.laytpl.fn = function (value)
		            {
		                //json日期格式转换为正常格式
		                var date = new Date(parseInt(value.replace("/Date(", "").replace(")/", ""), 10));
		                var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
		                var day = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
		                return date.getFullYear() + "-" + month + "-" + day;
		            }
		            var uploadInst = upload.render({
		                elem: '#uploadbannerImg' //绑定元素
		                ,url: 'banner/uploadBannerImg' //上传接口
		                ,data:'json'
		                ,done: function(res){
		                  layer.msg("上传图片成功！",{icon:1,shade:0.4,time:1000});
		                  var str="<img style='width:230px;height:130px;' src='"+res.url+"' /><input type='hidden' name='pic' value='"+res.url+"' />";
		                  $("#newImg").html(str);
		                }
		                ,error: function(){
		                  layer.msg("图片上传失败！请重试！",{icon:5,shade:0.4,time:1000});
		                }
		              });
		            //--------------方法渲染TABLE----------------
		            var tableIns = table.render({
		                elem: '#banner'
		                , id: 'banner'
		                , url: '/test/bannerlist'
						
		                , cols: [[
		                     { checkbox: true, LAY_CHECKED: false } //其它参数在此省略
		                     ,{ field: 'id', title: 'ID', width: 100, align: 'center' }
		                     , { field: 'categoryId', title: '轮播图ID', width: 212, align: 'center'}
		                    , { field: 'title', title: '轮播名称', width: 250, align: 'center' }
							, { field: 'url', title: '轮播路径', width: 250, align: 'center' }
		                    ,{field:'pic', title: '轮播图片', width: 250, align: 'center',templet: function(d){
		                	   		var str="<img style='width:220px;height:50px;' src='"+d.pic+"' />";
		                        	return str;
		                   		}
		                   }
		                   ,{ field:'bannerState', title: '轮播图状态', width: 112, align: 'center',templet: function(d){
		                          if(d.bannerState==1){
		                        	  return "<input type='checkbox' lay-filter='switchTest' name='"+d.bannerId+"' lay-skin='switch' lay-text='禁用|正常'>";
		                          }else{
		                        	  return "<input type='checkbox' lay-filter='switchTest' name='"+d.bannerId+"' lay-skin='switch' lay-text='禁用|正常' checked>";
		                          }
		                	 }
		                  },{title: '操作', fixed: 'right', width: 160, align: 'center', toolbar: '#bar'}
		                ]]
		                , page: true
		                , limits: [5, 10, 15]
		                , limit: 10 //默认采用10
		                , done: function (res, curr, count)
		                {
		                    //如果是异步请求数据方式，res即为你接口返回的信息。
		                    //如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、count为数据总长度
		                    //console.log(res);
		                    //得到当前页码
		                    //console.log(curr);
		                    $("#curPageIndex").val(curr);
		                    //得到数据总量
		                    //console.log(count);
		                }
		            });
		            //#region --------------批量删除----------------
		            $("#delete").click(function ()
		            {
		                var checkStatus = table.checkStatus('banner');
		                var count = checkStatus.data.length;//选中的行数
		                if (count > 0)
		                {
		                    parent.layer.confirm('确定要删除所选轮播？', { icon: 3 }, function (index)
		                    {
		                        var data = checkStatus.data; //获取选中行的数据
		                        var batchId = '';
		                        for (var i = 0; i < data.length; i++)
		                        {
		                        	batchId += data[i].bannerId + ",";
		                        }
		                        $.ajax({
		                            url: 'banner/batchDelete',
		                            type: "post",
		                            data: { 'batchId': batchId },
		                            success: function (data){
		                                if (date.status==200){
		                                     parent.layer.msg('删除成功', { icon: 1, shade: 0.4,anim:1, time: 1000 })
		                                     $("#search").click();//重载TABLE
		                                }else{
		                                     parent.layer.msg("删除失败", { icon: 5, shade: 0.4, anim:2, time: 1000 });
		                                }
		                                parent.layer.close(index);
		                            }
		                        })
		                    });
		                }
		                else
		                    parent.layer.msg("请至少选择一条数据", { icon: 5, shade: 0.4, time: 1000 });
		            });
		            //#region --------------搜索----------------
		            $("#search").click(function ()
		            {
		            	var word=$("#keyword").val();
		                tableIns.reload({
		                    where: {
		                    	keyword: word
		                    },page: {
		                    curr: 1 //重新从第 1 页开始
		                  }
		                });
		            });
		            //#endregion
					form.on('switch(switchTest)',function(data){
						var id=data.elem.name;
						var flag=data.elem.checked;
						if(flag){
							$.ajax({
								type:"post",
								url:"banner/changeBannerState",
								data:"bannerId="+id+"&state="+2,
								success:function(data){
									if(data=="success"){
										layer.msg('禁用轮播成功！',{icon:1,shade:0.4,anim: 1,time:1000});
									}else{
										layer.msg('禁用轮播失败！请重试！',{icon:5,shade:0.4,time:1000});
									}
								}
							});
						}else{
							$.ajax({
								type:"post",
								url:"banner/changeBannerState",
								data:"bannerId="+id+"&state="+1,
								success:function(data){
									if(data=="success"){
										layer.msg("启用轮播成功！",{icon:1,shade:0.4,anim: 2,time:1000});
									}else{
										layer.msg("启用轮播失败！请重试！",{icon:5,shade:0.4,time:1000});
									}
								}
							});
						}
					});
		            //工具条事件监听
		            table.on('tool(banner)', function (obj)
		            { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
		                var data = obj.data; //获得当前行数据
		                var layEvent = obj.event; //获得 lay-event 对应的值
		                var tr = obj.tr; //获得当前行 tr 的DOM对象
		                if (layEvent === 'edit')
		                { //编辑
		                    layer.open({
		                        type: 1,
		                        title: '编辑轮播图信息',
		                        shade: 0.4,  //阴影度
		                        fix: false,
		                        shadeClose: true,
		                        maxmin: false,
		                        area: ['800px;', '400px;'],    //窗体大小（宽,高）
		                        content: $('#formData'),
		                        success: function (layero, index)
		                        {
		                            var body = layer.getChildFrame('body', index); //得到子页面层的BODY
									 $("#bannerId").val(data.id);
		                            $("#bannerName").val(data.title);
		                            $("#bannerUrl").val(data.url);
									$("#categoryId").val(data.categoryId);
		                            $("#bannerImg").attr("src",data.pic);
		                            form.render();
		                            body.find('#hidValue').val(index); //将本层的窗口索引传给子页面层的hidValue中
		                        },
		                        btn:['修改','取消'],
		                        yes: function(index, layero){
		                        	$.post('banner/updateBanner',$('#bannerForm').serialize(),function(data){
		                                if (data.msg == 'success')
		                                {
		                                    parent.layer.msg('修改轮播图信息成功！', { icon: 1, shade: 0.4, time: 1000 });
		                                    $("#search").click();
		                                    $("#handle_status").val('');
		                                }
		                                else
		                                {
		                                    parent.layer.msg('修改轮播图信息失败！', { icon: 5, shade: 0.4, time: 1000 });
		                                }
		                                layer.close(index);
		                                $("#newImg").html("");
		                        	}); 
		                        }
		                    });
		                }else if(layEvent === 'delete'){
		                	layer.confirm('是否删除该轮播？', {
		                		  btn: ['确认', '取消'] //可以无限个按钮
		                		  ,btn1: function(index, layero){
		                			  $.ajax({
		                				   type: "POST",
		                				   url: "banner/deleteBanner",
		                				   data: "id="+data.id,
		                				   success: function(msg){
		                				     if(msg.status==200){
		                				    	 parent.layer.msg('删除成功', { icon: 1, shade: 0.4, time: 1000 });
		                				     }else{
		                				    	 parent.layer.msg('删除失败', { icon: 5, shade: 0.4, time: 1000 });
		                				     }
		                				   }
		                				});
		                			  $(tr).remove();
		                			  layer.close(index);
		                		  }
		                		});
		                }
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