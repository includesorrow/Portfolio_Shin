<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>upform.jsp</title>
<style>
	#wrap{width:350px; margin:auto}
</style>
</head>
<body>
	<form action="upload" method="post" enctype="multipart/form-data">
		<fieldset>
		<legend>이미지 업로드 폼</legend>
		<ul>
			<div>
				<li><select name="ilabel" id="ilabel">
				<option value="풍경">풍경</option>
				<option value="동물">동물</option>
				<option value="기타">기타</option>
			
			</select></li>
				<li><input type="file" name="mfile" id="mfile"></li>
				<li><input type="submit" value="전송"></li>
			
			</div>
		</ul>
		</fieldset>
	</form>


</body>
</html>