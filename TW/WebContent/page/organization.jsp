<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>    

	<table>
		<tr>
			<td>书记室</td>
		</tr>
		
		<s:iterator value="org1" id="org">
			<tr>
				<td>
					
					<s:set name="id"> <s:property value="id"/> </s:set>
					<s:url id="org1det" action="OrganizationDetailAction.do">
						<s:param name="id" value="#id"/>
					</s:url>
					<sx:a targets="content" href="%{org1det}" >
						<s:property value="department"/>
					</sx:a>
					
					
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
					<s:set name="id"> <s:property value="id"/> </s:set>
					<s:url id="org2det" action="OrganizationDetailAction.do">
						<s:param name="id" value="#id"/>
					</s:url>
					<sx:a targets="content" href="%{org2det}" >
						<s:property value="department"/>
					</sx:a>
					
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
					<s:set name="id"> <s:property value="id"/> </s:set>
					<s:url id="org3det" action="OrganizationDetailAction.do">
						<s:param name="id" value="#id"/>
					</s:url>
					<sx:a targets="content" href="%{org3det}" >
						<s:property value="department"/>
					</sx:a >
					
				</td>
			</tr>
		</s:iterator>
		
	</table>
