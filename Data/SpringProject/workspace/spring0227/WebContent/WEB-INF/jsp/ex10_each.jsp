<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex10.jsp</title>
<style>
.h {
	background: orange;
}

.t {
	background: pink;
}
</style>
</head>
<body>
	<div id="res"></div>
	<h1>Hello World!</h1>
	<p>test1</p>
	<p>test2</p>
	<p>test3</p>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	/* each()�� jQuery�� ����ؼ� �迭�� �����Ϸ��� �� �� ����ϴ� �޼����̴�.
	1. $.each(�迭��ü, function(index,item){});
	*/
	var array = [ 
		{name : '��浿',	addr : '���� ����'},
		{name : '��¾�',	addr : '���� ����'}, 
		{name : '������',	addr : '���� ����'}
		];
	$(function() {
		console.log(array[0].name);
		var addMember = {
			name : "������",
			addr : "���� ����"
		};
		array.push(addMember);
		$.each(array, function(idx, item) {
/* 			var print == '';
			print +="<h1> ["+item.addr+"]"+" "+item.name+"</h1>";
			document.getElementById("res").innerHTML += print; */
			$('#res').append("<h1> [" + item.addr + "]" + " " + item.name + "</h1>");
			$('#res h1').addClass("h");
		});
		
		//2. $(selector).each(function(index, item){});
		$('p').each(function(index,item){
			$(item).addClass('t');
			$(this).append(":"+array[index].name);
		});
	});
</script>
</html>