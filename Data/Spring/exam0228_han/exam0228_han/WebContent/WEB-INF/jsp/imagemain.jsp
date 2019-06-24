<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}/resources/img/" var="e"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>이미지 보는곳</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
<style>
#target, #imgCnt {
	width: 600px;
	margin: auto;
}

#target img {
	width: 550px;
	height: 350px;
	margin: 30px;
}

ul li {
	list-style: none;
	float: left;
	margin-left: 5px
}

ul li img {
	width: 100px;
	cursor: pointer;
}

#dialog_background {
	display: none;
	position: fixed;
	width: 100%;
	height: 100%;
	top: 0px;
	left: 0px;
	background: rgba(0, 0, 0, .3);
	z-index: 10;
}

#my_dialog {
	display: none;
	position: fixed;
 	left: calc(50% -160px); 
	top:0px;
/* 	top: calc(50% -70px); */
/* 	left:0px; */
	background: #fff;
	z-index: 11;
	padding: 10px;
}
</style>
<%-- modal을 위한 스타일 설정 --%>
</head>
<body>
	<div id="target">
		<img src="${e}${list[0].ifile}">
	</div>
	<%--메인이미지가 들어올 곳 --%>
	<div id="imgCnt">
		<ul>
			<c:forEach items="${list}" var="i">
				<li><img src="${e}${i.ifile}"></li>
			</c:forEach>
			<%-- 전체이미지가 들어올 곳. --%>
		</ul>
	</div>
	<div>
		<button type="button" id="refresh">새로고침</button>
	</div>
	<div style="display: none;" id="res"></div>
	<%-- ajax로 값은 받는데 그 값을 출력해주기 싫어서 display none인 div하나를 만듬. --%>
	<div id="dialog_background"></div>
	<div id="my_dialog">
		<img src="" id="my_dialogImg">
		<button type="button" id="btn-class-dialog">창닫기</button>
	</div>
	<script>
		$(function() {
			function react(){
				$("#imgCnt ul li img").bind(
					{
						mouseenter : function() {
							$("#target img").attr('src',$(this).attr('src').valueOf());
						},
						click : function() {
							$("#dialog_background").show();
							$("#my_dialog").show();
							$("#my_dialogImg").attr("src",
									$(this).attr('src').valueOf());
						}
					});
				$("#btn-class-dialog").bind({
					click : function() {
						$("#my_dialogImg").attr("src", "");
						$("#dialog_background").hide();
						$("#my_dialog").hide();
					}
				});
				//modal에 관한 function들
				
				$("#refresh").bind({
					click: function(){
						$("#res").load("refresh",function(response){
							// ajax를 통해 값을 받아옴.
							let array=response.split(",");
							// ifile부분만 리스트화 시켜서 가져옴.
							console.log(array);
							$("#imgCnt ul").html(function(){ 
								let html="";
								for(let s=0;s<array.length;s++){
									if($.trim(array[s])!=""){
										// 이미지가 없을경우는 새로고침에서  생성하지 않도록 만듬.
										html+='<li><img src="${e}'+array[s]+'"></li>';
									}
								}
								// for문을 통해서 이미지태그를 다시 완성시켜둠.
								return html;
							})
						react();
							// 새로운 img 객체에 bind를 걸기위해서 이를 재실행
						});
					}
				})
			}	
			react();
			// function으로 묶어두었기에 처음에 1번 실행시킴.
		})
	</script>
</body>
</html>