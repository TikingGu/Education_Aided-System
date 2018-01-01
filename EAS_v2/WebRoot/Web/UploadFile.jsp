<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'UploadFile.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    

    	<p style="font-size:25px;">请选择上传的文件</p>

    	<form action="fileUpload.action" method="post" name="uploadaction" enctype="multipart/form-data">
    	<input type="file" name="upload" id="file2" accept="*"/>
        <input name="btnUpload" type="submit" value="上传" class="button-search" style="position:relative;left:25px;top:2px;">  
    </form>
  

  </body>
</html>
