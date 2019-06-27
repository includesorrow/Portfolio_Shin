<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="resImg" value="resources/img"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; carset=EUC-KR">
<title>ex2.jsp</title>
</head>
<body>
	<p id="target">
		<img id="myImage" src="${resImg }/pic_bulboff.gif"
			style="width: 100px">
	</p>
	<button id="onBtn">turn on the light</button>
	<button id="offBtn">Turn off the light</button>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>
	//�н���ǥ
		$(function() {
			$('#onBtn').click(function() {
				imgOnOff(1)
			});
			$('#offBtn').click(function() {
				imgOnOff(2)
			});
		})
		function imgOnOff(idx) {
			let paths = "";
			if (idx === 1) {
				console.log("1");
				//1. ù��° ��� img �±� ��ü�� �Է��Ѵ�.
				//let imgPath = "<img id='myImage' src='${resImg}/pic_bulbon.gif style='width:100px'>"
				//$('#target').html(imgPath);
				//------------------------------------js
				//document.getElementById('target').innerHTML="<img id='myImage' src='${resImg}pic_bulbon.gif' style='width:100px'>";
				paths = "${resImg}/pic_bulbon.gif";
			} else {
				console.log("2");
				//let imgPath = "<img id='myImage' src='${resImg}/pic_bulboff.gif style='width:100px'>"
				//$('#target').html(imgPath);
				//------------------------------------js
				//document.getElementById('target').innerHTML="<img id='myImage' src='${resImg}pic_bulboff.gif' style='width:100px'>";
				paths = "${resImg}/pic_bulboff.gif";
			}
			//jQuery -> innerHTML=tag => html("tag")
			//2. �ι�° ��� �̹����� �Ӽ� �� src�� �����Ѵ�.
			$('#myImage').attr('src', paths);
		}
	</script>

</html>
