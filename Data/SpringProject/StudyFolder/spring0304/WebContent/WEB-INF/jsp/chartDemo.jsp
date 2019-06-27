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
		//Ajax�� ����ؼ� json�����͸� �񵿱������ �޾ƿ���
		//var jsonData = [{"key":"Math0","value":"101"},{"key":"Math1","value":"102"},{"key":"Math2","value":"103"},{"key":"Math3","value":"104"},......]
		var processed_json = [];
		$.getJSON('members/data.json', function(data) {
			// Populate series ������ Ÿ������ �����͸� �����ϱ� ���� processed_json �迭�� ���� �� ��
			// Ajax�� ���۵Ǿ�� �����͸� �о� ���鼭 processed_json�� ���� �����Ѵ�.
			for(i=0;i<data.length;i++){
				processed_json.push([data[i].key, data[i].value]);
			}
			// draw chart
			console.log(processed_json);
			// ��Ʈ view ��Ҹ� ������
			$('#container').highcharts({
				chart : {
					type : "column"
				},
				title : {
					text : "student data"
				},
				subtitle:{
					text:"����� ����Ÿ��Ʋ"
				},
				xAxis:{
					type:'category',
					allowDecimals:false, // �����θ� ǥ��
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
		});	// getJson ��
	});	
	/*
	title : ����
	subtitle : ������
	xAxis : X��
	*/
</script>
</head>
<body>
	<div style="width: 800px; margin: auto; border: 1px solid red">
		��Ʈ ����</div>
	<div id="container" style="height: 400px"></div>
</body>
</html>