<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/topic.css" type="text/css"
	media="screen" rel="stylesheet" />

<div id="topic">
<a href="<s:url action="TopicChange.do"> <s:param name="topicid" value="1"/></s:url>" id="a1">
	<img src="<s:property value="img1"/>" />
	进入专题活动一
</a>
</div>

<div id="topic">
<a href="<s:url action="TopicChange.do"> <s:param name="topicid" value="2"/></s:url>" id="a2">
	<img src="<s:property value="img2"/>" />
	进入专题活动二
</a>
</div>

<div id="topic">
<a href="<s:url action="TopicChange.do"> <s:param name="topicid" value="3"/></s:url>" id="a3">
	<img src="<s:property value="img3"/>" />
	进入专题活动三
</a>
</div>
