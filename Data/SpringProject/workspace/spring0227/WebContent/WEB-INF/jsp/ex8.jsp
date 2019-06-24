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
	<!-- five�� �ܾ��� ������ ��������� �����ϰ� �ٸ� ������ ���������� �����ϸ缭 ������ ������� �����ϸ鼭 ��� -->
	<div>
		<em> one </em> <a> two </a> <a> three </a> <b> four </b> <a> five
		</a> <em> six </em>
	</div>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		// div�� �ڽ� Element�� ���� ����.
		// $('div').children() => em, a, ���
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
			// 0�� em�� �ּ�
			var $node = $chNode.eq(i);
			// $node.html() -> em�ȿ� html �����͸� ������ ��
			// ������ $.trim���� ó��
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