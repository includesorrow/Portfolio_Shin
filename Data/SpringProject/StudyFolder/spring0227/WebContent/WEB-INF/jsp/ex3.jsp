<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex3.jsp</title>
</head>
<body>
	<div id="wrap">
		<table style="width: 100%">
			<tbody>
				<tr>
					<td class="item">Test내용 입니다.</td>
				</tr>
				<tr>
					<td class="item select">Test내용 입니다.</td>
				</tr>
				<tr>
					<td class="item">Test내용 입니다.</td>
				</tr>
				<tr>
					<td class="item select">Test내용 입니다.</td>
				</tr>
				<tr>
					<td class="item">Test내용 입니다.</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- <script>
	$(function() {
		var i = 0;
		setInterval(function() {
			i++;
			if (i % 2 == 0) {
				$('.item').css("background", "red");
				$('.item.select').css("background", "blue");
			} else {
				$('.item').css("background", "blue");
				$('.item.select').css("background", "red");
			}
		}, 500);
	});
</script> -->
<script>
	var num = false;
	$(function(){
		$('.item').css("background", "red");
		$('.item.select').css("background", "blue");
		setTimeout(test,500);
	});
	function test(){
		$('.item').css("background", "red");
		$('.item.select').css("background", "blue");
		setTimeout(test2,500);
	}
	function test2(){
		$('.item').css("background", "blue");
		$('.item.select').css("background", "red");
		setTimeout(test,500);
	}
</script>
</html>