<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex3.jsp</title>
</head>
<body>
	���� :
	<input type="number" name="num1" id="num1">
	<select id="calculator" name="calculator">
		<option value="sum">+</option>
		<option value="minus">-</option>
		<option value="multiply">*</option>
		<option value="division">/</option>
	</select>
	<input type="number" name="num2" id="num2">
	<input type="button" value="=" id="btn">

	<p id="demo"></p>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
//jQuery�� ����!
$(function(){
	$('#btn').click(function(){
		if(calculator.value==='sum'){sum();}
		else if(calculator.value==='minus'){minus();}
		else if(calculator.value==='multiply'){multiply();}
		else if(calculator.value==='division'){division();}
	});
});
function sum(){
	let num1 = $('#num1').val();
	let num2 = $('#num2').val();
	$('#demo').html((parseInt(num1,10)+parseInt(num2,10)));
}
function minus(){
	let num1 = $('#num1').val();
	let num2 = $('#num2').val();
	$('#demo').html((parseInt(num1,10)-parseInt(num2,10)));
}
function multiply(){
	let num1 = $('#num1').val();
	let num2 = $('#num2').val();
	$('#demo').html((parseInt(num1,10)*parseInt(num2,10)));
}
function division(){
	let num1 = $('#num1').val();
	let num2 = $('#num2').val();
	$('#demo').html((parseInt(num1,10)/parseInt(num2,10)));
}
// js �������� let, var ���𰡴� let ���
//let n1 = document.getElementById("num1").value;
//let n2 = document.getElementById("num2").value;
//���ڿ� ���ڸ� ������ ���� parseInt(n1, 10)
//document.getElementById("demo").innerHTML = parseInt(num1,10) + parseInt(num2,10);

//��������1. <select> +,-,x,/ </select> => * �ٸ� => ���͵� �ð���!

</script>
</html>
