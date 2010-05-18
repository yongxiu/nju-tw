<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>News</title>
</head>
<body>
	<table border="0">


<s:iterator value="news">
 <tr>
 	<td>
 		 <a href='<s:url action="GenericArticleDetail.do"><s:param name="id"><s:property value="id"/></s:param></s:url>'>
 		 	<s:property value="title"/> &nbsp; [ <s:property value="date"/> ]
 		 </a>
 		 
 	</td>
</tr>


 
 
</s:iterator>
</table>
</body>
</html>