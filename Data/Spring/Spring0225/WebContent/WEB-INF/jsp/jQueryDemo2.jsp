<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jQueryDemo2.jsp</title>
</head>
<body>

<h2>This is a heading</h2>
<div>
<p>This is a paragraph.</p>
<p>This is another paragraph.</p>
<button id="btn1">click me</button>
<button id="btn2">Click me</button>
</div>
<%--
css함수 : style 적용시 inline 방식으로 적용
* : 모든 요소를 의미함. 
모든 요소에 적용을 시켜보기
$("*").css("background","red");
-> 문제가 발생.
 --%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>

$(document).ready(function(){
	//$("*").css("background","red");
	//이러면 쓰잘데없는데까지 전부 다 background가 Red로 적용됨.
	$("body *").css("background","red");
	$("#btn2").click(function(){
		$("body *").css("background","yellow");
		 $(this).text("Clicked!");
	});
	//이렇게 하면 body부분만 적용됨
	$("#btn1").click(function(){
    $("*").hide();
   
  });
});
</script>
</head>


</body>
</html>