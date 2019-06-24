<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ul>
	<li><a href="./">Home</a></li>
	<!-- 세션이 있으면 : 로그아웃, 세션이 없으면 : 로그인 -->
	<li><c:choose>
			<c:when test="${sessionScope.uid == null }">
				<a href="mykosta">로그인</a>
			</c:when>
			<c:otherwise>
	${sessionScope.uname }님 <a href="logout">로그아웃</a>
			</c:otherwise>
		</c:choose></li>
	<li><c:choose>
			<c:when test="${sessionScope.uid == null }">
				<a href="txf">회원가입</a>
			</c:when>
			<c:otherwise>
				<a href="mypage">마이페이지</a>
			</c:otherwise>
		</c:choose></li>
	<li><a href="jqueryMain">게시판</a></li>
	<li><a href="jqueryMain2">UI 적용 예제2</a></li>
	<li><a href="ckeditor">CkEditor</a></li>
	<li><a href="txf">Transaction 예제</a></li>
</ul>