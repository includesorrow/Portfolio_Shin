<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>

<h2>My First Web Page</h2>
<p>My First Paragraph.</p>


���� : <input type="number" name="num1" id="num1">
<select id='choice'>
<option value='pick' selected>-- ���� --</option>
<option value='plus'>+</option>
<option value='minus'>-</option>
<option value='gob'>*</option>
<option value='nanugi'>/</option>	
</select>



<input type="number" name="num2" id="num2">
<input type="button" id="btn" onclick="sum()">
<!-- onclick="sum" << sum�̶� �Լ� ���ǽ�Ŵ-->
<p id="demo"></p>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>




/* �ڹٽ�ũ��Ʈ
 * -----------------------
 
 
function sum(){
//�ڹٽ�ũ��Ʈ �������� let, var ���� ����. ����� let�� ���. ���̴� ���߿�.
//let n1 = document.getElementById("num1")
//�� �ڵ常 ���� address�� ������ �� ����. �ּҸ� �������� ������ �Ȱ����� ��.
let n1 = document.getElementById("num1").value;
//�̷��� �������� ã�ƿ� ��.
alert(n1)
let n2 = document.getElementById("num2").value;
//document.getElementById("demo").innerHTML = n1+n2;
 //idã�ƶ�~
  //�̷��� ���ڿ��� ���Ϳ�!! �̰� ������ �ٲ���� �ؿ�!!
  
  
 document.getElementById("demo").innerHTML = parseInt(n1,10) + parseInt(n2,10);
 //n1,10 >>>>>>> 10�����̿���

}
*/

/*
 * jQuery�� ����
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
 * jquery�ʿ��Ѱ� = ���̺귯���� �ʿ���
 �������� 1. <select> +,-,*,/ </select> => *�ٸ� => ���͵�ð���.
 */




</script>

</body>
</html> 
