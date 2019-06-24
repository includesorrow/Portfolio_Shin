<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
</head>
<body>
	<fieldset>
		<legend> 이미지 업로드 폼 </legend>
		<ul>
			<div>
				<form action="upload" method="post" enctype="multipart/form-data">
					<li><select name="ilabel" id="ilabel">
							<option value="풍경">풍경</option>
							<option value="동물">동물</option>
							<option value="기타">기타</option>
					</select></li>
					<%-- select로 ilabel 값을 가져옴. --%>
					<li><input type="file" name="mfile" id="mfile"> 
					<input	type="button" value="이름중복체크" id="chk">
					</li>
					<li><input type="submit" value="전송" id="send"></li>
				</form>
			</div>
		</ul>
		<div id="idk" style="display: none;"></div>
		<%-- ajax로 받아온 값을 출력하기 싫어서 display none인 div를 하나 만들어둠. --%>
	</fieldset>
</body>
<script>
	$(function() {
		$("#send").prop("disabled", true);
		// 처음에 전송버튼의 비활성화를 걸어줌.
		$("#chk").click(function() {
			var filepath=$("#mfile").val().split($.trim("\\"));
			var filepath2=filepath[filepath.length-1];
			// 업로드한 파일의 이미지에서 path를 떼고 실제 이미지 파일의 이름만 filepath2에 저장.
			$("#idk").load("imagechk?ifile="+filepath2, function(response) {
				//ajax를 통해 ifile형태로 이미지 파일의 이름을 보냄.
				console.log(response);
				if (response === "0" && $.trim(filepath2)!="") {
					// 들어온 값이 0이면 중복이 되지 않았고, 업로드한 파일의 이름이 비어있지 않을 경우에만
					// 가능합니다라는 알림과 함께 전송버튼의 비활성화를 풀어줌.
					$("#send").prop("disabled", false);
					alert("가능합니다.");
				} else {
					// 중복이 될 경우나 업로드한 파일이 없을 경우는 중복입니다와 함께 버튼을 비활성화 시킴.
					$("#send").prop("disabled", true);
					alert("중복입니다.");
				}
			})
		});
	});
</script>
</html>