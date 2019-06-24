<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title></title>
</head>
<body>
	<ul>
		<li>${dto.writer }</li>
		<li>${dto.title }</li>
		<li>${dto.content}</li>
		<li><img src="${pageContext.request.contextPath}/resources/imgfile/${imgName}"></li>
	</ul>
</body>
</html>