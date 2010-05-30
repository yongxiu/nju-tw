<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<LINK rel=stylesheet type=text/css href="css/picNews.css">

<DIV id="bimg">

<div class="picNewsImgGroup">

<DIV class="ititlediv2" name="f" style="width:456px; height:281px; float:left;"><A onmouseover="this.style.cursor='hand'" href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews1.id"/></s:param></s:url>" title="<s:property value="picnews1.title"/>" onfocus="this.blur();">
<IMG class="picNewsImg" src="<s:property value="picnews1.path"/>"/></A></DIV>

<DIV class="ititlediv2" name="f" style="width:456px; height:281px; float:left;"><A onmouseover="this.style.cursor='hand'" href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews2.id"/></s:param></s:url>" title="<s:property value="picnews2.title"/>" onfocus="this.blur();">
<IMG class="picNewsImg" src="<s:property value="picnews2.path"/>"/></A></DIV>	

<DIV class="show" name="f" style="width:456px; height:281px; float:left;"><A onmouseover="this.style.cursor='hand'" href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews3.id"/></s:param></s:url>" title="<s:property value="picnews3.title"/>" onfocus="this.blur();">
<img class="picNewsImg" src="<s:property value="picnews3.path"/>"/></A></DIV>	

<DIV class="ititlediv2" name="f" style="width:456px; height:281px; float:left;"><A onmouseover="this.style.cursor='hand'" href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews4.id"/></s:param></s:url>" title="<s:property value="picnews4.title"/>" onfocus="this.blur();">
<IMG class="picNewsImg" src="<s:property value="picnews4.path"/>"/></A></DIV>	

<DIV class="ititlediv2" name="f" style="width:456px; height:281px; float:left;"><A onmouseover="this.style.cursor='hand'" href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews5.id"/></s:param></s:url>" title="<s:property value="picnews5.title"/>" onfocus="this.blur();">
<IMG class="picNewsImg" src="<s:property value="picnews5.path"/>"/></A></DIV>

</div>

<DIV id="simg">
<DIV name="f" class="" onmouseover="this.style.cursor='hand';" >1</DIV>
<DIV name="f" class="" onmouseover="this.style.cursor='hand';" >2</DIV>
<DIV name="f" class="" onmouseover="this.style.cursor='hand';" >3</DIV>
<DIV name="f" class="" onmouseover="this.style.cursor='hand';" >4</DIV>
<DIV name="f" class="" onmouseover="this.style.cursor='hand';" style="border-right:none;">5</DIV>
</DIV>

<DIV id="infoc">
<DIV class="ititlediv2" name="f" id="picNewsContent"><A href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews1.id"/></s:param></s:url>" title="<s:property value="picnews1.title"/>" onfocus="this.blur();">
<h3><s:property value="picnews1.title"/></h3>&emsp;&emsp;
<s:property value="picnews1.introduce"/></A></DIV>
<DIV class="ititlediv2" name="f" id="picNewsContent"><A href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews2.id"/></s:param></s:url>" title="<s:property value="picnews2.title"/>" onfocus="this.blur();">
<h3><s:property value="picnews2.title"/></h3>&emsp;&emsp;
<s:property value="picnews2.introduce"/></A></DIV>
<DIV class="show" name="f" id="picNewsContent"><A href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews3.id"/></s:param></s:url>" title="<s:property value="picnews3.title"/> .." onfocus="this.blur();">
<h3><s:property value="picnews3.title"/></h3>&emsp;&emsp;<s:property value="picnews3.introduce"/></A></DIV>
<DIV class="ititlediv2" name="f" id="picNewsContent"><A href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews4.id"/></s:param></s:url>" title="<s:property value="picnews4.title"/>" onfocus="this.blur();">
<h3><s:property value="picnews4.title"/></h3>&emsp;&emsp;<s:property value="picnews4.introduce"/></A></DIV>
<DIV class="ititlediv2" name="f" id="picNewsContent"><A href="<s:url action="AticalDetail.do"><s:param name="id"><s:property value="picnews5.id"/></s:param></s:url>" title="<s:property value="picnews5.title"/>" onfocus="this.blur();">
<h3><s:property value="picnews5.title"/></h3>&emsp;&emsp;<s:property value="picnews5.introduce"/></A></DIV>
</DIV> 
              
</DIV>

<SCRIPT language="JavaScript">
// JavaScript Document
	function getid(o){ return (typeof o == "object")?o:document.getElementById(o);}

	function getNames(obj,name,tij)
	{
		var plist = getid(obj).getElementsByTagName(tij);
		var rlist = new Array();
		for(i=0;i<plist.length;i++){if(plist[i].getAttribute("name") == name){rlist[rlist.length] = plist[i];}}
		return rlist;
	}

	function fiterplay(obj,num,t,name,c1,c2)
	{
		var fitlist = getNames(obj,name,t);
		for(i=0;i<fitlist.length;i++)
		{
			if(i == num)
			{
				fitlist[i].className = c1;

			}
			else
			{
				fitlist[i].className = c2;
			}


		}

	}

	function play(obj,num)
	{
		var s = getid('simg');
		var b = getid('bimg');
		var z = getid('infoc');
		try	
		{
			with(b)
			{
				filters[0].Apply();	

				fiterplay(b,num,"div","f","show","ititlediv2");	
				
				fiterplay(s,num,"div","f","s","");
				
				fiterplay(z,num,"div","f","show","ititlediv2");	
				filters[0].play();
			}
		}
		catch(e)
		{
				fiterplay(b,num,"div","f","show","ititlediv2");	
				
				fiterplay(s,num,"div","f","s","");	
				
				fiterplay(z,num,"div","f","show","ititlediv2");	
		}
	}
	
	function format()
	{
		var s = getid('simg');
		var l = getNames(s,"f","div");
		for(i=0;i<l.length;i++)
		{
			l[i].num = i;
			l[i].onclick = function()
			{
				play(this,this.num);
			};
		}
	}

	var autoStart = 0;
	var n = 0;
	function clearAuto() {clearInterval(autoStart);}
	function setAuto(){autoStart=setInterval("auto(n)", 3000);}
	function auto()
	{

		var s = getid("simg");
		var x = getNames(s,"f","div");
		n++;
		if(n>(x.length-1))
		{ n = 0; }
		play(x[n],n);
	}
	format();
	setAuto();
</script>

<!--
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
-->