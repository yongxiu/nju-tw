<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<div id="picNews">
<div class="picNews-h"></div>
<div class="picNews-p"><tiles:insertAttribute name="picNews" /></div>
</div>
<div id="news">
<div id="news1" class="subnews">
<div class="news-h"></div>
<div class="news-p"><tiles:insertAttribute name="news" /></div>
</div>
<div id="blank-v"> </div>
<div id="news2" class="subnews">
<div class="news-h"></div>
<div class="news-p"><tiles:insertAttribute name="news" /></div>
</div>
<div id="news3" class="subnews">
<div class="news-h"></div>
<div class="news-p"><tiles:insertAttribute name="news" /></div>
</div>
<div id="blank-v"> </div>
<div id="news4" class="subnews">
<div class="news-h"></div>
<div class="news-p"><tiles:insertAttribute name="news" /></div>
</div>
</div>