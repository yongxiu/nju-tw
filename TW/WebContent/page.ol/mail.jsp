<%@ page language="java" contentType="text/html;charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>


<link href="<%=request.getContextPath()%>/css/mail.css" type="text/css"
	media="screen" rel="stylesheet" />

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/sendmail.js"></script>


<s:form theme="simple" cssClass="tl" id="form_comments"
	action="SendMailAction.do">

	<div class="inner br">
	<h3>联系我们</h3>

	<div id="author_info"><s:fielderror>
		<s:param>author</s:param>
	</s:fielderror>
	<p title="您的姓名，必填"><label class="label" for="author">称谓：</label><s:textfield
		cssClass="input inputname" name="author" id="author" tabindex="1"></s:textfield><label
		class="star" for="author">*</label></p>
	<s:fielderror>
		<s:param>mailfrom</s:param>
	</s:fielderror>
	<p title="您的 email, 必填， 但不会显示在网页上，您可能会收到回复通知邮件"><label
		class="label" for="mailfrom">电邮：</label><s:textfield
		cssClass="input inputemail" value="" name="mailfrom" id="mailfrom"
		tabindex="2"></s:textfield><label class="star" for="mailfrom">*</label></p>
	<s:fielderror>
		<s:param>subject</s:param>
	</s:fielderror>
	<p title="您评论的主题，必填"><label class="label" for="subject">主题：</label><s:textfield
		cssClass="input inputurl" name="subject" id="subject" tabindex="3"></s:textfield><label
		class="star" for="subject">*</label></p>
	</div>

	<p><label class="label" for="comment">内容：</label><s:textarea
		cssClass="input textarea" id="comment" name="comment" tabindex="4"></s:textarea></p>
	<s:fielderror>
		<s:param>comment</s:param>
	</s:fielderror>
	<p><sx:submit targets="content" cssClass="btn" value="发送" name="submit" id="input_comments_submit" tabindex="5"></sx:submit>
       	<input
		type="button" value="取消" class="btn"></p>
	</div>
</s:form>
<div class="info">
<p>办公地址地址：南京大学鼓楼校区南园&nbsp;&nbsp;&nbsp;&nbsp; <br>
邮编：210093<br>
办公室电话：086-025-83593142<br>
Email：<span>tuanwei.nju@gmail.com</span><br>

</div>
