<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"   prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-CN" class="ax-vertical-centered">

<head>

  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
    <title>Navbar Template for Bootstrap</title>
    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="navbar.css" rel="stylesheet">
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <script src="${pageContext.request.contextPath}/jQuery/jquery-3.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <!-- 幻灯片-->
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
		<script src="${pageContext.request.contextPath}/js/ft-carousel.min.js" type="text/javascript" charset="utf-8"></script> 
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">
<!--
function refreshFrame(){
    document.getElementById('myframe').contentWindow.location.reload(true);
}
//-->
</script>
           
                          
                          <s:iterator value="#request.replieslist" var="reply" status="status">
                          <div>
                          <span style="font-size:1.5em" class="glyphicon glyphicon-user"></span>
                          <span> <s:property value="#request.namelist[#status.index]"/></span>
                          <span class="smallword pull-right text-muted"><s:property value="#reply.reDate"/></span>
                          <div class="answerOfComment" style="padding:10px; margin-top:20px;background-color:#F5F5F5"><s:property value="#reply.content"/></div>
                          <br>
                          </div>
                          </s:iterator>
                          
                        
                        
                      
                      <br>
                      <br>
                      
                      <hr style="width:100%" align="left">
                   
                 
               
              
      

              


</body>
</html>