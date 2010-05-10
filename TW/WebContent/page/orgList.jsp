<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Org Detail</title>
</head>
<body >
	<table border="1">
		<tr>
			<td>
				<h1>组织结构介绍</h1>
			</td>
		</tr>
		<tr>
			<td>
				<s:property value="org.department"/>
				<br>
				
			</td>
		</tr>
		<tr>
			<td>
				<s:property value="org.content"/>
			</td>
		</tr>
	</table>
</body>
</html>