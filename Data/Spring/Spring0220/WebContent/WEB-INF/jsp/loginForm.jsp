<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>mybatis-spring</title>

<link rel="stylesheet" type="text/css" href="resources/css/default.css">
</head>
<body>
	<div id="content">
			<fieldset style="width: 300px; margin: auto">
				<legend>�α��� ��</legend>
				<form method="post" action="loginProcess" autocomplete="off">
					<p>
						<label>���̵�</label> <input type="text" name="id" id="id">
					</p>
					<p>
						<label>��й�ȣ</label> <input type="password" name="password" id="password">
					</p>
					<p style="text-align: right;">

						<input type="submit" value="�α��� ">
					</p>
				</form>

			</fieldset>
		</div>
		

</body>
</html>