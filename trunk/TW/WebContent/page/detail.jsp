<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
    <td><s:property value="article.content" /> </td>
  </tr>
</table>
