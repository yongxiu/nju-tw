<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/articleList.css" type="text/css"
	media="screen" rel="stylesheet" />
<script type="text/javascript" src="<%=request.getContextPath()%>/js/articleList.js"></script>

<dl>
	<dt>标题</dt> <dd class="date">创建日期</dd> <dd class="category">文章类别</dd> <dd class="act">操作</dd>
<s:iterator value="articles" id="articles">
		<dt><s:property value="title"/></dt>
		<dd class="date"><s:property value="date"/></dd>
		<dd class="category"><s:property value="category"/></dd>
	
		<dd class="act"><a href="<s:url action="ShowModifyArticle.do"> <s:param name="id"><s:property value="id"/></s:param> </s:url>">修改</a></dd>

</s:iterator>

</dl>