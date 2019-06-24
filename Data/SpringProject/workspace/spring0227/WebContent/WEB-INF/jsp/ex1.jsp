<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex1.jsp</title>
</head>
<body>
	
	<button id="btn1" onclick="hide()">Hide</button>
	<button id="btn2" onclick="show()">Show</button>
	<div id="content" style="width: 100px; height: 100px; background: orange;"></div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$('#btn1').click(function(){
			$('#content').hide().css("background","orange");
		});
		$('#btn2').click(function(){
			$('#content').show().css("background","green");
		});
	});
</script>
</html>