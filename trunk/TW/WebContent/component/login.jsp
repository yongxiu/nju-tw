<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:form action="LoginAction.do">
	<table align="center" cellpadding="1" cellspacing="1" class="form">
		<tr>
			<td width="50%"><s:textfield name="username" label="UserName"
				labelposition="top"></s:textfield></td>
		</tr>
		<tr>
			<td width="50%"><s:password name="password" label="Password"
				labelposition="top"></s:password></td>
		</tr>
		<tr>
			<td>

			<button type="submit" class="positive" name="Submit">Login</button>

			</td>
			
			<td>
			
			<button type="reset" class="positive" name="Reset">Reset</button>
			
			
			</td>
		</tr>
	</table>

</s:form>
<br>
<br>
<br>
<br>
<br>
<br>
