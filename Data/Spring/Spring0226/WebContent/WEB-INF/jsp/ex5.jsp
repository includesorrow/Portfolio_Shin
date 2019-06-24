<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex5.jsp</title>
<!-- 브라우저가 DOM객체를 포함한 리소스 모두 읽어 올때까지 
	자바스크립트 객체를 대기 시키는 함수를 사용해서 해결 
	이벤트 :onload
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
 	 //var는 에러 안뜨고 let은 에러 뜸.
 	 //사용을 할려면 function test() 바로 밑에 let을 추가시켜서 해야 함/
 	 //var를 쓸려면 var n1;을 먼저 지정. 호이스팅을 해야 함.
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
					// 연습문제: <p id="res"></p> 값을 출력해봅시다.
					document.getElementById("res").innerHTML=printCarMsg;
				}
			};
			console.log("Type : " + car.type);
			car.printCar();
	};
</script>	
</body>
</html>