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
		<legend>�̹��� ���ε� ��</legend>
		<ul>
			<div>
			
	<form action="upload" method="post" enctype="multipart/form-data">
				<li><select name="ilabel" id="ilabel">
				<option value="ǳ��">ǳ��</option>
				<option value="����">����</option>
				<option value="��Ÿ">��Ÿ</option>
			
			</select></li>
				<li><input type="file" name="mfile" id="mfile">
				<input type="button" value="�̸��ߺ�üũ" id="chk"></li>
				<li><input type="submit" value="����" id="send"></li>
			
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
				alert("�����մϴ�.");
				
			}else{
				$("#send").prop("disabled",true);
				alert("�ߺ��Դϴ�.");
				
			}
		});
	});
});

</script>
</html>