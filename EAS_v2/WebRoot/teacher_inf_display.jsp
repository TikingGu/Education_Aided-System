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
   <script src="${pageContext.request.contextPath}/jQuery/jquery-3.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

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
        				<a class="btn btn-xs btn-default pull-right edit-profile" href="course_evaTeach_display.jsp"> 查看评教情况 </a>
        			</div>
        		</div>
			</div>
			<!-- 课程列表 -->
			<div class="col-xs-12 col-md-8">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title"> 课程 </h3>
					</div>
					<div class="panel-body">

            <div class="container" style="width: inherit;">
              <div class="row clearfix">
                <div class="col-md-12 column">
                  <table id="data_list" class="table table-hover table-bordered" cellspacing="0" width="100%">
                    <thead>
                      <tr>
                        <th>
                          ID
                        </th>
                        <th>
                          课程
                        </th>
                        <th>
                          学分
                        </th>
                        <th>
                          状态
                        </th>
                      </tr>
                    </thead>
                    <s:if test="#request.pb.beanList!=null">
                    <s:iterator value="#request.pb.beanList" var="course">
                    <tbody>
                     <td><s:property value="#course.id"/></td>
                     <td><s:property value="#course.name"/></td>
                     <td><s:property value="#course.state"/></td>
                     <td><s:date name="#course.date" format="yyyy-MM-dd" /></td>
                     <td>
                      <button type="button" class="btn btn-info btn-xs" data-toggle="modal" data-target="#findModal" onclick="getBookInfo(<s:property value="#course.ID"/>)" >点击查看</button>       
                    </td>                                              
                  </tbody>
                </s:iterator>
              </s:if>
              <s:else>
              <tbody>
                <tr>
                  <td>
                    1
                  </td>
                  <td>
                    TB - Monthly
                  </td>
                  <td>
                    01/04/2012
                  </td>
                  <td>
                    <button type="button" class="btn btn-info btn-xs"  onclick="window.location.href='teacher_coursde_display.jsp'">查看</button>
                  </td>
                </tr>
                <tr class="success">
                  <td>
                    1
                  </td>
                  <td>
                    TB - Monthly
                  </td>
                  <td>
                    01/04/2012
                  </td>
                  <td>
                    Approved
                  </td>
                </tr>
                <tr class="error">
                  <td>
                    2
                  </td>
                  <td>
                    TB - Monthly
                  </td>
                  <td>
                    02/04/2012
                  </td>
                  <td>
                    Declined
                  </td>
                </tr>
                <tr class="warning">
                  <td>
                    3
                  </td>
                  <td>
                    TB - Monthly
                  </td>
                  <td>
                    03/04/2012
                  </td>
                  <td>
                    Pending
                  </td>
                </tr>
                <tr class="info">
                  <td>
                    4
                  </td>
                  <td>
                    TB - Monthly
                  </td>
                  <td>
                    04/04/2012
                  </td>
                  <td>
                    Call in to confirm
                  </td>
                </tr>
              </tbody>
            </s:else>

          </table>
        </div>
      </div>
    </div>

          </div>
				</div>
			</div>
        </div>
</body>
</html>