<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>exam_1.jsp</title>
<style>
div {
	width: 600px;
	height: 200px;
}

.textstyle {
	font-size: 14pt;
	line-height: 20pt;
	margin: 10px;
}
</style>
</head>
<body>
	<!-- five란 단어라면 배경색을 보라색으로 변경하고 다른 노드들은 순차적으로 증가하며서 배경색을 노랑으로 변경하면서 출력 -->
	<div>
		<em> one </em> <a> two </a> <a> three </a> <b> four </b> <a> five
		</a> <em> six </em>
	</div>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		// div의 자식 Element를 변수 저장.
		// $('div').children() => em, a, 등등
		var $chNode = $('div').children();
		$chNode.css({
			'display' : 'block',
			'width' : '100px',
			'height' : '30px',
			'float' : 'left',
			'text-align' : 'center'
		});
		var i = 0;
		var inter = setInterval(function() {
			// 0는 em의 주소
			var $node = $chNode.eq(i);
			// $node.html() -> em안에 html 데이터를 가져온 것
			// 공백은 $.trim으로 처리
			if ($.trim($node.html()) == 'five') {
				$node.css("backgroundColor", "blue");
			} else {
				$node.css("backgroundColor", "pink");
			}
 			if (i > 5) {
 				clearInterval(inter);
 			}
			i++
		}, 500);
	});
</script>
</html>