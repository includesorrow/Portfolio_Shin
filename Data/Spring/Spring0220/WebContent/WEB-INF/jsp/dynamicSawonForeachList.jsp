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
<form method="post" action="dyfor">
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
						<tr>
							<th colspan="6">
							<input type="checkbox" name="dlist" value="10">10
							<input type="checkbox" name="dlist" value="20">20
							<input type="checkbox" name="dlist" value="30">30
							<input type="checkbox" name="dlist" value="40">40
							<input type="checkbox" name="dlist" value="50">50
							<input type="submit" value="send">
							</th>
						</tr>
						
						
					</tbody>
					
						
				
				</table>
			</div>
		</fieldset>




</form>
</body>
</html>