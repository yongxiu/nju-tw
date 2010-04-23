<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
    <title>上传成功</title>
  </head>
  <body>
  上传成功<br>
  标题：<s:property value="title"/>
  文件：<img src="<s:property value="sunyangLogoFileName"/>">
  </body>
</html>
