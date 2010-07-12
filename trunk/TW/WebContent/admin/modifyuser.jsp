<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<link href="<%=request.getContextPath()%>/css/modifyuser.css" type="text/css"
	media="screen" rel="stylesheet" />

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/modifyuser.js"></script>
	
<s:form theme="simple" action="ModifyUser.do">

	<s:actionmessage name="message"/>

	<s:set name="username"> <s:property value="user.username" escape="false"/> </s:set>
	
	<div class="cent">
	<s:fielderror>
		<s:param>username</s:param>
	</s:fielderror>
	
	<p title="用户的账号，必填"><label class="label" for="username">账号：</label>
	<s:textfield cssClass="input" name="username" id="username" value="%{#username}" />
	</p>

	<s:set name="name"><s:property value="user.name" escape="false"/></s:set>
	
	<p title="用户的姓名，必填"><label class="label" for="name">姓名：</label>
	<s:textfield cssClass="input" name="name" id="name" value="%{#name}"/>
	</p>
	<p><s:submit cssClass="btn" id="submit" value="保存"/><input
		type="button" value="取消" class="btn"></p>
	</div>

</s:form>