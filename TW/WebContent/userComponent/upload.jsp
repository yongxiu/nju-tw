<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<script type="text/javascript" src="<%=request.getContextPath()%>/js/upload.js"></script>
 
<div style="color:red">
    <s:fielderror />
</div>
<s:form action ="FileUploadAction.do"  method="post" enctype ="multipart/form-data"> 
    <s:file name ="myFile" id="file"/>
    <s:textfield cssClass="filename" name="myName" id="name"></s:textfield>
    <s:submit /> 
</s:form> 