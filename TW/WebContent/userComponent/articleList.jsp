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
		<td>标题</td> <td>创建日期</td> <td>文章类别</td> <td>操作</td>
	</tr>
	<s:iterator value="articles" id="articles">
		<tr>
			<td><s:property value="title"/></td>
			<td><s:property value="date"/></td>
			<td><s:property value="category"/></td>
		
			<td><a href="<s:url action="ShowModifyArticle.do"> <s:param name="id"><s:property value="id"/></s:param> </s:url>">修改</a></td>
	
		</tr>
	</s:iterator>
	
	</table>
</body>
</html>