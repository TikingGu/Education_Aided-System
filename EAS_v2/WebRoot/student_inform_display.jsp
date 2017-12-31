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

    <title>通知信息</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <link rel="stylesheet" href="css/lizhiliang.css" media="screen" type="text/css" />

    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>
    <!-- jQuery.js -->
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
    <script src="js/lizhiliang.js"></script>
   
  </head>
  <body>
    <div class="container">
      <!--头部留白-->
      <div style="background-color: #ffffff;width: 100%;height: 80px;"></div>
      <!-- 个人信息 -->
      <div class="row">
        <div class="col-xs-12 col-md-4">
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
                <p class="realname" title="&nbsp;">&nbsp; </p>
                <p class="username" title="username">用户名</p>
                <p class="username"> 学号 </p>
            </div>
          </div>
        </div>
        <div class="col-xs-12 col-md-8">
          <div class="panel panel-default">
            <div class="panel-heading">
              <h3 class="panel-title">
                课程名
              </h3>
            </div>
            <div class="panel-body">
              <div class="panel panel-default">
                <div class="col-xs-12 col-md-12 panel-heading">
                  <div class="panel-title">
                    <ul class="col-xs-12 col-md-2 pull-left" >
                      通知名
                    </ul>
                    <ul class="pull-right col-xs-12 col-md-3">
                      <small class="pull-right">发布时间</small>
                    </ul>
                    <ul class="pull-right col-xs-12 col-md-2">
                      <span class="pull-right">教师名</span>
                    </ul>
                  </div>
                </div>
                <div class="panel-body">
                    <li class="col-xs-12 col-md-12 li">通知内容</li>
                    <li class="col-xs-12 col-md-12 li">
                      <input type="text" name="huifu">
                      <a class="col-xs-12 col-md-2 pull-right btn-xs btn-default " href="">回复</a>
                    </li>
                    
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>