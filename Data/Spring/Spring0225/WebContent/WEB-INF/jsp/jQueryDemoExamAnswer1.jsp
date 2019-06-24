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
<!-- 버튼에아이디필요 -->

<script>
//학습포인트 : 자바스크립트를 사용해서 함수와 이미지 innerhtml 사용해서 핸들링
//그것을 다시 jQuery의 선택자로 변경해서 해당 이미지를 변경(html(),src)
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
		//1번째 방법 img 태그 자체를 입력한다
// 		let imgPath="<img id='myImage' src='${resImg}/pic_bolbon.gif' style='width:100px'>"
// 		$('#target').html(imgPath);			
		//---------------------------------
		//-------------JS----------------
// 				document.getElementById('target').innerHTML=
// 				"<img id='myImage' src='${resImg}/pic_bulbon.gif' style='width:100px'>";
		//-----------개선방법----
		paths="${resImg}/pic_bulbon.gif";
				
		}else{
			console.log("2");
// 			let imgPath="<img id='myImage' src='${resImg}/pic_bulboff.gif' style='width:100px'>"	
// 			$('#target').html(imgPath);
//			-----------------------------------JS
// 			document.getElementById('target').innerHTML=
// 				"<img id='myImage' src='${resImg}/pic_bulboff.gif' style='width:100px'>";
			//--------------개선방법------------
			paths="${resImg}/pic_bulboff.gif";
			
		}
		//2. 두번째 방법 이미지의 속상값 src 변경
		$('#myImage').attr('src',paths);
			}

</script>
</body>
</html>