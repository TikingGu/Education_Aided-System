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

   <script src="${pageContext.request.contextPath}/js/findCourse.js"></script>
</head>

<body load()>
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
            <a class="pull-right" href='selectEvlCourse.jsp'> 开始评教 </a>
          </div>
        </div>
      </div>
 
         <div class="col-xs-12 col-md-8">
        <!-- 课程信息 -->
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">课程信息</h3>
          </div>
          <button onclick="findCourse()">查看课程</button>
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
                          学期
                        </th>
                        <th>
                          状态
                        </th>
                      </tr>
                    </thead>
                    
                    <s:if test="#request!=null">
                    <s:iterator value="#request.s" var="course">
                    <tbody>
                     <td><s:property value="#course.courseId"/></td>
                     <td><s:property value="#course.courseName"/></td>
                     <td><s:property value="#course.period" /></td>
                     <td><s:property value="#course.state"/></td>
                     
                     <td>
                      <button type="button" class="btn btn-info btn-xs"  onclick="window.location.href='toCourseById.action?courseId=<s:property value='#course.courseId'/>'" >前往上课</button>
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
                       <button type="button" class="btn btn-info btn-xs"  onclick="window.location.href='course_inf_all.jsp'" >前往上课</button>
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
<!--  -->


</div>
<!--------------------------------------查看的模糊框------------------------>  
              <form class="form-horizontal">   <!--保证样式水平不混乱-->   
                <!-- 模态框（Modal） -->
                <div class="modal fade" id="displayNotice" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
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
                              <span class="input-group-addon" id="basic-addon1">标题</span>
                              
                            </div>

                            <div class="col-md-12">

                              <br/>
                              <p> 内容</p>
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
          </table>
          
                    <s:if test="#request.pb!=null">
					                    
					                    		   <%-- 定义页码列表的长度，5个长 --%>
								   <c:choose>
									<%-- 第一条：如果总页数<=5，那么页码列表为1 ~ totaPage 从第一页到总页数--%>
									<%--如果总页数<=5的情况 --%>
									  <c:when test="${pb.totaPage <= 5 }">
									    <c:set var="begin" value="1"/>
									    <c:set var="end" value="${pb.totaPage }"/>
									  </c:when>
									  <%--总页数>5的情况 --%>
									  <c:otherwise>
										  	<%-- 第二条：按公式计算，让列表的头为当前页-2；列表的尾为当前页+2 --%>
										  	<c:set var="begin" value="${pb.pageCode-2 }"/>
										    <c:set var="end" value="${pb.pageCode+2 }"/>
										    
										    <%-- 第三条：第二条只适合在中间，而两端会出问题。这里处理begin出界！ --%>
										    <%-- 如果begin<1，那么让begin=1，相应end=5 --%>
										    <c:if test="${begin<1 }">
										    	<c:set var="begin" value="1"/>
										    	<c:set var="end" value="5"/>
										    </c:if>
										    <%-- 第四条：处理end出界。如果end>tp，那么让end=tp，相应begin=tp-4 --%>
										    <c:if test="${end>pb.totaPage }">
										    	<c:set var="begin" value="${pb.totaPage-4 }"/>
										    	<c:set var="end" value="${pb.totaPage }"/>
										    </c:if>
									  </c:otherwise>
								</c:choose>
                    
                        
                        <div class="pull-right"><!--右对齐--->
                           <ul class="pagination">
                           <li class="disabled"><a href="#">第<s:property value="#request.pb.pageCode"/>页/共<s:property value="#request.pb.totaPage"/>页</a></li>
                           <li><a href="${pageContext.request.contextPath}/reader/borrowAction_${pb.url }pageCode=1">首页</a></li>
                           <li><a href="${pageContext.request.contextPath}/reader/borrowAction_${pb.url }pageCode=${pb.pageCode-1 }">&laquo;</a></li><!-- 上一页 -->
                           <%-- 循环显示页码列表 --%>
								<c:forEach begin="${begin }" end="${end }" var="i">
								  <c:choose>
								  <%--如果是当前页则设置无法点击超链接 --%>
								  	<c:when test="${i eq pb.pageCode }">							  	
								  			<li class="active"><a>${i }</a><li>							 
								  	</c:when>
								  	<c:otherwise>
								  		<li><a href="${pageContext.request.contextPath}/reader/borrowAction_${pb.url }pageCode=${i}">${i}</a></li>
								  	</c:otherwise>
								  </c:choose>
								</c:forEach>
				        	   <%--如果当前页数没到总页数，即没到最后一页,则需要显示下一页 --%>
							  <c:if test="${pb.pageCode < pb.totaPage }">
								  <li><a href="${pageContext.request.contextPath}/reader/borrowAction_${pb.url }pageCode=${pb.pageCode+1}">&raquo;</a></li>
							</c:if>
							<%--否则显示尾页 --%>
							<li><a href="${pageContext.request.contextPath}/reader/borrowAction_${pb.url }pageCode=${pb.totaPage}">尾页</a></li>
							</ul>
                           </div>
                    </s:if>          
          
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