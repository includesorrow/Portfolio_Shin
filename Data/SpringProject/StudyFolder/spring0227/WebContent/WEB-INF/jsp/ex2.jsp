<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex2.jsp</title>
<style>
	#wap{width: 750px; margin: auto;}
</style>
</head>
<body>
	<div id="wrap">
		<h1>test1</h1>
	</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(function(){
		$('#wrap').css('backgroundColor','red');
		$('#wrap').css('text-align','center');
		$('#wrap h1').css('color','white');
		// 5초 후에 다음 스타일을 적용 시켜보자.
		setTimeout(function(){
			$('#wrap').css('backgroundColor','pink');
			$('#wrap h1').css('color','yellow');
		},5000);	
	});
</script>
</html>