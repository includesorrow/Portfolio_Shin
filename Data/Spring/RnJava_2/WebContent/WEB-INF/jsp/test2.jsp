<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <!-- required css style file for C3.js -->
    <link href="c3.min.css" rel="stylesheet" type="text/css">
</head>
<body>

<!-- container element in which we will create the chart -->
<div id="chart1"></div>

<!-- required javascript libraries-->
<script src="d3.v3.min.js" charset="utf-8"></script>
<script src="c3.min.js"></script>

<!-- javascript block to render and update the chart-->
<script>

    var gaugeData = {'data': 80.0}
  
    // create a chart and set options
    // note that we bind the chart to the element with id equal to chart1 via the c3.js API
    var chart = c3.generate({
        bindto: '#chart1',
        data: {
            json: gaugeData,
            type: 'gauge',
        },
        gauge: {
            label:{
                //returning the value here and not the ratio
                format: function(value, ratio){ return value;}
            },
            min: 0,
            max: 100,
            width: 15,
            units: 'value' //this is only the text for the label
        }
    });
    
    // this function will update every 2000 milliseconds
    // and create a new value between 0 and 100
    setInterval(function () {
        
        // create a random value between 0 and 100, rounded to 2 digits
        var newValue = Math.floor(100 * Math.random());
        
        // create a data array holding the random value
        var newData = {'data', newValue };
        
        // tell the chart to load the new data
        chart.load({
          json: newData
        });
    }, 2000);
        
        
</script>
</body>
</html>