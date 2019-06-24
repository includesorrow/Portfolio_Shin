<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>mybatis-spring</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script>


</script>
<link rel="stylesheet" type="text/css" href="resources/css/default.css">
</head>
<body>
	<div id="wrap">
		<div id="header">
			<ul><li><a href="/">Home</a>|</li>
				<li>
				<c:choose>
					<c:when test="${sessionScope.uid==null }">
						<a href="loginForm">�α���</a>
					</c:when>
					<c:otherwise>
						${sessionScope.uname }�� <a href="logout">�α׾ƿ�</a>
					</c:otherwise>
				</c:choose>
				|</li>
				<li>
				<c:choose>
					<c:when test="${sessionScope.uid == null }">
						<a href="member">ȸ������</a>
					</c:when>
					<c:otherwise>
						<a href="mypage">����������</a>
					</c:otherwise>
				</c:choose>
				|</li>
				<li><a href="">�μ�����Ʈ</a>|</li>
				<li><a href="">�������Ʈ</a>|</li>
				<li>IP:</li>
			</ul>
		</div>
		<div id="content">���������� �����Դϴ�.</div><br>
		<p><a href="/imgview"></a></p>
				<div id="footer">
			<ul>
				<li>�������� ��ȣ��å</li>
				<li>ȸ��Ұ�</li>
				<li>����Ʈ��</li>
			</ul>
		</div>
	</div>
   
</body>
</html>