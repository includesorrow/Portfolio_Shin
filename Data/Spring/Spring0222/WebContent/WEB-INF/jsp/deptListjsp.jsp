<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
	<%-- deptList.jsp --%>
		<%-- header �� --%>
		<div id="content">
			<fieldset>
			<legend>�μ� ����Ʈ ����</legend>
			<div>
				<table style="width: 80%">
					<tr style="background: pink; height: 50px">
						<th>�μ���ȣ</th>
						<th>�μ���</th>
						<th>�μ���ġ</th>
						<th>����</th>
						<th>����</th>
					</tr>
					<c:forEach var="e" items="${list }">
					<tr style="text-align: center;">
						<td>${e.deptno }</td>
						<td>${e.dname }</td>
						<td>${e.loc }</td>
						<td><a href="">����</a></td>
						<td>
						<a href="javascript:goConfirmUrl('my.kosta188?cmd=deptDel',${e.deptno })">����</a></td>
					</tr>
					</c:forEach>
					<tr>
						<th colspan="5">
						<input type="button" value="�μ� �Է�"
						onclick="goUrl('deptForm.jsp')"
						>
						</th>
					</tr>
				</table>
			</div>
			</fieldset>
		</div>
		<%-- content �� --%>