<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex3.jsp</title>
</head>
<body>
	<div></div>
	<div></div>
	<div></div>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(
			function() {
				//innerHTML같다.
				$('div').html('<h1>Test 1 </h1>');
				$('div').html(function(index) {
					return '<p> test' + index
					"</p>";
				});
				//위의 예제에서 <h1> ~ <h3> 으로 <div>안의 내용을 채우시오.
				$('div').html(
						function(index) {
							return '<h' + parseInt(index + 1, 10) + '>Test '
									+ '</h' + parseInt(index + 1, 10) + '>';
						});
				$('div').css({
					border : '1px solid red',
					width : 300,
					height : 120
				});
			});
</script>
</html>