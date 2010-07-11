<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/topic.css" type="text/css"
	media="screen" rel="stylesheet" />
<table style="width:790px; height:200px;"><tr><td align=center>
<table class="t_s_Table" cellspacing="0" cellpadding="0">
<tr class="t_s_a_Tr"><td colspan="2" style="border-bottom:5px solid #e0e0e0; text-align:center;"><a href="admin.iWorkManageList.do">品牌项目管理</a></td></tr>
<tr class="t_s_a_Tr"><td colspan="2" style="text-align:center;">首页品牌项目替换</td></tr>
	<tr class="t_s_i_Tr">
		<td><img src="<s:property value="iworkone.path"/>" width="161" height="66"/></td>
		<td><img src="<s:property value="iworktwo.path"/>" width="161" height="66"/></td>
	</tr>
	<tr class="t_s_a_Tr">
		<td><a href="<s:url action="admin.IWorkChange.do"><s:param name="topicid" value="iworkone.id"/></s:url>" id="a1" style="font-size:16px; font-family:'微软雅黑';">修改重点工作一</a></td>
		<td><a href="<s:url action="admin.IWorkChange.do"><s:param name="topicid" value="iworktwo.id"/></s:url>" id="a2" style="font-size:16px; font-family:'微软雅黑';">修改重点工作二</a></td>
	</tr>
</table>
</td></tr></table>
