<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex9_filter</title>
</head>
<body>
	<div id="wrap">
		<table>
			<%for (int i = 0; i < 10; i++) {%>
			<tr>
				<td>Value : <%=i%></td>
			</tr>
			<% }%>
		</table>
	</div>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		/*filter() : ���� ��ü�� Ž�� �� ���͸��� �Ѵ�.
		�� $(selector).filter(selector);
		�� $(selector).filter(function(index){});*/
		// 1. ������ �ߴ� Ȧ�� ��Ҹ� ã�Ƽ� ���� ��ü�� ������ ���� �غ���
		$('tr:odd').css({
			backgroundColor : 'orange',
			color : 'red'
		});
		// 2. filter() �޼����� ���ڰ��� even�� ����� �� �ִ�.
		$('tr').filter(':even').css({
			backgroundColor : 'yellow',
			color : 'blue'
		});
		// -> 3�� ������� ���� �޾Ƽ� ���� ��ü�� �����Ѵ�.
		$('tr').filter(function(index) {
			return index % 3 == 0;
		}).css({
			backgroundColor : "pink",
			color : 'blue'
		});
	});
</script>
</html>