<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<table border="0">


<s:iterator value="infos">
 <tr>
 	<td>
 		 <a href='<s:url action="AticalDetail.do"><s:param name="id"><s:property value="id"/></s:param></s:url>'>
 		 	<s:property value="title"/> &nbsp; [ <s:property value="date"/> ]
 		 </a>
 		 
 	</td>
</tr>


 
 
</s:iterator>
</table>