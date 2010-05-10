<%@ page language="java" contentType="text/html;charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>发送邮件给管理员</title>
<link type="text/css" rel="stylesheet" href="css/mail.css" />
<script type="text/javascript" src="js/sendmail.js"></script>
</head>
<body>
<center><s:form cssClass="tl" id = "form_comments" action="SendMailAction.do" method="post">
<div class="inner br">
	<h3>发表您的评论 </h3>
	<div id="author_info">
		<p title="您的大名，必填"><s:textfield cssClass="input inputname" value="" name="author" id="author" tabindex="1"></s:textfield> <s:label for="author">称谓 *</s:label></p>
		<p title="您的 email, 必填， 但不会显示在网页上，您可能会收到回复通知邮件"><s:textfield cssClass="input inputemail" value="" name="mailfrom" id="email" tabindex="2"></s:textfield> <s:label for="mailfrom">电邮 *</s:label></p>
		<p title="您评论的主题，必填"><s:textfield cssClass="input inputurl" value="" name="subject" id="url" tabindex="3"></s:textfield> <s:label for="subject">主题 *</s:label></p>
	</div>
		<p><s:textarea cssClass="input textarea" id="comment" name="content" tabindex="4"></s:textarea></p>
		<p><s:submit value="发表评论" name="submit" id="input_comments_submit" tabindex="5"></s:submit> </p>
</div>
<!--  
	<table>
		<tr>
			<td colspan="2">给管理人员发送邮件</td>
		</tr>

		<tr>
			<td colspan="2"><s:label>您的邮箱:</s:label><s:textfield name="mailfrom"
				id = "input" size="75"></s:textfield></td>
		</tr>
		<tr>
			<td colspan="2"><s:label>主题: </s:label><s:textfield name="subject" size="75"
				value=""></s:textfield></td>
		</tr>
		<tr>
			<td colspan="2"><s:label>內容: </s:label><s:textarea name="content" cols="60" rows="30" value=""></s:textarea></td>
		</tr>
		<tr>
			<td colspan="2"><s:submit value="发送"></s:submit></td>
		</tr>
	</table>
-->
</s:form></center>
</body>
</html>