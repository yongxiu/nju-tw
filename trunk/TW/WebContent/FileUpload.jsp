<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>


<title>File Upload</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/upload.js"></script>
</head>
<body> 
<div style="color:red">
    <s:fielderror />
</div>
    <s:form action ="FileUploadAction.do"  method="post" enctype ="multipart/form-data"> 
        <s:file name ="myFile" id="file"/>
        <s:textfield cssClass="filename" name="myName" id="name"></s:textfield>
        <s:submit /> 
    </s:form> 
</body> 
</html> 