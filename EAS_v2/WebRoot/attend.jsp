<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-admin-theme.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">
    	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-admin-theme.css">
        <script type='text/javascript' src='<%=path %>/dwr/interface/daojishiService.js'></script>
		<script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
		<script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
		
       <script type="text/javascript">
	   function init()
	   {
	         
	   }
	   
	   
	   
	</script>
	</head>

<body onload="init()">
<div class="container">
	<div class="row">
    	<div class="col-lg-12"> 
        	<div class="panel panel-default bootstrap-admin-no-table-panel">
            	<div class="panel-heading">
                	<div class="text-muted bootstrap-admin-box-title">课堂小测验</div>
                </div>
            </div>
        </div>
        <div class="col-lg-12">
       	  <form action="<%=path %>/test_jiaojuan.action" name="form1" method="post">	
       	  <c:forEach items="${requestScope.timuList}"  varStatus="sta" var="test">	
			<div class="col-lg-12">
            	<div class="col-lg-12">
            		<label>
						${test.QuestionTitle }
						(
						  单选题${test.Score }分
						)
			  		</label>
                </div>
                <div class="col-lg-12">
                	<div class="col-lg-12">
						<div class="radio">
							<label>
                            	<div class="col-lg-12">
									<input type="radio" name="option1" id="option1" value="A">A:${test.testXuanxiangA }
                                </div>
							</label>
						</div>
                    </div>
                	<div class="col-lg-12">
						<div class="radio">
							<label>
                            	<div class="col-lg-12">
									<input type="radio" name="option1" id="option1" value="B">B:${test.testXuanxiangB }
                                </div>
							</label>
						</div>
                    </div>
                	<div class="col-lg-12">
						<div class="radio">
							<label>
                            	<div class="col-lg-12">
									<input type="radio" name="option1" id="option1" value="C">C:${test.testXuanxiangC }
                                </div>
							</label>
						</div>
                    </div>
                	<div class="col-lg-12">
						<div class="radio">
							<label>
                            	<div class="col-lg-12">
									<input type="radio" name="option1" id="option1" value="D">D:${test.testXuanxiangD }
                                </div>
							</label>
						</div>
                    </div>
                </c:forEach>
                </div>
                <div class="col-lg-12">
                	<hr />
                </div>
		  </form>
        </div>
        <div class="panel-footer">
        	<div class="col-lg-2">
            	<button type="submit" class="btn btn-primary">交卷</button>
        	</div>
         </div>
    </div>
</div>
</body>
</html>