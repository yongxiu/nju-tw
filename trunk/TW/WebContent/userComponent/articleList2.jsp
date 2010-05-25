<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/articleList2.css" type="text/css"
	media="screen" rel="stylesheet" />
	
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/articleList.js"></script>
	
<div id="dvTitleinbox">
  <div class="g-title-1">
    <div class="fn-fle">
      <h2>已发表的文章</h2>
      <span class="txt-info">(共 <strong>133</strong> 篇)</span></div>
  </div>
</div>
<div class="g-toolbar g-toolbar-top" id="dvToolbar_inbox">
  <div class="btngrp">
    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="MM.inbox.deleteList('delete');" title="" id="inbox__delete"><span>删 除</span></div>
  </div>
  
  <span class="msg-info">(若要修改，请直接点击文章)</span>
  
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
        <th class="wd1 ckb"><input id="checkbox_inbox_all" title="全选/不选　本页所有文章" type="checkbox"></th>
        <th class="wd2">文章标题</th>
        <th class="wd3">文章类型</th>
        <th class="wd4">时间</th>
      </tr>
    </thead>
  </table>
  <div id="MailListMaininbox" class="txt-12">
    <div id="period_div_inbox2">
      <table class="g-table-comm" id="period_table_inbox2">
      <s:iterator value="articles" id="articles" status="stat">
        <tbody>
          <tr style="" class="mark0" id="tr_inbox_<s:property value="#stat.index"/>">
          	<td class="wd0"></td>
            <td class="wd1 ckb"><input title="选择/不选" value="178:1tbishvRp0X9dqUmMAAAsi" name="checkbox_inbox" id="checkbox_inbox_<s:property value="#stat.index"/>" type="checkbox"></td>
            <td class="wd2"><a href="<s:url action="ShowModifyArticle.do"> <s:param name="id"><s:property value="id"/></s:param> </s:url>"><s:property value="title"/></a></td>
            <td class="wd3"><s:property value="category"/></td>
            <td class="wd4" title="2010年05月15日 23:29(六)"><s:property value="date"/></td>
          </tr>
        </tbody>
        </s:iterator>
      </table>
    </div>
  </div>
</div>
<div class="ibx-sel" id="divBom_inbox" style=""> 选择： <a href="javascript:selAll()">全部</a> - <a href="javascript:selConvert()">反选</a> - <a href="javascript:selNone()">不选</a> </div>

<div class="g-toolbar g-toolbar-bottom" id="dvToolbar_inbox__bottom">
  <div class="btngrp">
    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="MM.inbox.deleteList('delete');" title="" id="inbox__bottom__delete"><span>删 除</span></div>
  </div>

	<span class="msg-info">(若要修改，请直接点击文章)</span>

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
