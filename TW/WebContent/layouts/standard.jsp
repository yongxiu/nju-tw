<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<link href="/TW/css/style.css" rel="stylesheet" type="text/css" />
<title>2</title>

</head>
<body>

<div id="banner"><tiles:insertAttribute name="banner" /></div>
<div id="menu"><div id="navigation">
<tiles:insertAttribute name="navigation" /></div>
<div id="search"><tiles:insertAttribute name="search" /></div>
</div>
<div id="page">
	<div id="sidebar">
		<div id="unsure1">
			<div class="sidebar-h"></div>
			<div class="sidebar-p">unsure1</div>
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
				<div class="news-p">news1</div>
			</div>
			<div id="news2" class="subnews">
				<div class="news-h"></div>
				<div class="news-p">news2</div>
			</div>
			<div id="news3" class="subnews">
  				<div class="news-h"></div>
				<div class="news-p">news3</div>
  			</div>
			<div id="news4" class="subnews">
       			<div class="news-h"></div>
				<div class="news-p">news1</div>
 			</div>
		</div>
		<div id="linker"><tiles:insertAttribute name="linker" /></div>    
	</div>
</div>
<div id="copyright"><tiles:insertAttribute name="copyRight" /></div>
<!-- <div id="content"><tiles:insertAttribute name="body" /></div> -->


</body>
</html>
