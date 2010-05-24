<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/articleList2.css" type="text/css"
	media="screen" rel="stylesheet" />
<div id="dvTitleinbox">
  <div class="g-title-1">
    <div class="fn-fle">
      <h2>收件箱</h2>
      <span class="txt-info">(共 <strong>133</strong> 封)</span></div>
  </div>
</div>
<div class="g-toolbar g-toolbar-top" id="dvToolbar_inbox">
  <div class="btngrp">
    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="MM.inbox.deleteList('delete');" title="" id="inbox__delete"><span>删 除</span></div>
  </div>

  <div class="btngrp">
    <div class="btn btn-dft btn-dft-gc btn-dft-pd" onmouseover="this.className='btn btn-dft btn-dft-gc btn-dft-gc-hover btn-dft-pd'" onmouseout="this.className='btn btn-dft btn-dft-gc btn-dft-pd'" onmousedown="this.className='btn btn-dft btn-dft-gc btn-dft-gc-active btn-dft-pd'" onmouseup="this.className='btn btn-dft btn-dft-gc btn-dft-gc-hover btn-dft-pd'" onclick="GE.showToolbarMenu('inbox__sort');EV.stopEvent();" title="" id="inbox__sort"><span>查看</span><b class="arr"></b></div>
    <div class="btn btn-dft btn-dft-gr btn-dft-pd" onmouseover="this.className='btn btn-dft btn-dft-gr btn-dft-gr-hover btn-dft-pd'" onmouseout="this.className='btn btn-dft btn-dft-gr btn-dft-pd'" onmousedown="this.className='btn btn-dft btn-dft-gr btn-dft-gr-active btn-dft-pd'" onmouseup="this.className='btn btn-dft btn-dft-gr btn-dft-gr-hover btn-dft-pd'" onclick="GE.showToolbarMenu('inbox__more');EV.stopEvent();" title="" id="inbox__more"><span>更多操作</span><b class="arr"></b></div>
  </div>
  
  <div class="btngrp btngrp-ext"><a href="javascript:fGoto();" class="txt-disabd">首页</a><a href="javascript:fGoto();" class="txt-disabd">上页</a><a href="javascript:fGoto();" onclick="MM.inbox.goPage(2)">下页</a><a href="javascript:fGoto();" onclick="MM.inbox.goPage(7)">末页</a>
    <select onchange="MM.inbox.goPage(this.value);">
      <option value="1" selected="selected">1 / 7</option>
      <option value="2">2 / 7</option>
      <option value="3">3 / 7</option>
      <option value="4">4 / 7</option>
      <option value="5">5 / 7</option>
      <option value="6">6 / 7</option>
      <option value="7">7 / 7</option>
    </select>
  </div>
</div>
<div class="gIbx-lineinfo" id="inboxStatusDiv" style="display: none;"></div>
<div class="gIbx-tablayout">
  <table class="g-table-comm" id="inboxTitleTable">
    <thead>
      <tr>
        <th class="wd0"></th>
        <th class="wd1 ckb"><input id="checkbox_inbox_all" title="全选/不选　本页所有邮件" onclick="MM.inbox.click('all',this.checked)" type="checkbox"></th>
        <th class="wd2" onclick="MM.inbox.rankList('read')" title="点击可 按未读 排序"><b class="ico ico-mailatb" title="邮件类型"></b></th>
        <th class="wd3" onclick="MM.inbox.rankList('from')" title="点击可按 发件人 排序"><a href="javascript:fGoto();" hidefocus="true">发件人</a></th>
        <th class="wd5" onclick="MM.inbox.rankList('subject')" title="点击可按 主题 排序"><a href="javascript:fGoto();" hidefocus="true">主题</a></th>
        <th class="wd6" onclick="MM.inbox.rankList('attached')" title="点击可 按附件 排序"><b class="ico ico-attachment"></b></th>
        <th class="wd7" onclick="MM.inbox.rankList('date')" title="点击可按 时间 排序"><a href="javascript:fGoto();" hidefocus="true">时间<b class="ico ico-list-down"></b></a></th>
      </tr>
    </thead>
  </table>
  <div id="MailListMaininbox" class="txt-12">
    <div id="period_div_inbox2">
      <table class="g-table-comm" id="period_table_inbox2">
        <tbody>
          <tr style="" class="  mark0" id="tr_inbox_0">
            <td class="wd1 ckb"><input title="选择/不选" value="178:1tbishvRp0X9dqUmMAAAsi" name="checkbox_inbox" id="checkbox_inbox_0" type="checkbox"></td>
            <td class="wd3"><nobr><span class="" email="support@mydomain.com">support</span></nobr></td>
            <td class="wd5"><a title="Order&nbsp;Confirmation&nbsp;for&nbsp;ODR-4534460" href="javascript:fGoto();" hidefocus="true" onclick="return false;"><nobr>Order&nbsp;Confirmation&nbsp;for&nbsp;ODR-4534460</nobr></a></td>
            <td class="wd6">&nbsp;</td>
            <td title="2010年05月15日 23:29(六)" class="wd7">5月15日</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</div>
<div class="ibx-sel" id="divBom_inbox" style=""> 选择： <a href="javascript:fGoto()" onclick="MM.inbox.click('all',true);">全部</a> - <a href="javascript:fGoto()" onclick="MM.inbox.click('fan',true);">反选</a> - <a href="javascript:fGoto()" onclick="MM.inbox.click('all',false);">不选</a> </div>

<div class="g-toolbar g-toolbar-bottom" id="dvToolbar_inbox__bottom">
  <div class="btngrp">
    <div tabindex="0" class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="MM.inbox.deleteList('delete');" title="" id="inbox__bottom__delete"><span>删 除</span></div>
  </div>

  <div class="btngrp">
    <div tabindex="0" class="btn btn-dft btn-dft-gc btn-dft-pd" onmouseover="this.className='btn btn-dft btn-dft-gc btn-dft-gc-hover btn-dft-pd'" onmouseout="this.className='btn btn-dft btn-dft-gc btn-dft-pd'" onmousedown="this.className='btn btn-dft btn-dft-gc btn-dft-gc-active btn-dft-pd'" onmouseup="this.className='btn btn-dft btn-dft-gc btn-dft-gc-hover btn-dft-pd'" onclick="GE.showToolbarMenu('inbox__bottom__sort');EV.stopEvent();" title="" id="inbox__bottom__sort"><span>查看</span><b class="arr"></b></div>
    <div tabindex="0" class="btn btn-dft btn-dft-gr btn-dft-pd" onmouseover="this.className='btn btn-dft btn-dft-gr btn-dft-gr-hover btn-dft-pd'" onmouseout="this.className='btn btn-dft btn-dft-gr btn-dft-pd'" onmousedown="this.className='btn btn-dft btn-dft-gr btn-dft-gr-active btn-dft-pd'" onmouseup="this.className='btn btn-dft btn-dft-gr btn-dft-gr-hover btn-dft-pd'" onclick="GE.showToolbarMenu('inbox__bottom__more');EV.stopEvent();" title="" id="inbox__bottom__more"><span>更多操作</span><b class="arr"></b></div>
  </div>
  <div class="btngrp btngrp-ext"><a href="javascript:fGoto();" class="txt-disabd">首页</a><a href="javascript:fGoto();" class="txt-disabd">上页</a><a href="javascript:fGoto();" onclick="MM.inbox.goPage(2)">下页</a><a href="javascript:fGoto();" onclick="MM.inbox.goPage(7)">末页</a>
    <select onchange="MM.inbox.goPage(this.value);">
      <option value="1" selected="selected">1 / 7</option>
      <option value="2">2 / 7</option>
      <option value="3">3 / 7</option>
      <option value="4">4 / 7</option>
      <option value="5">5 / 7</option>
      <option value="6">6 / 7</option>
      <option value="7">7 / 7</option>
    </select>
  </div>
</div>
  
<table cellspacing="0">
<tr class="even"><td class="title">标题</td> <td class="date">创建日期</td> <td class="category">文章类别</td> <td class="act" colspan="2">操作</td></tr>
<s:iterator value="articles" id="articles" status="stat">
<tr
<s:if test="#stat.odd">class="odd"</s:if>
<s:else>class="even"</s:else>
>
		<td class="title"><s:property value="title"/></td>
		<td class="date"><s:property value="date"/></td>
		<td class="category"><s:property value="category"/></td>
	
		<td class="act"><a href="<s:url action="ShowModifyArticle.do"> <s:param name="id"><s:property value="id"/></s:param> </s:url>">√修改</a></td>
		<td class="act"><a href="<s:url action="ShowModifyArticle.do"> <s:param name="id"><s:property value="id"/></s:param> </s:url>">×删除</a></td>
</tr>
</s:iterator>
</table>