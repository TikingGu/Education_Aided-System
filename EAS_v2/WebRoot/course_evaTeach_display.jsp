<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="../../favicon.ico">

    <title>课程信息</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <link rel="stylesheet" href="css/lizhiliang.css" media="screen" type="text/css" />

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- chart.js for charts-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.js"></script>

    <script type="text/javascript">
        function chartid(){

        }
    </script>
</head>
<body>
    <div class="container">
            <div class="row">
                <s:iterator >
                    <div class="col-xs-12 col-md-6">
                        <div style="width: 100%;height: 120px;"></div>
                        <div style="width:300px;height: 300px; text-align:center" >
                            <p style="color:green; font-size:18px ;text-align:center;">grades:</p>
                            <script type="text/javascript">
                                var chartid=1   //<s:property value="1"/> ;     //此处以教师ID作为chartID的值,因一个界面内每个图表canvasID需不同 可以写进function内
                                document.write('<canvas id="'+chartid+'" width="45px" height="45px"></canvas>');
                            </script>
                            <script>                      //画表 可以写进function
                                var name1="教师课堂气氛",name2="教师课程规划",name3="教师课程批改",name4="教师课程态度",value1=2,value2=2,value3=3,value4=4;
                                var ctx = document.getElementById(chartid).getContext('2d');
                                var myChart = new Chart(ctx, {
                                    type: 'doughnut',
                                    data: {
                                        labels: [name1, name2, name3, name4],
                                        datasets: [{
                                            data: [value1 , value2 , value3 , value4],
                                            backgroundColor: [
                                                'green',
                                                'rgb(2555, 255, 0)',      //黄
                                                'rgb(255, 0, 0)',         //红
                                                'rgb(192, 192, 192)'      //灰
                                            ],
                                            borderWidth: 1
                                        }]
                                    },
                                    options:{
                                        cutoutPercentage:-1
                                        }
                                });
                        </script>
                        <p style="font-size:18px ;text-align:center;">课程名:</p>
                        <p style="font-size:18px ;text-align:center;">开课时间:</p>
                    </div> 
                </div>
            </s:iterator>
        </div>
    </div>
</body>
</html>