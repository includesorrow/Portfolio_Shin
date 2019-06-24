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
		<tr><td><h3>게시글 작성</h3></td></tr>
	</thead>
	<tbody>
		<form action="checkwrite" method="post">
		<tr><td>글제목<input type="text" name="wtitle" size="100"></td></tr>
		<tr><td>글종류<select name="wtype">
			<option value="잡담">잡담</option>
			<option value="추천">추천</option>
			<option value="개념">개념</option>
		</select></td></tr>
		<tr><td>글내용<textarea name="write" rows ="10" cols="100"></textarea>
		</td></tr>
	</tbody>
	<tfoot>
	<tr><td><input type="submit" value="작성"></td>
	</form>
		<td><form action="write" method="get">
		<input type="submit" value="목록">
		</form>
		</td>
		
		<td><form action="logout" method="get">
		<input type="submit" value="로그아웃">
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