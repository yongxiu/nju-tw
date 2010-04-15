<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
新闻：
<br>
<br>
<br>
<s:form action="DetailArticleAction">
	<!-- list article -->
<table>
  <tr>
  	<td>
 
	 <a href='<s:url action="DetailArticleAction.do"><s:param name="id" value="1"/></s:url>'>Article 1</a>
 	</td>
  </tr>
  <tr>
    <td>
	 <a href='<s:url action="DetailArticleAction.do"><s:param name="id" value="2"/></s:url>'>Article 2</a>
 	</td>
  </tr>
  <tr>
    <td>
 <a href='<s:url action="DetailArticleAction.do"><s:param name="id" value="3"/></s:url>'>Article 3</a>
 	</td>
  </tr>
  <tr>
  	<td>.......</td>
  </tr>
</table>


</s:form>