<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<style>
#res {
	width : 200px;
	background : pink;
	height : 35px;
}

</style>

<script>
//attr() : 속성과 관련된 모든 기능을 수행한다.
$(function(){
	$('img').attr('width',150);
		$('img').attr('width',function(index){
			return (index) * 100;
		});
		//연습문제 : 이미지의 크기를 100,250,500으로 맞추시오.
	$('img').attr('width',function(index){
		if(index==0){
			return 100;
		}else if(index == 1){
			return 250;
		}else{
			return 500;
		}
	});
		
		
	$('img').attr({
		border : '1px solid red',
		height : function(index) {
		if(index==0){
			return 100;
		}else if(index == 1){
			return 250;
		}else{
			return 500;
		}
		}
	});
		
});

//인덱스는 집합객체

</script>

<body>
	<div id="res"></div>
	<img src="resources/img/Chrysanthemum.jpg"/>
	<img src="resources/img/Hydrangeas.jpg"/>
	<img src="resources/img/Desert.jpg"/>
	
	
	
</body>
</html>