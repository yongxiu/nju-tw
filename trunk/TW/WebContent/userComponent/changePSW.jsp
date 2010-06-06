
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

	<s:form action="ChangePassword.do">
		<s:actionmessage name="message"/>
		<s:password name="oldPassword" label="原始密码"></s:password>
		<s:password name="newPassword" label="新密码"></s:password>
		<s:password name="newPasswordConfirmed" label="新密码确认"></s:password>
		<s:submit value="确定" cssClass = "bn"></s:submit>
	</s:form>



