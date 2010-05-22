<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/articleList.css" type="text/css"
	media="screen" rel="stylesheet" />

<table cellspacing="0">
<tr class="even"><td class="title">标题</td> <td class="date">创建日期</td> <td class="category">文章类别</td> <td class="act" colspan="2">操作</td></tr>
<s:iterator value="articles" id="articles" status="stat">
<tr
<s:if test="#stat.odd">class="odd"</s:if>
<s:else>class="even"</s:else>
>
		<td class="title"><s:property value="title"/></td>
		<td class="date"><s:property value="date"/></td>
		<td class="category"><s:property value="category"/></td>
	
		<td class="act"><a href="<s:url action="ShowModifyArticle.do"> <s:param name="id"><s:property value="id"/></s:param> </s:url>">√修改</a></td>
		<td class="act"><a href="<s:url action="ShowModifyArticle.do"> <s:param name="id"><s:property value="id"/></s:param> </s:url>">×删除</a></td>
</tr>
</s:iterator>
</table>