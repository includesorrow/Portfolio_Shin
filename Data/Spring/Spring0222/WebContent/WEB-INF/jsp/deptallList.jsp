<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div id="wrap">
		<p> 부서번호 : ${dlist.deptno } | 부서명 : ${dlist.dname }</p>
		<c:forEach var="e" items="${dlist.sawon }">
			<p> 사원번호 : ${e.sabun } | 사원이름 : ${e.saname } | 사원직책 : ${e.sajob }
			|사원급여 : ${e.sapay } </p>
			<p> 휴대폰번호 : ${e.sphone.phnum} | 지급모델 : ${e.sphone.pmodel } | 지급날짜 : ${e.sphone.pdate }
			<hr />
		</c:forEach>
	</div>

</body>
</html>