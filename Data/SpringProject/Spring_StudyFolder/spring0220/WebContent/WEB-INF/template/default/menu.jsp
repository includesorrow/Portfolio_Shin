<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ul>
	<li><a href="./">Home</a></li>
	<!-- ������ ������ : �α׾ƿ�, ������ ������ : �α��� -->
	<li><c:choose>
			<c:when test="${sessionScope.uid == null }">
				<a href="mykosta">�α���</a>
			</c:when>
			<c:otherwise>
	${sessionScope.uname }�� <a href="logout">�α׾ƿ�</a>
			</c:otherwise>
		</c:choose></li>
	<li><c:choose>
			<c:when test="${sessionScope.uid == null }">
				<a href="txf">ȸ������</a>
			</c:when>
			<c:otherwise>
				<a href="mypage">����������</a>
			</c:otherwise>
		</c:choose></li>
	<li><a href="jqueryMain">�Խ���</a></li>
	<li><a href="jqueryMain2">UI ���� ����2</a></li>
	<li><a href="ckeditor">CkEditor</a></li>
	<li><a href="txf">Transaction ����</a></li>
</ul>