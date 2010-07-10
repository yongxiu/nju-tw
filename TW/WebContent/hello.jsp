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

<p><a href='BackHome.do'> 进入后台管理(customer)</a></p>
<p><a href='admin.BackHome.do'> 进入后台管理(admin)</a></p>
<p><a href='<%=request.getContextPath()%>/edit.jsp'>CKEditor Test</a></p>
<p><a href='<%=request.getContextPath()%>/mail.jsp'>发送邮件测试</a></p>
<p><a href='writeIndex.do'>建立全文索引</a></p>

<div style="margin-top:50px">
<ul>
	<li><a href='List.do'>1-11模板</a></li>
	<li><a href='Introduction.do'>团委简介</a></li>
	<li><a href='OfficeMap.do'>办公地图</a></li>
	<li><a href='Contact.do'>联系我们</a></li>
	<li><a href='Download.do'>文件系统&综合资料</a></li>
	-------------------------------
	<li><a href='UpdateNewsAction.do'>团学新闻</a></li>
	<li><a href='BasicStyle.do'>基层风采</a></li>
	<li><a href='Project.do'>重点工作&品牌项目</a></li>
	<li><a href='UpdateInfoAction.do'>通知公告</a></li>
	<li><a href='/TW/component/publication.jsp'>团属刊物</a></li>
	<li><a href='/TW/component/youth.jsp'>青共校、广播台</a></li>
	<li><a href='/TW/component/studentOrg.jsp'>学生组织</a></li>
</ul>
</div>
</body>
</html>