<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/ckeditor/ckeditor.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CKEditor Test(Struts2)</title>
</head>
<body>
	<s:form action="ModifyArticle.do">
<s:set name="titlem"><s:property value="article.title" escape="false"/></s:set>
<s:textfield name="title" label="文章标题" value="%{#titlem}"></s:textfield>

<s:set name="contentm"><s:property value="article.content" escape="false"/></s:set>
<s:textarea  name="content" id="content" cssClass="ckeditor" rows="16" cols="100" value="%{#contentm}"></s:textarea>
        <br>

	
<s:set name="category" value="#{'焦点新闻':{'基层动态','宣传思想'},
								'组织机构':{'书记室','内部机构','下属组织'},
								'公告信息':{'—— ——'},
								'理论园地':{'—— ——'},
								'媒体报导':{'—— ——'}}"/>
		
		<s:doubleselect name="category1" list="#category.keySet()" doubleName="category2" doubleList="#category[top]" label="文章类型"/>
		<s:submit label="发布文章"></s:submit>
       
</s:form>
	
</body>
</html>