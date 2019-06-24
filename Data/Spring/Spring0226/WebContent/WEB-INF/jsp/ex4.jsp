<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex4.jsp</title>
<script>
	var inum = 0;// 전역변수
	function incrementNum(){
		inum+=5; 
		document.getElementById("res").innerHTML=inum;
		//jQeuery $("#res2")
		document.getElementById("res2").value=inum;
	}
</script>
</head>
<body>
<!--  5씩 증가하는 자바스크립트 함수를 만들어서 적용시키보자. -->
<input type="button" onclick="incrementNum()" value="Click">
<p id="res"></p>
<input type="number" value="0" id="res2">
</body>
</html>