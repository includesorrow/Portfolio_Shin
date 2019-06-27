<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jQuerydemo2.jsp</title>
</head>
<body>
	<div>
		<h2>This is a heading</h2>
		<p>This is a paragraph.</p>
		<p>This is another paragraph.</p>
		<button id="btn1">Click me</button>
	</div>
	<%--
		css�Լ� : style ���� �� inline������� ����
		* : ��� ��Ҹ� �ǹ��Ѵ�.
		��� ��ҿ� ������ ���Ѻ���
		$("*").css("background","red"); -> ������ �߻�!
	 --%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
		$(document).ready(function() {
			$("body *").css("background", "red");
			$("#btn1").click(function() {
				$("body *").css("background", "yellow");
				$(this).text("Clicked!");
			});
		});
</script>
</body>
</html>