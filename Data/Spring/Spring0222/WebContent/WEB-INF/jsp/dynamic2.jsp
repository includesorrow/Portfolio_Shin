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
			<legend>��� ����Ʈ ����</legend>
			<div>
				<table style="width: 80%">
					<tr style="background: pink; height: 50px">
						<th>�����ȣ</th>
						<th>����̸�</th>
						<th>�μ���ȣ</th>
						<th>��å</th>
						<th>���Գ�¥</th>
					</tr>
					
					<tr>
						<th colspan="5">
						����̸� �˻�:
						<input type="text" name="saname">
						<br>
						�����å �˻�:
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