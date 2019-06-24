<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
		<fieldset>
		<legend>이미지 업로드 폼</legend>
		<ul>
			<div>
			
	<form action="upload" method="post" enctype="multipart/form-data">
				<li><select name="ilabel" id="ilabel">
				<option value="풍경">풍경</option>
				<option value="동물">동물</option>
				<option value="기타">기타</option>
			
			</select></li>
				<li><input type="file" name="mfile" id="mfile">
				<input type="button" value="이름중복체크" id="chk"></li>
				<li><input type="submit" value="전송" id="send"></li>
			
			</form>
			
			</div>
		</ul>
		
		<div id="idk" style="display:none;"></div>
		</fieldset>
	

</body>
<script>
$(function(){
	$("#send").prop("disabled",true);
	$("#chk").click(function(){
		$("#idk").load("imagechk?ifile="+$("#mfile").val(),function(response){
			console.log($("#mfile").val());	
			if(response==="0"){
				$("#send").prop("disabled",false);
				alert("가능합니다.");
				
			}else{
				$("#send").prop("disabled",true);
				alert("중복입니다.");
				
			}
		});
	});
});

</script>
</html>