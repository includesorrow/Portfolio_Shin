<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>dynamicExample1.jsp</title>
</head>
<body>
<form method="post" action="my.kosta188">
<input type="hidden" name="cmd" value="dyex2">
	<fieldset>
			<legend>��� ����Ʈ ����</legend>
			<div>
				<table style="width: 80%">
					<tr style="background: pink; height: 50px">
						<th>�����ȣ</th>
						<th>����̸�</th>
						<th>�μ���ȣ</th>
						<th>��å</th>
						<th>����</th>
						<th>���Գ�¥</th>
					</tr>
					<c:forEach var="e" items="${list }">
					<tr style="text-align: center;">
						<td>${e.sabun }</td>
						<td>${e.saname }</td>
						<td>${e.deptno }</td>
						<td>${e.sajob }</td>
						<td>${e.gender }</td>
						<td>${e.sahire }</td>
					</tr>
					</c:forEach>
					<tr>
						<th colspan="6">
						����̸� �˻�:
						<input type="text" name="saname">
						<br>
						�����å �˻�:
						<input type="text" name="sajob">
						<input type="submit" value="send">
						</th>
					</tr>
				</table>
			</div>
			</fieldset>
</form>			
</body>
</html>