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
		/*filter() : 문서 객체를 탐색 및 필터링을 한다.
		● $(selector).filter(selector);
		● $(selector).filter(function(index){});*/
		// 1. 예전에 했던 홀수 요소만 찾아서 문서 객체의 색상을 변경 해보자
		$('tr:odd').css({
			backgroundColor : 'orange',
			color : 'red'
		});
		// 2. filter() 메서드의 인자값에 even을 사용할 수 있다.
		$('tr').filter(':even').css({
			backgroundColor : 'yellow',
			color : 'blue'
		});
		// -> 3의 배수값을 리턴 받아서 문서 객체로 선택한다.
		$('tr').filter(function(index) {
			return index % 3 == 0;
		}).css({
			backgroundColor : "pink",
			color : 'blue'
		});
	});
</script>
</html>