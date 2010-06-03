<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<table style="width:790px; height:200px;"><tr><td align=center>
<table style="border:5px solid #e0e0e0;" cellpadding=0 cellspacing=0>
<s:if test="message!=null">
<tr><td colspan=2 style="text-align:center;height:55px;border-collapse:collapse;border:solid #e0e0e0;border-width:0 1px 1px 1px; width:300px"><s:property value="message"/></td></tr>
</s:if>
<tr>
	<td style="text-align:center;height:55px;border-collapse:collapse;border:solid #e0e0e0;border-width:0 1px 1px 1px; width:150px"><button class="bn" onclick="javascript:window.location.href='<s:url action="admin.TurnGray.do"/>'">变为灰色</button></td>
	<td style="text-align:center;height:55px;border-collapse:collapse;border:solid #e0e0e0;border-width:0 1px 1px 1px; width:150px"><button class="bn" onclick="javascript:window.location.href='<s:url action="admin.TurnOri.do"/>'">恢复主色</button></td>
</tr>
</table>
</td></tr></table>
