<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jQueryDemo3</title>
<style>
	#target{width: 200px; height: 200px}
	.cs1{ background: orange; border: 1px dotted;}
</style>
</head>
<body>
<%-- 1. jQuery는 Dom 중심 언어이다.
	 - 자바 스크립트 라이브러리 중 하나
	 2. jQuery 장점은 간소한 코드, 막강한 플러그인 활용 --%>
	    <input type="color" id="col">
   <input type="button" id="select" value="select">
   
	 <div id="wrap">
	 	<p id="target">jQuery 예제 : Style 더하고 삭제하기</p>
	 	<p>
	 	<input type="button" id="btn1" value="AddStyle">
	 	<input type="button" id="btn2" value="removeStyle">
	 	
	 	</p>
	 
	 </div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>
	$(function(){
		$("#select").click(function() {
            $("#target").css({"background": $("#col").val()});
         });
		
		$('#btn1').click(function(){
			//이미 선언된 css 의 클래스를 추가한다.
			$('#target').addClass("cs1");
		});
		$('#btn2').click(function(){	
			//이미 선언된 css의 클래스를 추가한다.
			$('#target').removeClass("cs1");
		});
		
		
	});


</script>


</body>
</html>