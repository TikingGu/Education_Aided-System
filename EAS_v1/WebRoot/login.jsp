<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登陆页面</title>
    <script src="${pageContext.request.contextPath }/js/jquery-1.8.3.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" />
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/style_grey.css" />

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath }/css/bootstrap/bootstrap.min.css " rel="stylesheet">

    <!-- Custom styles for this template -->
    <%--<link href="${pageContext.request.contextPath }/css/signin.css" rel="stylesheet">
--%>
    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
    <style>
        input[type=text] {
            width: 80%;
            height: 25px;
            font-size: 12pt;
            font-weight: bold;
            margin-left: 45px;
            padding: 3px;
            border-width: 0;
        }

        input[type=password] {
            width: 80%;
            height: 25px;
            font-size: 12pt;
            font-weight: bold;
            margin-left: 45px;
            padding: 3px;
            border-width: 0;
        }

        #loginform\:codeInput {
            margin-left: 1px;
            margin-top: 1px;
        }

        .va {
            margin: 0px 0 0 120px;
            height: 34px;
        }
    </style>

    <script type="text/javascript">
        if(top!=self){
            top.location = self.location;
        }

    </script>


</head>
<body>



<div id="loginBlock" class="login"
     style="margin-top: 80px; height: 320px;;">

    <div class="loginFunc">
        <div id="lbNormal" class="loginFuncMobile">登录</div>
    </div>
    <div class="loginForm" style="width:100%;text-align:center">
        <s:form  namespace="/"  action="login"  id="loginform" name="loginform"  cssClass="noceform"  >
            <s:actionerror/>
            <div id="idInputLine" class="loginFormIpt showPlaceholder"
                 style="margin-top: 5px;">
                <s:textfield id="loginform:idInput" name="username"
                             cssClass="loginFormTdIpt" maxlength="50" tabindex="1" title="请输入帐号"/>
                <label for="idPlaceholder" class="placeholder" id="idPlaceholder">帐号：</label>
            </div>
            <div class="forgetPwdLine"></div>
            <div id="pwdInputLine" class="loginFormIpt showPlaceholder">
                <s:password id="loginform:pwdInput" cssClass="loginFormTdIpt" type="password"
                            name="password" value="" tabindex="2" title="请输入密码"/>
                <label for="pwdPlaceholder" class="placeholder" id="pwdPlaceholder">密码：</label>
            </div>
            <div class="loginFormIpt loginFormIptWiotTh"
                 style="margin-top:58px;">
                <div id="codeInputLine" class="loginFormIpt showPlaceholder"
                     style="margin-left:0px;margin-top:-40px;width:90px;">
                    <input id="loginform:codeInput" class="loginFormTdIpt" type="text"
                           name="checkcode" title="请输入验证码" />
                    <div>  </div>
                    <img id="loginform:vCode" class="va" src="${pageContext.request.contextPath }/validatecode.jsp"
                         onclick="javascript:document.getElementById('loginform:vCode').src='${pageContext.request.contextPath }/validatecode.jsp?'+Math.random();" />
                </div>
                    <%--<a href="javascript:$('#loginform').submit();" id="loginform:j_id19" name="loginform:j_id19">
                        <span id="loginform:loginBtn" class="btn btn-lg btn-primary btn-block"
                                style="margin-top:-36px;">登录</span>
                    </a>--%>
                <br>
                <button id="loginform:j_id19" name="loginform:j_id19" class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            </div>
        </s:form>
    </div>
</div>
</body>
</html>