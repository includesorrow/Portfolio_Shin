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
	  //append : ���� ���뿡 ������ �߰��ϴ� �Լ�
	  $(this).append("JQuery�ǽ�!").css({"color":"pink"},{"fontSize":"20px"});
  									//�̰� �ʹ��. key value
  });
  $("#p1").mouseleave(function(){
	  //empty() : ����� ������ ����
	  //remove() -> ����� ������ ����.
	  
	  $(this).empty().append(p1Default).css({"color":"red"},{"fontSize":"20px"});
	  	    });
});
</script>
</body>
</html>