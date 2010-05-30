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
