<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

	<table border="0">


<s:iterator value="articles">
 <tr>
 	<td>
 		 <a href='<s:url action="AticalDetail.do"><s:param name="id"><s:property value="id"/></s:param></s:url>'>
 		 	<s:property value="title"/> &nbsp; [ <s:property value="date"/> ]
 		 </a>
 		 
 	</td>
 	<td>
 		
 		<s:if test="category==5">
 			[来自 校外报道]
 		</s:if>
 		<s:if test="category==6">
 			[来自南大新闻网]
 		</s:if>
 		<s:if test="category==7">
 			[来自南京大学报]
 		</s:if>
 		<s:if test="category==8">
 			[来自南大青年报]
 		</s:if>
 		<s:if test="category==9">
 			[来自校园广播台]
 		</s:if>
	
 	</td>
</tr>
</s:iterator>

</table>


<br>
<!-- init -->
<div id="articleNavi"><s:set name="currentPage"><s:property value="currentPage"/></s:set>
<s:set name="category"><s:property value="category"/></s:set>
<s:iterator value="pageCount" id="page">
		<a href='<s:url action="Article.do" ><s:param name="currentPage" value="#page"/> <s:param name="category" value="#category"/></s:url>'>
			<s:property value="page"/>
		</a>
		
</s:iterator></div>
