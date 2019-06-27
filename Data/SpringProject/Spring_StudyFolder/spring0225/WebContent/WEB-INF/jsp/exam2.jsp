<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>exam2.jsp</title>
</head>
<body>
	<input type="color" id="color" value="#564655">
	<input type="button" id="btn" value="aplly">
	<p id="target" style="width: 200px; height: 150px;"></p>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script>
			$('#btn').click(function(){
				$('#target').css("background",$('#color').val());
			});
	</script>
</body>
</html>