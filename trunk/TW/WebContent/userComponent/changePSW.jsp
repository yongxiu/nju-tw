<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

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


