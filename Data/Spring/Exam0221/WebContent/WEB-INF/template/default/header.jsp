<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--  header1 ���� ���� -->
<div id="header1" class="hd">
	<div id="hgroup">
		<h1>Page Header</h1>
		<h2>Page Sub Heading</h2>${error}
		<c:if test="${error} eq sess">
			<p> ���ǿ���</p>
		</c:if>
	</div>
</div>
<!--  header1 ���� �� -->