<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>dynamicExample2.jsp</title>
</head>
<body>
<form method="post" action="dyex2">
	<fieldset>
			<legend>사원 리스트 예제</legend>
			<div>
				<table style="width: 80%">
					<tr style="background: pink; height: 50px">
						<th>사원번호</th>
						<th>사원이름</th>
						<th>부서번호</th>
						<th>직책</th>
						<th>가입날짜</th>
					</tr>
					
					<tr>
						<th colspan="5">
						사원이름 검색:
						<input type="text" name="saname">
						<br>
						사원직책 검색:
						<input type="text" name="sajob">
						<input type="submit" value="send">
						</th>
					</tr>
				</table>
			</div>
			</fieldset>
</form>			
</body>
</html>