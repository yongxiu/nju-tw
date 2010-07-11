<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/topic.css" type="text/css"
	media="screen" rel="stylesheet" />
<table style="width:790px; height:200px;"><tr><td align=center>
<table class="t_s_Table" cellspacing="0" cellpadding="0">
<tr class="t_s_a_Tr"><td colspan="3" style="border-bottom:5px solid #e0e0e0; text-align:center;"><a href="admin.BrandManageList.do">品牌活动管理</a></td></tr>
<tr class="t_s_a_Tr"><td colspan="3" style="text-align:center;">首页品牌项目 工作替换</td></tr>
	<tr class="t_s_i_Tr">
		<td><img src="<s:property value="brandone.path"/>" width="161" height="66"/></td>
		<td><img src="<s:property value="brandtwo.path"/>" width="161" height="66"/></td>
		<td><img src="<s:property value="brandthree.path"/>" width="161" height="66"/></td>
	</tr>
	<tr class="t_s_a_Tr">
		<td><a href="<s:url action="admin.BrandChange.do"><s:param name="topicid" value="brandone.id"/></s:url>" id="a1" style="font-size:16px; font-family:'微软雅黑';">修改品牌项目一</a></td>
		<td><a href="<s:url action="admin.BrandChange.do"><s:param name="topicid" value="brandtwo.id"/></s:url>" id="a2" style="font-size:16px; font-family:'微软雅黑';">修改品牌项目二</a></td>
		<td><a href="<s:url action="admin.BrandChange.do"><s:param name="topicid" value="brandthree.id"/></s:url>" id="a3" style="font-size:16px; font-family:'微软雅黑';">修改品牌项目三</a></td>
	</tr>
</table>
</td></tr></table>
