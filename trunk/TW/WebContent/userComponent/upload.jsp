<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<link href="<%=request.getContextPath()%>/css/upload.css" type="text/css"
	media="screen" rel="stylesheet" />

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/upload.js"></script>

<div class = "cent">
	<s:form theme="simple" action ="FileUploadAction.do"  method="post" enctype ="multipart/form-data">
	<s:fielderror>
		<s:param>myFile</s:param>
	</s:fielderror>
		<div><p><label class="label" for="myFile">文件：</label><s:file cssClass="filename" name ="myFile" id="file" size="50"/></p></div>
		<s:fielderror>
		<s:param>myName</s:param>
	</s:fielderror>
	    <div><p><label class="label" for="myName">名称：</label><s:textfield cssClass="filename" name="myName" id="name"></s:textfield></p></div>
	    <div><p><label class="label" for="myName">类别： <input type="radio" title="类别" value="1" name="category"  checked >文件系统
	    <input type="radio" title="类别" value="2" name="category">综合资料
	    </p></div>
	    <p><s:submit cssClass="btn" value="上传" name="submit"
		id="submit" tabindex="5"></s:submit>
		<input type="button" value="取消" class="btn"></p>
	</s:form>
</div>