<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>

<html>
<head>	
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>kosta188</title>
</head>
<body>


<table>
	<thead>
		<tr><td><h3>�Խñ� �ۼ�</h3></td></tr>
	</thead>
	<tbody>
		<form action="checkwrite" method="post">
		<tr><td>������<input type="text" name="wtitle" size="100"></td></tr>
		<tr><td>������<select name="wtype">
			<option value="���">���</option>
			<option value="��õ">��õ</option>
			<option value="����">����</option>
		</select></td></tr>
		<tr><td>�۳���<textarea name="write" rows ="10" cols="100"></textarea>
		</td></tr>
	</tbody>
	<tfoot>
	<tr><td><input type="submit" value="�ۼ�"></td>
	</form>
		<td><form action="write" method="get">
		<input type="submit" value="���">
		</form>
		</td>
		
		<td><form action="logout" method="get">
		<input type="submit" value="�α׾ƿ�">
		</form>
		</td>
		</tr>
	</tfoot>
</table>
		
    
    
    <div id="header1" class="hd">
    
    </div>
	</div>
</body>
</html>