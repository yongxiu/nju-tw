<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
   <table  style="padding-left:24px;" cellpadding="0" cellspacing="0">
   <tr><td style="">
   <a href=" <s:url action="TopicListPage.do"><s:param name="topicid" value="brandone.id"/></s:url>">
    <img style="border:none;"  src="<s:property value="brandone.path"/>" width="139" height="54"/>
    </a>
    </td></tr>
   <tr><td style="">
   <a href=" <s:url action="TopicListPage.do"><s:param name="topicid" value="brandtwo.id"/></s:url>">
    <img style="border:none;"  src="<s:property value="brandtwo.path"/>" width="139" height="54"/>
    </a>
    </td></tr>
      <tr><td style="">
   <a href=" <s:url action="TopicListPage.do"><s:param name="topicid" value="brandthree.id"/></s:url>">
    <img style="border:none;"  src="<s:property value="brandthree.path"/>" width="139" height="54"/>
    </a>
    </td></tr>
   </table>