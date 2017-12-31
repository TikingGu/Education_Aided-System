<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css"/>        
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-admin-theme.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-admin-theme.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.js"></script>
<title>无标题文档</title>
</head>
<body>
<div class="container">
	<div class="col-md-6 bootstrap-admin-col-left">
            <ul class="nav navbar-collapse collapse bootstrap-admin-navbar-side">
                <li class="active">
                    <a href="back_to_XXXPage.action"><i class="glyphicon glyphicon-chevron-left"></i> 返回</a>
                </li>
            </ul>
    </div>
	<div class="row">
		<div class="col-lg-12">
        	<div class="panel panel-default bootstrap-admin-no-table-panel">
            	<div class="panel-heading">
                	<div class="text-muted bootstrap-admin-box-title"><center>课堂测验反馈</center></div>
                </div>
            </div>
        </div>
	</div>
	<div class="row">
		<div class="col-lg-6">
			<canvas id="myChart1" width="30" height="30"></canvas>
			<script>
				var fail=8,pass=18,medium=30,good=20,excellent=10;
				var ctx = document.getElementById("myChart1").getContext('2d');
				var myChart = new Chart(ctx, {
    				type: 'bar',
   					data: {
       			 		labels: ["不及格", "及格", "中等", "良好", "优秀"],
        				datasets: [{
        					label:'学生人数',
            				data: [fail , pass , medium , good , excellent],
            				backgroundColor: [
                			'rgba(0, 255, 0,1)',
                			'rgba(255, 0, 0,1)',
                			'rgba(0, 0, 255,1)',
                			'rgba(2555, 255, 0,1)',
                			'rgba(153, 102, 255,1)',
                			'rgba(192, 192, 192,1)'
            				],
            				borderWidth: 1
        				}]
    				},
    				options:{
    					cutoutPercentage:50
    				}
				});
			</script>
		</div>
		<div class="col-lg-6">
			<canvas id="myChart2" width="30" height="30"></canvas>
			<script>
				var first=80,secend=70,third=60,fourth=55,fifth=50,sixth=45,seventh=40,eighth=30,nineth=20,tenth=10;
				var ctx = document.getElementById("myChart2").getContext('2d');
				var myChart = new Chart(ctx, {
    				type: 'bar',
   					data: {
       			 		labels: ["第一题", "第二题", "第三题", "第四题", "第五题","第六题","第七题","第八题","第九题","第十题"],
        				datasets: [{
        					label:'做对学生人数',
            				data: [first, secend , third , fourth , fifth, sixth , seventh , eighth , nineth , tenth ],
            				backgroundColor: [
                			'rgba(0, 255, 0 , 1)',
                			'rgba(255, 0, 0 , 1)',
                			'rgba(0, 0, 255 , 1)',
                			'rgba(2555, 255, 0 , 1)',
                			'rgba(153, 102, 255 , 1)',
                			'rgba(192, 192, 192 , 1)',
                			'rgba(0,255,0 , 1)',
                			'rgba(400,255,0 , 1)',
                			'rgba(0,255,400 , 1)',
                			'rgba(300,255,400 , 1)',
            				],
            				borderWidth: 1
        				}]
    				},
    				options:{
    					cutoutPercentage:50
    				}
				});
		 	</script>
		</div>
	</div>
 </div>
</body>
</html>