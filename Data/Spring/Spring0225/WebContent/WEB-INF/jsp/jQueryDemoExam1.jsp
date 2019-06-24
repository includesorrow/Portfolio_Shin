<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="resImg" value="resources/img"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jQueryDemoExam1</title>
</head>
<body>
<p id="target">
<img id="myImage" src="${resImg }/pic_bulboff.gif" style="width:100px">
</p>

<button onclick="imgOnOFF(1)">Turn on the light</button>
<button onclick="imgOnOFF(2)">Turn off the light</button>
<!-- 버튼에아이디필요 -->

<script>
	function imgOnOFF(idx){
		if(idx===1){
			console.log("1");
			document.getElementById('target').innerHTML=
				"<img id='myImage' src='${resImg}/pic_bulbon.gif' style='width:100px'>";
				
		}else{
			console.log("2");
			
			document.getElementById('target').innerHTML=
				"<img id='myImage' src='${resImg}/pic_bulboff.gif' style='width:100px'>";
	
		}
			}

</script>
</body>
</html>