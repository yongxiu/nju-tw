<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/adduser.css" type="text/css"
	media="screen" rel="stylesheet" />

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/adduser.js"></script>

<div class="cent">
<s:form theme="simple" action="AddUser.do">
<table>

<s:actionmessage name="message"/>

<tr>
<td class="tdLabel">
	<label class="label" for="username">账号：</label>
</td>
<td>
	<s:textfield label="username" name="username"/>
</td>

</tr>
<tr>
<td class="tdLabel">
	<label class="label" for="username">密码：</label>
</td>
<td>
	<s:password label="password" name="password"/>
</td>

</tr>
<tr>
<td class="tdLabel">
	<label class="label" for="username">确认密码：</label>
</td>
<td>
	<s:password label="confirm password" name="passwordConfirmed"/>
</td>
</tr>
<tr>
<td class="tdLabel">
	<label class="label" for="username">姓名：</label>
</td>
<td>
	<s:textfield label="name" name="name"/>
</td>
</tr>
<tr>
<td>
	<s:submit value="确认" id="submit" cssClass="btn"/>
</td>
<td>
	<input type="button" value="取消" class="btn">
</td>
</tr>
</table>
</s:form>
</div>