<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex5.jsp</title>
</head>
<body>
	<div>
	<form method="post" action="ex/ex_5data"></form>
	<fieldset>
	<legend>동적으로 폼의 속성 추가 예제</legend>
		<p><label>gId</label><input type="text"/></p>
		<p><label>age</label><input type="text"/></p>
		<p><label>gname</label><input type="text"/></p>
		<p><label>addr</label><input type="text"/></p>
		<p><label>id</label><input type="text"/></p>
		<p><label>pwd</label><input type="password"/></p>
		<p><input type="submit" value="semd"/></p>
	</fieldset>
	</div>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$('input[type=text]:first').attr("name",).val('XmanData');
		$('input[type=text]:last').val('아이디를 입력');
		$('input[type=text]:eq(2)').val('Bigdata');
		$('input[type=password]').val('test');
	});
</script>
</html>