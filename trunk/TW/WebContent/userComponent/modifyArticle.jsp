<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<link href="<%=request.getContextPath()%>/css/edit.css" type="text/css"
	media="screen" rel="stylesheet" />
	
<script type="text/javascript"
	src="<%=request.getContextPath()%>/ckeditor/ckeditor.js"></script>
	
<div class="page-title post">
	<h2>
	修改文章
	</h2>
</div>
<s:form action="ModifyArticle.do" theme="simple">
	<s:set name="titlem"><s:property value="article.title" escape="false"/></s:set>
	<s:textfield name="title" cssClass="input-text" value="%{#titlem}"></s:textfield>
	
	<s:set name="contentm"><s:property value="article.content" escape="false"/></s:set>
	<s:textarea  name="content" id="content" cssClass="ckeditor" rows="16" cols="100" value="%{#contentm}"></s:textarea>
	
	<s:set name="category" value="#{'焦点新闻':{'基层动态','宣传思想'},
									'组织机构':{'书记室','内部机构','下属组织'},
									'公告信息':{'—— ——'},
									'理论园地':{'—— ——'},
									'媒体报道':{'—— ——'}}"/>
	<div class="doubleselect">
		<label class="label">文章类型：</label>
		<s:doubleselect name="category1" list="#category.keySet()" doubleName="category2" doubleList="#category[top]"/>
		<s:submit value="保存文章" cssClass = "btn"></s:submit>
	</div>
</s:form>