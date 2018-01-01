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
		<script src="${pageContext.request.contextPath}/jQuery/jquery-3.1.1.min.js"></script>
      <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

	</head>

<body>

<button type="button" class="btn btn-info btn-xs" data-toggle="modal" data-target="#attendContest" onclick=savaClassId("666") >进行测试</button>
<script>

function savaClassId(id) {
	 window.location.href="SavaCourseIdAction.action?courseId="+id;
}

</script>







 <!--------------------------------------查看的模糊框------------------------>  
                                 <form class="form-horizontal">   <!--保证样式水平不混乱-->   
                                        <!-- 模态框（Modal） -->
             
                  <div class="modal fade" id="attendContest" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                      <div class="modal-content">
                        <div class="modal-header">
                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                            &times;
                          </button>
                          <h4 class="modal-title" id="myModalLabel">
                            进行测试
                          </h4>
                        </div>
                        <div class="modal-body">
                        
                    <!---------------------表单-------------------->
                     <div class="form-group">
                     
                     <s:iterator value="#request.questionList" var="question" status="status">
                      <label for="firstname" class="col-sm-3 control-label"><s:property value="#question.questionTitle"/></label>
                        <div class="col-sm-7">
                          <label class="radio-inline">
							  <input type="radio" name="<s:property value="#status.index"/>" id="inlineRadio11" value="option1"> <s:property value="#question.option1"/>
							</label>
							<label class="radio-inline">
							  <input type="radio" name="question[<s:property value="#status.index"/>].answer" id="inlineRadio12" value="option2"> <s:property value="#question.option1"/>
							</label>
							<label class="radio-inline">
							  <input type="radio" name="question[<s:property value="#status.index"/>].answer" id="inlineRadio13" value="option3"> <s:property value="#question.option1"/>
							</label>
							<label class="radio-inline">
							  <input type="radio" name="question[<s:property value="#status.index"/>].answer" id="inlineRadio14" value="option3"> <s:property value="#question.option1"/>
							</label>
                        </div>
                    </s:iterator>
                
                    
                    
                    
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