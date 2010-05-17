<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/ckeditor/ckeditor.js"></script>

<s:form action="SubmitArticleAction.do">
<s:textfield name="title" label="文章标题"></s:textfield>
<s:textarea  name="content" id="content" cssClass="ckeditor" rows="16" cols="100"></s:textarea>
        <br>

	
<s:set name="category" value="#{'焦点新闻':{'基层动态','宣传思想'},
								'组织机构':{'书记室','内部机构','下属组织'},
								'test1':{'test1.1','test1.2'}}"/>
		
		<s:doubleselect name="category1" list="#category.keySet()" doubleName="category2" doubleList="#category[top]" label="文章类型"/>
		<s:submit label="发布文章"></s:submit>
       
</s:form>