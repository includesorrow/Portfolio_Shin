<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content=Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div id="wrap">
		<p>�μ���ȣ : ${dlist.deptno } | �μ��� : ${dlist.dname }</p>
		<c:forEach var="e" items="${dlist.sawon }">
			<p>�����ȣ : ${e.sabun } | ����̸� : ${e.saname } | �����å : ${e.sajob }
				| ����޿� : ${e.sapay }</p>
			<p>�ڵ��� ��ȣ : ${e.sphone.phnum } | �� : ${e.sphone.pmodel } | ��¥ : ${e.sphone.pdate }</p>
			<hr />
		</c:forEach>
	</div>
</body>
</html>