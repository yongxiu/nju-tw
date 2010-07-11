<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
<head>
<style type="text/css">
body{
	font-family:"黑体";
	color:grey;
	background-color:#e5e8f1;
	background-image: url(/TW/img/adminbg.gif);
	background-repeat: repeat-x;
	background-position: center top;
}
#wrap{
	width:507px;
	height:372px;
	padding-top:65px;
	padding-left:40px;
	background-image: url(/TW/img/lg.gif);
	background-repeat: no-repeat;
	margin:150px auto;
}
#Btn{
	background-image: url(/TW/img/btlg.gif);
	width:70px;
	height:25px;
	border:0px;
	cursor:hand;
}
#loginTextfield{
	width: 120px;
	height: 18px;
	border: 1px solid grey;
	font-size: 12px;
	padding: 0 0 0 2px;
	line-height: 22px;
}
#loginTextfield label {
	width: 30px;
	height: 36px;
	font-size: 12px;
	padding: 0 0 2px 2px;
	line-height: 35px;
}
#copy{
font-size: 12px;
font-family: Verdana, PMingLiU;
position:absolute;
top:440px;
padding-left:30px;
}
a {
	font-size: 12px;
	font-family: Verdana, PMingLiU;
	text-decoration:none;
}

a:link {
	color: #095C83;
}

a:visited {
	color: #095C83;
}

a:hover {
	color: #DC143C;
	text-decoration: underline;
}

a:active {
	color: #DC143C;
	text-decoration: underline;
}
</style>
<title>南京大学共青团委</title>
</head>
<body>
<div id="wrap">
<s:form  action="LoginAction.do" theme="xhtml">
	<table cellpadding="0" cellspacing="0" style="">
		<tr><td style="">
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
		<tr><td height="5px;"></td></tr>
		<tr>
			<td ><s:password id="loginTextfield" name="password" label="密码" size="20"
				labelposition="top"></s:password>
			</td>
		</tr>
		<tr><td height="10px;"></td></tr>
		<tr>
			<td>
			<s:submit id="Btn" name="loginbt" cssClass="btn" value=""  ></s:submit>					
			</td>
		</tr>
	</table>
</s:form>
<div id="copy">
<table width="100%" align="center"><tr><td width="100%" align="center">
<span>&copy; 2010   Tuanwei.nju.edu.cn.<a href="http://tuanwei.nju.edu.cn"> 共青团南京大学委员会</a> 版权所有 </span> 
</td></tr></table>
</div>
</div>
</body>
</html>