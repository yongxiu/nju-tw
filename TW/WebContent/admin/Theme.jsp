<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:property value="message"/>
<button class="btn" onclick="javascript:window.location.href='<s:url action="admin.TurnGray.do"/>'">变为灰色</button>
<button class="btn" onclick="javascript:window.location.href='<s:url action="admin.TurnOri.do"/>'">恢复主色</button> 