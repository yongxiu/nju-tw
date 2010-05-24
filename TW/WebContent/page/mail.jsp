<%@ page language="java" contentType="text/html;charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>



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
	<p><s:submit cssClass="btn" value="发送" name="submit"
		id="input_comments_submit" tabindex="5"></s:submit> <input
		type="button" value="取消" class="btn"></p>
	</div>
</s:form>
<div class="info">
<p>南京大学地址：南京市汉口路22号&nbsp;&nbsp;&nbsp;&nbsp; <br>
邮编：210093<br>
校长办公室电话：086-025-83593186<br>
Email：<a href="mailto:guyue@nju.edu.cn">guyue@nju.edu.cn</a><br>
办公地点：南京大学北大楼112室<br>
<br>
关于本站任何问题与建议请联络：<br>
<a href="mailto:webmaster@nju.edu.cn">webmaster@nju.edu.cn</a></p>
</div>
