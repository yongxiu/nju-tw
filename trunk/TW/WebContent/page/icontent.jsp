<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<div id="picNews">
<div class="picNews-h"><div class="headText">图片传真</div></div>
<div class="picNews-p"><tiles:insertAttribute name="picNews" /></div>
</div>
<div id="news">
<div id="news1" class="subnews">
<div class="news-h"><div class="headText">焦点新闻</div><div class="headLink"><a href="###"><img src="img/more.gif"/></a></div></div>
<div class="news-p"><tiles:insertAttribute name="news" /></div>
</div>
<div id="blank-v"> </div>
<div id="news2" class="subnews">
<div class="news-h"><div class="headText">公告信息</div><div class="headLink"><a href="###"><img src="img/more.gif"/></a></div></div>
<div class="news-p"><tiles:insertAttribute name="news" /></div>
</div>
<div id="news3" class="subnews">
<div class="news-h"><div class="headText">理论园地</div><div class="headLink"><a href="###"><img src="img/more.gif"/></a></div></div>
<div class="news-p"><tiles:insertAttribute name="news" /></div>
</div>
<div id="blank-v"> </div>
<div id="news4" class="subnews">
<div class="news-h"><div class="headText">媒体报道</div><div class="headLink"><a href="###"><img src="img/more.gif"/></a></div></div>
<div class="news-p"><tiles:insertAttribute name="news" /></div>
</div>
</div>