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
			<legend>사원 리스트 예제</legend>
			<div>
				<table>
					<tbody>
						<tr style="background: pink; height: 50px">
							<td>사원번호</td>
							<td>사원이름</td>
							<td>부서번호</td>
							<td>성별</td>
							<td>가입날짜</td>
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
								<option value="" selected="selected">선택 </option>
								<option value="1">사원이름 </option>
								<option value="2">직책 </option></c:if>
							<c:if test="${searchType eq 2}">
								<option value="">선택 </option>
								<option value="1">사원이름 </option>
								<option value="2" selected="selected">직책 </option></c:if>
							<c:if test="${searchType eq 1}">
								<option value="">선택 </option>
								<option value="1" selected="selected">사원이름 </option>
								<option value="2">직책 </option></c:if>
							</select>
 								<input type="search" name="search"> 
 								<input type="submit" value="검색"></td>
						</tr>
					</tfoot>
				</table>
			</div>
		</fieldset>
	</form>
</body>
</html>