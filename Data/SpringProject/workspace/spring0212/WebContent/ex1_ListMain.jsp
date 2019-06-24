<%@page import="java.util.List"%>
<%@page import="collection.Ex1_List"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex1_ListMain.jsp</title>
</head>
<body>
	<%
		ApplicationContext ctx = 
		new GenericXmlApplicationContext("collection/list.xml");
		Ex1_List list = ctx.getBean("list2", Ex1_List.class);
		List<Float> flist = list.getItemsf();
		for(Float e: flist){
	%>
		<%=e %> <br>
		<%} %>
</body>
</html>