<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'display.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css"/>        
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/base.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-admin-theme.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-admin-theme.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ft-carousel.css" />
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
			
			.example {
	width: 1000px;
	height: 600px;
	font-size: 40px;
	text-align: center;
	margin: 20px auto;
	background-color: #464576;
			}
			
			.carousel-item{line-height: 336px;color: #fff;font-family:  Arial Black}
		</style>
  </head>
  
  <body style=font-family: "微软雅黑";background-color: #1F1F1F>
 <div class="container">
    	<div class="col-lg-12">
        	<div class="col-md-2 bootstrap-admin-col-left">
            	<ul class="nav navbar-collapse collapse bootstrap-admin-navbar-side">
                	<li class="active">
                   	 	<a href="go_to_XXXPage.action"><i class="glyphicon glyphicon-chevron-left"></i>前往课程页面</a>
                	</li>
            	</ul>
        	</div>
            <div class="col-md-2 bootstrap-admin-col-right">
            	<ul class="nav navbar-collapse collapse bootstrap-admin-navbar-side">
                	<li class="active">
                   	 	<a href="go_to_XXXPage.action"><i class="glyphicon glyphicon-chevron-left"></i>开始测试</a>
                	</li>
            	</ul>
        	</div>
        </div>
        <div class="col-lg-12">
        	<div class="col-lg-12">
            	<div class="example">
					<div class="ft-carousel" id="carousel_1">
						<ul class="carousel-inner">
							<li class="carousel-item"><img src="${pageContext.request.contextPath}/images/1.jpg" /></li>
							<li class="carousel-item"><img src="${pageContext.request.contextPath}/images/2.jpg" /></li>
							<li class="carousel-item"><img src="${pageContext.request.contextPath}/images/3.jpg" /></li>
							<li class="carousel-item"><img src="${pageContext.request.contextPath}/images/a4.png" /></li>
							<li class="carousel-item"><img src="${pageContext.request.contextPath}/images/a5.png" /></li>
							<li class="carousel-item"><img src="${pageContext.request.contextPath}/images/a6.png" /></li>
						</ul>
					</div>
				</div>
                
                
            </div>
        
        </div>
        <div class="col-lg-12">
        	<div class="col-lg-4">
            </div>
            <div class="col-lg-2">
            	<button type="button" class="btn btn-primary btn-lg">
  					<span class="glyphicon glyphicon-thumbs-up" style="color: rgb(82, 255, 139);"></span>
				</button>
            
            
            </div>
            <div class="col-lg-2">
            	<button type="button" class="btn btn-primary btn-lg">
                	<span class="glyphicon glyphicon-thumbs-down" style="color: rgb(82, 255, 139);"></span>
				</button>
            
            
            </div>
            <div class="col-lg-4">
            </div>
        </div>
    </div>
    	<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
		<script src="${pageContext.request.contextPath}/js/ft-carousel.min.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			$("#carousel_1").FtCarousel();

			$("#carousel_2").FtCarousel({
				index: 1,
				auto: false
			});

			$("#carousel_3").FtCarousel({
				index: 0,
				auto: true,
				time: 3000,
				indicators: false,
				buttons: true
			});
		</script>
 </body>
 </html>
