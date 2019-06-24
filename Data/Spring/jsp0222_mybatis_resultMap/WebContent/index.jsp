<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%-- include를 사용하면 A가 B를 포함할 때 변환후 컴파일때
		하나의 서블릿으로 변환후 컴파일이 된다.
	 --%>
<%@ include file="header.jsp"%>
<%-- header 끝 --%>
<div id="content">
	<ul>
		<li><a href="my.kosta188?cmd=dyex1">동적쿼리 if문예제</a></li>
		<li><a href="my.kosta188?cmd=dyex2">동적쿼리 where문예제</a></li>
		<li><a href="my.kosta188?cmd=dyex3">동적쿼리 choose문예제</a></li>
		<li><a href="my.kosta188?cmd=dyfor">동적쿼리 foreach문예제</a></li>

	</ul>
	<hr>
	<ul>
		<li><a href="my.kosta188?cmd=resultMap1">ResultMap1 예제</a></li>
	</ul>
</div>
<%-- content 끝 --%>
<%@ include file="footer.jsp"%>