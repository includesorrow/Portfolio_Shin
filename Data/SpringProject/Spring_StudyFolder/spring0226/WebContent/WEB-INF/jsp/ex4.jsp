<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex4.jsp</title>
</head>
<body>
	<!-- 5�� �����ϴ� �ڹٽ�ũ��Ʈ �Լ��� ���� ������Ѻ���. -->
	<input type="button" onclick="incrementNum()" value="Click">
	<p id="res"></p>
	<input type="number" value="0" id="res2">
</body>
<script>
	let inum = 0;
	function incrementNum() {
		inum += 5;
		document.getElementById("res").innerHTML = inum;
		//jQeuery $('#res2')
		document.getElementById("res2").value = inum;
	}
</script>
</html>