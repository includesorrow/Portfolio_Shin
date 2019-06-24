<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Form2.jsp</title>
</head>
<body>
	<div>
	<fieldset>
		<legend>VO객체 사용하기</legend>
		<form action="formTest" method="post">
		<p>
		<!-- 
		* oninvalid = setCustomValidity('커스터마이징 메세지')
		[a-z]:소문자
		[A-Z]:대문자
		[a-zA-Z]{3}:총3문자
		[0-9]:숫자 
		*
		+
		$:끝 문자열
		^: 시작문자열
		[^a-zA-Z] : 영문자는 제외
		* oninput: 값이 들어온 상태를 체크
		-->
		작성자 <input type="text" name="writer"
		required="required" pattern="[^a-zA-Z0-9]+"
		oninvalid="this.setCustomValidity('한글만 입력')"
		oninput="this.setCustomValidity('')">
		</p>
		<p>
		부서번호<input type="number" name="deptno" min="10" step="10"max="50" required="required">
		</p>
		<p>
		Blog<input type="url" name="url" list="data" placeholder="url입력" required="required">
		</p>
			<datalist id="data">
				<option>
					http:\\blog.naver.com/javabook
				</option>
				<option>
					http:\\blog.naver.com/whitheshadow
				</option>
			</datalist>
			<p>
		 		<input type="submit" value="send">
		 	</p>
		</form>
	</fieldset>
	</div>
</body>
</html>