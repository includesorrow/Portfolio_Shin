<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex6.jsp</title>
<style>
table {
	width: 200px;
}
</style>
</head>
<body>
	<table>
	<tbody>
		<c:forEach var="i" begin="0" end="9" step="1">
			<tr>
				<td>${i }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	var flag=false;
	$(document).ready(function(){
		$('tbody tr:odd').css("background","pink");
		$('tbody tr:even').css("background","yellow");
		
		setInterval(function(){
			if(flag){
				//$('tr:first').css("background","olive");
				$('tbody tr:odd').css("background","yellow");
				$('tbody tr:even').css("background","pink");
				flag=false;
			}else{
				$('tbody tr:odd').css("background","pink");
				$('tbody tr:even').css("background","yellow");
				flag=true;
			}
		},500);
	});
</script>
</html>