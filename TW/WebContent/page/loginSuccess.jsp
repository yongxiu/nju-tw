<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!-- super admin -->
<s:if test="role==1">
	<table>
  <tr>
   	<td> 欢迎您： <s:property value="name"/> </td>
  </tr>
  
  <tr>
  <td>
  	您可以执行：
  	 </td>
  </tr>
  <tr>
    <td>
    	<a href="#">
    		管理用户
    	</a>
    </td>
    <td>
    	<a href="edit.jsp">
    		发表文章
    	</a>
    </td>
  </tr>
</table>

</s:if>

<!-- sydic -->
<s:if test="role==2">
	<table>
  <tr>
   	<td> 欢迎您： <s:property value="name"/> </td>
  </tr>
  
  <tr>
  <td>
  	您可以执行：
  	 </td>
  </tr>
  <tr>
    <td>
    	<a href="#">
    		审核文章
    	</a>
    </td>
   
  </tr>
</table>

</s:if>

<!-- user -->
<s:if test="role==3">
	<table>
  <tr>
   	<td> 欢迎您： <s:property value="name"/> </td>
  </tr>
  
  <tr>
  <td>
  	您可以执行：
  	 </td>
  </tr>
  <tr>
   
    <td>
    	<a href="edit.jsp">
    		发表文章
    	</a>
    </td>
  </tr>
</table>

</s:if>



