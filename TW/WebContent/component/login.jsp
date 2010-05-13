<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<s:form  action="LoginAction.do" theme="xhtml">
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
			<sx:submit type="image" name="loginbt" src="/TW/img/logoin.gif"  targets="logindiv" ></sx:submit>
						
			</td>
		</tr>
	</table>

</s:form>


