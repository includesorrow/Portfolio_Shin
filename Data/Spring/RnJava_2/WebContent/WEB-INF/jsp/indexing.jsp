<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    import="kr.or.kosta.mvc.controller.Plotting"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<% Plotting p = new Plotting();
   String imageTag = p.plot();
%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script>	
$(document).ready(function(){
 
});
</script>
</head>
<body>
<h1>�ȳ��ϼ��� !</h1>
<%=imageTag %>
</body>
</html>

