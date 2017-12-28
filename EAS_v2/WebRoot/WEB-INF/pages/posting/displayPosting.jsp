<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
            <!-- TemplateBeginEditable name="doctitle" -->
            <title>无标题文档</title>
            <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-admin-theme.css">
            <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-admin-theme.css">
            <!-- TemplateEndEditable -->
            <!-- TemplateBeginEditable name="head" -->
            <!-- TemplateEndEditable -->
        </head>

        <body>
        	
           <div class="col-xs-12 col-md-12 bootstrap-admin-col-left">
            <ul class="nav navbar-collapse collapse bootstrap-admin-navbar-side">
                <li class="active">
                    <a href="back_to_XXXPage.action"><i class="glyphicon glyphicon-chevron-left"></i> 问答区域</a>
                </li>
            </ul>
        	</div>
            <div class="col-xs-12 col-md-12 eachCommentDiv" id="comment5695" show="true">
                    <div class="panel panel-default">
                    <div class="panel-heading">
                        <span class="smallword text-muted">
	  	2017-xx-xx
	  </span>
                        <span class="glyphicon glyphicon-question-sign"></span>
                        <span style="font-size:1.5em;font-weight:bold;">
						问题题目
					</span>
                     <span id="Po_ID";style="font-size:1.5em;font-weight:bold;">
                        问题ID
                    </span>
                        <a href="#nowhere" cid="5695" class="collpaseComment"><span class="glyphicon glyphicon-resize-small pull-right"></span></a>
                    </div>
                    <div class="panel-body commentBody " cid="5695" style=" ">
                        <table width="100%" class="eachCommentTable">
                            <tbody>
                                <tr valign="top">
                                    <td width="100px" style="padding-top:15px">
                                        <span style="font-size:1.5em" class="glyphicon glyphicon-user"></span>
                                        <span>用户名 </span>
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
                                        <div class="eachCommentDescDivIfOnly">问题详细</div>
                                        <br>
                                        <br>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                        <script>
                        $(function() {

                            $("a.showAnswerCodeLink").click(function() {
                                $(this).hide();
                                var aid = $(this).attr("aid");
                                $("div.answerCode[aid=" + aid + "]").show(0);
                            });

                        });
                        </script>
                        <br>
                        <br>
                        <br>
                        <br>
                        <div style="margin-left:100px">
                            <br>
                            <input cid="5695" type="button" class="pull-left btn btn-success btn-xs addAnswerButton" value="添加答案">
                            <a cid="5695" href="/frontloginPage" style="display:none" sid="2977" class="smallword addAnswerLoginLink">
					请先登陆
				</a>
                        </div>
                        <br>
                        <br>
                        <form method="post" id="answerForm5695" action="/frontanswer">
                            <div class="answerDiv" style="margin-left: 100px; display: none;" cid="5695">
                                <div class="text-muted">
                                    <span class="strong">答案</span> 或者
                                    <span class="strong">代码</span> 请
                                    <span class="strong">至少填写一项</span>, 如果是自己有问题，<span class="strong">请重新提问</span>，否则站长有可能看不到
                                </div>
                                <br>
                                <table width="80%" class="show1">
                                    <tbody>
                                        <tr>
                                            <td width="100px"></td>
                                            <td>
                                                <textarea style="height:200px;" id="answerdesc5695" name="answer.desc" class="form-control" placeholder=""></textarea>
                                                <br>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td></td>
                                            <td>
                                                <textarea style="height:200px;" id="answercode5695" name="answer.code" class="form-control" placeholder="粘贴正确代码 答案或者代码，请至少提供一样"></textarea>
                                                <br>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                                <div>
                                    <input type="hidden" name="answer.comment.id" value="5695">
                                    <input type="hidden" name="knowledge.id" value="495">
                                    <input cid="5695" type="submit" class="pull-left btn btn-success btn-xs" value="提交答案">
                                </div>
                            </div>
                        </form>
                        <hr style="width:100%" align="left">
                    </div>
                </div>
            </div>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <span class="smallword text-muted">
	  	2017-xx-xx
	  </span>
                    <span class="glyphicon glyphicon-question-sign"></span>
                    <span style="font-size:1.5em;font-weight:bold;">
						问题内容
						
						
					
					</span>
                    <a href="#nowhere" cid="5695" class="collpaseComment"><span class="glyphicon glyphicon-resize-small pull-right"></span></a>
                </div>
                <div class="panel-body commentBody " cid="5695" style=" ">
                    <table width="100%" class="eachCommentTable">
                        <tbody>
                            <tr valign="top">
                                <td width="100px" style="padding-top:15px">
                                    <span style="font-size:1.5em" class="glyphicon glyphicon-user"></span>
                                    <span>用户名 </span>
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
                                    <div class="eachCommentDescDivIfOnly">问题详细</div>
                                    <br>
                                    <br>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                    <script>
                    $(function() {

                        $("a.showAnswerCodeLink").click(function() {
                            $(this).hide();
                            var aid = $(this).attr("aid");
                            $("div.answerCode[aid=" + aid + "]").show(0);
                        });

                    });
                    </script>
                    <br>
                    <br>
                    <br>
                    <br>
                    <div style="margin-left:100px">
                        <br>
                        <input cid="5695" type="button" class="pull-left btn btn-success btn-xs addAnswerButton" value="添加答案">
                        <a cid="5695" href="/frontloginPage" style="display:none" sid="2977" class="smallword addAnswerLoginLink">
					请先登陆
				</a>
                    </div>
                    <br>
                    <br>
                    <form method="post" id="answerForm5695" action="/frontanswer">
                        <div class="answerDiv" style="margin-left: 100px; display: none;" cid="5695">
                            <div class="text-muted">
                                <span class="strong">答案</span> 或者
                                <span class="strong">代码</span> 请
                                <span class="strong">至少填写一项</span>, 如果是自己有问题，<span class="strong">请重新提问</span>，否则站长有可能看不到
                            </div>
                            <br>
                            <table width="80%" class="show1">
                                <tbody>
                                    <tr>
                                        <td width="100px"></td>
                                        <td>
                                            <textarea style="height:200px;" id="answerdesc5695" name="answer.desc" class="form-control" placeholder=""></textarea>
                                            <br>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                        <td>
                                            <textarea style="height:200px;" id="answercode5695" name="answer.code" class="form-control" placeholder="粘贴正确代码 答案或者代码，请至少提供一样"></textarea>
                                            <br>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                            <div>
                                <input type="hidden" name="answer.comment.id" value="5695">
                                <input type="hidden" name="knowledge.id" value="495">
                                <input cid="5695" type="submit" class="pull-left btn btn-success btn-xs" value="提交答案">
                            </div>
                        </div>
                    </form>
                    <hr style="width:100%" align="left">
                </div>
            </div>
            <input id="commentButton" type="button" value="提问" class="btn btn-info btn logcommentButton">
            </div>
        </body>

    </html>