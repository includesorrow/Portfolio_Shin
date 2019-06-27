<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex7.jsp</title>
</head>
<body>
	<div>
		<p>Test 1</p>
		<p id="test1">이것은 Test 입니다.</p>
		<p>오늘은 목요일!</p>
		<p>내일은 금요일!</p>
		<p>내일은 금요일!</p>
		<p>내일은 금요일!</p>
		<p>내일은 금요일!</p>
		<p>내일은 금요일!</p>
		<h1>jQuery Test 입니다.</h1>
		<div>
			<h1 id="target">jQuery Test2 입니다.</h1>
		</div>
	</div>
</body>
<%--
	JQuery 함수 필터 선택자
	● 요소:Contains(문자열) : 특정 문자열을 포함하는 문서 객체를 선택
	● 요소:eq(n) : n번째 위치하는 문서 객체를 선택
	● 요소:gt(n) : n번째 초과 위치하는 문서 객체를 선택
	● 요소:has(h1) : h1태그를 가지고 있는 문서 객체를 선택
	● 요소:lt(n) : n번째 미만에 위치하는 문서 객체를 선택
	● 요소:not(선택자) : 선택자와 일치하지 않는 문서 객체를 선택
	● 요소:nth-child(3n+1) : 3n+1번째 위치하는 문서 객체를 선택한다 (1,4,7,,,,)
 --%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(
			function() {
				//$('div p:contains("Test")').css("background","pink");
				//연습문제 div안에 있는 모든 요소에서 Test 문자열을 포함할 때

				//$('div p:gt(0)').css('background','red');

				//$('div:has("h1")').css({'background':'yellow','border':'1px solid red'});
				//$('p:nth-child(2n+1)').css('background','green');

				console.log($('div>div').children().text())
				console.log("id가 test1의 다음 요소 : " + $('#test1').next().text())
				console.log("id가 target인 부모의 h1의 내용출력 : "
						+ $.trim($('#target').parent().prev().text()));
			});
</script>
</html>