<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:form action="SearchAction">
<table>
  <tr>
    <th><s:textfield label="Search Article" name="titileSearched"></s:textfield></th>
    <th><s:submit label="Search" value="submit" name="search"></s:submit> </th>
  </tr>

</table>
</s:form>
