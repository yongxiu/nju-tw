<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<%=request.getContextPath()%>/css/styles.css"
	type="text/css" media="screen" rel="stylesheet" />
<style type="text/css">
img,div {
	behavior: url(iepngfix.htc)
}
</style>

<title>Student Login</title>
</head>
<body id="login">
<div id="wrappertop"></div>
<div id="wrapper">
<div id="content">
<div id="header">
<h1><a href=""><img
	src="<%=request.getContextPath()%>/images/logo.jpg"
	alt="FreelanceSuite"></a></h1>
</div>
<div id="darkbanner" class="banner320">
<h2>Login</h2>
</div>
<div id="darkbannerwrap"></div>
<s:form action="LoginAction.do">
	<table align="center" cellpadding="1" cellspacing="1" class="form">
		<tr>
			<td width="50%"><s:textfield name="userName" label="UserName"
				labelposition="top"></s:textfield></td>
		</tr>
		<tr>
			<td width="50%"><s:password name="password" label="Password"
				labelposition="top"></s:password></td>
		</tr>
		<tr>
			<td>

			<button type="submit" class="positive" name="Submit"><img
				src="<%=request.getContextPath()%>/images/key.png"
				alt="Announcement" />Login</button>

			</td>
		</tr>
	</table>

</s:form></div>
</div>

</body>
</html>