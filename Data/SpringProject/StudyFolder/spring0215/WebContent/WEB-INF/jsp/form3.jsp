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
			<legend>파일 업로드 연습문제</legend>
			<form action="upload2" method="post" enctype="multipart/form-data">
				<p>
					작성자 : <input name="writer" id="writer" required="required" type="text">
				</p>
				<p>
					제목 : <input name="title" id="title" required="required" type="text">
				</p>
				<p>
					내용 : <input name="content" id="content" type="text" required="required">
				</p>
				<p>
					이미지 파일 : <input name="mfile" id="mfile" type="file">
				</p>
				<p>
					<input type="submit" value="send">
				</p>
			</form>
		</fieldset>
	</div>
</body>
</html>