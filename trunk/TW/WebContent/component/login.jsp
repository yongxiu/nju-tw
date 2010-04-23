<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<s:form action="LoginAction.do">
	<table align="center" cellpadding="1" cellspacing="1" class="form">
		<tr>
    	 	<s:actionerror/>
     		<s:actionmessage name="message" value="message"/>
		</tr>
		<tr>
			<td>
				<s:fielderror></s:fielderror>
			</td>
		</tr>
		<tr>
			<td><s:textfield name="username" label="用户名" size="10"
				labelposition="left"></s:textfield>
			</td>
			
		</tr>
		<tr>
			<td ><s:password name="password" label="密    码" size="11"
				labelposition="left"></s:password>
			</td>
		
		</tr>
		<tr>
			<td>
			<s:submit type="image" name="search" src="/TW/img/logoin.gif"  ></s:submit>
			</td>
		</tr>
	</table>

</s:form>
</body>
</html>

