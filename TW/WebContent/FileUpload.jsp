<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<title>File Upload</title>
</head>
<body> 
    <s:form action ="FileUploadAction.do"> 
        <s:file name ="myFile" label ="Image File"/> 
        <s:textfield name ="caption" label ="Caption"/>        
        <s:submit /> 
    </s:form> 
</body> 
</html> 