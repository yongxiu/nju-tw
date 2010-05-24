<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- super admin -->
<s:if test="role==1">
	<table>
		<tr>
			<td>欢迎您： <s:property value="name" /></td>
		</tr>

		<tr>
			<td>您可以执行：</td>
		</tr>
		<tr>
			<td><a href='admin.ListUser.do'> 成员管理</a></td>
			<td><a href='admin.BackHome.do'> 发文章</a></td>
		</tr>
		<tr>
			<td><a href='admin.uploadFile.do'> 上传文件</a></td>
			<td><a href='admin.changePSW.do'> 修改密码</a></td>
		</tr>
		<tr>
			<td><a href='admin.FileList.do'> 已上传文件</a></td>
			<td><a href='admin.ArticleList.do'> 已发表文章</a></td>
		</tr>
		<tr>
			<td><a href='#'>主题活动管理</a></td>
			<td><a href='#'>退出</a></td>
		</tr>
	</table>

</s:if>



<!-- user -->
<s:if test="role==2">
	<table>
		<tr>
			<td>欢迎您： <s:property value="name" /></td>
		</tr>

		<tr>
			<td>您可以执行：</td>
		</tr>
		<tr>

			<td><a href='BackHome.do'> 发文章</a></td>
			<td><a href='ArticleList.do'> 已发表文章</a></td>
		</tr>
		<tr>
			<td><a href='uploadFile.do'> 上传文件</a></td>
			<td><a href='FileList.do'> 已上传文件</a></td>
		</tr>
		<tr>
			<td><a href='changePSW.do'> 修改密码</a></td>
			<td><a href='#'>退出</a></td>
		</tr>
	</table>

</s:if>



