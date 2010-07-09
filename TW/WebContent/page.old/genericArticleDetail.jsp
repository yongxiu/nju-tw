<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<table class="g_a_Table">
  <tr>
    <td class="g_a_Title"><s:property value="article.title" /></td>
  </tr>
  <tr>
    <td> <s:set name="contentd" value="article.content"/>
	<s:property value="#contentd" escape="false"/><br/></td></tr>
</table>
