<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<ul>
	<li><a href="./" style="color: white;">Home</a></li>
	<!-- ������ ������ : �α׾ƿ�, ������ ������ : �α��� -->
	<li><c:choose>
			<c:when test="${sessionScope.uid == null }">
				<a href="mykosta" style="color: white;">�α���</a>
			</c:when>
			<c:otherwise>
	${sessionScope.uname }�� <a href="logout" style="color: white;">�α׾ƿ�</a>
			</c:otherwise>
		</c:choose></li>
	<li><c:choose>
			<c:when test="${sessionScope.uid == null }">
				<a href="txf" style="color: white;">ȸ������</a>
			</c:when>
			<c:otherwise>
				<a href="mypage" style="color: white;">����������</a>
			</c:otherwise>
		</c:choose></li>
	<li><a href="jqueryMain" style="color: white;">�Խ���</a></li>
	<li><a href="edu" style="color: white;">KOSTA EDU</a></li>
	<li><a href="ckeditor" style="color: white;">CkEditor</a></li>
	<li><a href="txf" style="color: white;">Transaction ����</a></li>
</ul>