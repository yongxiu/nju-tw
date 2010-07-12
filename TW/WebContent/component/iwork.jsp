<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
   <table style="padding-left:24px;">
   <tr><td style="">
   <a href=" <s:url action="IWorkArticleList.do"><s:param name="iworkid" value="iworkone.id"/></s:url>">
    <img style="border:none;"  src="<s:property value="iworkone.path"/>" width="139" height="54"/>
    </a>
    </td></tr>
   <tr><td style="">
   <a href=" <s:url action="IWorkArticleList.do"><s:param name="iworkid" value="iworktwo.id"/></s:url>">
    <img style="border:none;"  src="<s:property value="iworktwo.path"/>" width="139" height="54"/>
    </a>
    </td></tr>
   </table>
   
  
    