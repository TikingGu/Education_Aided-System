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
<script src="${pageContext.request.contextPath}/jQuery/jquery-3.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/icheck.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/selectEvlCourse.js"></script>
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
            <p class="username" title="username">用户名 <s:property value="#session.student.stuName"/></p>
            <p class="username"> 学号 <s:property value="#session.student.SID"/></p>
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
                    <s:if test="#request.s!=null">
                    <scripts>
                    window.altert(#request.s)
                    </scripts>
                    <s:iterator value="#request.s" var="course">
                    <tbody>
                     <td><s:property value="#course.courseId"/></td>
                     <td><s:property value="#course.courseName"/></td>
                     <td><s:property value="#course.state"/></td>
                     <td><s:date name="#course.period" /></td>
                     <td>
                      <button type="button" class="btn btn-info btn-xs" data-toggle="modal" data-target="#myModal" onclick="saveCourseId(<s:property value="#course.id"/>)" >进行评教</button>
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
                       <button type="button" class="btn btn-info btn-xs" data-toggle="modal" data-target="#BeginEvl" onclick="saveCourseId(<s:property value="#course.id"/>)" >进行评教</button>
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
                  ...                  </td>
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


</div>
</div> 
</div>
</div>


 <!--------------------------------------查看的模糊框------------------------>  
                                 <form class="form-horizontal">   <!--保证样式水平不混乱-->   
                                        <!-- 模态框（Modal） -->
                  <div class="modal fade" id="BeginEvl" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                      <div class="modal-content">
                        <div class="modal-header">
                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                            &times;
                          </button>
                          <h4 class="modal-title" id="myModalLabel">
                            进行评教
                          </h4>
                        </div>
                        <div class="modal-body">
                        
                    <!---------------------表单-------------------->
                     <div class="form-group">
                      <label for="firstname" class="col-sm-3 control-label">课堂氛围</label>
                        <div class="col-sm-7">
                          <label class="radio-inline">
							  <input type="radio" name="a1" id="inlineRadio11" value="option1"> 1
							</label>
							<label class="radio-inline">
							  <input type="radio" name="a1" id="inlineRadio12" value="option2"> 2
							</label>
							<label class="radio-inline">
							  <input type="radio" name="a1" id="inlineRadio13" value="option3"> 3
							</label>
							<label class="radio-inline">
							  <input type="radio" name="a1" id="inlineRadio14" value="option3"> 4
							</label>
                        </div>
                    
                      <label for="firstname" class="col-sm-3 control-label">课堂氛围</label>
                    <div class="col-sm-7">
                          <label class="radio-inline">
							  <input type="radio" name="a2" id="inlineRadio21" value="option1"> 1
							</label>
							<label class="radio-inline">
							  <input type="radio" name="a2" id="inlineRadio22" value="option2"> 2
							</label>
							<label class="radio-inline">
							  <input type="radio" name="a2" id="inlineRadio23" value="option3"> 3
							</label>
							<label class="radio-inline">
							  <input type="radio" name="a2" id="inlineRadio24" value="option3"> 4
							</label>
                        </div>
                      <label for="firstname" class="col-sm-3 control-label">课堂氛围</label>
                   <div class="col-sm-7">
                          <label class="radio-inline">
							  <input type="radio" name="a3" id="inlineRadio1" value="option1"> 1
							</label>
							<label class="radio-inline">
							  <input type="radio" name="a3" id="inlineRadio2" value="option2"> 2
							</label>
							<label class="radio-inline">
							  <input type="radio" name="a3" id="inlineRadio3" value="option3"> 3
							</label>
							<label class="radio-inline">
							  <input type="radio" name="a3" id="inlineRadio3" value="option3"> 4
							</label>
                        </div>
                        <label for="firstname" class="col-sm-3 control-label">课堂氛围</label>
                    <div class="col-sm-7">
                          <label class="radio-inline">
							  <input type="radio" name="a4" id="inlineRadio1" value="option1"> 1
							</label>
							<label class="radio-inline">
							  <input type="radio" name="a4" id="inlineRadio2" value="option2"> 2
							</label>
							<label class="radio-inline">
							  <input type="radio" name="a4" id="inlineRadio3" value="option3"> 3
							</label>
							<label class="radio-inline">
							  <input type="radio" name="a4" id="inlineRadio3" value="option3"> 4
							</label>
                        </div>
                    
                    
                    
                    <!---------------------表单-------------------->
                  </div>
                        <div class="modal-footer">
                          <button type="button" class="btn btn-default" data-dismiss="modal" onclick="saveEvl()">提交
                          </button>
                        </div>
                      </div><!-- /.modal-content -->
                    </div><!-- /.modal -->
                  </div>

                                 </form>  

 


</body>
</html>