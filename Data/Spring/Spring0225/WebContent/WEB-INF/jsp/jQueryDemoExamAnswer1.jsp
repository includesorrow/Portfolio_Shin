<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="resImg" value="resources/img"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jQueryDemoExam1</title>
</head>
<body>
<p id="target">
<img id="myImage" src="${resImg }/pic_bulboff.gif" style="width:100px">
</p>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<button id="onBtn">Turn on the light</button>
<button id="offBtn">Turn off the light</button>
<!-- ��ư�����̵��ʿ� -->

<script>
//�н�����Ʈ : �ڹٽ�ũ��Ʈ�� ����ؼ� �Լ��� �̹��� innerhtml ����ؼ� �ڵ鸵
//�װ��� �ٽ� jQuery�� �����ڷ� �����ؼ� �ش� �̹����� ����(html(),src)
	$(function(){
		$('#onBtn').click(function(){
			
			imgOnOFF(1)	
			
		});	
		$('#offBtn').click(function(){
			imgOnOFF(2)
		});
		
	});
	



	function imgOnOFF(idx){
		let paths="";
		if(idx===1){
			console.log("1");
		//1��° ��� img �±� ��ü�� �Է��Ѵ�
// 		let imgPath="<img id='myImage' src='${resImg}/pic_bolbon.gif' style='width:100px'>"
// 		$('#target').html(imgPath);			
		//---------------------------------
		//-------------JS----------------
// 				document.getElementById('target').innerHTML=
// 				"<img id='myImage' src='${resImg}/pic_bulbon.gif' style='width:100px'>";
		//-----------�������----
		paths="${resImg}/pic_bulbon.gif";
				
		}else{
			console.log("2");
// 			let imgPath="<img id='myImage' src='${resImg}/pic_bulboff.gif' style='width:100px'>"	
// 			$('#target').html(imgPath);
//			-----------------------------------JS
// 			document.getElementById('target').innerHTML=
// 				"<img id='myImage' src='${resImg}/pic_bulboff.gif' style='width:100px'>";
			//--------------�������------------
			paths="${resImg}/pic_bulboff.gif";
			
		}
		//2. �ι�° ��� �̹����� �ӻ� src ����
		$('#myImage').attr('src',paths);
			}

</script>
</body>
</html>