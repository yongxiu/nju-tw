<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
  <tr>
    <td></td>
    <td><s:property value="article.title" /> </td>
  </tr>
  <tr>
    <td></td>
    <td> <s:set name="contentd" value="article.content"/>
	<s:property value="#contentd" escape="false"/>
   
     </td>
    
  </tr>
</table>
</body>
</html>