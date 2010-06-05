<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<link href="<%=request.getContextPath()%>/css/adminList.css" type="text/css"
	media="screen" rel="stylesheet" />
	
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/articleList.js"></script>
	
<div id="dvTitleinbox">
  <div class="g-title-1">
    <div class="fn-fle">
      <h2>管理用户</h2>
      <span class="txt-info">(共 <strong>133</strong> 位)</span></div>
  </div>
</div>
<div class="g-toolbar g-toolbar-top" id="dvToolbar_inbox">
  <div class="btngrp">
    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="window.location.href='/TW/AddUserPage.do'" title="" id="inbox__delete"><span>添加用户</span></div>
  </div>
  
  <div class="btngrp">
    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="MM.inbox.deleteList('delete');" title="" id="inbox__delete"><span>删除用户</span></div>
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
        <th class="wd1 ckb"><input id="checkbox_inbox_all" title="全选/不选　本页所有文章" type="checkbox"></th>
        <th style="width:50px;">用户ID</th>
        <th style="width:130px;">用户名</th>
        <th style="width:130px;">密码</th>
        <th style="width:130px;">姓名</th>
        <th style="width:130px;">角色</th>
        <th style="width:101px;">操作</th>
      </tr>
    </thead>
  </table>
  <div id="MailListMaininbox" class="txt-12">
    <div id="period_div_inbox2">
      <table class="g-table-comm" id="period_table_inbox2">
      <s:iterator value="users" status="stat">
        <tbody>
          <tr style="" class="mark0" id="tr_inbox_<s:property value="#stat.index"/>">
          	<td class="wd0"></td>
            <td class="wd1 ckb"><input title="选择/不选" value="178:1tbishvRp0X9dqUmMAAAsi" name="checkbox_inbox" id="checkbox_inbox_<s:property value="#stat.index"/>" type="checkbox"></td>
            <td style="width:50px;"><s:property value="id"/></td>
            <td style="width:130px;"><s:property value="username"/></td>
            <td style="width:130px;"><s:property value="password"/></td>
            <td style="width:130px;"><s:property value="name"/></td>
            <td style="width:130px;"><s:if test="role==1">
						超级管理员
					</s:if>
					<s:else>
						普通用户
					</s:else></td>
			<td style="width:101px;"><a href='#' onclick="javascript:delUser('<s:url action="DeleteUser"><s:param name="id"><s:property value="id"/></s:param></s:url>');return false;">
					删除
				</a><a href='<s:url action="GetModifyList"><s:param name="id"><s:property value="id"/></s:param></s:url>'>
					修改
				</a></td>
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
    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="window.location.href='/TW/admin/adduser.jsp'" title="" id="inbox__delete"><span>添加用户</span></div>
  </div>
  
  <div class="btngrp">
    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="MM.inbox.deleteList('delete');" title="" id="inbox__delete"><span>删除用户</span></div>
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
