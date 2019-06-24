<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="resImg" value="../resources/img"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	#wrap{width:300px; margin:auto}
	#wrap div{text-align:center}
	body ul li {list-style:none; float:left}
	body ul li img {width:150px; height:100px; cursor:pointer}
	div img {width:200px; height:300px;}
</style>
</head>
<body>
<div id="wrap">
	<div><a href=""><img src="${resImg }/1.jpg" id="target"></a></div>
	<ul><c:forEach begin="1" end="6" step="1" varStatus="e" >
		<li><img src="${resImg }/${e.index}.jpg"></li>
		</c:forEach>
		
	</ul>
	</div>
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$("ul li img").on({
		
		mouseenter: function(){
			console.log("마우스 on");
			//console.log("마우스 on" + $(this).attr("src"));
			//마우스 on일 경우 $(this).attr("src") 읽어와서 타겟 적용
			$("#target").attr("src",$(this).attr("src"))
		},
		mouseleave:function(){
			console.log("마우스off");
			
		},
		click: function(){
			console.log("마우스 click");
		}
		// : first => first(),last(), prev(), next(),child()
	})


</script>

<script>

</script>
</body>
</html>