<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="resImg" value="resources/img"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jQueryExam6</title>
<style>
#wrap {	width: 750px; margin: auto;}
#wrap div {	text-align: center;}
body ul li {list-style: none; float: left}
body ul li img {width: 110px; height: 90px; cursor: pointer;}
div img {width: 400px; height: 500px;}
</style>	
</head>
<body>
	<div id="wrap">
		<div><a href=""><img src="${resImg }/1.jpg" id="target"></a>
		</div>
		<ul>
			<c:forEach begin="1" end="6" step="1" varStatus="e">
				<li><img src="${resImg }/${e.index}.jpg"></li>
			</c:forEach>
		</ul>
	</div>
</body>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$("ul li img").on({
		mouseenter : function() {
			//console.log("마우스 on");
			//마우스 on일 경우 $(this).attr("src") 읽어와서 target에 적용
			$('#target').attr("src",$(this).attr("src"))
		},
		mouseleave : function() {
			console.log("마우스 off");
		},
		click : function() {
			console.log("마우스 click");
		}
		// :first => first(), last(), prev(), next(), child()
		// eq() => 예제를 작성하기 학습 바랍니다.
	});
</script>
</html>