<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/topic.css" type="text/css"
	media="screen" rel="stylesheet" />



<table style="width:790px; height:280px;"><tr><td align=center>
<table class="t_s_Table">
	<tr class="t_s_i_Tr">
		<td><img src="<s:property value="imagePath"/>" width="161" height="66"/></td>
		<td style="width:250px"><img src="<s:property value="imagePath"/>" width="161" height="66"/></td>
	</tr>
	<tr class="t_s_a_Tr">
		<td><a href="<s:url action="TopicManage.do"><s:param name="topicid"><s:property value="topicid"/></s:param> <s:param name="isnew" value="0"/></s:url>" style="font-size:16px; font-family:'微软雅黑';">原有活动专题修改</a></td>
		<td style="width:250px">
		
		<s:form theme="simple" action ="TopicImgUploadAction.do?topicid=%{topicid}" method="post" enctype ="multipart/form-data">
	<s:fielderror>
		<s:param>imgFile</s:param>
	</s:fielderror>
	<div><br/><p><span style="font-size:16px; font-family:'微软雅黑';">修改专题图片：</span></p><br/><p><s:file cssClass="filename" name ="imgFile" id="imgFile" size="20"/></p></div><p><s:submit cssClass="upbtn" value="上传并增加专题内容" name="submit" id="submit"/></p><br/>
</s:form>
		
		</td>
	</tr>
</table>
<br/><br/>

</td></tr></table>