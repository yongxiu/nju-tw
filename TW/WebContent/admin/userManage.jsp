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
    </div>
  </div>
</div>
<div class="g-toolbar g-toolbar-top" id="dvToolbar_inbox">
  <div class="btngrp">
    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="window.location.href='/TW/AddUserPage.do'" title="" id="inbox__delete"><span>添加用户</span></div>
  </div>
  
</div>
<div class="gIbx-lineinfo" id="inboxStatusDiv" style="display: none;"></div>
<div class="gIbx-tablayout">
  <table class="g-table-comm" id="inboxTitleTable">
    <thead>
      <tr>
        <th class="wd0"></th>
        <th class="wd1 ckb"></th>
        <th style="width:50px;">用户ID</th>
        <th style="width:130px;">用户名</th>
        <th style="width:130px;">密码</th>
        <th style="width:130px;">姓名</th>
        <th style="width:130px;">角色</th>
        <th style="width:101px;text-align:center;">操作</th>
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
            <td class="wd1 ckb"></td>
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
			<td style="width:101px;text-align:center;" class="action"><a href='#' onclick="javascript:delUser('<s:url action="DeleteUser"><s:param name="id"><s:property value="id"/></s:param></s:url>');return false;">
					删除</a>&nbsp;<a href='<s:url action="GetModifyList"><s:param name="id"><s:property value="id"/></s:param></s:url>'>修改</a></td>
          </tr>
        </tbody>
        </s:iterator>
      </table>
    </div>
  </div>
</div>

<div class="g-toolbar g-toolbar-bottom" id="dvToolbar_inbox__bottom">
  <div class="btngrp">
    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="window.location.href='/TW/admin/adduser.jsp'" title="" id="inbox__delete"><span>添加用户</span></div>
  </div>


</div>
