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
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
  	<script src="js/lizhiliang.js"></script>

</head>
<body>
	<!-- 头部留白-->
	<div style="background-color: #ffffff;width: 100%;height: 80px;"></div>
	<div class="container">
		<div class="row">
			<!-- 教师信息 -->
			<div class="col-xs-12 col-md-4">
        		<div class="panel panel-default">
        			<div class="panel-heading">
        				<h3 class="panel-title">
        					个人信息
        					<a class="btn btn-xs btn-default pull-right edit-profile" href="注销action">注销</a>
        				</h3>
        			</div>
        			<div class="panel-body">
        				欢迎：用户名 老师
        				<a class="btn btn-xs btn-default pull-right edit-profile" href="course_evaTeach_display"> 查看评教情况 </a>
        			</div>
        		</div>
			</div>
			<!-- 课程列表 -->
			<div class="col-xs-12 col-md-8">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title"> 课程 </h3>
					</div>
					<s:iterator items="" var="course">
						<ul class="list-group">
							<a class="list-group-item" href="<%=path%>/pages/course_homework_inf.jsp">
								<b>课程名</b>
								<div class="skillbar clearfix pull-right" data-percent="99%">
									<li class="skillbar-bar li" style="background: #3498db;"></li>
									<li class="skillbar-title li">授课进度</li>
									<li class="skill-bar-percent li">25%</li>
								</div> <!-- End Skill Bar -->
							</a>
						</ul>
					</s:iterator>
				</div>
			</div>
        </div>
</body>
</html>