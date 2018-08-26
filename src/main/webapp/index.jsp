<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>title 标题</title>
</head>
<body>
<h2>Hello World!</h2>
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
