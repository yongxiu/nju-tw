<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<table border="0">


<s:iterator value="guides" id="guide" status="st">
 <tr>
 	<td valign="top" width="300" align="left" style="<s:if test="#st.last"></s:if><s:else>border-width:0 0 1px; border-color:#DCDCDC;border-style:solid;</s:else>">
 		 <a href='<s:url action="AticalDetail.do"><s:param name="id"><s:property value="id"/></s:param></s:url>'>
 		 	<s:property value="title"/>
 		 </a>
 		 
 	</td>
 	<td width="80" align="left" style="color:rgb(148,28,0); padding-left:8px;font-size:12px;<s:if test="#st.last"></s:if><s:else>border-width:0 0 1px; border-color:#DCDCDC;border-style:solid;</s:else>"><s:property value="date"/></td>
 	
</tr>

 
 
</s:iterator>
</table>