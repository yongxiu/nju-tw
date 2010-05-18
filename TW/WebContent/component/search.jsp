<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<s:form id="search" action="Search.do" theme="simple">
<table border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td ><s:textfield id="searchTextField" size="12" value="输入标题关键字..." name="search" onblur="if (this.value == '') {this.value = '输入标题关键字...';}" onfocus="if (this.value == '输入标题关键字...') {this.value = '';}"></s:textfield></td>
    <td ><s:submit id="searchSubmit" type="image" name="search" src="/TW/img/search2.png"  ></s:submit></td>  
</tr>
</table>
</s:form>


