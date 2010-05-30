<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<link href="<%=request.getContextPath()%>/css/imgareaselect-default.css" type="text/css"
	media="screen" rel="stylesheet" />
	
<link href="<%=request.getContextPath()%>/css/imgareaselect-deprecated.css" type="text/css"
	media="screen" rel="stylesheet" />
	
<link href="<%=request.getContextPath()%>/css/imgareaselect-animated.css" type="text/css"
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

<div style="float:left;">
<img id="myimg" src="/TW/img/test.jpg" />
</div>
<div id="preview" style="width: 476px; height: 301px; overflow: hidden; float:left;">
    <img src="/TW/img/test.jpg" style="width: 476px; height: 301px;" />
</div>


</body>
</html>