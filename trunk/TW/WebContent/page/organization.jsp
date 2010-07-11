<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
  
	<table class="o_Table" 	cellspacing=0 cellpadding=0>
		<tr>
			<td class="o_Title">书记室</td>
		</tr>
		<s:iterator value="org1" id="org"><tr><td>
					<s:set name="id"> <s:property value="id"/> </s:set>
					<s:url id="org1det" action="OrgDetail.do">
						<s:param name="id" value="#id"/>
					</s:url>
					<s:a  href="%{org1det}" >
						<s:property value="department"/>
					</s:a>
		</td></tr></s:iterator>
	</table>

	
	<table class="o_Table" cellspacing=0 cellpadding=0>
		<tr>
			<td class="o_Title">基层团委</td>
		</tr>
		
		<s:iterator value="org2">
			<tr>
				<td>
					<s:set name="id"> <s:property value="id"/> </s:set>
					<s:url id="org2det" action="OrgDetail.do">
						<s:param name="id" value="#id"/>
					</s:url>
					<s:a  href="%{org2det}" >
						<s:property value="department"/>
					</s:a>
					
				</td>
			</tr>
		</s:iterator>
		
	</table>

	<table class="o_Table" cellspacing=0 cellpadding=0>
		<tr>
			<td class="o_Title">下属组织</td>
		</tr>
		
		<s:iterator value="org3">
			<tr>
				<td>
					<s:set name="id"> <s:property value="id"/> </s:set>
					<s:url id="org3det" action="OrgDetail.do">
						<s:param name="id" value="#id"/>
					</s:url>
					<s:a  href="%{org3det}" >
						<s:property value="department"/>
					</s:a >
					
				</td>
			</tr>
		</s:iterator>
		
	</table>
