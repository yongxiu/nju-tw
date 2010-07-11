<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/topic.css" type="text/css"
	media="screen" rel="stylesheet" />

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/radioList.js"></script>

<div id="dvTitleinbox">
<br/><div><table style="width:790px;"><tr><td align=center><table class="t_s_Table"><tr><td style="width:200px;height:70px;font-size:16px; font-family:'微软雅黑';">活动专题</td><td style="width:200px;height:70px"><img src="<s:property value="path"/>" width="161" height="66"/></td></tr></table></td></tr></table></div><br/>
  <div class="g-title-1">
    <div class="fn-fle">
      <h2>品牌项目</h2>
	</div>
  </div>
</div>
<div id="topicForm">
<s:form name="topicForm" theme="simple" action="admin.BrandChangeSave.do?topicid=%{topicid}">
	<div class="g-toolbar g-toolbar-top" id="dvToolbar_inbox">
	  <div class="btngrp">
	    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="topicForm.submit();" id="inbox__delete"><span>保存</span></div>
	  </div>

	</div>
	<div class="gIbx-lineinfo" id="inboxStatusDiv" style="display: none;"></div>
	<div class="gIbx-tablayout">
	  <table class="g-table-comm" id="inboxTitleTable">
	    <thead>
	      <tr>
	        <th class="wd0"></th>
	        <th class="wd1 ckb"></th>
	        <th class="wd2" style="width:737px">工作名称</th>
	      </tr>
	    </thead>
	  </table>
	  <div id="MailListMaininbox" class="txt-12">
	    <div id="period_div_inbox2">
	      <table class="g-table-comm" id="period_table_inbox2">
	      <s:iterator value="brands" id="article" status="stat">
	        <tbody>
	          <tr style="" class="mark0" id="tr_inbox_<s:property value="#stat.index"/>">
	          	<td class="wd0"></td>
	            <td class="wd1 ckb">
	           
	            <s:set name="topicid"> <s:property value="topicid"/> </s:set>
	            <s:set name="currentid"> <s:property value="id"/> </s:set>
				
	            	<input  class="check1" type = "radio" name="checkId" value="<s:property value="id"/>" <s:if test="#topicid==#currentid">
				checked
				</s:if>
				/>
				
					
				</td>
	            <td class="wd2" style="width:737px"><s:property value="name"/></td>
	          </tr>
	        </tbody>
	        </s:iterator>
	      </table>
	    </div>
	  </div>
	</div>

	<div class="g-toolbar g-toolbar-bottom" id="dvToolbar_inbox__bottom">
	  <div class="btngrp">
	    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="topicForm.submit();" id="inbox__delete"><span>保存</span></div>
	  </div>

	</div>
</s:form>
</div>
