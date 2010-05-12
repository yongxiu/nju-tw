
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

	<s:form action="ChangePassword.do">
		<s:actionmessage name="message"/>
		<s:password name="oldPassword" label="原始密码"></s:password>
		<s:password name="newPassword" label="新密码"></s:password>
		<s:password name="newPasswordConfirmed" label="新密码确认"></s:password>
		<s:submit></s:submit>
	</s:form>
<s:form action="ChangePSWAction.do">
	<table align="center" cellpadding="1" cellspacing="1" class="form">

		<tr>
			<td><s:textfield name="oldpassword" label="输入原密码" size="10"
				labelposition="left"></s:textfield>
			</td>
			
		</tr>
		<tr>
			<td ><s:password name="newpassword" label="输入新密码" size="11"
				labelposition="left"></s:password>
			</td>
		
		</tr>
		<tr>
			<td ><s:password name="newpassword" label="再次输入新密码" size="11"
				labelposition="left"></s:password>
			</td>
		
		</tr>
		<tr>
			<td>
			<s:submit value="确定"></s:submit>
			</td>
		</tr>
	</table>

</s:form>


