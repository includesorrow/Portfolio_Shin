<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="dyex3" method="post">
		<fieldset>
			<legend>��� ����Ʈ ����</legend>
			<div>
				<table>
					<tbody>
						<tr style="background: pink; height: 50px">
							<td>�����ȣ</td>
							<td>����̸�</td>
							<td>�μ���ȣ</td>
							<td>����</td>
							<td>���Գ�¥</td>
						</tr>
						<c:forEach items="${list }" var="sawon">
							<tr>
								<td>${sawon.sabun }</td>
								<td>${sawon.saname }</td>
								<td>${sawon.deptno }</td>
								<td>${sawon.sgender }</td>
								<td>${sawon.sahire }</td>
							</tr>
						</c:forEach>
					</tbody>
					<tfoot>
						<tr>
							<td colspan="6">
							<select name="searchType">
							<c:if test="${empty searchType}">	
								<option value="" selected="selected">���� </option>
								<option value="1">����̸� </option>
								<option value="2">��å </option></c:if>
							<c:if test="${searchType eq 2}">
								<option value="">���� </option>
								<option value="1">����̸� </option>
								<option value="2" selected="selected">��å </option></c:if>
							<c:if test="${searchType eq 1}">
								<option value="">���� </option>
								<option value="1" selected="selected">����̸� </option>
								<option value="2">��å </option></c:if>
							</select>
 								<input type="search" name="search"> 
 								<input type="submit" value="�˻�"></td>
						</tr>
					</tfoot>
				</table>
			</div>
		</fieldset>
	</form>
</body>
</html>