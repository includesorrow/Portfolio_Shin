<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex6.jsp</title>
<style>
	#res{width: 300px; height: 300px; margin: auto;
	background-color: pink; border: 1px solid blue;}
</style>
</head>
<body>
	<div id="res"></div>
</body>
<script>
	// javascript 배열 생성
	var cols = ["red","blue","green","orange","pink"];
	console.log("cols:"+cols[0]);	//인덱스에 접근

	for(let e in cols){
		console.log("cols:"+e);
	}
	for(let i=0; i<cols.length; i++){
		console.log("cols:"+cols[i]);
	}
	//setInterval(fn익명함수로 정의, 1000) : 메모리에서 소거가 빠르다.
	/*var i = 0;
	window.onload = function() {
		var inter = setInterval(function() {
			var num = i++;
			document.getElementById("res").innerHTML = num;
			if (i % 2 == 0) {
				document.getElementById("res").style.backgroundColor = "red";
			} else {
				document.getElementById("res").style.backgroundColor = "green"
			}
		}, 1000);
	};*/
</script>
</html>