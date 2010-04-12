<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<title>
			<tiles:getAsString name="title" />
		</title>
		
	</head>
	<body>
		<div id="page">
			<div id="header" class="clearfix">
				<tiles:insertAttribute name="header" />
			</div><!-- end header -->
			<div id="content" class="clearfix">
				<div id="sub">
					<img src="<c:url value="/images/diplomat.jpg"/>"/>
				</div>
				<div id="main">
					<tiles:insertAttribute name="body" />
				</div>
				<div id="nav">
					<tiles:insertAttribute name="navigation" />
				</div>
			</div><!-- end content -->
			<div id="footer" class="clearfix">
				<tiles:insertAttribute name="footer" />
			</div><!-- end footer -->
		</div><!-- end page -->
		<div id="extra1">&nbsp;</div>
		<div id="extra2">&nbsp;</div>
	</body>
</html>