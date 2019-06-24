<%--
  Created by IntelliJ IDEA.
  User: parkjihyoung
  Date: 15. 5. 24.
  Time: 오후 5:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Rserve.Rserve_C" %>
<html>
  <head>
    <title>Rserve</title>
  </head>
  <body>
<h1> hello world </h1>
<%
  Rserve_C rc = new Rserve_C();
  out.print(rc.returnRClass());
%>
  </body>
</html>
