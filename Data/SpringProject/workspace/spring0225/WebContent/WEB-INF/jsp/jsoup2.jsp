<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="article">
	<div id="header2">
		<h1>�н���ǥ : UI Design : Jsop ũ�Ѹ� �����ϱ�</h1>
		<p id="time">2019-02-20</p>
	</div>
	<div id="content">
		<div style="width: 600px;">
			<c:forEach items="${list }" var="li">
				<table border="1">${li }</table>
			</c:forEach>
		</div>
	</div>
</div>