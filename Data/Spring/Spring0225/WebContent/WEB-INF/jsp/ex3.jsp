<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

<h2>My First Web Page</h2>
<p>My First Paragraph.</p>


숫자 : <input type="number" name="num1" id="num1">
<select id='choice'>
<option value='pick' selected>-- 선택 --</option>
<option value='plus'>+</option>
<option value='minus'>-</option>
<option value='gob'>*</option>
<option value='nanugi'>/</option>	
</select>



<input type="number" name="num2" id="num2">
<input type="button" id="btn" onclick="sum()">
<!-- onclick="sum" << sum이란 함수 정의시킴-->
<p id="demo"></p>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>




/* 자바스크립트
 * -----------------------
 
 
function sum(){
//자바스크립트 지역변수 let, var 선언 가능. 현재는 let만 사용. 차이는 나중에.
//let n1 = document.getElementById("num1")
//이 코드만 보면 address만 가지고 온 것임. 주소만 가져오고 벨류는 안가지고 옴.
let n1 = document.getElementById("num1").value;
//이래야 벨류까지 찾아온 것.
alert(n1)
let n2 = document.getElementById("num2").value;
//document.getElementById("demo").innerHTML = n1+n2;
 //id찾아라~
  //이러면 문자열만 나와요!! 이걸 정수로 바꿔줘야 해요!!
  
  
 document.getElementById("demo").innerHTML = parseInt(n1,10) + parseInt(n2,10);
 //n1,10 >>>>>>> 10진수이에요

}
*/

/*
 * jQuery로 변경
 */

 $(function(){ 
	 
	 
		$('#btn').click(function(){
			if(choice.value==='plus'){
			sum();
			}
			else if(choice.value	==='minus'){
			minus();
			}
			else if(choice.value==='gob'){
			gob();
			}
			else if(choice.value==='nanugi'){
			nanugi();
			}
		
		});	
 });
 function sum(){
	
	 let num1 = $("#num1").val();
	 let num2 = $("#num2").val();
	 console.log("==============")
	 console.log(num1);
	 console.log(num2);
	 $('#demo').html((parseInt(num1,10) + parseInt(num2,10)));
 }
 function minus(){
		
	 let num1 = $("#num1").val();
	 let num2 = $("#num2").val();
	 console.log("==============")
	 console.log(num1);
	 console.log(num2);
	 $('#demo').html((parseInt(num1,10) - parseInt(num2,10)));
 }
 
 function gob(){
		
	 let num1 = $("#num1").val();
	 let num2 = $("#num2").val();
	 console.log("==============")
	 console.log(num1);
	 console.log(num2);
	 $('#demo').html((parseInt(num1,10) * parseInt(num2,10)));
 }
 
 
 function nanugi(){
		
	 let num1 = $("#num1").val();
	 let num2 = $("#num2").val();
	 console.log("==============")
	 console.log(num1);
	 console.log(num2);
	 $('#demo').html((parseInt(num1,10) / parseInt(num2,10)));
 }
 //id = "num"     => JQuery => $("#num")
 
 
 
 
 
/*
 * jquery필요한거 = 라이브러리가 필요함
 연습문제 1. <select> +,-,*,/ </select> => *다름 => 스터디시간에.
 */




</script>

</body>
</html> 
