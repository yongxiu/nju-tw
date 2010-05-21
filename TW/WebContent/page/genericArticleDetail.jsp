<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<table class="articleTable">
  <tr>
    <td></td>
    <td class="articleTitle"><s:property value="article.title" /> </td>
  </tr>
  <tr>
    <td></td>
    <td class="articleContent"> <s:set name="contentd" value="article.content"/>
	<s:property value="#contentd" escape="false"/>
   
     </td>
    
  </tr>
</table>
