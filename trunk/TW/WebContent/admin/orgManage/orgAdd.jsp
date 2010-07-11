<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<script type="text/javascript"
	src="<%=request.getContextPath()%>/ckeditor/ckeditor.js"></script>
	
<s:form action="/OrgAdd.do">
	名称： <input name="department" type="text"/>
	<br/>
	
	类别：
	<select name="category">
	      <option value="1" selected="selected">工作人员</option>
	      <option value="2">组织机构</option>
	</select>
	    
	<br/>
	介绍：
	<s:textarea name="content" cssClass="ckeditor" rows="16" cols="80"></s:textarea>
	<s:submit value="提交"></s:submit>
	</s:form>