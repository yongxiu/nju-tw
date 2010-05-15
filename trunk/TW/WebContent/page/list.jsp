<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<table>
  <tr>
    <td>
    	<s:set name="ss"><s:property value="search" escape="false"/></s:set>
    	
    	<s:textfield size="10" value="%{#ss}" name="ss" ></s:textfield>
    </td>
     
</tr>
</table>

<br>
<br>
<br>
<s:form action="DetailArticleAction">

<table>
	<s:iterator value="articles" id="article">
		<tr>
			<td>
				 <s:set name="id"> <s:property value="id"/> </s:set>
				 标题：&nbsp; <a href='<s:url action="DetailArticleAction.do" ><s:param name="id" value="#id"/></s:url>'><s:property value="title"/> </a>
			</td>
		</tr>
		<tr>
		</tr>
		<tr>
			<td>
				版块:&nbsp; <s:property value="category"/>
			</td>
		</tr>
		<tr>
			<td>
				发布日期:&nbsp;<s:property value="date"/>
			</td>
		</tr>
	</s:iterator>
</table>

</s:form>

<!-- page action -->
<s:iterator value="pageCount" id="p">
		<s:set name="pValue"><s:property value="p"/></s:set>
		<s:set name="search"><s:property value="search" escape="false"/></s:set>
		
		<s:if test="#session.currentPage==#pValue">
			[<s:property value="#pValue"/>]
		</s:if>
		<s:else>
		<a href='<s:url action="PageAction.do" ><s:param name="pp"> <s:property value="#pValue"/></s:param> <s:param name="search" value="%{#search}"> </s:param></s:url>'>
		 <s:property value="p"/> 
		</a>
		</s:else>
	
		
	
</s:iterator>


