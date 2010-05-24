<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<link rel="stylesheet" type="text/css" href="/TW/css/navigation.css" />
<link href="/TW/css/style.css" rel="stylesheet" type="text/css" media="screen"/>
<SCRIPT language=javascript type=text/javascript src="js/jquery.js"></SCRIPT>
  
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

<ul id="m-nav" class="nav">
	<li class="sy"><a href="Home.do" title="首页" ></a></li>
	<li class="zz"><a href="Org.do" title="组织结构"> </a>
    
    	<UL style="display: block; opacity: 0.9999;">
			<LI id="sjs"><A href="#" title="书记室"></A></LI>
			<LI id="nbjg"><A href="#" title="内部结构"></A></LI>
			<LI id="xszz"><A href="#" title="下属组织"></A></LI>
		</UL>
		
    </li>
	<li class="jd"><a href='<s:url action="Article.do"><s:param name="category" value="2"/><s:param name="currentPage" value="1"/></s:url>' title="焦点新闻"></a>
	   
    	<UL style="display: block; opacity: 0.9999; ">
			<LI id="xcsx"><a href='<s:url action="Article.do"><s:param name="category" value="10"/><s:param name="currentPage" value="1"/></s:url>' title="宣传思想"></a></LI>
			<LI id="jcdt"> <a href='<s:url action="Article.do"><s:param name="category" value="11"/><s:param name="currentPage" value="1"/></s:url>' title="基层动态"></a></LI>
		</UL>
		
    </li>
	<li class="gg"><a href='<s:url action="Article.do"><s:param name="category" value="3"/><s:param name="currentPage" value="1"/></s:url>' title="宣传思想"></a></li>
	<li class="ll"><a href='<s:url action="Article.do"><s:param name="category" value="4"/><s:param name="currentPage" value="1"/></s:url>' title="理论园地"></a></li>
	<li class="mt"><a href='<s:url action="Article.do"><s:param name="category" value="5"/><s:param name="currentPage" value="1"/></s:url>' title="媒体报道"></a></li>
	<li class="xz"><a href="Download.do" title="下载专区"></a></li>

	<li class="lx"><a href="ConnectUs.do" title="联系我们"></a></li>
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
				}else{
					navArray[0].className = "active";}
			});
</script>
-->