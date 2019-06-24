<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<p id="p1">Enter this paragraph.</p>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	let p1Default = $('#p1').text();
  $("#p1").mouseenter(function(){
	  //append : 기존 내용에 내용을 추가하는 함수
	  $(this).append("JQuery실습!").css({"color":"pink"},{"fontSize":"20px"});
  									//이게 맵방식. key value
  });
  $("#p1").mouseleave(function(){
	  //empty() : 요소의 내용을 비운다
	  //remove() -> 요소의 내용을 삭제.
	  
	  $(this).empty().append(p1Default).css({"color":"red"},{"fontSize":"20px"});
	  	    });
});
</script>
</body>
</html>