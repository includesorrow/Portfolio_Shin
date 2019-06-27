<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
	<%-- sawonList.jsp --%>
<%@ include file="header.jsp" %>
		<%-- header 끝 --%>
		<div id="content">
			<fieldset>
			<legend>사원 리스트 예제</legend>
			<div>
				<table style="width: 80%">
					<tr style="background: pink; height: 50px">
						<th>사원번호</th>
						<th>사원이름</th>
						<th>부서번호</th>
						<th>성별</th>
						<th>가입날짜</th>
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
						<input type="button" value="사원 입력"
						onclick="goUrl('sawonForm.jsp')"
						>
						</th>
					</tr>
				</table>
			</div>
			</fieldset>
		</div>
		<%-- content 끝 --%>
<%@ include file="footer.jsp" %>