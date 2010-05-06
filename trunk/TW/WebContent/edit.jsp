<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/ckeditor/ckeditor.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CKEditor Test(Struts2)</title>
</head>
<body>
<s:textarea name="content" id="content" cssClass="ckeditor" rows="16" cols="100"></s:textarea>

</body>
</html>