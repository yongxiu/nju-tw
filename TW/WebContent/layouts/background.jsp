<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<title>南京大学共青团委管理员界面</title>
</head>
<body>
<div id="container">
<div id="banner"><tiles:insertAttribute name="banner" /></div>
<div id="menu">
<tiles:insertAttribute name="navigation" /> 
<tiles:insertAttribute name="search" />
<div id="blank-h1"> </div>
</div>
<div id="page">
<div id="sidebar">
<div id="topic">
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
<div id="picNews">
<div class="picNews-h"></div>
<div class="picNews-p"><tiles:insertAttribute name="picNews" /></div>
</div>
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
</div>
<div id="linker"><tiles:insertAttribute name="linker" /></div>
<div id="copyright"><tiles:insertAttribute name="copyRight" /></div>
<div id="blank-h2"></div>
</div>
</div>
</body>
</html>