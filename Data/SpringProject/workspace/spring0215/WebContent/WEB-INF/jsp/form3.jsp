<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>form3.jsp</title>
<style>
#wrap {	width: 350px;	margin: auto}
</style>
</head>
<body>
	<div id="wrap">
		<fieldset>
			<legend>���� ���ε� ��������</legend>
			<form action="upload2" method="post" enctype="multipart/form-data">
				<p>
					�ۼ��� : <input name="writer" id="writer" required="required" type="text">
				</p>
				<p>
					���� : <input name="title" id="title" required="required" type="text">
				</p>
				<p>
					���� : <input name="content" id="content" type="text" required="required">
				</p>
				<p>
					�̹��� ���� : <input name="mfile" id="mfile" type="file">
				</p>
				<p>
					<input type="submit" value="send">
				</p>
			</form>
		</fieldset>
	</div>
</body>
</html>