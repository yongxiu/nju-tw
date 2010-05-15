<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<br>
<br>
<br>
<br>
<table>
  <tr>
    <td>标题：</td>
    <td><s:property value="article.title" /> </td>
  </tr>
  <tr>
    <td>内容：</td>
    <td> <c:set var="content" ><s:property value="article.content" /></c:set><s:property value="article.content" />
    <c:out value="${content}" escapeXml="false"></c:out>
     </td>
    
  </tr>
</table>
