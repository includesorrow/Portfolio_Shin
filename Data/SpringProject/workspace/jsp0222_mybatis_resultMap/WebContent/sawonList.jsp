<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
	<%-- sawonList.jsp --%>
<%@ include file="header.jsp" %>
		<%-- header �� --%>
		<div id="content">
			<fieldset>
			<legend>��� ����Ʈ ����</legend>
			<div>
				<table style="width: 80%">
					<tr style="background: pink; height: 50px">
						<th>�����ȣ</th>
						<th>����̸�</th>
						<th>�μ���ȣ</th>
						<th>����</th>
						<th>���Գ�¥</th>
					</tr>
					<c:forEach var="e" items="${list }">
					<tr style="text-align: center;">
						<td>${e.sabun }</td>
						<td>${e.saname }</td>
						<td>${e.deptno }</td>
						<td>${e.gender }</td>
						<td>${e.sahire }</td>
					</tr>
					</c:forEach>
					<tr>
						<th colspan="5">
						<input type="button" value="��� �Է�"
						onclick="goUrl('sawonForm.jsp')"
						>
						</th>
					</tr>
				</table>
			</div>
			</fieldset>
		</div>
		<%-- content �� --%>
<%@ include file="footer.jsp" %>