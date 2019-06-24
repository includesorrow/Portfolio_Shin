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
		//h1의 내용을 읽어와서 html 인자로 전달
		$('h1').html(function(index,html){
			console.log(index+":"+html);
		
			return '≡'+html+'≡';
			
		});
		
		//비교 기존꺼
		$('h1').css('color',function(index){
			if(index==0){
				return 'red';
				
			}
			else if(index == 1){
				return 'blue';
				
			}
			else{
				return 'orange';
			}
			
		});
		
		
		
		//비교 좋은거
		var colrs = ['red','blue','orange'];
		$('h1').html(function(index,html){
			$(this).css('color',colrs[index]);
			return '☆'+html+'★';
		});
		
		//연습문제 : css 선택자를 사용해서 h1의 0부터 2까지의 색상을 지정해서 출력하시오.
		
	});

</script>
</head>
<body>
	<span>Tag Test</span>
	<h1>Hello World!</h1>
	<h1>Hello World!</h1>
	<h1>Hello World!</h1>
	
</body>
</html>