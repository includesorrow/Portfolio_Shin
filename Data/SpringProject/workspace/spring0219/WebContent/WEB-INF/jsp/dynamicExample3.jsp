<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>dynamicExample3.jsp</title>
</head>
<body>
	<form method="post" action="dyex3">
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
					<c:forEach items="${list }" var="e">
						<tr style="text-align: center;">
							<td>${e.sabun }</td>
							<td>${e.saname }</td>
							<td>${e.deptno }</td>
							<td>${e.sgender }</td>
							<td>${e.sahire }</td>
						</tr>
					</c:forEach>
					<tr>
						<th colspan="6">
						<select name="searchType">
								<option value="">선택</option>
								<option value="1">사원이름</option>
								<option value="2">직책</option>
						</select> <input type="text" name="searchName"> <input
							type="submit" value="send"></th>
					</tr>
				</table>
			</div>
		</fieldset>
	</form>
</body>
</html>