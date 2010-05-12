<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Management</title>
</head>
<body>
	<a href="ListUser.do">查看成员</a> &nbsp;&nbsp;<a href="/TW/admin/adduser.jsp">添加成员</a>
	
	<table border="1">
		<tr>
			<td>
				id
			</td>
			<td>
				username
			</td>
			<td>
				password
			</td>
			<td>
				name
			</td>
			<td>
				role
			</td>
			<td>
				operation1
			</td>
			<td>
				operation2
			</td>
		</tr>
		<s:iterator value="users">
			<tr>
				<td>
					<s:property value="id"/>
				</td>
				<td>
					<s:property value="username"/>
				</td>
				<td>
					<s:property value="password"/>
				</td>
				<td>
					<s:property value="name"/>
				</td>
				<td>
					<s:if test="role==1">
						超级管理员
					</s:if>
					<s:else>
						普通用户
					</s:else>
					
				</td>
				<td>
				<a href='<s:url action="DeleteUser"><s:param name="id"><s:property value="id"/></s:param></s:url>'>
					delete
				</a>
				</td>
				<td>
				<a href='<s:url action="GetModifyList"><s:param name="id"><s:property value="id"/></s:param></s:url>'>
					modify
				</a>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>