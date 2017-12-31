<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'create.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css"/>   
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-admin-theme.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-admin-theme.css">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
<div class="container">
	<div class="row">
		<div class="col-lg-2">
        	<ul class="nav navbar-collapse collapse bootstrap-admin-navbar-side">
                <li class="active">
                    <a href="back_to_XXXPage.action"><i class="glyphicon glyphicon-chevron-left"></i> 返回</a>
                </li>
            </ul>
        </div>
    	<div class="col-lg-12">
        	<div class="panel panel-default bootstrap-admin-no-table-panel">
            	<div class="panel-heading">
                	<div class="text-muted bootstrap-admin-box-title">创建公告</div>
                </div>
            </div>
        </div>
        <div class="col-lg-12">
        	<form role="form">
  				<div class="form-group">
    				<label for="name">公告标题</label>
    				<input type="text" class="form-control" id="name" placeholder="请输入公告的标题">
  				</div>
            </form>

        </div>
        <div class="col-lg-12">
        	<form role="form">
  				<div class="form-group">
   					<label for="name">公告内容</label>
    				<textarea class="form-control" rows="3" placeholder="请输入公告的内容"></textarea>
  				</div>
			</form>
        </div>
    </div>
	
</div>
</body>
</html>
