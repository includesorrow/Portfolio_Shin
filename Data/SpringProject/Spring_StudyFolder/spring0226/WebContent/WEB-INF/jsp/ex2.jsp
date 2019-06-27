<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; carset=EUC-KR">
<title>ex2.jsp</title>
<script src="resources/js/myfunc.js"></script>
<script>
	//	function changeImg(imgSrc){
	//		console.log(imgSrc);
	//		document.getElementById('myImage').src="resources/image/"+imgSrc;
	//	}
</script>
</head>
<body>
	<h2>What Can JavaScript Do?</h2>
	<p>JavaScript can change HTML attributes.</p>
	<p>In this case JavaScript changes the src (source) attribute of an
		image.</p>
	<button onclick="changeImg('pic_bulbon.gif')">turn on the
		light</button>
	<img id="myImage" src="resources/img/pic_bulboff.gif"
		style="width: 100px">
	<button onclick="changeImg('pic_bulboff.gif')">Turn off the
		light</button>
</body>
</html>
