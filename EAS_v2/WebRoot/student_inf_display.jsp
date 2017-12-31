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

  <title>个人信息</title>

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
            <a class="pull-right" href="selectEvlCourse.jsp"> 开始评教 </a>
          </div>
        </div>
      </div>
      <div class="col-xs-12 col-md-8">
        <!-- 课程信息 -->
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">课程信息</h3>
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
                    Default
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
        <!--  -->
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">通知信息</h3>
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
                          通知
                        </th>
                        <th>
                          时间
                        </th>
                        <th>
                          状态
                        </th>
                      </tr>
                    </thead>
                    <s:if test="#request.pb.beanList!=null">
                    <s:iterator value="#request.pb.beanList" var="notice">
                    <tbody>
                     <td><s:property value="#notice.id"/></td>
                     <td><s:property value="#notice.name"/></td>
                     <td><s:property value="#notice.state"/></td>
                     <td><s:date name="#notice.date" format="yyyy-MM-dd" /></td>
                     <td>
                      <button type="button" class="btn btn-info btn-xs" data-toggle="modal" data-target="#findModal" onclick="getBookInfo(<s:property value="#notice.ID"/>)" >点击查看</button>       
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
                    Default
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
</div>
</body>
</html>