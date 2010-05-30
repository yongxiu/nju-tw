<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<table border="0">


<s:iterator value="medias" id="media">
 <tr>
 	<td>
 		 <a href='<s:url action="AticalDetail.do"><s:param name="id"><s:property value="id"/></s:param></s:url>'>
 		 	<s:property value="title"/> &nbsp; [ <s:property value="date"/> ]
 		 </a>
 		 
 	</td>
 	<td>
		【来自 
 		<s:if test="category==5">
 			校外报道
 		</s:if>
 		<s:if test="category==6">
 			南大新闻网
 		</s:if>
 		<s:if test="categoryc==7">
 			南京大学报
 		</s:if>
 		<s:if test="category==8">
 			南大青年报
 		</s:if>
 		<s:if test="category==9">
 			校园广播台
 		</s:if>
	】
 	</td>
</tr>


 
 
</s:iterator>
</table>