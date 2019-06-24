<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="resImg" value="resources/img"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jQuerydemo1</title>
<style>
#wrap {
	width: 350px;
	height: 300px;
}
</style>
</head>
<body>
	<div id="wrap">
		<p>
			<img id="target" src="${resImg }/pic_bulboff.gif">
		</p>
		<p>
			<input type="button" id="hideBtn" value="Hide">
			<input type="button" id="showBtn" value="Show">
		</p>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script>
		$(function() {
			$('#hideBtn').click(function() {
				console.log("Hide Btn Clicked!");
				$('#target').hide("fast", function() {
					$('#wrap').css("background", "yellow") //fast : hide 수행 시
				});
			});
			$('#showBtn').click(function() {
				console.log("Show Btn Clicked!");
				$('#target').show("slow");
				$('#wrap').css("background", "red") //slow : show 마친 후
			});
		});
	</script>

</body>
</html>