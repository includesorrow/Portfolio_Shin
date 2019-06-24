<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>traffic.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script>
	$(document).ready(function() {
		$.getJSON('members/traffic1',function(data){
			console.log(data[0]);
// 			$.each(data,function(index,item){
// 				console.log(index+","+item.name+","+item.list);
// 				$.each(item.list,function(idx,itm){
// 					if(item.name=="jane"){json1.push(itm);}
// 					else{json2.push(itm);}
// 				});
// 			});
			$('#container').highcharts({
				chart:{
					type:'pie'
					//column,bar,line
				},
				title:{
					text:'traffic'
				},
				xAxis:{					
					title:{
						text:'date'
					}
				},
				yAxis:{
					title:{
						text:"traffic"
					}
				},
				 series: [{
	                  name: 'Brands',
	                  colorByPoint: true,
	                  data: [{
	                      name: 'Chrome',
	                      y: data[0].list[0],
	                      sliced: true,
	                      selected: true
	                  }, {
	                      name: 'Internet Explorer',
	                      y: data[0].list[1]
	                  }, {
	                      name: 'Firefox',
	                      y: data[0].list[2]
	                  }, {
	                      name: 'Safari',
	                      y: data[0].list[3]
	                  },  {
	                      name: 'Opera',
	                      y: data[0].list[4]
	                  }, {
	                      name: 'Other',
	                      y: data[0].list[5]
	                  }]
	              }]
			});
		});		
	});
</script>
</head>
<body>
<div id="container" style="width: 100%; height: 400px;">aaaaaaa</div>
</body>
</html>