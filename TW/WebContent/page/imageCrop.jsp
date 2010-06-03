<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<link href="<%=request.getContextPath()%>/css/imgareaselect-default.css" type="text/css"
	media="screen" rel="stylesheet" />
	
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.4.2.min.js"></script>
	
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.imgareaselect.min.js"></script>
	
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/image.js"></script>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Image Test</title>
</head>
<body>

<s:form action="CropAction.do?imageValue=%{imageValue}" theme="simple"> 
<div id="preview" style="width: 238px; height: 150px; overflow: hidden; float:left;">
    <img src="<s:property value="imageValue"/>" />
</div>
<div style="float:left;">
<img id="myimg" src="<s:property value="imageValue"/>"/>
</div>
<input type="hidden" id="x1" name="x1" />
<input type="hidden" id="y1" name="y1" />
<input type="hidden" id="x2" name="x2" />
<input type="hidden" id="y2" name="y2" /> 
<input type="submit" name="submit" value="Submit" /> 
</s:form>

</body>
</html>