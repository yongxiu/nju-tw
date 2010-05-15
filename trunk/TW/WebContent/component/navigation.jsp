<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<ul id="m_nav">
	<li class="sy"><sx:a href="###" title="首页" cssClass="active">
		<span>sy</span>
	</sx:a></li>
	<li class="zz"><a href="Org.do" title="组织结构"> </a></li>
	<li class="jd"><a href="###" title="焦点新闻"><span>jd</span></a></li>
	<li class="gg"><a href="###" title="公告信息"><span>gg</span></a></li>
	<li class="ll"><a href="###" title="理论园地"><span>ll</span></a></li>
	<li class="mt"><a href="###" title="媒体报道"><span>nt</span></a></li>
	<li class="xz"><a href="###" title="下载专区"><span>xz</span></a></li>
	<li class="lx"><a href="ConnectUs.do" title="联系我们"></a></li>
</ul>
<script language="javascript">
	function switchTab(tabid) {
		var navArray = document.getElementById('m_nav').getElementsByTagName(
				"a");
		for ( var i = 0; i < navArray.length; i++) {
			navArray[i].className = '';
		}
		navArray[tabid].className = "active";
	}
</script>






