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
	$(function() {
		var pro_json1 = [];
		var pro_json2 = [];
		$.getJSON('members/valjson2', function(data) {
			console.log(data);
			$.each(data, function(index, item) {
				console.log(item + ":" + index.name + ":" + index.list);
				$.each(index.list, function(ite, idx) {
					if (index.name === "kim") {
						pro_json1.push(idx);
					} else {
						pro_json2.push(idx);
					}
				});
			});
			console.log("--------------------")
			console.log(pro_json1)
			console.log(pro_json2)

			$('#container').highcharts({
				chart : {
					// column, var, line
					type : 'var'
				},
				title : {
					text : "과일 소비량"
				},
				xAxis : {
					categories : [ 10, 20, 30 ]
				},
				yAxis : {
					title : {
						text : "과일 소비"
					}
				},
				series : [ {
					name : 'kim',
					data : pro_json1
				} ]
			});
		});
	});
</script>
</head>
<body>
	<div id="container" style="width: 100%; height: 400px;"></div>
</body>
</html>