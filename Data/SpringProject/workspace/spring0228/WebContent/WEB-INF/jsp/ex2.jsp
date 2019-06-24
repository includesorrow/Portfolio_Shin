<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex1.jsp</title>
<style>
#res {
	width: 200px;
	background: pink;
	height: 35px;
}
</style>
</head>
<body>
	<div id="res"></div>
	<img src="resources/img/g1.jpg" />
	<img src="resources/img/g2.jpg" />
	<img src="resources/img/g2.jpg" />
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		/* attr()
		● $(selector).attr(name, value);
		● $(selector).attr(name, function(index,attr){});
		● $(selector).attr({object});
		 */
		$('img').attr({
			border : '1px soild red',
			height : function(index) {
				if (index == 0) {
					return 100;
				} else if (index == 1) {
					return 250;
				} else {
					return 500;
				}
			}
		});
	});
</script>
</html>