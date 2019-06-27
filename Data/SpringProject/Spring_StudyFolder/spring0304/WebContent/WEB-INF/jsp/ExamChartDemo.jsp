<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>연습문제</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script>
	$(function(){
		$('#container').highcharts({
			chart:{
				// column, var, line
				type:'bar'
			},
			title:{
				text:"과일 소비량"
			},
			xAxis:{
				categories:['Apples','Bananas','Oranges']
			},
			yAxis:{
				title:{
					text:"과일 소비"
				}
			},
			series:[{
				name:'Jane',
				data:[1,0,7]
			},
			{
				name:'kim',
				data:[5,7,2]
			}]
		});
	});
</script>
</head>
<body>
	<div id="container" style="width: 100%; height: 400px;"></div>
</body>
</html>