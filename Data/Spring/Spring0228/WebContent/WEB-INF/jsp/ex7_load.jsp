<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(
			function() {
				/*
				ex2_load_test.jsp의
				p요소만을 가져와서 현재 페이지
				div 요소 안에 넣기 위해서 아래와
				같이 문법을 적용할 수 있다.
				p이외에도, ,를 적용해서 span요소도 가지고 올 수 있다.
				 */

				$('#loadTest').click(
						function() {
							$('#target').load('ajax/ex2_load_test?cmd=1',
									function(response, status, xhr) {
										console.log("Response:" + response);
										console.log("status:" + status);
										console.log("XHR:" + xhr.stauts);
									});
							$('#target2').load('ajax/ex2_load_test?cmd=1',
									function(){
										$('target2').css('background','green');
								
							});
						});

			});
</script>
</head>
<body>
	<div>
		<input type="button" id="loadTest" value="AjaxText">
	</div>
	<div id="target"></div>
	<div id="target2" style="background: orange;"></div>

</body>
</html>