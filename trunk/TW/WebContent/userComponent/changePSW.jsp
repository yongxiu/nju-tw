<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<div id="cent">
<s:form action="ChangePassword.do" theme="simple">
	<s:actionmessage name="message"/>
	<table id="pswTable">
	<tr>
		<td><label class="label" for="oldPassword">原始密码：</label></td>
		<td><s:password name="oldPassword"/></td>
	</tr>
	<tr>
		<td><label class="label" for="oldPassword">新密码：</label></td>
		<td><s:password name="newPassword"/></td>
	</tr>
	<tr>
		<td><label class="label" for="oldPassword">新密码确认：</label></td>
		<td><s:password name="newPasswordConfirmed"/></td>
	</tr>
	<tr>
		<td colspan="2"><sx:submit targets="content" id="pswConfirm" value="确定" cssClass = "bn"/></td>
	</tr>

	</table>
</s:form>
</div>


