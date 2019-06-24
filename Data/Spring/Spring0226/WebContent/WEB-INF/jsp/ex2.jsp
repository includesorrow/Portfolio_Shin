<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="resImg" value="resources/image"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex2.jsp</title>
<script src="resources/js/myfunc.js"></script>
</head>
<body>

<button  onclick="changeImg('pic_bulbon.gif')">Turn on the light</button>
   <img id="myImage" src="resources/image/pic_bulboff.gif" style="width:100px">
<button  onclick="changeImg('pic_bulboff.gif')">Turn off the light</button>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>
   
</script>
</body>
</html>