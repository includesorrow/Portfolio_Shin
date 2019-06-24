<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex4.jsp</title>
</head>
<body>
	<span>Tag Test</span>
	<h1>Hello World!</h1>
	<h1>Hello World!</h1>
	<h1>Hello World!</h1>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		// h1의 내용을 읽어와서 html 인자로 전달
// 		$('h1').html(function(index, html) {
// 			console.log(index + ":" + html);
// 			return '♡' + html + '♡';
// 		});
		// 연습문제) css 선택자를 사용해서 h1의 0부터 2까지의 색상을 지정해서 출력하시오.
		// 		$('h1').css('color', function(index){
		// 			if(index==0){
		// 				return "cyan";
		// 			}else if(index==1){
		// 				return "magenta";
		// 			}else{
		// 				return "yellow";
		// 			}
		// 		});

		var colors = [ 'red', 'blue', 'orange' ];
		$('h1').html(function(index, html) {
			$(this).css('color', colors[index]);
			return '♡' + html + '♡';
		});
		//$('<h2></h2>').html('하이 안뇽!').appendTo('body');
		//$('<p></p>').html('하이 안뇽!zz').appendTo('span');
	});
</script>
</html>