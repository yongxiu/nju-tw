<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add user</title>
</head>
<body>
<s:form action="AddUser.do">
<table>

<s:actionmessage name="message"/>

<tr>
<td>
	<s:textfield label="username" name="username"/>
</td>

</tr>
<tr>
<td>
	<s:password label="password" name="password"/>
</td>

</tr>
<tr>
<td>
	<s:password label="confirm password" name="passwordConfirmed"/>
</td>
</tr>
<tr>
<td>
	<s:textfield label="name" name="name"/>
</td>
</tr>
	<s:submit/>
</table>
</s:form>
</body>
</html>