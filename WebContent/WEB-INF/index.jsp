<%@ page language="java"   pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax测试</title>
<script src="js/jquery.js" type="text/javascript"></script>
<script type="text/javascript">
	function Ajax(){ 
		var xmlHttpReq = null;	//声明一个空对象用来装入XMLHttpRequest
		if (window.ActiveXObject){//IE5 IE6是以ActiveXObject的方式引入XMLHttpRequest的
			xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
		} 
		else if (window.XMLHttpRequest){//除IE5 IE6 以外的浏览器XMLHttpRequest是window的子对象
			xmlHttpReq = new XMLHttpRequest();//实例化一个XMLHttpRequest
		}
		if(xmlHttpReq != null){	//如果对象实例化成功 
			xmlHttpReq.open("GET","test.action",true);	//调用open()方法并采用异步方式
			xmlHttpReq.onreadystatechange=RequestCallBack; //设置回调函数
			xmlHttpReq.send(null);	//因为使用get方式提交，所以可以使用null参调用(参数是请求体内容)
		}
		function RequestCallBack(){//一旦readyState值改变，将会调用这个函数
			if(xmlHttpReq.readyState == 4){
					if(xmlHttpReq.status == 200){
						//将xmlHttpReq.responseText的值赋给ID为 resText 的元素
						document.getElementById("resText").innerHTML = xmlHttpReq.responseText;
					}
			}
		}
	}
</script>
</head>
<body>
	<!-- <form action="register.action" method="post">
		用户名：<input name="user.username" type="text"/>
		密    码：<input name="user.password" type="password"/>
		<input type="submit" value="注册"/>
	</form> -->
	<input type="button" id="" value="Ajax提交" onclick="Ajax();" />
<div id="resText" ></div>
</body>

</html>