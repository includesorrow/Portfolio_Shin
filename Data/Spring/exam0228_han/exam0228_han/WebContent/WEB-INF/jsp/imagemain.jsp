<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}/resources/img/" var="e"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�̹��� ���°�</title>

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
<%-- modal�� ���� ��Ÿ�� ���� --%>
</head>
<body>
	<div id="target">
		<img src="${e}${list[0].ifile}">
	</div>
	<%--�����̹����� ���� �� --%>
	<div id="imgCnt">
		<ul>
			<c:forEach items="${list}" var="i">
				<li><img src="${e}${i.ifile}"></li>
			</c:forEach>
			<%-- ��ü�̹����� ���� ��. --%>
		</ul>
	</div>
	<div>
		<button type="button" id="refresh">���ΰ�ħ</button>
	</div>
	<div style="display: none;" id="res"></div>
	<%-- ajax�� ���� �޴µ� �� ���� ������ֱ� �Ⱦ display none�� div�ϳ��� ����. --%>
	<div id="dialog_background"></div>
	<div id="my_dialog">
		<img src="" id="my_dialogImg">
		<button type="button" id="btn-class-dialog">â�ݱ�</button>
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
				//modal�� ���� function��
				
				$("#refresh").bind({
					click: function(){
						$("#res").load("refresh",function(response){
							// ajax�� ���� ���� �޾ƿ�.
							let array=response.split(",");
							// ifile�κи� ����Ʈȭ ���Ѽ� ������.
							console.log(array);
							$("#imgCnt ul").html(function(){ 
								let html="";
								for(let s=0;s<array.length;s++){
									if($.trim(array[s])!=""){
										// �̹����� �������� ���ΰ�ħ����  �������� �ʵ��� ����.
										html+='<li><img src="${e}'+array[s]+'"></li>';
									}
								}
								// for���� ���ؼ� �̹����±׸� �ٽ� �ϼ����ѵ�.
								return html;
							})
						react();
							// ���ο� img ��ü�� bind�� �ɱ����ؼ� �̸� �����
						});
					}
				})
			}	
			react();
			// function���� ����ξ��⿡ ó���� 1�� �����Ŵ.
		})
	</script>
</body>
</html>