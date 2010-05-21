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
<div class="map"><img alt="" src="/TW/img/map.jpg">
<a
	href="http://ditu.google.cn/maps?f=q&source=s_q&hl=zh-CN&geocode=&q=%E5%8D%97%E4%BA%AC%E5%A4%A7%E5%AD%A6+%E5%8C%97%E5%A4%A7%E6%A5%BC&sll=32.056973,118.772764&sspn=0.041755,0.090551&brcurrent=3,0x35b58cbd6f026b19:0x99078ba991015b05,0,0x35b58b4255794bc9:0x54f67b57d0a85240%3B5,0,0&ie=UTF8&hq=%E5%8C%97%E5%A4%A7%E6%A5%BC&hnear=%E6%B1%9F%E8%8B%8F%E7%9C%81%E5%8D%97%E4%BA%AC%E5%B8%82%E9%BC%93%E6%A5%BC%E5%8C%BA%E6%B1%89%E5%8F%A3%E8%B7%AF%E5%8D%97%E4%BA%AC%E5%A4%A7%E5%AD%A6&ll=32.057263,118.778214&spn=0.019968,0.045276&z=15">在谷歌地图中打开</a>
</div>
