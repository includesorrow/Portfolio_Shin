<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		//innerHTML����.
		$('div').html('<h1>Test 1 </h1>');
		$('div').html(function(index){
			return '<p> test' + index + "</p>";
		});
		
		//���� �������� <h1>~<h3>���� div������ ä��ÿ�.
		$('div').html
		(function(index){
			return '<h' + parseInt(index + 1,10) + '> test'
				+ '</h' + parseInt(index + 1,10) + '>';
				});
	
		$('div').css({
			border : '1px solid red',
			width : 300,
			height : 120
		});
		});


</script>
</head>
<body>
	<div></div>
<div></div>
<div></div>
</body>
</html>