<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex6.jsp</title>
<style>
	#res { width:300px; height: 300px; margin: auto;
	background-color: pink;
	border:1px solid blue;
	}
</style>
<script>
	//javascript 배열 생성
	var cols=["red","blue","green","orange","pink"];
	console.log("cols:" + cols[0]);//인덱스에 접근
	
	for(let e in cols){ //<-object
		console.log("cols:"+e);
	}
	
	for(let i=0; i<cols.length; i++){
		console.log("cols:"+cols[i]);
	}

	//setInterval(fn 익명 함수로 정의,1000) : 메모리에서 소거가 빠르다.
/*	var i=0;
	window.onload=function(){
		var inter  = setInterval(function(){
			var num = i++;
			document.getElementById("res").innerHTML= num;
			if(i % 2 == 0){
				document.getElementById("res").style.backgroundColor="red";
			}else{
				document.getElementById("res").style.backgroundColor="green";
			}
			
		}, 1000);
	};*/
</script>
</head>
<body>
	<div id="res"></div>
	<input type="button" id="button" value="button">
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
var i=0;

	window.onload=function(){
		var inter = setInterval(function(){
			var num = i++;
			document.getElementById("res").innerHTML=cols[num];
			document.getElementById("res").style.backgroundColor=cols[num];
			if(i===4){
			//i=0;
				clearInterval(inter);
			}
		},1000);
		
		//clearInterval(inter); // 인터벌을 삭제
	}

	
	
	
	


</script>
</html>