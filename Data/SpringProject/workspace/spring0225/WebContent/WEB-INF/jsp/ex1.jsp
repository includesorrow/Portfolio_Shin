<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

<h2>My First JavaScript</h2>
<!-- document.getElementById('demo1') : id가 demo1인 Dom 객체를 찾아라 (아이디 선택자)
	innerHTML 참조된 HTML에 값을(tag) 지정 => setter -->
<button type="button"
onclick="myfnc(1)">
Click me to display Date and Time1.</button>
<button type="button"
onclick="myfnc(2)">
Click me to display Date and Time2.</button>

<p id="demo1" style="background:red">test1</p>
<p id="demo2" style="background:blue">test2</p>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
// 자바스크립트 함수를 적용해보기 : 매서드
function myfnc(idx){
	alert(idx);
    document.getElementById('demo'+idx).innerHTML=Date()}
//$(function(){

//});
</script>
</body>
</html> 
