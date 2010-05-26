<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<s:form action="ModifyUser.do">
<table>

<s:actionmessage name="message"/>

<tr>
<td>
	<s:set name="username"> <s:property value="user.username"/> </s:set>
	
	<s:textfield label="username" name="username" value="%{#username}" />
</td>

</tr>


<tr>
<td>
	<s:set name="name"><s:property value="user.name"/></s:set>
	<s:textfield label="name" name="name" value="%{#name}"/>
</td>
</tr>
	<s:submit/>
</table>
</s:form>