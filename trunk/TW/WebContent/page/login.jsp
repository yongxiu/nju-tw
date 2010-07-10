<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<head>
<link href="/TW/css/login.css" rel="stylesheet" type="text/css" media="screen"/>

<title>南京大学共青团委</title>
</head>
<body>
<div id="Wrapper"> 
			<table width="740" height="100%" align="center" cellpadding="0"

				cellspacing="0"> 
				<tr> 
					<td height="136"> 
						<div id="Logo"> 
							<a href="#"><img src="img/IndexLogo.png"

									border="0"> </a> 
						</div> 
					</td> 
				</tr> 
				<tr> 
					<td height="39"></td> 
				</tr>
				<tr>					
					<td height="341" id="Main">						    					
						<div id="Login"> 
						<font style="font-size: 12px;font-weight:bold;color: #FF0000"></font><br> 
						
						
						<s:form  action="LoginAction.do" theme="xhtml">
	<table cellpadding="0" cellspacing="0" style="margin-left:100px;">
		<tr><td style="width:100%;">
    	 	<s:actionerror/>
     		<s:actionmessage name="message" value="message"/>
		</td></tr>
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
		<tr>
			<td ><s:password id="loginTextfield" name="password" label="密码" size="20"
				labelposition="top"></s:password>
			</td>
		</tr>
		<tr>
			<td>
			<s:submit id="Btn" name="loginbt" cssClass="btn" value=""  ></s:submit>
						
			</td>
		</tr>

	</table>

</s:form>
<table width="100%" align="center"><tr><td width="100%" align="center">
			<div id="copyrightPage"><span>&copy; 2010   Tuanwei.nju.edu.cn. All rights reserved.<a href="http://tuanwei.nju.edu.cn"> 共青团南京大学委员会</a> 版权所有 </span> 

	<span>Powered By IGROO</span></div>	
	</td></tr></table>							 
</div>			 
</body>
</html>
