<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/topic.css" type="text/css"
	media="screen" rel="stylesheet" />
	
<img src="<s:property value="imagePath"/>"/>
<br>

<s:form theme="simple" action ="TopicImgUploadAction.do?topicid=%{topicid}" method="post" enctype ="multipart/form-data">
	<s:fielderror>
		<s:param>imgFile</s:param>
	</s:fielderror>
	<div><p><label class="label" for="imgFile">修改专题图片：</label><s:file cssClass="filename" name ="imgFile" id="imgFile" size="50"/></p></div>
    
    <p><s:submit cssClass="btn" value="上传并增加专题内容" name="submit"
	id="submit"/></p>
</s:form>

<a href="<s:url action="TopicManage.do"> <s:param name="topicid"><s:property value="topicid"/></s:param> <s:param name="isnew" value="0"/></s:url>">
	不修改专题图片，只增减专题内容
</a>