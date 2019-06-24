<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex8_ajax.jsp</title>
<script>
var xhr; // 브라우저별 XMLHttpRequest 객체를 저장할 전역변수
function test() {
	var param = document.getElementById("subject").value;
	
	if(window.ActiveXObject){
		xhr = new ActiveXObject("Microsoft.XMLHTTP");
		
	}
	else{
		xhr = new XMLHttpRequest(); 
	}
	//서버로부터 결과가 도착할 때 수행하는 함수 지정 (콜백함수)
	xhr.onreadystatechange = res;
	//서버에게 호출하기 위한 준비
	//전송방식, 주소, 비동기식(true), 동기식(false)
	xhr.open("GET","ajax/ajaxData1?subject="+param,true);
	//서버에게 요청 보내기
	xhr.send(null);//우린 get방식으로 보내기로 했기 때문에 인자는 반드시 null
	//POST라면 NULL이 아니라 보내고자 하는 파라미터를 문자열로 넣어야 한다.
	//xhr.send(s);
	
}


//서버로부터 전달되는 결과가 도착하는 메서드
function res() {
	console.log("ReadyState :" + xhr.readyState )
	if(xhr.readyState == 4) { // 서버로부터 데이터 처리가 완료된 경우
		if(xhr.status == 200){ //정상적인 처리인 경우
			let txt = document.getElementById("txt");
			txt.innerHTML = xhr.responseText;
			alert(xhr.responseText);
		} else {
			alert ("실패" + xhr.status);
		}
	}
}



</script>
<script type="text/javascript"></script>
</head>




<body>
	<div style="width:300px; height:300px; margin:auto;">
		과목 : <input type="text" name="subject" id="subject"/>
		<input type="button" value="Ajax 테스트" onclick="test()" />
		<p>관련 시험 :
		<div id="txt"></div>
	
	</div>
</body>
</html>