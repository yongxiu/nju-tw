<%@ page language="java" contentType="text/html;charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>发送邮件给管理员</title>
<link type="text/css" rel="stylesheet" href="css/mail2.css" />
<script type="text/javascript" src="js/sendmail.js"></script>
</head>
<body>
<center><s:form action="SendMailAction.do" method="post">
	<table>
		<tr>
			<td colspan="2">给管理人员发送邮件</td>
		</tr>

		<tr>
			<td colspan="2"><s:label>您的邮箱:</s:label><s:textfield name="mailfrom"
				size="75"></s:textfield></td>
		</tr>
		<tr>
			<td colspan="2"><s:label>主题: </s:label><s:textfield name="subject" size="75"
				value=""></s:textfield></td>
		</tr>
		<tr>
			<td colspan="2"><s:label>內容: </s:label><s:textarea name="content" cols="60" rows="30" value=""></s:textarea></td>
		</tr>
		<tr>
			<td colspan="2"><s:submit value="发送"></s:submit></td>
		</tr>
	</table>
</s:form></center>
</body>
</html>