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
//attr() : �Ӽ��� ���õ� ��� ����� �����Ѵ�.
$(function(){
	$('img').attr('width',150);
		$('img').attr('width',function(index){
			return (index) * 100;
		});
		//�������� : �̹����� ũ�⸦ 100,250,500���� ���߽ÿ�.
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

//�ε����� ���հ�ü

</script>

<body>
	<div id="res"></div>
	<img src="resources/img/Chrysanthemum.jpg"/>
	<img src="resources/img/Hydrangeas.jpg"/>
	<img src="resources/img/Desert.jpg"/>
	
	
	
</body>
</html>