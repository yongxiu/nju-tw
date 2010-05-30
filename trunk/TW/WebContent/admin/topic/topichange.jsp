<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/topic.css" type="text/css"
	media="screen" rel="stylesheet" />
	
<<<<<<< .mine
	<img src="<s:property value="imagePath"/>"/>
	<br>
	<a href="<s:url action="TopicManage.do"> <s:param name="topicid"><s:property value="topicid"/></s:param> <s:param name="isnew" value="0"/></s:url>">
		原有活动专题修改
	</a>
	<br>
	<br>
	<br>
	<a href="<s:url action="TopicManage.do"> <s:param name="topicid"><s:property value="topicid"/></s:param> <s:param name="isnew" value="1"/></s:url>">
		新活动专题修改
	</a>
	
</body>
</html>
<img src="<s:property value="imagePath"/>"/>
<br>

<s:form theme="simple" action ="TopicImgUploadAction.do?topicid=%{topicid}" method="post" enctype ="multipart/form-data">
	<s:fielderror>
		<s:param>imgFile</s:param>
	</s:fielderror>
	<div><p><label class="imglabel" for="imgFile">修改专题图片：</label><s:file cssClass="filename" name ="imgFile" id="imgFile" size="50"/></p></div>
    
    <p><s:submit cssClass="upbtn" value="上传并增加专题内容" name="submit"
	id="submit"/></p>
</s:form>

<div id="change">

<a href="<s:url action="TopicManage.do"> <s:param name="topicid"><s:property value="topicid"/></s:param> <s:param name="isnew" value="0"/></s:url>">
	不修改专题图片，只增减专题内容
</a>
</div>
