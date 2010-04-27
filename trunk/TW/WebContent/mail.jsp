<%@ page language="java" contentType="text/html;charset=utf-8"
	pageEncoding="utf-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>发送邮件给管理员</title>
<link type="text/css" rel="stylesheet" href="css/mail.css" />
<script type="text/javascript" src="js/sendmail.js"></script>
</head>
<body>
<center>
<form action="SendMail" method="post">
<div id="wrapper">
<div class="header">给管理人员发送邮件<a href="" class="return"><img src="img/return.png" style="border:none" /></a></div>

<div class="tr">
<div>您的邮箱：</div>
<div><input type="text" name="mailfrom" size="40"
	class="reqd email in" /></div>
</div>
<div class="tr">
<div>主题：</div>
<div><input type="text" name="subject" size="40" class="reqd in" />
</div>
</div>
<div class="tr">
<div>內容：</div>
<div><textarea name="content" cols="35" rows="10" id="content"
	class="reqd in"></textarea></div>
</div>
<div class="tr">
<div><input type="submit" class="subbutton" value="发送" /></div>
</div>
</div>
</form>
</center>
</body>
</html>