<%@page import="practice.rJava_Con"%>
<%@ page import="com.sun.org.apache.xml.internal.security.utils.Base64"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Test!</h1>
 <% rJava_Con con = new rJava_Con(); %>
 <img src=" <%=Base64.encode(con.returnRImg())%>" />

</body>
</html>