<%@ page  contentType="text/html; charset=UTF-8"%>
<table><tr><td><object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
	width="1000" height="800" id="FlashID">
	<param name="movie" value="<%=request.getContextPath()%>/flash/logo.swf" />
	<param name="quality" value="high" />
	<param name="wmode" value="opaque" />
	<param name="swfversion" value="6.0.65.0" />
	<!-- 此 param 标签提示使用 Flash Player 6.0 r65 和更高版本的用户下载最新版本的 Flash Player。如果您不想让用户看到该提示，请将其删除。 -->
	<param name="expressinstall" value="Scripts/expressInstall.swf" />
	<!-- 下一个对象标签用于非 IE 浏览器。所以使用 IECC 将其从 IE 隐藏。 --> <!--[if !IE]>--> <object
		data="<%=request.getContextPath()%>/flash/logo.swf" type="application/x-shockwave-flash"
		width="1000" height="800"> <!--<![endif]-->
		<param name="quality" value="high" />
		<param name="wmode" value="opaque" />
		<param name="swfversion" value="6.0.65.0" />
		<param name="expressinstall" value="Scripts/expressInstall.swf" />
		<!--[if !IE]>--> </object> <!--<![endif]--> </object>
		</td></tr></table>