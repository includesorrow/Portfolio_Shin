<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ul>
	<li><a href="./" style="color: white;">Home</a></li>
	<!-- 세션이 있으면 : 로그아웃, 세션이 없으면 : 로그인 -->
	<li><c:choose>
			<c:when test="${sessionScope.uid == null }">
				<a href="mykosta" style="color: white;">로그인</a>
			</c:when>
			<c:otherwise>
	${sessionScope.uname }님 <a href="logout" style="color: white;">로그아웃</a>
			</c:otherwise>
		</c:choose></li>
	<li><c:choose>
			<c:when test="${sessionScope.uid == null }">
				<a href="txf" style="color: white;">회원가입</a>
			</c:when>
			<c:otherwise>
				<a href="mypage" style="color: white;">마이페이지</a>
			</c:otherwise>
		</c:choose></li>
	<li><a href="jqueryMain" style="color: white;">게시판</a></li>
	<li><a href="edu" style="color: white;">KOSTA EDU</a></li>
	<li><a href="ckeditor" style="color: white;">CkEditor</a></li>
	<li><a href="txf" style="color: white;">Transaction 예제</a></li>
</ul>