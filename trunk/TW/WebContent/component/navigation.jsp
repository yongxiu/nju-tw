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
	<li class="sy"><a href="Home.do" title="首页" ></a></li>
	<li class="zz"><a href="Org.do" title="组织结构"> </a>
    	
    	<UL style="display: block; opacity: 0.9999;width:396px;">

			<LI id="sjs"><A href="<s:url action="OrgList.do"><s:param name="category" value="1"></s:param> </s:url>" title="书记室"></A></LI>
			<LI id="jgsz"><A href="<s:url action="OrgList.do"><s:param name="category" value="2"></s:param> </s:url>" title="机构设置"></A></LI>
			<LI id="xszz"><A href="<s:url action="OrgList.do"><s:param name="category" value="4"></s:param> </s:url>" title="学生组织"></A></LI>
			<LI id="jctw"><A href="<s:url action="OrgList.do"><s:param name="category" value="3"></s:param> </s:url>" title="基层团委"></A></LI>

		</UL>
		
    </li>
	<li class="xw"><a href='<s:url action="Article.do"><s:param name="category" value="1"/><s:param name="currentPage" value="1"/></s:url>' title="新闻动态"></a></li>
	<li class="gg"><a href='<s:url action="Article.do"><s:param name="category" value="2"/><s:param name="currentPage" value="1"/></s:url>' title="公告信息"></a></li>
	<li class="ll"><a href='<s:url action="Article.do"><s:param name="category" value="3"/><s:param name="currentPage" value="1"/></s:url>' title="理论园地"></a></li>
	<li class="mt"><a href='<s:url action="Article.do"><s:param name="category" value="4"/><s:param name="currentPage" value="1"/></s:url>' title="媒体报道"></a>
		<UL style="display: block; opacity: 0.9999;width:495px;">
			<LI id="xwbd"><A href="<s:url action="Article.do"><s:param name="category" value="5"/><s:param name="currentPage" value="1"/></s:url>" title="校外报导"></A></LI>
			<LI id="ndxww"><A href="<s:url action="Article.do"><s:param name="category" value="6"/><s:param name="currentPage" value="1"/></s:url>" title="南大新闻网"></A></LI>
			<LI id="njdxb"><A href="<s:url action="Article.do"><s:param name="category" value="7"/><s:param name="currentPage" value="1"/></s:url>" title="南京大学报"></A></LI>
			<LI id="ndqnb"><A href="<s:url action="Article.do"><s:param name="category" value="8"/><s:param name="currentPage" value="1"/></s:url>" title="南大青年报"></A></LI>
			<LI id="xygbt"><A href="<s:url action="Article.do"><s:param name="category" value="9"/><s:param name="currentPage" value="1"/></s:url>" title="南京大学校园广播台"></A></LI>
		</UL>
	</li>
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
				}else if(pageUrl.indexOf("1")>0){
					navArray[2].className = "active";}
				else {
					navArray[0].className = "active";
				}
			});
</script>
 -->