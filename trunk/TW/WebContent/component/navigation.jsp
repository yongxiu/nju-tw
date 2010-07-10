<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<link rel="stylesheet" type="text/css" href="/TW/css/navigation.css" />
<!--  
	<SCRIPT type="text/javascript">
	  $('#m-nav').ready(function(){
			$("#m-nav li").hover(
				function(){ $("ul", this).fadeIn("normal"); }, 
				function() { } 
			);
	  	if (document.all) {
				$("#m-nav li").hoverClass ("sfHover");
			}
	  });
	  
		$.fn.hoverClass = function(c) {
			return this.each(function(){
				$(this).hover( 
					function() { $(this).addClass(c);  },
					function() { $(this).removeClass(c); }
				);
			});
		};	  
	</SCRIPT>
-->
<ul id="m-nav" class="nav">
	<li id="n1"><a href="Home.do" title="首页"> </a>
	<li id="n2"><a href="#" title="团情纵览"> </a>
    	<UL style="display: block; opacity: 0.9999;width:297px;">
			<LI id="n2s1"><A href="UpdateNewsAction.do" title="团学新闻"></A></LI>
			<LI id="n2s2"><A href="BasicStyle.do" title="基层采风"></A></LI>
			<LI id="n2s3"><A href="Project.do" title="媒体传真"></A></LI>
		</UL>	
    </li>
	<li id="n3"><a href="#" title="关于团委"> </a>
    	<UL style="display: block; opacity: 0.9999;width:495px;">
			<LI id="n3s1"><A href="Introduction.do" title="团委简介"></A></LI>
			<LI id="n3s2"><A href="#" title="机构人员"></A></LI>
			<LI id="n3s3"><A href="OfficeMap.do" title="办公地图"></A></LI>
			<LI id="n3s4"><A href="#" title="工作简报"></A></LI>
			<LI id="n3s5"><A href="Contact.do" title="联系我们"></A></LI>
		</UL>	
    </li>
    <li id="n4"><a href="#" title="理论园地"> </a>
    	<UL style="display: block; opacity: 0.9999;width:396px;">
			<LI id="n4s1"><A href="#" title="时事理论"></A></LI>
			<LI id="n4s2"><A href="#" title="团内精神与讲话"></A></LI>
			<LI id="n4s3"><A href="#" title="高教动态"></A></LI>
			<LI id="n4s4"><A href="#" title="调查研究"></A></LI>
		</UL>	
    </li>
    <li id="n5"><a href="Download.do" title="下载专区"> </a>
    	<UL style="display: block; opacity: 0.9999;width:198px;">
			<LI id="n5s1"><A href="#" title="文件系统"></A></LI>
			<LI id="n5s2"><A href="#" title="综合资料"></A></LI>
		</UL>	
    </li>
    <li id="n6"><a href="#" title="电子团务"> </a></li>
    <li id="n0"><a href="#" title="占位"> </a></li>
    <li id="n0"><a href="#" title="占位"> </a></li>
</ul>

<BR clear="all">

<!-- 
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
				}else if(pageUrl.indexOf("1")>0){
					navArray[2].className = "active";}
				else {
					navArray[0].className = "active";
				}
			});
</script>
 -->