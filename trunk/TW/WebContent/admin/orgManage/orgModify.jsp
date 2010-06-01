<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<s:form action="OrgUpdate.do?orgid=%{orgid}">
	组织机构: <input name="department" type="text" value="<s:property value='org.department'/>"/ >
	<br>
	<s:set name="content"><s:property value='org.content' escape="false"/></s:set>
	<br>
	机构介绍
	<s:textarea name="content" value="%{#content}"  rows="16" cols="100"></s:textarea>
	<br>
	<s:submit value="提交修改"></s:submit>
	</s:form>

</body>
</html>