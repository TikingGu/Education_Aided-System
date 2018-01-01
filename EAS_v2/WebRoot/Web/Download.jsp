<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <link  href="CSS/style.css" rel="stylesheet" type="text/css">
  </head>
  
  <body style="background-image:url(images/background.png);
  background-position:fixed;
  background-repeat:no-repeat;
  background-size:100%;">
<div style="position:absolute;
left:28%;
top:30%;
background-color:rgba(255,255,255,0.5);">
<table border="1" cellpadding="10" style="width:850px;
height:550px;
border:1px solid black;
border-collapse:collapse;">
<tr>
        <th>文件名</th>
		<th>上传人</th>
		<th>文件大小</th>
		<th>文件上传日期</th>
</tr>
<s:iterator  var="name" value="#request.pageBean.list" status="i">
<tr>
        <td><s:property value="#name.fileName"/></td>
        <td><s:property value="#name.teacher.TId"/></td>
        <td><s:property value="#name.fileSize"/></td>
        <td><s:property value="#name.uploadDate"/></td>
        <td><a href="<s:url value="download.action">  				
<s:param name="fileName" value="#name.fileName"/>
            </s:url>">下载</a>
			</td>
</tr>
</s:iterator>
</table>
</div>
  <table style="position:absolute;
  left:36%;
  bottom:5%;">
   <tr class="odd"> 
        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td> 
        <td>
        <s:if test="%{pageBean.currentPage == 1}"></s:if> 
          <s:else>
          <a href="downloadview.action?page=1">首页</a> 
        <td>  <a href="downloadview.action?page=<s:property value="%{pageBean.currentPage-1}"/>" >
          上一页 </a>
         </s:else> 
         </td> 
         <td> 
         <s:if test="%{pageBean.currentPage != pageBean.totaPage}"> 
        <td>  <a  href="downloadview.action?page=<s:property value="%{pageBean.currentPage+1}"/>">下一页</a> 
        <td>  <a  href="downloadview.action?page=<s:property value="pageBean.totaPage"/>">尾页  
          </a> 
         </s:if> 
           </td> 
           <td> 
             <div align="center"> 页次<s:property value="pageBean.currentPage"/> 
              &nbsp; /<s:property value="pageBean.totaPage" />  &nbsp;&nbsp;&nbsp;共  
             <s:property value="pageBean.totalRecord" />  记录  
             </div> 
           </td> 
  </tr>
  </table>
  </body>
</html>