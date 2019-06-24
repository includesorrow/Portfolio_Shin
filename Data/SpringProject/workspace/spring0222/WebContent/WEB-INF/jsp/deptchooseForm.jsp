<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content=Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
#wrap {width: 500px; margin: auto; border: 1px dotted;}
</style>
</head>
<body>
	<div id="wrap">
		<form action="deptalllist" method="post">
			부서번호 : <select name="deptno">
				<option>10</option>
				<option>20</option>
				<option>30</option>
				<option>40</option>
				<option>50</option>
			</select> <input type="submit" value="검색">
		</form>
	</div>
</body>
</html>