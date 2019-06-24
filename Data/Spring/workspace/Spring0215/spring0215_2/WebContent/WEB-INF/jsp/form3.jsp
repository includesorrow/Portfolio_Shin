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
			<legend>자동으로 올려줌?</legend>
			<form action="upload2" method="post" enctype="multipart/form-data">
				<p>
					작성자 : <input type="text" name="writer" id="writer" required="required"
					pattern="[^a-zA-Z0-9]+"
					oninvalid="this.setCustomValidity('한글만 입력')"
					oninput="this.setCustomValidity('')">
				</p>
				<p>
					제목 : <input type="text" name="title" id="title" required="required">
				</p>
				<p>
					내용 : <input type="text" name="content" id="content" required="required">
				</p>			
				<p>
					이미지파일 : <input name="mfile" id="mfile" type="file">
				</p>
				<p>
					<input type="submit" value="send">
				</p>
			</form>
		</fieldset>
	</div>
</body>
</html>