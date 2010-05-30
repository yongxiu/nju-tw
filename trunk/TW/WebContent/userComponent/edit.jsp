<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<link href="<%=request.getContextPath()%>/css/edit.css" type="text/css"
	media="screen" rel="stylesheet" />
	
<script type="text/javascript"
	src="<%=request.getContextPath()%>/ckeditor/ckeditor.js"></script>
<div class="page-title post">
<h2>
发表新文章
</h2>
</div>

<s:form theme="simple" action="SubmitArticleAction.do">
<s:textfield cssClass="input-text" name="title"></s:textfield>
<br/>

<s:textarea  name="content" id="content" cssClass="ckeditor" rows="16" cols="100"></s:textarea>

<s:set name="category" value="#{'新闻动态':{'—— ——'},
								'公告信息':{'—— ——'},
								'理论园地':{'—— ——'},
								'媒体报道':{'—— ——'},
								'校外报道':{'南大新闻网','南京大学报','南大青年报','校园广播台'}}"/>
		
<div class="doubleselect">
<label class="label">文章类型：</label>
<s:doubleselect name="category1" list="#category.keySet()" doubleName="category2" doubleList="#category[top]"/>

<s:submit value="发布文章" cssClass = "btn"></s:submit>
</div>
       
</s:form>