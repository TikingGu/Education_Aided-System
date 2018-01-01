<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"   prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-CN" class="ax-vertical-centered">

<head>

  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
    <title>Navbar Template for Bootstrap</title>
    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="navbar.css" rel="stylesheet">
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <script src="${pageContext.request.contextPath}/jQuery/jquery-3.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <!-- 幻灯片-->
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
		<script src="${pageContext.request.contextPath}/js/ft-carousel.min.js" type="text/javascript" charset="utf-8"></script> 
<title>Insert title here</title>
</head>
<body>
<button onclick="window.location.href='loadPost.action'">加载帖子</button>
              <div class="row">
              

<script type="text/javascript">
<!--
function refreshFrame(){
    document.getElementById('myframe').contentWindow.location.reload(true);
}
//-->
</script>
                <div class="col-xs-12 col-md-12 eachCommentDiv" id="comment5695" show="true">
                <s:iterator value="#request.postlist" var='posting'>
                  <div class="panel panel-default">
                    <div class="panel-heading">
                      <span class="smallword text-muted">
                        2017-xx-xx
                      </span>
                      <span class="glyphicon glyphicon-question-sign"></span>
                      <span style="font-size:1.5em;font-weight:bold;">
                        <s:property value="#posting.title"/>
                      </span>
                      <a href="#nowhere" id="5695" class="collpaseComment"><span class="glyphicon glyphicon-resize-small pull-right"></span></a>
                    </div>
                    
                    <div class="panel-body commentBody " cid="5695" style=" ">
                      <table width="100%" hight="100px" class="eachCommentTable">
                        <tbody>
                          <tr valign="top">
                            <td width="100px" style="padding-top:15px">
                              <span style="font-size:1.5em" class="glyphicon glyphicon-user"></span>
                              <span><s:property value="#posting.student.stuName"/> </span>
                              <br>
                            </td>
                            <td align="left">
                              <div class="text-muted">关于
                                <a href="/k/boostrap/boostrap-jumbotron/495.html">

                                  <span style="font-style:italic;font-weight:bold">
                                    问题主题

                                  </span>
                                </a> 的提问
                              </div>
                              <div class="eachCommentDescDivIfOnly"><s:property value="#posting.content"/> </div>
                              <br>
                              <br>
                            </td>
                          </tr>
                        </tbody>
                      </table>                     
                      <div style="margin-left:100px">
                        <br>
                        <div class="listAnswersDiv" style="margin-left:100px" cid="1824">
                          <span style="font-weight:bold">回复</span> 
                          <hr>
                          <br>
                          <iframe id="myframe" width="100%" frameBorder="0" src="showPost.action?poId=<s:property value="#posting.poId"/>" scrolling="yes">
                          
                          </iframe>
                        </div>
                        				
                      </div>
                      <br>
                      <br>
                      
                      <hr style="width:100%" align="left">
                    </div>
                    <button type="button" class="btn btn-info btn-xs" data-toggle="modal" data-target="#createAnswer" onclick="createAnswer()" >添加答案</button>   
                  </div>
                  <!--------------------------------------查看的模糊框------------------------>  
              <form class="form-horizontal" action="replyPost.action">   <!--保证样式水平不混乱-->   
                <!-- 模态框（Modal） -->
                <div class="modal fade" id="createAnswer" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                  <div class="modal-dialog">
                    <div class="modal-content">
                      <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                          &times;
                        </button>
                        <h4 class="modal-title" id="myModalLabel">
                          添加答案
                        </h4>
                      </div>
                      <div class="modal-body">

    
		
                        <!---------------------表单-------------------->
                        <div class="form-group">
                          <div class="contain">

							<div><input name="poId" value="<s:property value="#posting.poId"/>" style="display:none"></div>
                            <div class="col-md-12">

                              <br/>
                              <textarea class="form-control" name="content" rows="10" placeholder="正文" aria-describedby="basic-addon1"></textarea>

                            </div>
                          </div>
                        </div>
                        <!---------------------表单尾-------------------->
                      </div>
                      <div class="modal-footer">
                        <button type="submit" class="btn btn-default">提交
                        </button>
                      </div>
                    </div><!-- /.modal-content -->
                  </div><!-- /.modal -->
                </div>
              </form>
             
                  </s:iterator>
                </div>
                
              </div>
              
              <div>
                <input id="commentButton" type="button" value="提问" class="btn btn-info btn logcommentButton" data-toggle="modal" data-target="#createPosting">
              </div>

              <!--------------------------------------查看的模糊框------------------------>  
              <form class="form-horizontal" action="addPost.action">   <!--保证样式水平不混乱-->   
                <!-- 模态框（Modal） -->
                <div class="modal fade" id="createPosting" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                  <div class="modal-dialog">
                    <div class="modal-content">
                      <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                          &times;
                        </button>
                        <h4 class="modal-title" id="myModalLabel">
                          添加问题
                        </h4>
                      </div>
                      <div class="modal-body">

                        <!---------------------表单-------------------->
                        <div class="form-group">
                          <div class="contain">

                            <div class="col-md-12">
                              <span class="input-group-addon" id="basic-addon1">填写标题</span>
                              <input type="text" name="title" class="form-control" placeholder="title" aria-describedby="basic-addon1">
                            </div>

                            <div class="col-md-12">

                              <br/>
                              <textarea class="form-control" name="content" rows="10" placeholder="正文" aria-describedby="basic-addon1"></textarea>

                            </div>
                          </div>
                        </div>
                        <!---------------------表单尾-------------------->
                      </div>
                      <div class="modal-footer">
                        <button type="submit">提交
                        </button>
                      </div>
                    </div><!-- /.modal-content -->
                  </div><!-- /.modal -->
                </div>
              </form>
              



         
</body>
</html>