var s_url = "http://www.pcbeta.com";

var xmlHttpForNews;
function show_hide(value) {
    for (i=0;i<6;i++) {
        document.getElementById('ss_tab_'+i).style.cssText +=";margin-bottom:1px;cursor: pointer;width:139px;height:30px;line-height:30px;background:#b7dbe8;";
    }
    document.getElementById('ss_tab_'+value).style.cssText +=";width:141px;border-right:0px #ccc solid;background:url(./images/default/new/ss_tab_c.jpg) no-repeat;";
    print_news(value);
}
function print_news(value) {
    var content = document.getElementById('ss_'+value).value;
    if (content == '') {
        startRequestNews(value)
    } else {
        document.getElementById('ss_content').innerHTML = content;
    }
}
function startRequestNews(value) {
    createXMLHttpRequestForNews();
    xmlHttpForNews.onreadystatechange = function(){
        WaitForStateChange(value);
    };
    xmlHttpForNews.open("POST","./get_pcbeta_news.php?param="+value,true);
    xmlHttpForNews.send(null);
}
function WaitForStateChange(value) {
    document.getElementById('ss_content').innerHTML = "<div class='loadding'></div>";
    if(xmlHttpForNews.readyState == 4 ){
        if(xmlHttpForNews.status == 200) {
            document.getElementById('ss_content').innerHTML = xmlHttpForNews.responseText;
            document.getElementById("ss_"+value).value = xmlHttpForNews.responseText;
        }
    }
}
function createXMLHttpRequestForNews(){
    if(window.ActiveXObject){
        try{
            xmlHttpForNews = new ActiveXObject("Microsoft.XMLHTTP");
        }catch(otherMicrosoft){
            try{
                xmlHttpForNews= new ActiveXObject("Microsoft.XMLHTTP");
            }catch(failed){
                xmlHttpForNews= false;
            }
        }
    }else if(window.XMLHttpRequest){
        xmlHttpForNews = new XMLHttpRequest();
    }
    if(!xmlHttpForNews){
        alert("���� XMLHttpRequest ����ʧ��!");
    }
}

function day_week(value) {
    if (value == "d") {
        document.getElementById('day_week_ww').style.display = "none";
        document.getElementById('day_week_w').className  = "";
        document.getElementById('day_week_yy').style.display = "none";
        document.getElementById('day_week_y').className  = "";
        document.getElementById('day_week_dd').style.display = "block";
        document.getElementById('day_week_d').className  = "day_week_c";
    }
    if (value == "w") {
        document.getElementById('day_week_dd').style.display = "none";
        document.getElementById('day_week_d').className  = "";
        document.getElementById('day_week_yy').style.display = "none";
        document.getElementById('day_week_y').className  = "";
        document.getElementById('day_week_ww').style.display = "block";
        document.getElementById('day_week_w').className  = "day_week_c";
    }
    if (value == "y") {
        document.getElementById('day_week_dd').style.display = "none";
        document.getElementById('day_week_d').className  = "";
        document.getElementById('day_week_ww').style.display = "none";
        document.getElementById('day_week_w').className  = "";
        document.getElementById('day_week_yy').style.display = "block";
        document.getElementById('day_week_y').className  = "day_week_c";
    }
}

//�ı���õ���ʧȥ����
function clearTxt(id,txt) {
    if (document.getElementById(id).value == txt)
        document.getElementById(id).value="" ;
    return ;
}
function fillTxt(id,txt) {
    if ( document.getElementById(id).value == "" )
        document.getElementById(id).value=txt;
    return ;
}

function $$(id) {
    return document.getElementById(id);
}
function addLoadEvent(func){
    var oldonload = window.onload;
    if (typeof window.onload != 'function') {
        window.onload = func;
    } else {
        window.onload = function(){
            oldonload();
            func();
        }
    }
}
function moveElement(elementID,final_x,final_y,interval) {
    if (!document.getElementById) return false;
    if (!document.getElementById(elementID)) return false;
    var elem = document.getElementById(elementID);
    if (elem.movement) {
        clearTimeout(elem.movement);
    }
    if (!elem.style.left) {
        elem.style.left = "0px";
    }
    if (!elem.style.top) {
        elem.style.top = "0px";
    }
    var xpos = parseInt(elem.style.left);
    var ypos = parseInt(elem.style.top);
    if (xpos == final_x && ypos == final_y) {
        return true;
    }
    if (xpos < final_x) {
        var dist = Math.ceil((final_x - xpos)/10);
        xpos = xpos + dist;
    }
    if (xpos > final_x) {
        var dist = Math.ceil((xpos - final_x)/10);
        xpos = xpos - dist;
    }
    if (ypos < final_y) {
        var dist = Math.ceil((final_y - ypos)/10);
        ypos = ypos + dist;
    }
    if (ypos > final_y) {
        var dist = Math.ceil((ypos - final_y)/10);
        ypos = ypos - dist;
    }
    elem.style.left = xpos + "px";
    elem.style.top = ypos + "px";
    var repeat = "moveElement('"+elementID+"',"+final_x+","+final_y+","+interval+")";
    elem.movement = setTimeout(repeat,interval);
}
function iFocusChange() {
    if(!$$('ifocus')) return false;
    $$('ifocus').onmouseover = function(){
        atuokey = true
    };
    $$('ifocus').onmouseout = function(){
        atuokey = false
    };
    var iFocusBtns = $$('ifocus_btn').getElementsByTagName('li');
    var listLength = iFocusBtns.length;
    for(var i=0;i<listLength;i++){
        iFocusBtns[i].index=i;
        iFocusBtns[i].onmouseover = function() {
            moveElement('ifocus_piclist',0,-(this.index*300),5);
            classCurrent('ifocus_btn',this.index);
        }
    }
}
setInterval('autoiFocus()',5500);
var atuokey = false;
function autoiFocus() {
    if(!$$('ifocus')) return false;
    if(atuokey) return false;
    var focusBtnList = $$('ifocus_btn').getElementsByTagName('li');
    var listLength = focusBtnList.length;
    for(var i=0; i<listLength; i++) {
        if (focusBtnList[i].className == 'piccurrent') var currentNum = i;
    }
    if (currentNum!=listLength-1){
        moveElement('ifocus_piclist',0,-((currentNum+1-0)*300),5);
        classCurrent('ifocus_btn',currentNum+1-0);
    }
    else{
        moveElement('ifocus_piclist',0,0,5);
        classCurrent('ifocus_btn',0);
    }
}
function classCurrent(iFocusBtnID,n){
    var iFocusBtns= $$(iFocusBtnID).getElementsByTagName('li');
    for(var i=0; i<iFocusBtns.length; i++) {
        document.getElementById("pic_"+i).style.backgroundImage='';
        if (i==n) {
            iFocusBtns[n].className='piccurrent';
            document.getElementById("pic_"+n).style.backgroundImage='url(picNewsImg/p.jpg)';
        } else {
            iFocusBtns[i].className='normal';
        }
    }
}
addLoadEvent(iFocusChange);
function show_bbs(value) {
    for (i=1;i<5;i++) {
        document.getElementById('bbs_0'+i).style.backgroundImage='url('+s_url+'/templates/default/img/bbs_0'+i+'.jpg)';
        document.getElementById('bbs_'+i).style.display="none";
        document.getElementById('bbs_'+i).style.border="0px";
    }
    document.getElementById('bbs_0'+value).style.backgroundImage='url('+s_url+'/templates/default/img/bbs_0'+value+'_c.jpg)';
    document.getElementById('bbs_'+value).style.display="";
}

//����
function searchBox(){
    if(!$('more_search')||!$('search_box')) return;
    $('more_search').onclick=function(){
        $('search_box').className= '';
        $('more_search').style.display='none';
        $('close_search').style.display='block';
    }

    $('close_search').onclick=function(){
        $('search_box').className= 'fixoneline';
        $('more_search').style.display='block';
        $('close_search').style.display='none';
    }

}
addLoadEvent(searchBox);

function addseccode() {

    if(noseccode != 0) return;

    $('login_authcode_input').style.display = 'block';
    if($('login_authcode_img').style.display == 'block') {
        $('login_authcode_img').style.display='none';
    }
    $('login_showclose').style.display = 'block';
    $('user_login_position').className = 'current';
}

function showseccode() {
    $('login_authcode_img').style.display='block';
    updateseccode();
}

function hidesec() {
    $('login_authcode_input').style.display = 'none';
    $('login_showclose').style.display = 'none';
    $('login_authcode_img').style.display = 'none';
    $('user_login_position').className = '';
}

function AddFavorite(sURL, sTitle)
{
    try
    {
        window.external.addFavorite(sURL, sTitle);
    }
    catch (e)
    {
        try
        {
            window.sidebar.addPanel(sTitle, sURL, "");
        }
        catch (e)
        {
            alert("�����ղ�ʧ�ܣ���ʹ��Ctrl+D�������");
        }
    }
}
function SetHome(obj,vrl){
    try{
        obj.style.behavior='url(#default#homepage)';
        obj.setHomePage(vrl);
    }
    catch(e){
        if(window.netscape) {
            try {
                netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
            }
            catch (e) {
                alert("�˲�����������ܾ�\n�����������ַ�����롰about:config�����س�\nȻ�� [signed.applets.codebase_principal_support]��ֵ����Ϊ'true',˫�����ɡ�");
            }
            var prefs = Components.classes['@mozilla.org/preferences-service;1'].getService(Components.interfaces.nsIPrefBranch);
            prefs.setCharPref('browser.startup.homepage',vrl);
        }
    }
}

function border(value) {
    document.getElementById(value).style.border = "1px solid #ffc400";
}
function noneborder(value) {
    document.getElementById(value).style.border = "1px solid #d0d0d0";
}

