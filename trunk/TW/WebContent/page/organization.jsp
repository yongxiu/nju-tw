<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Organization</title>
</head>
<body>
	<table>
		<tr>
			<td>书记室</td>
		</tr>
		
		<s:iterator value="org1">
			<tr>
				<td>
					<s:property value="department"/>
				</td>
			</tr>
		</s:iterator>
		
	</table>
	<br>
	
	<table>
		<tr>
			<td>内部结构</td>
		</tr>
		
		<s:iterator value="org2">
			<tr>
				<td>
					<s:property value="department"/>
				</td>
			</tr>
		</s:iterator>
		
	</table>
	<br>
	
	<table>
		<tr>
			<td>下属组织</td>
		</tr>
		
		<s:iterator value="org3">
			<tr>
				<td>
					<s:property value="department"/>
				</td>
			</tr>
		</s:iterator>
		
	</table>
</body>
</html>