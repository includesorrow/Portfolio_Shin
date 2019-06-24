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
css�Լ� : style ����� inline ������� ����
* : ��� ��Ҹ� �ǹ���. 
��� ��ҿ� ������ ���Ѻ���
$("*").css("background","red");
-> ������ �߻�.
 --%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>

$(document).ready(function(){
	//$("*").css("background","red");
	//�̷��� ���ߵ����µ����� ���� �� background�� Red�� �����.
	$("body *").css("background","red");
	$("#btn2").click(function(){
		$("body *").css("background","yellow");
		 $(this).text("Clicked!");
	});
	//�̷��� �ϸ� body�κи� �����
	$("#btn1").click(function(){
    $("*").hide();
   
  });
});
</script>
</head>


</body>
</html>