<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<br>
<br>
<br>
<br>
<table>
  <tr>
    <td></td>
    <td><s:property value="article.title" /> </td>
  </tr>
  <tr>
    <td></td>
    <td> <s:set name="contentd" value="article.content"/>
	<s:property value="#contentd" escape="false"/>
   
     </td>
    
  </tr>
</table>
