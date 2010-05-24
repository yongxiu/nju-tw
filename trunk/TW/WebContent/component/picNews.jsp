<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<LINK rel=stylesheet type=text/css href="css/picNews.css">
<SCRIPT language=javascript type=text/javascript src="js/picNews.js"></SCRIPT>

<div id="ifocus">
  <div id="ifocus_pic">
    <div style="TOP: 0px; LEFT: 0px" id="ifocus_piclist">
      <ul>
     
        <li><a href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews1.id"/></s:param></s:url>" target="_blank"><img 
  style="BORDER-TOP: #e8e8e8 1px solid" src="<s:property value="picnews1.path"/>" /></a></li>
        <li><a href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews2.id"/></s:param></s:url>" target="_blank"><img 
  style="BORDER-TOP: #e8e8e8 1px solid" src="<s:property value="picnews2.path"/>" /></a></li>
        <li><a href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews3.id"/></s:param></s:url>" target="_blank"><img 
  style="BORDER-TOP: #e8e8e8 1px solid" src="<s:property value="picnews3.path"/>" /></a></li>
        <li><a href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews4.id"/></s:param></s:url>" target="_blank"><img 
  style="BORDER-TOP: #e8e8e8 1px solid" src="<s:property value="picnews4.path"/>" /></a></li>
        <li><a href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews5.id"/></s:param></s:url>" target="_blank"><img 
  style="BORDER-TOP: #e8e8e8 1px solid" src="<s:property value="picnews5.path"/>" /></a> </li>
      </ul>
    </div>
  </div>
  <div id="ifocus_btn">
    <ul>
      <li id="pic_0" class="piccurrent">
        <div><a class="pic_title" href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews1.id"/></s:param></s:url>" 
  target="_blank"><s:property value="picnews1.title"/></a></div>
        <div class="pic_info">
          <p><s:property value="picnews1.introduce"/></p>
        </div>
      </li>
      <li id="pic_1" >
        <div><a class="pic_title" href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews2.id"/></s:param></s:url>" 
  target="_blank"><s:property value="picnews2.title"/></a></div>
        <div class="pic_info">
          <p><s:property value="picnews2.introduce"/></p>
        </div>
      </li>
      <li id="pic_2">
        <div><a class="pic_title" href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews3.id"/></s:param></s:url>" 
  target="_blank"><s:property value="picnews3.title"/></a></div>
        <div class="pic_info">
          <p><s:property value="picnews3.introduce"/></p>
        </div>
      </li>
      <li id="pic_3">
        <div><a class="pic_title" href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews4.id"/></s:param></s:url>" 
  target="_blank"><s:property value="picnews4.title"/></a></div>
        <div class="pic_info">
          <p><s:property value="picnews4.introduce"/></p>
        </div>
      </li>
      <li id="pic_4">
        <div><a class="pic_title" href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews5.id"/></s:param></s:url>" 
  target="_blank"><s:property value="picnews5.title"/></a></div>
        <div class="pic_info">
          <p><s:property value="picnews5.introduce"/></p>
        </div>
      </li>
    </ul>
  </div>
    <SCRIPT type=text/javascript>
    document.getElementById("pic_0").style.backgroundImage='url(picNewsImg/p.jpg)';
  </SCRIPT>
</div>