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

<div id="article">
<div id="header2">
	<h1> 학습목표 : Jsoup사용해서 크롤링 적용하기</h1>
	<p id="time">2019-02-21</p>

</div>
<div id="content">
	<h2>크롤링 결과</h2>
	<ol>
	
	<c:forEach var="e" items="${list }">
		<li>${e }</li>
		</c:forEach>
	</ol>
	<p>
	
	<h3>D3.js 적용</h3>

	<div class="chart"></div>
</div>

</div>

</body>
</html>