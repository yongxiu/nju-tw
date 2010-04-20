<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<link href="/TW/css/style.css" rel="stylesheet" type="text/css" />
<script src="/TW/js/swfobject_modified.js" type="text/javascript"></script>
<title>南京大学共青团委</title>

</head>
<body>
<div id="container">
<div id="banner"><tiles:insertAttribute name="banner" /></div>
<div id="menu">
<div>
<tiles:insertAttribute name="navigation" /></div>

<tiles:insertAttribute name="search" /></div>

<div id="page">
	<div id="sidebar">
		<div id="unsure1">
			<div class="sidebar-h"></div>
			<div class="sidebar-p"><tiles:insertAttribute name="topic" /></div>
		</div>
		<div id="login">
			<div class="sidebar-h"></div>
			<div class="sidebar-p"><tiles:insertAttribute name="login" /></div>
		</div>
		<div id="ipholder">
			<div class="sidebar-h"></div>
			<div class="sidebar-p"><tiles:insertAttribute name="ipHolder" /></div>
		</div>
	</div>
	<div id="content">
		<div id="unsure2">unsure2</div>
		<div id="news">
			<div id="news1" class="subnews">
				<div class="news-h"></div>
				<div class="news-p"><tiles:insertAttribute name="news" /></div>
			</div>
			<div id="news2" class="subnews">
				<div class="news-h"></div>
				<div class="news-p"><tiles:insertAttribute name="news" /></div>
			</div>
			<div id="news3" class="subnews">
  				<div class="news-h"></div>
				<div class="news-p"><tiles:insertAttribute name="news" /></div>
  			</div>
			<div id="news4" class="subnews">
       			<div class="news-h"></div>
				<div class="news-p"><tiles:insertAttribute name="news" /></div>
 			</div>
		</div>
		<div id="linker"><tiles:insertAttribute name="linker" /></div>    
	</div>
</div>
<div id="copyright"><tiles:insertAttribute name="copyRight" /></div>
<!-- <div id="content"><tiles:insertAttribute name="body" /></div> -->
</div>
</body>
</html>
