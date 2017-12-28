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

    <title>个人信息</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="navbar.css" rel="stylesheet">

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

    <!-- [if ] -->
  </head>

  <body>
    <div class="content-wrapper">
      <!--头部留白-->
     <input type="button" value="to course" 
onclick="javascrtpt:window.location.href='course_inf_all.jsp'">
      <div style="background-color: #ffffff;width: 100%;height: 80px;"></div>
      
  <div class="response-container container" ng-app="app"
       ng-controller="PublicProfileController as pc"
       ng-init="pc.init('leetcode526418', '29', '0', '0', '0',
                        '59', '100001', '100000', '2.0', '0',
                        '3.0,', null,
                        {&quot;percentiles&quot;: [], &quot;avg_percentile&quot;: 0.0, &quot;top_tags&quot;: []}, [&quot;Weekly Contest 2&quot;, &quot;Weekly Contest 3&quot;, &quot;Weekly Contest 4&quot;, &quot;Weekly Contest 5&quot;, &quot;Weekly Contest 6&quot;, &quot;Weekly Contest 7&quot;, &quot;Weekly Contest 8&quot;, &quot;Weekly Contest 9&quot;, &quot;Smarking Algorithm Contest&quot;, &quot;Smarking Algorithm Contest 2&quot;, &quot;Smarking Algorithm Contest 3&quot;, &quot;Smarking Algorithm Contest 4&quot;, &quot;Weekly Contest 10&quot;, &quot;Weekly Contest 11&quot;, &quot;Weekly Contest 12&quot;, &quot;Weekly Contest 13&quot;, &quot;Weekly Contest 14&quot;, &quot;Weekly Contest 15&quot;, &quot;Weekly Contest 16A&quot;, &quot;Weekly Contest 16B&quot;, &quot;Weekly Contest 17&quot;, &quot;Weekly Contest 18A&quot;, &quot;Weekly Contest 18B&quot;, &quot;Weekly Contest 19&quot;, &quot;Weekly Contest 20&quot;, &quot;Weekly Contest 21&quot;, &quot;Weekly Contest 22&quot;, &quot;Weekly Contest 23&quot;, &quot;Weekly Contest 24&quot;, &quot;Weekly Contest 25&quot;, &quot;Weekly Contest 26&quot;, &quot;Weekly Contest 27&quot;, &quot;Weekly Contest 28&quot;, &quot;Weekly Contest 29&quot;, &quot;Weekly Contest 30&quot;, &quot;Weekly Contest 31&quot;, &quot;Weekly Contest 32&quot;, &quot;Weekly Contest 33&quot;, &quot;Weekly Contest 34&quot;, &quot;Weekly Contest 35&quot;, &quot;Weekly Contest 36&quot;, &quot;Weekly Contest 37&quot;, &quot;Weekly Contest 38&quot;, &quot;Weekly Contest 39&quot;, &quot;Weekly Contest 40&quot;, &quot;Weekly Contest 41&quot;, &quot;Weekly Contest 42&quot;, &quot;Weekly Contest 43&quot;, &quot;Weekly Contest 44&quot;, &quot;Weekly Contest 45&quot;, &quot;Weekly Contest 46&quot;, &quot;Weekly Contest 47&quot;, &quot;Weekly Contest 48&quot;, &quot;Weekly Contest 49&quot;, &quot;Weekly Contest 50&quot;, &quot;Weekly Contest 51&quot;, &quot;Weekly Contest 52&quot;, &quot;Weekly Contest 53&quot;, &quot;Weekly Contest 54&quot;, &quot;Weekly Contest 55&quot;, &quot;Weekly Contest 56&quot;, &quot;Weekly Contest 57&quot;, &quot;Weekly Contest 58&quot;, &quot;Weekly Contest 59&quot;, &quot;Weekly Contest 60&quot;, &quot;Weekly Contest 61&quot;])" ng-cloak>
    <div class="row">
      <div class="col-sm-5 col-md-4">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">
              个人信息
               <a class="btn btn-xs btn-default pull-right edit-profile" href="修改密码界面 我找不到命名">修改</a>
               <a class="btn btn-xs btn-default pull-right edit-profile" href="注销action">注销</a>
            </h3>
          </div>
          <div class="panel-body">
            <img style="float:left; margin-right: 15px; margin-top: 5px;"
                 width="80px"
                 src="https://www.gravatar.com/avatar/bb9be28f44922730fde5a34cf8487157.png?s=200"
                 class="img-rounded"
                 alt="user avatar" />
            <h4 class="realname" title="&nbsp;">&nbsp; </h4>
            <p class="username" title="username">用户名</p>
          </div>
        </div>
      </div>
      <!--到课情况-->
      <div class="col-sm-7 col-md-8">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title" ng-bind="heatmap_title">到课情况</h3>
          </div>
          <div class="panel-body col-centered">
            <div id="cal-heatmap">一个表 </div>
          </div>
        </div>

        <!-- 课程信息 -->
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">课程信息</h3>
          </div>
          
        </div>
        <!-- 通知 -->
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">通知</h3>
          </div>
      
        </div>
      </div> 
    </div>
    </div>
    </div>
  </body>
</html>