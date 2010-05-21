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
    	<a href="/TW/edit.jsp">
    		发表文章
    	</a>
    </td>
  </tr>
</table>

</s:if>



<!-- user -->
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
    	<a href="/TW/edit.jsp">
    		发表文章
    	</a>
    	<a href="GetModifyArticle.do">
    		已发表文章
    	</a>
    	<a href="/TW/userComponent/changePSW.jsp">
    		修改密码
    	</a>
    	
    </td>
  </tr>
</table>

</s:if>



