<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex6.jsp</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<style>
		#target,#imgCnt{width:600px; margin:auto;}
		#target img{width:550px; height:350px; margin:30px;}
		ul li {list-style : none; float : left; margin-left : 5px}
		ul li img{width:100px; cursor:pointer;}
		#dialog-background{
		display : none;
		position : fixed;
		top : 0; left : 0;
		width : 100%; height : 100%;
		background : rgba(0,0,0,.3);
		z-index:10;
		}
		#my-dialog{
		display:none;
		position:fixed;
		left:calc(50%-160px); top:calc(50%-70px);
		background:#fff;
		z-index:11;
		padding:10px;
		}
	
	</style>
	
<script>
$(document).ready(function(){
	$('img').bind({
		mouseenter:function(){
			
			
			$('#target img').attr('src',$(this).attr('src').valueOf())
		},click:function(){
			$('#my-dialog,#my-dialogImg').css({'width' : 400, 'height' : 300})
			$("#my-dialog,#dialog-background").show();
			$('#my-dialogImg').attr('src',$(this).attr('src').valueOf());
		}
	});	

	$('#btn-close-dialog').click(function(){
		$("#my-dialog,#dialog-background").hide();
	});

});

</script>
</head>
<body>
	<div id="target">
		<img src="resources/img/1.jpg"/>
	
	</div>
	<div id="imgCnt">
		<ul>
			<%
				for (int i = 1; i <= 5; i++){
			%>
			<li><img src="resources/img/<%=i%>.jpg"/></li>
			<%
				}
			%>
		</ul>
	
	</div>
	<!-- 모달창 -->
	<div id="my-dialog">
	<img src="" id="my-dialogImg">
	<button id="btn-close-dialog">창닫기</button>
	
	</div>
	<div id="dialog-background"></div>

</body>
</html>