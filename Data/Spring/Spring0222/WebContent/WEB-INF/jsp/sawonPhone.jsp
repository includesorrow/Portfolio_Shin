<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
	#wrap{width:500px; margin:auto; border:1px dotted;}
</style>
</head>
<body>
	<div id="wrap">
		<ul>
			<li> �����ȣ : ${sawon.sabun }</li>
			<li> �����å : ${sawon.sajob }</li>
			<li> ����̸� : ${sawon.saname }</li>
			<li> ����ȣ : ${sawon.sphone.phnum }</li>
			<li> ���� : ${sawon.sphone.pmodel }</li>
		</ul>
	</div>


</body>
</html>