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
		    <option>=선택=</option>
			<option value="1">스포츠카</option>
			<option value="2">지프</option>
		</select>
		<select name="car2" id="car2" onchange="myCarImg()">
			<option>=선택=</option>
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


	var xhr; // 브라우저별 XMLHttpRequest객체를 저장할 전역변수
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
		//서버로부터 결과가 도착할 때 수행하는 함수 지정 (콜백함수)
		xhr.onreadystatechange = res1;
		//서버에게 호출하기 위한 준비
		//전송방식, 주소, 비동기식(true), 동기식(false)
		xhr.open("GET", "ajax/ajaxData2?car=" + param, true);
		//서버에게 요청보내기
		xhr.send(null);
		//우린 get방식으로 보내기로 했기 때문에 인자는 반드시 null이어야 하고, 만약
		//post라면 null이 아니라, 보내고자 하는 파라미터를 문자열로 넣어야 한다.
		//xhr.send(s);
	}
	function myCarImg() {
		defaultAjax();
		var param = document.getElementById("car2").value;
		//서버로부터 결과가 도착할 때 수행하는 함수 지정 (콜백함수)
		xhr.onreadystatechange = res2;
		//서버에게 호출하기 위한 준비
		//전송방식, 주소, 비동기식(true), 동기식(false)
		xhr.open("GET", "ajax/ajaxData3?carName=" + param, true);
		//서버에게 요청보내기
		xhr.send(null);
		//우린 get방식으로 보내기로 했기 때문에 인자는 반드시 null이어야 하고, 만약
		//post라면 null이 아니라, 보내고자 하는 파라미터를 문자열로 넣어야 한다.
		//xhr.send(s);
	}
	//서버로부터 전달되는 결과가 도착하는 메서드
	function res1() {
		if (xhr.readyState == 4) {
			if (xhr.status == 200) {
				let txt = document.getElementById("car2");
				txt.innerHTML = xhr.responseText;
			} else {
				alert("실패" + xhr.status);
			}
		}
	}
	function res2() {
		console.log("ReadyState:"+xhr.readyState)
		if (xhr.readyState == 4) {//서버로부터 데이터 처리가 완료된 경우
			if (xhr.status == 200) {//정상적인 처리인 경우
				let txt = document.getElementById("target");
				//1->car1.jpg 2->zeep.jpg
				txt.src="resources/img/"+xhr.responseText+".jpg";
				//alert(xhr.responseText);
			} else {
				alert("실패" + xhr.status);
			}
		}
	}

</script>	
</body>
</html>