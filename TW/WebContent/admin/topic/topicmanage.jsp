<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	
	<s:form action="TopicDecision.do?topicid=%{topicid}">
		
		<s:submit></s:submit>
		<br>
		<br>
		<table>
		<tr>
		<th></th>
		<th>标题</th><th>文章类型</th><th>时间</th></tr>
		<s:iterator value="articles" id="article">
		<tr>
		
			<td>
			<input  class="check1" type = "checkbox" name="checkId" value="<s:property value="id"/>"
				<s:set name="ifchecked"> <s:property value="#article.checked"/> </s:set>
				<s:if test="#ifchecked==1">
				checked
				</s:if>
			
			/>
		
		
			</td>
			<td>
			<s:property value="title"/>
	
			</td>
			<td>
			<s:property value="category"/>
			</td>
			<td>
			<s:property value="date"/>
			</td>
		</tr>
		</s:iterator>
		</table>
	</s:form>
</body>
</html>