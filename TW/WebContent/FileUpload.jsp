<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>


<title>File Upload</title>
</head>
<body> 
<div style="color:red">
    <s:fielderror />
</div>

    <s:form action ="FileUploadAction.do"> 
        <s:file name ="myFile" label ="Image File"/> 
        <s:textfield name ="caption" label ="Caption"/>        
        <s:submit /> 
    </s:form> 
</body> 
</html> 