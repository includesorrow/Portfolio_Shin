<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>form3.jsp</title>
</head>
<body>
	<div>
		<fieldset>
			<legend>�ڵ����� �÷���?</legend>
			<form action="upload2" method="post" enctype="multipart/form-data">
				<p>
					�ۼ��� : <input type="text" name="writer" id="writer" required="required"
					pattern="[^a-zA-Z0-9]+"
					oninvalid="this.setCustomValidity('�ѱ۸� �Է�')"
					oninput="this.setCustomValidity('')">
				</p>
				<p>
					���� : <input type="text" name="title" id="title" required="required">
				</p>
				<p>
					���� : <input type="text" name="content" id="content" required="required">
				</p>			
				<p>
					�̹������� : <input name="mfile" id="mfile" type="file">
				</p>
				<p>
					<input type="submit" value="send">
				</p>
			</form>
		</fieldset>
	</div>
</body>
</html>