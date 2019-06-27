<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>selectcar.jsp</title>
<style>
	#wrap{ width: 300px; margin: auto;}
	#wrap img { width: 200px;}
</style>
</head>
<body>
	<div id="wrap">
		<p>
		<select name="car1" id="car1" onchange="myCar()">
		    <option>=����=</option>
			<option value="1">������ī</option>
			<option value="2">����</option>
		</select>
		<select name="car2" id="car2" onchange="myCarImg()">
			<option>=����=</option>
		</select>
		</p>
		<p>
			<img id="target" src="resources/img/default.jpg">
		</p>
	</div>
<script>

// 	function myCar(){
// 		console.log(document.getElementById("car1").value)
// 	}


	var xhr; // �������� XMLHttpRequest��ü�� ������ ��������
	function defaultAjax(){
		if (window.ActiveXObject) {
			xhr = new ActiveXObject("Microsoft.XMLHTTP");
		} else {
			xhr = new XMLHttpRequest();
		}
	}

	function myCar() {
		defaultAjax();
		var param = document.getElementById("car1").value;
		//�����κ��� ����� ������ �� �����ϴ� �Լ� ���� (�ݹ��Լ�)
		xhr.onreadystatechange = res1;
		//�������� ȣ���ϱ� ���� �غ�
		//���۹��, �ּ�, �񵿱��(true), �����(false)
		xhr.open("GET", "ajax/ajaxData2?car=" + param, true);
		//�������� ��û������
		xhr.send(null);
		//�츰 get������� ������� �߱� ������ ���ڴ� �ݵ�� null�̾�� �ϰ�, ����
		//post��� null�� �ƴ϶�, �������� �ϴ� �Ķ���͸� ���ڿ��� �־�� �Ѵ�.
		//xhr.send(s);
	}
	function myCarImg() {
		defaultAjax();
		var param = document.getElementById("car2").value;
		//�����κ��� ����� ������ �� �����ϴ� �Լ� ���� (�ݹ��Լ�)
		xhr.onreadystatechange = res2;
		//�������� ȣ���ϱ� ���� �غ�
		//���۹��, �ּ�, �񵿱��(true), �����(false)
		xhr.open("GET", "ajax/ajaxData3?carName=" + param, true);
		//�������� ��û������
		xhr.send(null);
		//�츰 get������� ������� �߱� ������ ���ڴ� �ݵ�� null�̾�� �ϰ�, ����
		//post��� null�� �ƴ϶�, �������� �ϴ� �Ķ���͸� ���ڿ��� �־�� �Ѵ�.
		//xhr.send(s);
	}
	//�����κ��� ���޵Ǵ� ����� �����ϴ� �޼���
	function res1() {
		if (xhr.readyState == 4) {
			if (xhr.status == 200) {
				let txt = document.getElementById("car2");
				txt.innerHTML = xhr.responseText;
			} else {
				alert("����" + xhr.status);
			}
		}
	}
	function res2() {
		console.log("ReadyState:"+xhr.readyState)
		if (xhr.readyState == 4) {//�����κ��� ������ ó���� �Ϸ�� ���
			if (xhr.status == 200) {//�������� ó���� ���
				let txt = document.getElementById("target");
				//1->car1.jpg 2->zeep.jpg
				txt.src="resources/img/"+xhr.responseText+".jpg";
				//alert(xhr.responseText);
			} else {
				alert("����" + xhr.status);
			}
		}
	}

</script>	
</body>
</html>