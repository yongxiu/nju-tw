<%@ page language="java" contentType="text/html;charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link href="<%=request.getContextPath()%>/css/mail.css"
	type="text/css" media="screen" rel="stylesheet" />
<script type="text/javascript" src="js/sendmail.js"></script>
<title>发送邮件给管理员</title>
</head>
<body>
<s:form theme = "simple" cssClass="tl" id = "form_comments" action="SendMailAction.do" method="post">
<div class="inner br">
	<h3>发表您的评论 </h3>
	<table id="author_info">
	<s:actionerror/>
	<s:fielderror/>
    <tr height="30">
    	<td><s:label for="author">* 称谓</s:label></td>
    	<td><s:textfield cssClass="input inputname" name="author" id="author" tabindex="1" title="您的姓名，必填"></s:textfield></td>
    </tr>
	<tr height="30">
		<td><s:label for="mailfrom">* 电邮</s:label></td>
		<td><s:textfield cssClass="input inputemail" name="mailfrom" id="email" tabindex="2" title="您的 email, 必填， 但不会显示在网页上，您可能会收到回复通知邮件"></s:textfield></td>
	</tr>
	<tr height="30">
		<td><s:label for="subject">* 主题</s:label></td>
		<td><s:textfield cssClass="input inputurl" name="subject" id="url" tabindex="3" title="您评论的主题，必填"></s:textfield></td>
	</tr>
    <tr>
    	<td></td>
    	<td><s:textarea cssClass="input textarea" id="comment" name="content" tabindex="4"></s:textarea></td>
    </tr>
	<tr>
		<td><s:submit value="发表评论" name="submit" id="input_comments_submit" tabindex="5" cssClass="btn"></s:submit></td>
		<td><input type="button" value="取消" onclick="location.href='index.html'" tabindex="6" class="btn"></td>
	</tr>
	</table>
</div>
</s:form>
</body>
</html>