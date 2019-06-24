<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>chartDemo.jsp</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script>
	$(function() {
		//Ajax를 사용해서 json데이터를 비동기식으로 받아오기
		//var jsonData = [{"key":"Math0","value":"101"},{"key":"Math1","value":"102"},{"key":"Math2","value":"103"},{"key":"Math3","value":"104"},......]
		var processed_json = [];
		$.getJSON('members/data.json', function(data) {
			// Populate series 데이터 타입으로 데이터를 저장하기 위한 processed_json 배열을 생성 한 후
			// Ajax로 전송되어온 데이터를 읽어 오면서 processed_json에 값을 저장한다.
			for(i=0;i<data.length;i++){
				processed_json.push([data[i].key, data[i].value]);
			}
			// draw chart
			console.log(processed_json);
			// 차트 view 요소를 선택자
			$('#container').highcharts({
				chart : {
					type : "column"
				},
				title : {
					text : "student data"
				},
				subtitle:{
					text:"여기는 서브타이틀"
				},
				xAxis:{
					type:'category',
					allowDecimals:false, // 정수로만 표기
					title:{
						text:"x"
					}
				},
				yAxis:{
					title:{
						text:"Scores"
					}
				},
				series: [{
					name: 'Subjects',
					data: processed_json
				}]
			});	
		});	// getJson 끝
	});	
	/*
	title : 제목
	subtitle : 소제목
	xAxis : X축
	*/
</script>
</head>
<body>
	<div style="width: 800px; margin: auto; border: 1px solid red">
		차트 데모</div>
	<div id="container" style="height: 400px"></div>
</body>
</html>