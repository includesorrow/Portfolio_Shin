<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex5.jsp</title>
<!-- �������� DOM��ü�� ������ ���ҽ� ��� �о� �ö����� 
	�ڹٽ�ũ��Ʈ ��ü�� ��� ��Ű�� �Լ��� ����ؼ� �ذ� 
	�̺�Ʈ :onload
-->

</head>
<body>
	<p id="res"></p>
<script>
  function test(){
 	// let n = 10;
 	 //var n1;
 	 if(true){
 		 let n1 = 20;
 	 }
 	 //var�� ���� �ȶ߰� let�� ���� ��.
 	 //����� �ҷ��� function test() �ٷ� �ؿ� let�� �߰����Ѽ� �ؾ� ��/
 	 //var�� ������ var n1;�� ���� ����. ȣ�̽����� �ؾ� ��.
 	 console.log(n1);
  }
  test();

</script>

<script>
	window.onload=function(){
		let car = {
				type : "Fiat",
				model : "500",
				color : "white",
				printCar : function() {
					let printCarMsg = "Type : " + car.type;
					printCarMsg +="model :"+car.model;
					printCarMsg +="color:"+car.color;
					console.log("printCarMsg:"+printCarMsg);
					// ��������: <p id="res"></p> ���� ����غ��ô�.
					document.getElementById("res").innerHTML=printCarMsg;
				}
			};
			console.log("Type : " + car.type);
			car.printCar();
	};
</script>	
</body>
</html>