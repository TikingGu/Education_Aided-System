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
  </head>
  <div class="container">
    <div class="row clearfix">
      <div class="col-md-12 column">
        <div class="bs-example bs-example-tabs" data-example-id="togglable-tabs">
          <!-- Nav tabs -->
          <ul class="nav nav-tabs" role="tablist">
            <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">Home</a></li>
            <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">Profile</a></li>
            <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab">Messages<span class="badge">14</span></a></li>
            <li role="presentation"><a href="#download" aria-controls="download" role="tab" data-toggle="tab">Download</a></li>
          </ul>
          <!-- Tab panes -->
          <div class="tab-content">
            <div role="tabpanel" class="tab-pane active" id="home">
              <div class="col-md-12 column">
                <h2>
                  Heading
                </h2>
                <p>
                  Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
                </p>
                <p>
                  <a class="btn" href="#">View details »</a>
                </p>
                <div class="progress">
                    <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                      60%
                    </div>
                  </div> 
                <p>
                  <em>Git</em> 是一个分布式的版本控制系统，最初由 <strong>Linus Torvalds</strong> 编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在 <small>Ruby</small> 社区中。
                </p>
                <blockquote>
                  <p>
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.
                  </p> <small>Someone famous <cite>Source Title</cite></small>
                </blockquote>
                <dl>
                  <dt>
                    Description lists
                  </dt>
                  <dd>
                    A description list is perfect for defining terms.
                  </dd>
                  <dt>
                    Euismod
                  </dt>
                  <dd>
                    Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.
                  </dd>
                  <dd>
                    Donec id elit non mi porta gravida at eget metus.
                  </dd>
                  <dt>
                    Malesuada porta
                  </dt>
                  <dd>
                    Etiam porta sem malesuada magna mollis euismod.
                  </dd>
                  <dt>
                    Felis euismod semper eget lacinia
                  </dt>
                  <dd>
                    Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.
                  </dd>
                </dl>
                <ul class="breadcrumb">
                  <li>
                    <a href="#">Home</a>
                  </li>
                  <li>
                    <a href="#">Library</a>
                  </li>
                  <li class="active">
                    Data
                  </li>
                </ul>
                <ul>
                  <li>
                    Lorem ipsum dolor sit amet
                  </li>
                  <li>
                    Consectetur adipiscing elit
                  </li>
                  <li>
                    Integer molestie lorem at massa
                  </li>
                  <li>
                    Facilisis in pretium nisl aliquet
                  </li>
                  <li>
                    Nulla volutpat aliquam velit
                  </li>
                  <li>
                    Faucibus porta lacus fringilla vel
                  </li>
                  <li>
                    Aenean sit amet erat nunc
                  </li>
                  <li>
                    Eget porttitor lorem
                  </li>
                </ul>
                <button type="button" class="btn btn-default">返回后台页面</button>
              </div>
            </div>
            <div role="tabpanel" class="tab-pane" id="messages">
              <div class="col-xs-12 col-md-12 bootstrap-admin-col-left">
                <ul class="nav navbar-collapse collapse bootstrap-admin-navbar-side">
                  <li class="active">
                    <a href="back_to_XXXPage.action"><i class="glyphicon glyphicon-chevron-left"></i> 问答区域</a>
                  </li>
                </ul>
              </div>
              <div class="row">
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
                      <a href="#nowhere" cid="5695" class="collpaseComment"><span class="glyphicon glyphicon-resize-small pull-right"></span></a>
                    </div>
                    <div class="panel-body commentBody " cid="5695" style=" ">
                      <table width="100%" hight="100px" class="eachCommentTable">
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
                      <div style="margin-left:100px">
                        <br>
                        <input cid="5695" type="button" class="pull-left btn btn-success btn-xs addAnswerButton" value="添加答案">
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
              </div>
              <div class="row">
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
              <div>
                <input id="commentButton" type="button" value="提问" class="btn btn-info btn logcommentButton">
              </div>
            </div>
            <div role="tabpanel" class="tab-pane" id="profile">
              <div class="container">
                <div class="row clearfix">
                  <div class="col-md-12 column">
                    <div class="jumbotron">
                      <h1>
                        公告!
                      </h1>
                      <p>
                        This is a template for a simple marketing or informational website. It includes a large callout called the hero unit and three supporting pieces of content. Use it as a starting point to create something more unique.
                      </p>
                      <p>
                       <a class="btn btn-primary btn-large" href="#">Learn more</a>
                     </p>
                   </div>
                   <div class="progress">
                    <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                      60%
                    </div>
                  </div> 
                  <button type="button" class="btn btn-info btn-lg">按钮</button>
                </div>
              </div>
            </div>
            </div>
            <div role="tabpanel" class="tab-pane" id="download">...4</div>
          </div>
        </div>
      </div>
    </div>
  </div>

</body>

</html>