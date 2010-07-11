<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<script type="text/javascript"
	src="<%=request.getContextPath()%>/ckeditor/ckeditor.js"></script>
	
<s:form action="OrgUpdate.do?orgid=%{orgid}">
组织机构: <input name="department" type="text" value="<s:property value='org.department'/>"/ >
<br>
<s:set name="content"><s:property value='org.content' escape="false"/></s:set>
<br>
机构介绍
<s:textarea name="content" cssClass="ckeditor" value="%{#content}"  rows="16" cols="80"></s:textarea>
<br>
<s:submit value="提交修改"></s:submit>
</s:form>
