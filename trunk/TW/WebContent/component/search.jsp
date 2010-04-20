<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form id="search" action="SearchAction" theme="simple">
<table>
  <tr>
    <td><s:textfield size="12" value="输入标题关键字..." name="search" onblur="if (this.value == '') {this.value = '输入标题关键字...';}" onfocus="if (this.value == '输入标题关键字...') {this.value = '';}"></s:textfield></td>
    <td><s:submit type="image" name="search" src="/TW/img/search.gif"  ></s:submit></td> 
 
</tr>
</table>
</s:form>

