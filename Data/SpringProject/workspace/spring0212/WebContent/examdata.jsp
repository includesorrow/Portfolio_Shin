<%@page import="exam.ExamBeanInter"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	String type = request.getParameter("con");
	ApplicationContext ctx = new GenericXmlApplicationContext("exam/exam.xml");	//경로설정 후 빈을 한번만 생성!
	ExamBeanInter ebi = ctx.getBean("exam", ExamBeanInter.class);
	ebi.callExecutebean(type);
	%><%=ebi.getMessageBean()%>