<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Org List</title>
</head>
<body>
	<s:property value="orgName"/>
	<br>
	<br>
	<br>
	
	<s:iterator value="orgs">
		<br>
		<s:set name="id"> <s:property value="id"/> </s:set>
		<a href="<s:url action="OrgDetail.do"><s:param name="id" value="#id"/></s:url>"> 
					
			<s:property value="department"/>
		</a>
	</s:iterator>
</body>
</html>