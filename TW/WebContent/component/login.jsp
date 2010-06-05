<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<s:form  action="LoginAction.do" theme="xhtml">
	<table cellpadding="0" cellspacing="0">
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
			<td><s:textfield id="loginTextfield" name="username" label="用户名" size="20"
				labelposition="top"></s:textfield>
			</td>
		</tr>
		<tr><td><br></td></tr>
		<tr>
			<td ><s:password id="loginTextfield" name="password" label="密码" size="20"
				labelposition="top"></s:password>
			</td>
		</tr>
		<tr><td><br></td></tr>
		<tr>
			<td>
			<sx:submit name="loginbt" cssClass="btn" value="登陆" targets="logindiv" ></sx:submit>
						
			</td>
		</tr>
	</table>

</s:form>


