<%@page import="com.eas.model.homework_evaluation_system.HomeworkComment"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">

	<title>作业评价</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        background: #eee;
    }
    .main {
        max-width: 970px;
        width: 100%;
        background: #fff;
        margin: 20px auto;
        padding: 20px;
    }
</style>
</head>
<body>
    <div class="main">
    	<div>
	        <h2 style="display: inline-block; width: 8em; margin: 0">作业评价列表</h2>
	        <a href="create.action" class="btn btn-primary pull-right">创建新评价</a>
    	</div>
        <table class="table">
        	<thead>
        		<tr>
	                <th>ID</th>
	                <th>学生ID</th>
	                <th>教师ID</th>
	        		<th>标题</th>
	                <th>内容</th>
	                <th>创建时间</th>
	            </tr>
        	</thead>
        	<tbody>
        	<s:iterator value="list">
        		<tr>
	        		<td> <s:property value="id"/> </td>
	        		<td> <s:property value="sId"/> </td>
	        		<td> <s:property value="tId"/> </td>
	        		<td> <s:property value="title"/> </td>
	        		<td> <s:property value="content"/> </td>
	        		<td> <s:property value="createdAt"/> </td>
        		</tr>
        	</s:iterator>
            </tbody>
        </table>
    </div>

    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script>
</script>
</body>
</html>
