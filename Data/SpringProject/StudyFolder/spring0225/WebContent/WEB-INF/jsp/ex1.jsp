<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

<h2>My First JavaScript</h2>
<!-- document.getElementById('demo1') : id�� demo1�� Dom ��ü�� ã�ƶ� (���̵� ������)
	innerHTML ������ HTML�� ����(tag) ���� => setter -->
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
// �ڹٽ�ũ��Ʈ �Լ��� �����غ��� : �ż���
function myfnc(idx){
	alert(idx);
    document.getElementById('demo'+idx).innerHTML=Date()}
//$(function(){

//});
</script>
</body>
</html> 
