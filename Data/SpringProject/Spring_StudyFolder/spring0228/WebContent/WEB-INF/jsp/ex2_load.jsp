<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex2_load.jsp</title>
</head>
<body>
	<div>
		<input type="button" id="loadTest" value="AjaxText">
		<input type="button" id="loadTest2" value="LoadData">
	</div>
	<div id="target"></div>
	<div id="target2" style="background: orange;"></div>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		/*
			ex2_load_test.jsp의 p 요소만을 가져와서 현재 페이지 div 요소안에 넣기 위해서 아래와 같이 문법을 적용할 수 있다.
			p 이외에도 ,를 사용해서 span 요소도 가져 올 수 있다.
			p, span p
		*/
		$('#loadTest').click(function(){
			$('#target').load('ajax/ex2_load_test?cmd=1',function(response,status,xhr){
				console.log("Response : "+response);
				console.log("status : "+status);
				console.log("XHR : "+xhr.status);

				$('#target2').html(response).children().css({"background":"pink","width":"300px","border":"1px solid red"});
			});
		});
		
		$('#loadTest2').click(function(){
			$('#target').load('ajax/ex2_load_test?cmd=2 #goal+h5');
		});
	});
</script>
</html>