<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<img src="<s:property value="imagePath"/>"/>
	<br>
	<a href="<s:url action="TopicManage.do"> <s:param name="topicid"><s:property value="topicid"/></s:param> <s:param name="isnew" value="0"/></s:url>">
		原有活动专题修改
	</a>
	<br>
	<br>
	<br>
	<a href="<s:url action="TopicManage.do"> <s:param name="topicid"><s:property value="topicid"/></s:param> <s:param name="isnew" value="1"/></s:url>">
		新活动专题修改
	</a>
</body>
</html>