<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<head>
<link href="/TW/css/style.css" rel="stylesheet" type="text/css" media="screen"/>

<title>南京大学共青团委</title>
</head>
<body>
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
		<tr><td></td></tr>
		<tr>
			<td ><s:password id="loginTextfield" name="password" label="密码" size="20"
				labelposition="top"></s:password>
			</td>
		</tr>
		<tr><td></td></tr>
		<tr>
			<td>
			<s:submit name="loginbt" cssClass="btn" value="登陆"  ></s:submit>
						
			</td>
		</tr>
	</table>

</s:form>
<div id="copyrightPage"><span>&copy; 2010   Tuanwei.nju.edu.cn. All rights reserved.<a href="http://tuanwei.nju.edu.cn"> 共青团南京大学委员会</a> 版权所有 </span> 

	<span>Powered By IGROO</span></div>
</body>
</html>
