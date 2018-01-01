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
        				<a class="btn btn-xs btn-default pull-right edit-profile" href="course_evaTeach_display"> 查看评教情况 </a>
        			</div>
        		</div>
        		<!-- 课程列表 -->
			
				<div class="panel panel-default">
					<div class="panel-heading">
					<button type="button" class="btn btn-success btn-xs" style="float:right" onclick="window.location.href='teacher_inf_display.jsp'">返回选择</button>
						<h3 class="panel-title"> 课程 </h3>
						
					</div>
					
					<div class="panel-body">

            <div class="container" style="width: inherit;">
              <div class="row clearfix">
                <div class="col-md-12 column">
                  <table id="data_list" class="table table-hover table-bordered" cellspacing="0" width="100%">
                    <label>课程</label>
                    <ul>
                    
                    <li>课程名称</li>              
                    </ul>
                    <ul>
                    <li>课程id</li>
                    </ul>
                    <ul>
                    <li>课程上课时间</li>
                    </ul>
                    <ul>
                    <li>课程上课地点</li>
                    </ul>
                    
                    
           

          </table>
        </div>
      </div>
    </div>

         
				</div>
			</div>
			</div>
			<!-- 测试列表 -->
			<div class="col-xs-12 col-md-8">
				<div class="panel panel-default">
					<div class="panel-heading">
					<button type="button" class="btn btn-info btn-xs" style="float:right" onclick="window.location.href='createContest.jsp'">添加测试</button>
					
						<h3 class="panel-title">测试列表 </h3>
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
                          测试ID
                        </th>
                        <th>
                          学分
                        </th>
                        <th>
                          状态
                        </th>
                      </tr>
                    </thead>
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
                    <button type="button" class="btn btn-info btn-xs"  onclick="window.location.href='displayContestResult.jsp'">查看结果</button>
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
              </tbody>

          </table>
        </div>
      </div>
    </div>

          </div>
				</div>
			</div>
			<!-- 测试列表 -->
			<div class="col-xs-12 col-md-8">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">学生列表 </h3>
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
                          学生ID
                        </th>
                        <th>
                          学生名
                        </th>
                        <th>
                          状态
                        </th>
                      </tr>
                    </thead>
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
                    <input id="commentButton" type="button" value="作业评价" class="btn btn-info btn logcommentButton btn-xs" data-toggle="modal" data-target="#evlHomework">
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
              </tbody>

          </table>
          <!--------------------------------------查看的模糊框------------------------>  
              <form class="form-horizontal">   <!--保证样式水平不混乱-->   
                <!-- 模态框（Modal） -->
                <div class="modal fade" id="evlHomework" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                  <div class="modal-dialog">
                    <div class="modal-content">
                      <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                          &times;
                        </button>
                        <h4 class="modal-title" id="myModalLabel">
                          作业评价
                        </h4>
                      </div>
                      <div class="modal-body">

                        <!---------------------表单-------------------->
                        <div class="form-group">
                          <div class="contain">

                            <div class="col-md-12">
                              <span class="input-group-addon" id="basic-addon1">填写标题</span>
                              <input type="text" class="form-control" placeholder="title" aria-describedby="basic-addon1">
                            </div>

                            <div class="col-md-12">

                              <br/>
                              <textarea class="form-control" rows="10" placeholder="正文" aria-describedby="basic-addon1"></textarea>

                            </div>
                          </div>
                        </div>
                        <!---------------------表单尾-------------------->
                      </div>
                      <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal" onclick="saveEvl()">提交
                        </button>
                      </div>
                    </div><!-- /.modal-content -->
                  </div><!-- /.modal -->
                </div>
              </form>
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