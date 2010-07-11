<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
   <table style="padding-left:24px;">
   <tr><td style="">
   <a href=" <s:url action="TopicListPage.do"><s:param name="topicid" value="1"/></s:url>">
    <img style="border:none;"  src="<s:property value="img1"/>" width="139" height="54"/>
    </a>
    </td></tr>
   <tr><td style="">
   <a href=" <s:url action="TopicListPage.do"><s:param name="topicid" value="2"/></s:url>">
    <img style="border:none;"  src="<s:property value="img2"/>" width="139" height="54"/>
    </a>
    </td></tr>
   </table>
    
    <!-- 
    <div> 
   	<a href=" <s:url action="TopicListPage.do"><s:param name="topicid" value="3"/></s:url>">
    <img style="border:none;"  src="<s:property value="img3"/>" width="161" height="66"/>
    </a>
    </div>
    -->
    