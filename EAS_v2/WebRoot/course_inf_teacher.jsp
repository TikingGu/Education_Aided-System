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
            <li role="presentation"><a href="#upload" aria-controls="upload" role="tab" data-toggle="tab">Upload</a></li>
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
                      <a href="#nowhere" id="5695" class="collpaseComment"><span class="glyphicon glyphicon-resize-small pull-right"></span></a>
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
                        <div class="listAnswersDiv" style="margin-left:100px" cid="1824">
                          <span style="font-weight:bold">2 个答案</span> 
                          <hr>
                          <br>
                          <span style="font-size:1.5em" class="glyphicon glyphicon-user"></span>
                          <span>天衣 </span>
                          <span class="smallword pull-right text-muted">答案时间：2017-07-28</span>
                          <div class="answerOfComment" style="padding:10px; margin-top:20px;background-color:#F5F5F5">多了一个框框</div>
                          <br>
                          <span style="font-size:1.5em" class="glyphicon glyphicon-user"></span>
                          <span>how2j </span>
                          <span class="smallword pull-right text-muted">答案时间：2017-05-12</span>
                          <div class="answerOfComment" style="padding:10px; margin-top:20px;background-color:#F5F5F5">我看得出~~~  -。-
                          </div>
                        </div>
                        <button type="button" class="btn btn-info btn-xs" data-toggle="modal" data-target="#createAnswer" onclick="createAnswer()" >添加答案</button>       

                      </div>
                      <br>
                      <br>
                      
                      <hr style="width:100%" align="left">
                    </div>
                  </div>
                </div>
              </div>
              
              <div>
                <input id="commentButton" type="button" value="提问" class="btn btn-info btn logcommentButton" data-toggle="modal" data-target="#createPosting">
              </div>

              <!--------------------------------------查看的模糊框------------------------>  
              <form class="form-horizontal">   <!--保证样式水平不混乱-->   
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
              <!--------------------------------------查看的模糊框------------------------>  
              <form class="form-horizontal">   <!--保证样式水平不混乱-->   
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
                  <button type="button" class="btn btn-info btn-lg"data-toggle="modal" data-target="#beginSign" >按钮</button>
                </div>
              </div>
            </div>
            
            <!--------------------------------------查看的模糊框------------------------>  
            <form class="form-horizontal">   <!--保证样式水平不混乱-->   
              <!-- 模态框（Modal） -->
              <div class="modal fade" id="beginSign" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                  <div class="modal-content">
                    <div class="modal-header">
                      <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                      </button>
                      <h4 class="modal-title" id="myModalLabel">
                        开始点名
                      </h4>
                    </div>
                    <div class="modal-body">

                      <!---------------------表单-------------------->
                      <div class="form-group">
                        <div class="contain">

                          <div class="col-md-12">
                            <span class="input-group-addon" id="basic-addon1">输入验证码</span>
                            <input type="text" class="form-control" placeholder="title" aria-describedby="basic-addon1">
                          </div>


                        </div>


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
            
          </div>

          <div role="tabpanel" class="tab-pane" id="download">
            <div class="container" style="width: inherit;">
              <div class="row clearfix">
                <div class="col-md-12 column">
                  <table id="data_list" class="table table-hover table-bordered" cellspacing="0" width="100%">
                    <thead>
                      <tr>
                        <th>
                          文件ID
                        </th>
                        <th>
                          文件名称
                        </th>
                        <th>
                          文件大小
                        </th>
                        <th>
                          操作
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
                      <button type="button" class="btn btn-info btn-xs" data-toggle="modal" data-target="#myModal" onclick="saveCourseId(<s:property value="#course.id"/>)" >下载</button>
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
                       <button type="button" class="btn btn-info btn-xs" data-toggle="modal" data-target="#BeginEvl" onclick="saveCourseId(<s:property value="#course.id"/>)" >下载</button>
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
        <div role="tabpanel" class="tab-pane" id="upload">
            <div class="container">
              <div class="row clearfix">
                <div class="col-md-12 column">
                  <form role="form">
                    <div class="form-group">
                     <label for="exampleInputEmail1">文件名字</label><input type="email" class="form-control" id="exampleInputEmail1" />
                   </div>

                   <div class="form-group">
                     <label for="exampleInputFile">File input</label><input type="file" id="exampleInputFile" />
                     <p class="help-block">
                      Example block-level help text here.
                    </p>
                  </div>
                  <button type="submit" class="btn btn-default">Submit</button>
                </form>
              </div>
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