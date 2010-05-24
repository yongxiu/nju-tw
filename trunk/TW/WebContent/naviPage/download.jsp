<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>download</title>
</head>
<body>
<div id="downloadPage">
<s:iterator value="files" id="file">
	<a href="<s:property value="#file.path"/>">
	 	<s:property value="#file.filename"/>
	</a>
	<br>
	</s:iterator>
	</div>
</body>
</html>