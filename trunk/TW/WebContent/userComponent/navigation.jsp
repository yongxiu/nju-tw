<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<ul id="m_nav">
	<li class="sy"><a href="Home.do" title="首页" ><span>sy</span>
	</a></li>
	<li class="zz"><a href="BackHome.do" title="发表文章"><span>发文章</span></a></li>
	<li class="jd"><a href="ArticleList.do" title="已发表的文章"><span>已发文章</span></a></li>
	<li class="gg"><a href="uploadFile.do" title="上传文件"><span>上传文件</span></a></li>
	<li class="ll"><a href="changePSW.do" title="账户管理"><span>账户管理</span></a></li>
	<li class="mt"><a href="###" title="媒体报道"><span>nt</span></a></li>
	<li class="xz"><a href="###" title="下载专区"><span>xz</span></a></li>
	<li class="lx"><a href="ConnectUs.do" title="联系我们"></a></li>
</ul>


<script language="javascript">
	$('#m_nav').ready(
			function() {
				var pageUrl = "";
				pageUrl = window.location;
				pageUrl = pageUrl.toString();
				var navArray = document.getElementById('m_nav')
						.getElementsByTagName("a");
				if (pageUrl.indexOf("Org.do")>0) {
					navArray[1].className = "active";
				}else{
					navArray[0].className = "active";}
			});
</script>






