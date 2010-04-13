<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<title>2</title>

</head>
<body>
<div id="page">
<div  ><tiles:insertAttribute name="banner" /></div>
<div id="nav"><tiles:insertAttribute name="navigation" /></div>
<!-- end header -->
<div id="left">
<div id="log"></div>
<div id="searchs"><tiles:insertAttribute name="search" /></div>
<div id="ip"><tiles:insertAttribute name="ipHolder" /></div>
</div>
<div id="content" ></div>
<!-- end content -->
<div id="footer" >
<div id="link"><tiles:insertAttribute name="linker" /></div>
<div id="copy"><tiles:insertAttribute name="copyRight" /></div>
</div>
</div>
</body>
</html>
