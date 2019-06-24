<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content=Type" content="text/html; charset=EUC-KR">
<title>deptList.jsp</title>
<style>
	#wrap{width: 500px; margin: auto;}
	table{border: 1px dotted; width: 100%}
	td{border: 1px solid;}
	.no{width: 20%; background: orange; text-align: center;}
</style>
</head>
<body>
	<div id="wrap">
		<table>
			<tr><th>부서번호</th><th>부서명</th><th>위치</th></tr>
			<c:forEach var="e" items="${dlist }">
				<tr>
					<td class="no">${e.deptno}</td>
					<td>&nbsp;&nbsp;${e.dname }</td>
					<td>&nbsp;&nbsp;${e.loc }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>