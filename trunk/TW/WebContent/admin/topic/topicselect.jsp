<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<a href="<s:url action="TopicChange.do"> <s:param name="topicid" value="1"/></s:url>" id="a1">
		<img src="/TW/topicImage/huodong1.gif" />
	</a>
	
	<a href="<s:url action="TopicChange.do"> <s:param name="topicid" value="2"/></s:url>" id="a2">
		<img src="/TW/topicImage/huodong2.gif" />
	</a>
	
	<a href="<s:url action="TopicChange.do"> <s:param name="topicid" value="3"/></s:url>" id="a3">
		<img src="/TW/topicImage/huodong3.gif" />
	</a>
	<br>
	
		<label for="a1">进入专题活动一</label>
	
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<label for="a2">进入专题活动二</label>
	
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<label for="a3">进入专题活动三</label>
	
</body>
</html>