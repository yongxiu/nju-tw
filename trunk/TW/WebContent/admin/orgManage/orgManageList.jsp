<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/adminList.css" type="text/css"
	media="screen" rel="stylesheet" />
	
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/articleList.js"></script>
	
<s:form name="deleteForm" theme="simple">
<div class="g-toolbar g-toolbar-top" id="dvToolbar_inbox">
  <div class="btngrp">
    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="javascript:window.location.href='/TW/OrgAddPage.do'" id="inbox__delete"><span>添加新的组织机构</span></div>
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
        <th class="wd1" style="width:503px">组织机构</th>
        <th style="width:70px;text-align:center">类别</th>
        <th style="width:160px;text-align:center">操作</th>
      </tr>
    </thead>
  </table>
  <div id="MailListMaininbox" class="txt-12">
    <div id="period_div_inbox2">
      <table class="g-table-comm" id="period_table_inbox2">
      <s:iterator value="orgs">
        <tbody>
        <s:if test="category==1"></s:if>
		  <s:else>
          <tr style="" class="mark0" id="tr_inbox_<s:property value="#stat.index"/>">
          	<td class="wd0"></td>
            <td style="width:503px"><s:property value="department"/></td>
            <td style="width:70px;text-align:center">
            	<s:if test="category==2">
					机构设置
				</s:if>
				<s:if test="category==3">
					基层团委
				</s:if>
				<s:if test="category==4">
					学生组织
				</s:if>
            </td>
            <td style="width:160px;text-align:center" class="action">
            <a href="OrgModifyPage.do?orgid=<s:property value='id'/>">修改</a>
            <a href="OrgDelete.do?orgid=<s:property value='id'/>">删除</a>
            </td>
          </tr>
          </s:else>
        </tbody>
        </s:iterator>
      </table>
    </div>
  </div>
</div>

<div class="g-toolbar g-toolbar-bottom" id="dvToolbar_inbox__bottom">
  <div class="btngrp">
    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="javascript:window.location.href='/TW/admin/orgManage/orgAdd.jsp'" id="inbox__delete"><span>添加新的组织机构</span></div>
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
</s:form>
