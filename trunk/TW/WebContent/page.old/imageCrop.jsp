<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

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

<s:form action="CropAction.do?imageValue=%{imageValue}" theme="simple"> 
<div id="preview" style="float: left; margin: 0pt 40px 0pt 0pt;">
	<h3>图片预览：</h3>
	<div id="privew_div" style="width: 238px; height: 150px; overflow: hidden; float:left;border:1px solid #000000;">
    <img src="<s:property value="imageValue"/>" />
    </div>
</div>
<div style="float: left; padding-left: 40px; border-left: 1px solid rgb(187, 187, 187);">
	<h3>图片剪切</h3>
	<div style="float:left;border:1px solid #BBBBBB;padding:2px;margin-bottom:30px;">
	<img id="myimg" src="<s:property value="imageValue"/>"/>
	</div>
	<br/>
	<input type="submit" name="submit" value="完成" style="float:left" class="btn"/> 
</div>
<input type="hidden" id="x1" name="x1" />
<input type="hidden" id="y1" name="y1" />
<input type="hidden" id="x2" name="x2" />
<input type="hidden" id="y2" name="y2" /> 
</s:form>

</body>
</html>