<%@ page language="java" contentType="text/html;charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link href="<%=request.getContextPath()%>/css/mail.css"
	type="text/css" media="screen" rel="stylesheet" />
<title>发送邮件给管理员</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/sendmail.js"></script>
</head>
<body>
<s:form theme = "simple" cssClass="tl" id = "form_comments" action="SendMailAction.do" method="post">
	<div class="inner br">
		<h3>发表您的评论 </h3>

		<div id="author_info">
			<s:fielderror><s:param>author</s:param></s:fielderror>
			<p title="您的姓名，必填"><s:textfield cssClass="input inputname" name="author" id="author" tabindex="1"></s:textfield><label class="label" for="author">称谓 *</label></p>
			<s:fielderror><s:param>mailfrom</s:param></s:fielderror>
			<p title="您的 email, 必填， 但不会显示在网页上，您可能会收到回复通知邮件"><s:textfield cssClass="input inputemail" value="" name="mailfrom" id="mailfrom" tabindex="2"></s:textfield><label class="label" for="mailfrom">电邮 *</label></p>
			<s:fielderror><s:param>subject</s:param></s:fielderror>
			<p title="您评论的主题，必填"><s:textfield cssClass="input inputurl" name="subject" id="subject" tabindex="3"></s:textfield><label class="label" for="subject">主题 *</label></p>
		</div>
	
		<p><s:textarea cssClass="input textarea" id="comment" name="comment" tabindex="4"></s:textarea></p>
		<s:fielderror><s:param>comment</s:param></s:fielderror>
		<p><s:submit cssClass="btn" value="发表评论" name="submit" id="input_comments_submit" tabindex="5"></s:submit>
       	<input type="button" value="取消" class="btn"></p>
	</div>
</s:form>
</body>
</html>