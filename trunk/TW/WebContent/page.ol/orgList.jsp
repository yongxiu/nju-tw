<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<table class="o_l_Table" cellpadding=0 cellspacing=0>
		<tr>
			<td style="text-align:left;font-size:25px;font-weight:bold;">组织结构介绍</td>
			<td style="text-align:right;font-size:20px;"><s:property value="org.department" escape="false"/></td>
		</tr>		
		<tr>
			<td colspan="2"><hr style="margin:10px 0 10px 0;"/></td>
		</tr>
		<tr>
			<td colspan="2"><s:property value="org.content" escape="false"/><br/></td>
		</tr>
	</table>
