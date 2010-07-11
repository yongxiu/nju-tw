<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/topic.css" type="text/css"
	media="screen" rel="stylesheet" />
<table style="width:790px; height:200px;"><tr><td align=center>
<table><tr><td><a href="">重点工作管理管理</a></td></tr></table>
<table class="t_s_Table">
<tr><td><span>首页替换重点工作替换</span></td></tr>
	<tr class="t_s_i_Tr">
		<td><img src="<s:property value="img1"/>" width="161" height="66"/></td>
		<td><img src="<s:property value="img2"/>" width="161" height="66"/></td>
		<td><img src="<s:property value="img3"/>" width="161" height="66"/></td>
	</tr>
	<tr class="t_s_a_Tr">
		<td><a href="<s:url action="TopicChange.do"><s:param name="topicid" value="1"/></s:url>" id="a1" style="font-size:16px; font-family:'微软雅黑';">进入专题活动一</a></td>
		<td><a href="<s:url action="TopicChange.do"><s:param name="topicid" value="2"/></s:url>" id="a2" style="font-size:16px; font-family:'微软雅黑';">进入专题活动二</a></td>
		<td><a href="<s:url action="TopicChange.do"><s:param name="topicid" value="3"/></s:url>" id="a3" style="font-size:16px; font-family:'微软雅黑';">进入专题活动三</a></td>
	</tr>
</table>
</td></tr></table>
