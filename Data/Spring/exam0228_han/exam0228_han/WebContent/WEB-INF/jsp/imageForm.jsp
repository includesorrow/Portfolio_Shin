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
		<legend> �̹��� ���ε� �� </legend>
		<ul>
			<div>
				<form action="upload" method="post" enctype="multipart/form-data">
					<li><select name="ilabel" id="ilabel">
							<option value="ǳ��">ǳ��</option>
							<option value="����">����</option>
							<option value="��Ÿ">��Ÿ</option>
					</select></li>
					<%-- select�� ilabel ���� ������. --%>
					<li><input type="file" name="mfile" id="mfile"> 
					<input	type="button" value="�̸��ߺ�üũ" id="chk">
					</li>
					<li><input type="submit" value="����" id="send"></li>
				</form>
			</div>
		</ul>
		<div id="idk" style="display: none;"></div>
		<%-- ajax�� �޾ƿ� ���� ����ϱ� �Ⱦ display none�� div�� �ϳ� ������. --%>
	</fieldset>
</body>
<script>
	$(function() {
		$("#send").prop("disabled", true);
		// ó���� ���۹�ư�� ��Ȱ��ȭ�� �ɾ���.
		$("#chk").click(function() {
			var filepath=$("#mfile").val().split($.trim("\\"));
			var filepath2=filepath[filepath.length-1];
			// ���ε��� ������ �̹������� path�� ���� ���� �̹��� ������ �̸��� filepath2�� ����.
			$("#idk").load("imagechk?ifile="+filepath2, function(response) {
				//ajax�� ���� ifile���·� �̹��� ������ �̸��� ����.
				console.log(response);
				if (response === "0" && $.trim(filepath2)!="") {
					// ���� ���� 0�̸� �ߺ��� ���� �ʾҰ�, ���ε��� ������ �̸��� ������� ���� ��쿡��
					// �����մϴٶ�� �˸��� �Բ� ���۹�ư�� ��Ȱ��ȭ�� Ǯ����.
					$("#send").prop("disabled", false);
					alert("�����մϴ�.");
				} else {
					// �ߺ��� �� ��쳪 ���ε��� ������ ���� ���� �ߺ��Դϴٿ� �Բ� ��ư�� ��Ȱ��ȭ ��Ŵ.
					$("#send").prop("disabled", true);
					alert("�ߺ��Դϴ�.");
				}
			})
		});
	});
</script>
</html>