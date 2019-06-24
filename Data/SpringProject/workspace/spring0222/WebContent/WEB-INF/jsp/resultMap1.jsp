<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div id="content">
			<fieldset>
			<legend>부서 리스트 예제</legend>
			<div>
				<table style="width: 80%">
					<tr style="background: pink; height: 50px">
						<th>부서번호</th>
						<th>부서명</th>
						<th>부서위치</th>
						<th>수정</th>
						<th>삭제</th>
					</tr>
					<c:forEach var="e" items="${list }">
					<tr style="text-align: center;">
						<td>${e.deptno }</td>
						<td>${e.dname }</td>
						<td>${e.loc }</td>
						<td><a href="">수정</a></td>
						<td>삭제</td>
					</tr>
					</c:forEach>
					<tr>
						<th colspan="5">
						</th>
					</tr>
				</table>
			</div>
			</fieldset>
		</div>
</body>
</html>