<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Image Select</title>
</head>
<body>
	<table>
  
	

		<s:iterator value="imageStrings" id="image">
			 <tr>
			 	<td>
			 		
			 		<s:param name="imageValue">
			 			<s:property value="image"/>
			 		</s:param>
			 		
					<img  src="<s:property value="image"/>">
					
				</td>
				
				<td>
					
				
					<a href='<s:url action="SelectImage"><s:param name="imageValue"><s:property value="image"/></s:param></s:url>'>
 		 				将该图片设为首页图片
 		 			</a>
					
				</td>
			 </tr>
		</s:iterator>
		
	</table>	
	
</body>
</html>