<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
  
<a href="Home.do">首页</a>组织机构
	<table id="organizationTable1" class="organizationTable">
		<tr>
			<td class="organizationTitle">书记室</td>
		</tr>
		
		<s:iterator value="org1" id="org">
			<tr>
				<td>
					
					<s:set name="id"> <s:property value="id"/> </s:set>
					<s:url id="org1det" action="OrgDetail.do">
						<s:param name="id" value="#id"/>
					</s:url>
					<s:a  href="%{org1det}" >
						<s:property value="department"/>
					</s:a>
					
					
				</td>
			</tr>
		</s:iterator>
		
	</table>

	
	<table id="organizationTable2" class="organizationTable">
		<tr>
			<td class="organizationTitle">内部结构</td>
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

	<table id="organizationTable3" class="organizationTable">
		<tr>
			<td class="organizationTitle">下属组织</td>
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
