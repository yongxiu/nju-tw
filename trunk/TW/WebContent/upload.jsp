<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
    <title>My JSP 'upload.jsp' starting page</title>
  </head>
  
  <body>
  <s:fielderror/>
    <form action="upload.do" method="post" enctype="multipart/form-data">
    	标&nbsp&nbsp&nbsp&nbsp题：<input type="text" name="title"/><br>
    	上传文件：<input type="file" name="sunyangLogo"/><br>
    	<input value="上传" type="submit"/>
    </form>
  </body>
</html>
