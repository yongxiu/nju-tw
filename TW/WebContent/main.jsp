<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="WEB-INF/tiles.tld " prefix="tiles"%>

<!DOCTYPE html 
	PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>2</title>

</head>
<body>
<div id="page">
<div id="banner" class="clearfix"><tiles:insertAttribute
	name="banner" /></div>
<div id="nav"><tiles:insertAttribute name="navigation" /></div>
<!-- end header -->
<div id="left">
<div id="log"><tiles:insertAttribute name="login" /></div>
<div id="search"><tiles:insertAttribute name="search" /></div>
<div id="ip"><tiles:insertAttribute name="ipHolder" /></div>
</div>
<div id="content" class="clearfix">


</div>
<!-- end content -->
<div id="footer" class="clearfix">
<div id="link"><tiles:insertAttribute name="linker" /></div>
<div id="copy"><tiles:insertAttribute name="copyRight" /></div>
</div>
<!-- end footer --></div>
<!-- end page -->
<div id="extra1">&nbsp;</div>
<div id="extra2">&nbsp;</div>
</body>
</html>
