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
		//�� ���� ���� �̺�Ʈ�� �����ϰ� ó���ϰ� �� �� ���Ǵ� �Լ�
		$('h1').bind({
			click : function(){
				$(this).html(function(index,html){
					return "<p>���귯�ꢾ</p>";
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