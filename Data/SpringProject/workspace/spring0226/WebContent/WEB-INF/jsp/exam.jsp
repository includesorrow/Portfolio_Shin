<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex6.jsp</title>
<style>
#res {
	width: 300px;
	height: 300px;
	margin: auto;
	background-color: pink;
	border: 1px solid blue;
}
</style>
</head>
<body>
	<div id="res"></div>
</body>
<script>
	var cols = [ "red", "blue", "green", "orange", "pink" ];
	var i = 0;
	window.onload = function() {
		var inter = setInterval(function() {
			document.getElementById("res").innerHTML = cols[i];
			document.getElementById("res").style.backgroundColor = cols[i];
			if (i < (cols.length - 1)) {
				i++;
			} else {
				i = 0;
				//clearInterval(inter);	// interval을 삭제
			}
		}, 1000);
	};
</script>
<!-- document.getElementById("res").style.backgroundColor = "red"; -->
</html>