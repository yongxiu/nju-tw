<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
    <div style="height:10px;width:186px;"></div>
    <div>
   
    <a href=" <s:url action="TopicListPage.do"><s:param name="topicid" value="1"/></s:url>">
    <img style="border:none;"  src="<s:property value="img1"/>" width="161" height="66"/>
    </a>
    </div>
    <div>
    <a href=" <s:url action="TopicListPage.do"><s:param name="topicid" value="2"/></s:url>">
    <img style="border:none;"  src="<s:property value="img2"/>" width="161" height="66"/>
    </a>
    </div>
    <div>
   	<a href=" <s:url action="TopicListPage.do"><s:param name="topicid" value="3"/></s:url>">
    <img style="border:none;"  src="<s:property value="img3"/>" width="161" height="66"/>
    </a>
    </div>