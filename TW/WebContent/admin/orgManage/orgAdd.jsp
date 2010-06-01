<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="/OrgAdd.do">
	组织机构: <input name="department" type="text"/>
	<br>
	
	
	
	 
	<br>
	类别选择：<select name="category">
	      
	      <option value="2" selected="selected">机构设置</option>
	      <option value="3">基层团委</option>
	      <option value="4">学生组织</option>
	    
	    </select>
	    
	    </br>
	    </br>
	    机构介绍：
	<s:textarea name="content"   rows="16" cols="100"></s:textarea>
	<s:submit value="提交"></s:submit>
	</s:form>
</body>
</html>