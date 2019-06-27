<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex5.jsp</title>
<style>
	.cng{background: orange; color: red;}
	p{color: pink;}
</style>
</head>
<body>
	<h1>Hello World!</h1>
	<h1>Hello World!</h1>
	<h1>Hello World!</h1>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(function(){
		//한 번에 여러 이벤트를 감지하고 처리하고 할 때 사용되는 함수
		$('h1').bind({
			click : function(){
				$(this).html(function(index,html){
					return "<p>러브러브♥</p>";
				});
			},
			mouseenter : function(){
				$(this).addClass('cng')
			},
			mouseleave : function(){
				$(this).removeClass('cng')
			}
		});
	});
</script>
</html>