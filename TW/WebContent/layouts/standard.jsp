<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>


<html>
<head>
<link href="/TW/css/style.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="/TW/css/orgLink.css" rel="stylesheet" type="text/css" media="screen"/>
<script src="/TW/js/swfobject_modified.js" type="text/javascript"></script>
<script src="/TW/js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script src="/TW/js/grayscale.js" type="text/javascript"></script>
<title>南京大学共青团委</title>
<sx:head  />
</head>
<body>
<div id="container">
<div id="banner"><tiles:insertAttribute name="banner" /></div>
<div id="menu">
<div><tiles:insertAttribute name="navigation" /></div>
<div><tiles:insertAttribute name="search" /></div>
</div>
<div id="blank-h1"></div>
<div id="page">
<div id="sidebar">
<div id="topic">
<div class="sidebar-h"><div class="headText">重点工作</div><div class="sideheadLink"><a href="iWork.do"><img src="img/more.gif" style="border:none;"/></a></div></div>
<div class="sidebar-p"><tiles:insertAttribute name="iwork" /></div></div>
<div id="proj">
<div class="sidebar-h"><div class=headText>品牌项目</div><div class="sideheadLink"><a href="Brand.do"><img src="img/more.gif" style="border:none;"/></a></div></div>
<div class="sidebar-p">
<tiles:insertAttribute name="brand" />
</div></div>
<div id="mag">
<div class="sidebar-h"><div class="headText">团属刊物</div></div>
<div class="sidebar-p"><tiles:insertAttribute name="paper" /></div></div>

<div id="org">
<div class="sidebar-h"><div class="headText">学生组织</div></div>
<div class="sidebar-p">
<tiles:insertAttribute name="orgLink" />
</div>
</div>
<div id="ipholder">
<div class="sidebar-h"><div class="headText">访问统计</div></div>
<div class="sidebar-p"><tiles:insertAttribute name="ipHolder" /></div></div>
</div>
<div id="content">
<tiles:insertAttribute name="content" />
</div>
<div id="linker" style="clear:both;"><tiles:insertAttribute name="linker" /></div>
<div id="copyright"><tiles:insertAttribute name="copyRight" /></div>
<div id="blank-h2"></div>
</div>
</div>
</body>
</html>