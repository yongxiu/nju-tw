<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<div id="picNews">
<div class="picNews-h"><div class="headText">图片传真</div></div>
<div class="picNews-p"><tiles:insertAttribute name="picNews" /></div>
</div>
<div id="news">
<div id="news1" class="subnews">
<div class="news-h"><div class="headText">团学新闻</div><div class="headLink"><a href="Article.do?currentPage=1&level=0&category=1"><img src="img/more.gif" style="border:none;"/></a></div></div>
<div class="news-p"><tiles:insertAttribute name="news" /></div>
</div>
<div id="blank-v"> </div>
<div id="news2" class="subnews">
<div class="news-h"><div class="headText">通知公告</div><div class="headLink"><a href="Article.do?currentPage=1&level=0&category=11"><img src="img/more.gif" style="border:none;"/></a></div></div>
<div class="news-p"><tiles:insertAttribute name="info" /></div>
</div>
<div id="news3" class="subnews">
<div class="news-h"><div class="headText">基层采风</div><div class="headLink"><a href="Article.do?currentPage=1&level=0&category=2"><img src="img/more.gif" style="border:none;"/></a></div></div>
<div class="news-p"><tiles:insertAttribute name="theory" /></div>
</div>
<div id="blank-v"> </div>
<div id="news4" class="subnews">
<div class="news-h"><div class="headText">办事指南</div><div class="headLink"><a href="Article.do?currentPage=1&level=0&category=12"><img src="img/more.gif" style="border:none;"/></a></div></div>
<div class="news-p"><tiles:insertAttribute name="guide" /></div>
</div>
</div>