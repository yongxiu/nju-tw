<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button onclick="javascript:window.location.href='/TW/admin/orgManage/orgAdd.jsp'">添加新的组织机构</button>
	<br>
	<br>
	<table border="1">
		<tr>
		<td>组织机构</td>
		<td>类别</td>
		<td>操作</td>
		<td>操作</td>
		</tr>
		
		<s:iterator value="orgs">
			<s:if test="category==1"></s:if>
			<s:else>
			<tr>
			<td>
			<s:property value="department"/>
			</td>
			<td>
				<s:if test="category==2">
					机构设置
				</s:if>
				<s:if test="category==3">
					基层团委
				</s:if>
				<s:if test="category==4">
					学生组织
				</s:if>
			</td>
			<td>
			<a href="OrgModify.do?orgid=<s:property value='id'/>">修改</a>
			</td>
			<td>
			<a href="OrgDelete.do?orgid=<s:property value='id'/>">删除</a>
			</td>
			</tr>
			</s:else>
		</s:iterator>
	</table>
</body>
</html>