<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<div style="color: red"><s:fielderror /></div>
<s:form action="FileUploadAction.do" method="post"
	enctype="multipart/form-data">
	<s:file name="myFile" label="File" />
	<s:submit value="提交"/>
</s:form>
