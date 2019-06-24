<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jQueryDemo3</title>
<style>
	#target{width: 200px; height: 200px}
	.cs1{ background: orange; border: 1px dotted;}
</style>
</head>
<body>
<%-- 1. jQuery�� Dom �߽� ����̴�.
	 - �ڹ� ��ũ��Ʈ ���̺귯�� �� �ϳ�
	 2. jQuery ������ ������ �ڵ�, ������ �÷����� Ȱ�� --%>
	    <input type="color" id="col">
   <input type="button" id="select" value="select">
   
	 <div id="wrap">
	 	<p id="target">jQuery ���� : Style ���ϰ� �����ϱ�</p>
	 	<p>
	 	<input type="button" id="btn1" value="AddStyle">
	 	<input type="button" id="btn2" value="removeStyle">
	 	
	 	</p>
	 
	 </div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>
	$(function(){
		$("#select").click(function() {
            $("#target").css({"background": $("#col").val()});
         });
		
		$('#btn1').click(function(){
			//�̹� ����� css �� Ŭ������ �߰��Ѵ�.
			$('#target').addClass("cs1");
		});
		$('#btn2').click(function(){	
			//�̹� ����� css�� Ŭ������ �߰��Ѵ�.
			$('#target').removeClass("cs1");
		});
		
		
	});


</script>


</body>
</html>