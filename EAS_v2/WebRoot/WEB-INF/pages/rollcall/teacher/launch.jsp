<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">

	<title>签到</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<style>
    body {
        background: #eee;
    }
    .main {
        max-width: 970px;
        width: 100%;
        background: #fff;
        margin: 20px auto;
        padding: 20px;
    }
</style>
</head>
<body>
    <div class="main">
        <h2>发起签到</h2>
        <form id="form" action="create.action" method="post">
		  <div class="form-group">
		    <label>教师ID（登录功能做好后自动从会话取得）</label>
		    <input type="text" class="form-control" id="T_ID", name="T_ID" placeholder="T_ID" required>
		  </div>
		  <div class="form-group">
		    <label>需要签到的班级ID（可以从班级服务取得班级列表然后勾选）</label>
		    <input type="text" class="form-control" id="C_IDS", name="C_IDS" placeholder="英文逗号分割" required>
		  </div>
		  <div class="form-group">
		    <label>签到截止时间</label>
		    <input type="date-time" class="form-control" id="expired_at", name="expired_at" placeholder="yyyy-MM-dd HH:mm:ss" required>
		  </div>
		  <div class="form-group">
		    <label>签到口令暗号</label>
		    <input type="text" class="form-control" id="code", name="code" placeholder="" required>
		  </div>

		  <button type="submit" class="btn btn-primary">创建</button required>
		</form>
    </div>

    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script>
$(function () {
    // $('#form').submit(function(event) {
    //     $.ajax({
    //         url: $(this).attr('action'),
    //         type: $(this).attr('method'),
    //         dataType: 'html',
    //         data: $(this).serialize(),
    //     })
    //     .done(function(result) {
    //         console.log(result);
    //     })
    //     .fail(function() {
    //         console.log("error");
    //     })
    //     .always(function() {
    //         console.log("complete");
    //     });

    //     return false; // 阻止默认事件
    // });
});
</script>
</body>
</html>
