<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<table>
  <tr>
    <td></td>
    <td class="articleTableTitle"><s:property value="article.title" /> </td>
  </tr>
  <tr>
    <td></td>
    <td class="articleTableContent"> <s:set name="contentd" value="article.content"/>
	<s:property value="#contentd" escape="false"/>
   
     </td>
    
  </tr>
</table>
