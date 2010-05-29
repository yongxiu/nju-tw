<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div style="width:1016x;margin-left:auto;margin-right:auto;overflow:hidden;">
		<s:iterator value="imageStrings" id="image">
			<div style="width:330px;height:229px;float:left;margin:10px 10px 0 0;border:gray solid 1px;">
			 	<div style="width:330px;height:200px;">			 		
			 		<s:param name="imageValue">
			 			<s:property value="image"/>
			 		</s:param>			 		
					<img style="width:330px;height:200px;" src="<s:property value="image"/>">			
				</div>
				<div style="width:330px;height:29px;float:none;text-align:center;background:url(./img/btn_form.png) center no-repeat;">
					<a style="text-decoration:none;color:white;font-size:12px;font-family:'微软雅黑';line-height:25px;"  href='<s:url action="SelectImage"><s:param name="imageValue"><s:property value="image"/></s:param></s:url>'>设为首页图</a>
			</div>
			</div>
		</s:iterator>
		<div style="width:330px;height:229px;float:left;margin:10px 10px 0 0;">
			 	<div style="width:330px;height:201px;"></div>
				<div style="width:330px;height:29px;float:none;text-align:center;background:url(./img/btn_form.png) center no-repeat;">
					<a style="text-decoration:none;color:white;font-size:12px;font-family:'微软雅黑';line-height:25px;"  href='#'>返回</a>
				</div>
		</div>
</div>	
