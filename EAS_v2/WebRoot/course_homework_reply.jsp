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

    <title>发送通知</title>

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

    <script language="javascript">
        function check()
        {
            if(document.formAdd.title.value=="")
            {
                alert("请输入标题");
                return false;
            }
            document.informAdd.submit();
        } 
    </script>
</head>
<body>
    <!-- 头部留白-->
    <div style="background-color: #ffffff;width: 100%;height: 80px;"></div>
    <div class="container">
        <div class="row">
            <!-- 学生信息 -->
            <div class="col-xs-12 col-md-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            通知信息
                        </h3>
                    </div>
                    <div class="panel-body">
                        <li class="li">课程名:</li>
                        <li class="li">学生姓名:</li>
                        <li class="li">学生学号</li>
                    </div>
                </div>
            </div>
            <!-- 创建通知 -->
            <div class="col-xs-12 col-md-8">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <p class="panel-title">创建通知</p>
                    </div>
                    <div class="panel-body">
                        <form action="<%=path %>/.action" name="informAdd" method="post">
                            <div class="col-xs-12 col-md-12" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC" style="margin-bottom:8px">
                                <ul align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
                                    <div class="col-xs-1 col-md-2" bgcolor="#FFFFFF" align="right">
                                        标题：
                                    </div>
                                    <div class="col-xs-11 col-md-10" bgcolor="#FFFFFF" align="left">
                                        <input type="text" name="title">
                                    </div>
                                </ul>
                                <ul style="width: 100%;height:22px;"></ul>
                                <ul align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
                                    <div class="col-xs-12 col-md-2" bgcolor="#FFFFFF" align="right">
                                        内容：
                                    </div>
                                    <div class="col-xs-12 col-md-10" bgcolor="#FFFFFF" align="left">
                                        <textarea style="height:200px;" id="commentdesc" name="comment.desc" class="form-control" placeholder="填写通知内容"></textarea>
                                    </div>
                                </ul>
                                <ul align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
                                    <div class="col-xs-12 col-md-2" bgcolor="#FFFFFF" align="right">&nbsp;</div>
                                    <div class="col-xs-12 col-md-10" bgcolor="#FFFFFF" align="left">
                                        <input type="hidden" name="stuId" value="${sessionScope.stu.stuId }">
                                        <input type="button" value="提交" onclick="check()">&nbsp; &nbsp; &nbsp; &nbsp; 
                                        <input type="reset" value="重置">&nbsp;
                                    </div>
                                </ul>
                            </div>
                        </form>
                    </div>
                </div>                    
            </div>
        </div>
</body>
</html>