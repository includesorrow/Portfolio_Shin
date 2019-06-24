<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  	
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>mybatis-spring</title>
<style>
@charset "EUC-KR";
body{ margin: 0px; padding: 0px; text-decoration: none}
#wrap { width:800px; margin: auto;}
	#header,#footer{ width: 800px; height:100px; text-align: right;
			 background: orange;}
	ul { list-style: none; }
	#header li { display: inline;}
	#header a:link { text-decoration: none; color: #000}
	#content{ }
	#content td{ border: 1px dotted; }
	#footer li {
		display: inline;
}
</style>
<link rel="stylesheet" type="text/css" href="resources/css/default.css">
</head>
<body>
	<div id="wrap">
		<div id="header">
			<ul><li>Home|</li>
				<li>
					<c:choose>
					<c:when test="${sessionScope.id == null }"> 
					<a href="loginForm">�α���</a>
					</c:when>
					<c:otherwise>
					${sessionScope.name }�� <a href="logout">�α׾ƿ�</a>
					</c:otherwise>
				</c:choose>
				|</li>
				<li>
				<c:choose>
					<c:when test = "${sessionScope.uid == null}">
					<a href="member">ȸ������</a>
					</c:when>
					<c:otherwise>
					<a href="mypage">����������</a>
					</c:otherwise>
				</c:choose>
				|</li>
				<li><a href="">�μ�����Ʈ</a>|</li>
				<li><a href="">�������Ʈ</a>|</li>
				<li>IP:${reip }</li>
			</ul>
		</div>
		<div id="content">���������� �����Դϴ�.</div>
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