<%@ page language="java" contentType="text/html;charset=utf-8"
         pageEncoding="utf-8"%>

<!DOCTYPE html>

<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Note Page 中文标题测试</title>

</head>
<body>
<h2>Hello World!</h2>
<form method="post" action="http://mmall.zhaoxitong.net/user/login.do">
    用户名：<input type="text" name="username" id="username""/>
    密码：<input type="password" name="password" id="password"/>
    <input type="submit" value="登录"/>
</form>

<p>测试中文测试</p>
springmvc upload file
<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file" />
    <input type="submit" value="upload" />
</form>

rich text upload file
<form name="form1" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file" />
    <input type="submit" value="upload" />
</form>

</body>
</html>
