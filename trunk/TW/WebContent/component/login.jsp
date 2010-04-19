<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:form action="LoginAction.do">
	<table align="center" cellpadding="1" cellspacing="1" class="form">
		<tr>
			<td><s:textfield name="username" label="用户名" size="10"
				labelposition="left"></s:textfield></td>
		</tr>
		<tr>
			<td ><s:password name="password" label="密    码" size="11"
				labelposition="left"></s:password></td>
		</tr>
		<tr>
			<td>
			<button type="submit" class="positive" name="Submit">Login</button>
			</td>
		</tr>
	</table>

</s:form>

