<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex8_ajax.jsp</title>
<script>
var xhr; // �������� XMLHttpRequest ��ü�� ������ ��������
function test() {
	var param = document.getElementById("subject").value;
	
	if(window.ActiveXObject){
		xhr = new ActiveXObject("Microsoft.XMLHTTP");
		
	}
	else{
		xhr = new XMLHttpRequest(); 
	}
	//�����κ��� ����� ������ �� �����ϴ� �Լ� ���� (�ݹ��Լ�)
	xhr.onreadystatechange = res;
	//�������� ȣ���ϱ� ���� �غ�
	//���۹��, �ּ�, �񵿱��(true), �����(false)
	xhr.open("GET","ajax/ajaxData1?subject="+param,true);
	//�������� ��û ������
	xhr.send(null);//�츰 get������� ������� �߱� ������ ���ڴ� �ݵ�� null
	//POST��� NULL�� �ƴ϶� �������� �ϴ� �Ķ���͸� ���ڿ��� �־�� �Ѵ�.
	//xhr.send(s);
	
}


//�����κ��� ���޵Ǵ� ����� �����ϴ� �޼���
function res() {
	console.log("ReadyState :" + xhr.readyState )
	if(xhr.readyState == 4) { // �����κ��� ������ ó���� �Ϸ�� ���
		if(xhr.status == 200){ //�������� ó���� ���
			let txt = document.getElementById("txt");
			txt.innerHTML = xhr.responseText;
			alert(xhr.responseText);
		} else {
			alert ("����" + xhr.status);
		}
	}
}



</script>
<script type="text/javascript"></script>
</head>




<body>
	<div style="width:300px; height:300px; margin:auto;">
		���� : <input type="text" name="subject" id="subject"/>
		<input type="button" value="Ajax �׽�Ʈ" onclick="test()" />
		<p>���� ���� :
		<div id="txt"></div>
	
	</div>
</body>
</html>