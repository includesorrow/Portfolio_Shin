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
		// h1�� ������ �о�ͼ� html ���ڷ� ����
// 		$('h1').html(function(index, html) {
// 			console.log(index + ":" + html);
// 			return '��' + html + '��';
// 		});
		// ��������) css �����ڸ� ����ؼ� h1�� 0���� 2������ ������ �����ؼ� ����Ͻÿ�.
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
			return '��' + html + '��';
		});
		//$('<h2></h2>').html('���� �ȴ�!').appendTo('body');
		//$('<p></p>').html('���� �ȴ�!zz').appendTo('span');
	});
</script>
</html>