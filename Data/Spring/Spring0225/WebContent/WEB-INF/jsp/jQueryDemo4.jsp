<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jQueryDemo4</title>
</head>
<body>

<h2>This is a heading</h2>

<p>This is a paragraph.</p>
<p>This is another paragraph.</p>
<p>This is 3</p>
<p>This is 4</p>

<button>Click me</button>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	console.log('$(p):' +($('p').length));
  $("button").click(function(){
    $("p:first").css("background","red"); //ù��°
    $("p:eq(1)").css("background","blue");//eq(idx)���
    $("p:last").css({"background":"green"});//���������
  });
});
</script>
</body>
</html>
