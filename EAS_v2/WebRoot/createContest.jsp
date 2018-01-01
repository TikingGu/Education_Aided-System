<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css"/>        
        <link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-admin-theme.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
	    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-admin-theme.css">
        
	</head>

	<body leftmargin="2" topmargin="9" background='<%=path %>/img/allbg.gif'>
	<div class="col-md-2 bootstrap-admin-col-left">
            
                <button type="button" class="btn btn-primary" onclick="window.location.href='teacher_coursde_display.jsp'">返回</button>
            
        </div>
		<div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-default bootstrap-admin-no-table-panel">
                            <div class="panel-heading">
                                <div class="text-muted bootstrap-admin-box-title">创建题目</div>
                            </div>
                            <div class="bootstrap-admin-no-table-panel-content bootstrap-admin-panel-content collapse in">
                                <form class="form-horizontal" action="insertQuiz.action" method="post">
                                <div class="col-lg-7 form-group">
                                        <label class="col-lg-4 control-label" for="create_bno">测验名称</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" id="questionTitle" name="quizname" type="text" value="">
                                            <label class="control-label" for="create_bno" style="display: none;"></label>
                                        </div>
                                    </div>
                                    
                                    
                                    <div class="col-lg-5 form-group">                               
                                        <label class="col-lg-4 control-label" for="create_bno">题目名称</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" id="questionTitle" name="questions[0].questionTitle" type="text" value="">
                                            <label class="control-label" for="create_bno" style="display: none;"></label>
                                        </div>
                                    </div>
                                  
                                    <div class="col-lg-7 form-group">
                                        <label class="col-lg-4 control-label" for="create_bname">选项A：</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" id="bookName" name="questions[0].option1" type="text" value="">
                                            <label class="control-label" for="create_bname" style="display: none;"></label>
                                        </div>
                                    </div>
                                       
                                    <div class="col-lg-5 form-group">
                                        <label class="col-lg-4 control-label" for="create_bname">选项B：</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" id="bookName" name="questions[0].option2" type="text" value="">
                                            <label class="control-label" for="create_bname" style="display: none;"></label>
                                        </div>
                                    </div>
                                    
                                  <div class="col-lg-7 form-group">
                                        <label class="col-lg-4 control-label" for="create_bname2">选项C：</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" id="autho" name="questions[0].option3" type="text" value="">
                                            <label class="control-label" for="create_bname2" style="display: none;"></label>
                                        </div>
                                    </div>
                                    
                                     <div class="col-lg-5 form-group">
                                        <label class="col-lg-4 control-label" for="create_bname3">选项D：</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" id="question.option4" name="questions[0].option4" type="text" value="">
                                            <label class="control-label" for="create_bname2" style="display: none;"></label>
                                        </div>
                                    </div>
                                    <div class="col-lg-7 form-group">
                                    <div class="col-lg-9 form-group">
	                                    <label class="col-lg-4 control-label" for="create_bname3">正确答案:</label>
		                                     <div class="col-lg-8">
		                                     		<div class="col-lg-9">
		                                            <label  control-label" for="create_bname3">选项A：</label>
		                                           <input  id="press" name="questions[0].answer" type="radio" value="A"> <br/>
		                                           </div>
		                                            <div class="col-lg-9">
		                                            <label  control-label" for="create_bname3">选项B：</label>
		                                           <input  cid="press" name="questions[0].answer" type="radio" value="B"> <br/>
		                                           </div>
		                                            <div class="col-lg-9">
		                                            <label  control-label" for="create_bname3">选项C：</label>
		                                           <input  id="press" name="questions[0].answer" type="radio" value="C"> <br/>
		                                           </div>
													<div class="col-lg-9">
		                                            <label  control-label" for="create_bname3">选项D：</label>
		                                           <input  id="press" name="questions[0].answer" type="radio" value="D"> <br/>
		                                           </div>
		                                     </div>
	                                      </div>
                                      </div>
                                     <div class="col-lg-5 form-group">
                                        <label class="col-lg-4 control-label" for="create_bname3">小测分值</label>
                                        <div class="col-lg-8">
                                            <input class="form-control" id="press" name="points" type="text" value="">                     
                                        </div>
                                    </div>
                                  
                                    <div class="col-lg-3 form-group">

                                        <button type="submit" class="btn btn-primary" id="btn_create" onclick="create()">创建</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
	
   </body>
</html>
