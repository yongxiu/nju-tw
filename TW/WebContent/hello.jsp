<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<%=request.getContextPath()%>/css/styles.css"
	type="text/css" media="screen" rel="stylesheet" />
<style type="text/css">
img,div {
	behavior: url(iepngfix.htc)
}
</style>

<title>Student Login</title>
</head>
<body id="login">


<a href='Home.do'> 进入南大团委首页</a>
<a href='IpcountAction.do'> 计数器</a>

<p><a href='BackHome.do'> 进入后台管理</a></p>
<p><a href='<%=request.getContextPath()%>/edit.jsp'>CKEditor Test</a></p>
<p><a href='<%=request.getContextPath()%>/mail.jsp'>发送邮件测试</a></p>
<p><a href='writeIndex.do'>建立全文索引</a></p>
</body>
</html>