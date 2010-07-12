<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- super admin -->
<s:if test="role==1">
	<table id="loginSuccessfulTable" cellpadding="0" cellspacing="0">
	<tr><td colSpan="2" style="width:100%">欢迎您：<span><s:property value="name"/></span></td></tr>
	<tr><td colSpan="2" style="width:100%">-------------------------</td></tr>
	<tr><td><a href='admin.ListUser.do'> 成员管理</a></td><td><a href='admin.BackHome.do'> 发表文章</a></td></tr>
	<tr><td><a href='admin.uploadFile.do'> 上传文件</a></td><td><a href='admin.changePSW.do'> 修改密码</a></td></tr>
	<tr><td><a href='admin.FileList.do'> 文章列表</a></td><td><a href='admin.ArticleList.do'> 文章列表</a></td></tr>
	<tr><td><a href='OrgManageListPage.do'> 组织结构</a></td><td><a href='admin.topic.do'>活动管理</a></td></tr>
	<tr><td><a href='admin.ListUser.do'>后台管理</a></td><td><a href='Logout.do'>退出</a></td></tr>
	</table>
</s:if>



<!-- user -->
<s:if test="role==2">
	
	<table id="loginSuccessfulTable" cellpadding="0" cellspacing="0">
	<tr><td colSpan="2" style="width:100%">欢迎您：<span><s:property value="name"/></span></td></tr>
	<tr><td colSpan="2" style="width:100%">-------------------------</td></tr>
	<tr><td><a href='BackHome.do'> 发表文章</a></td><td><a href='CustomerArticles.do'> 已发表文章</a></td></tr>
	<tr><td><a href='uploadFile.do'> 上传文件</a></td><td><a href='FileList.do'> 已上传文件</a></td></tr>
	<tr><td><a href='changePSW.do'> 修改密码</a></td><td><a href='Logout.do'>退出</a></td></tr>
	</table>
</s:if>



