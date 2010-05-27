<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<table border="1" class="organizationDetail">
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
