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
		<legend>�̹��� ���ε� ��</legend>
		<ul>
			<div>
				<li><select name="ilabel" id="ilabel">
				<option value="ǳ��">ǳ��</option>
				<option value="����">����</option>
				<option value="��Ÿ">��Ÿ</option>
			
			</select></li>
				<li><input type="file" name="mfile" id="mfile"></li>
				<li><input type="submit" value="����"></li>
			
			</div>
		</ul>
		</fieldset>
	</form>


</body>
</html>