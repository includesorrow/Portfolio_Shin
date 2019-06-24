<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex3.jsp</title>
<script>
	function sumNum() {
		var x, y, z; // 함수안에 변수는 지역변수
		x = document.getElementById('x').value;
		y = document.getElementById('y').value;
		// parseInt(문자열정수, 10)
		z = parseInt(x, 10) + parseInt(y, 10);
		document.getElementById('res').innerHTML = z;
	}
</script>
</head>
<body>
	<input type="number" name="x" id="x" step="1" max="10">
	<input type="number" name="y" id="y" step="1" max="10">
	<p id="res"></p>
	<input type="button" value="연산" onclick="sumNum()">
</body>
</html>