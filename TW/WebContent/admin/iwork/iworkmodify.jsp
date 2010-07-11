<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/topic.css" type="text/css"
	media="screen" rel="stylesheet" />

<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/articleList.js"></script>

<!-- previous and next -->
<s:set name="total"><s:property value="totalpages"/></s:set>
<s:set name="previous"><s:property value="%{currentPage-1}"/></s:set>
<s:if test="#previous==0">
	<s:set name="previous"><s:property value="1"/></s:set>

</s:if>

<s:set name="next"><s:property value="%{currentPage+1}"/></s:set>
<s:set name="totalOver"><s:property value="%{totalpages+1}"/></s:set>
<s:if test="#next==#totalOver">
	<s:set name="next"><s:property value="totalpages"/></s:set>
	
</s:if>

<div id="dvTitleinbox">
<br/><div><table style="width:790px;"><tr><td align=center><table class="t_s_Table"><tr><td style="width:200px;height:70px;font-size:16px; font-family:'微软雅黑';">活动专题</td><td style="width:200px;height:70px"><img src="<s:property value="img"/>" width="161" height="66"/></td></tr></table></td></tr></table></div><br/>
  <div class="g-title-1">
    <div class="fn-fle">
      <h2>重点工作</h2>
      <span class="txt-info">(<strong><s:property value="topicid"/></strong>)</span></div>
  </div>
</div>
<div id="topicForm">
<s:form name="topicForm" action="admin.IWorkModifySave.do?topicid=%{topicid}">
	<div class="g-toolbar g-toolbar-top" id="dvToolbar_inbox">
	  <div class="btngrp">
	    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="topicForm.submit();" id="inbox__delete"><span>保存</span></div>
	  </div>
	  
	  <div class="btngrp btngrp-ext"><a href="admin.IWorkModify.do?currentPage=1&topicid=<s:property value='topicid'/>" class="txt-disabd">首页</a><a href="admin.IWorkModify.do?currentPage=<s:property value='#previous'/>&topicid=<s:property value='topicid'/>" class="txt-disabd">上页</a><a href="admin.IWorkModify.do?currentPage=<s:property value='#next'/>&topicid=<s:property value='topicid'/>" onclick="MM.inbox.goPage(2)">下页</a><a href="TopicManagePageTiles.do?currentPage=<s:property value='#total'/>&topicid=<s:property value='topicid'/>" onclick="MM.inbox.goPage(7)">末页</a>
	
	
	<select onchange="var url='admin.IWorkModify.do?currentPage='+this.value;  javascript:window.location.href=url;"> 
   	<s:set name="current"> <s:property value="currentPage"/> </s:set>
    <s:iterator value="pageCount" id="mark">
   		<s:set name="markValue"><s:property value="mark"/> </s:set>
    	
    	<s:if test="#current==#markValue">
    	<option value="<s:property value="mark"/>&topicid=<s:property value='topicid'/>" selected="selected"><s:property value="mark"/>/<s:property value="totalpages"/></option>
    	</s:if>
    	<s:else>
    	<option value="<s:property value="mark"/>&topicid=<s:property value='topicid'/>" ><s:property value="mark"/>/<s:property value="totalpages"/></option>
    	</s:else>
    </s:iterator>
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
	      <s:iterator value="articles" id="article" status="stat">
	        <tbody>
	          <tr style="" class="mark0" id="tr_inbox_<s:property value="#stat.index"/>">
	          	<td class="wd0"></td>
	            <td class="wd1 ckb">
	            <input  class="check1" type = "checkbox" name="checkId" value="<s:property value="id"/>"
				<s:set name="ifchecked"> <s:property value="#article.checked"/> </s:set>
				<s:if test="#ifchecked==1">
				checked
				</s:if>

			
			/>
		
			</td>
	            <td class="wd2"><s:property value="title"/></td>
	            <td class="wd3"><s:property value="category"/></td>
	            <td class="wd4"><s:property value="date"/></td>
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
	    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="topicForm.submit();" id="inbox__delete"><span>保存</span></div>
	  </div>

	
	  <div class="btngrp btngrp-ext"><a href="TopicManagePageTiles.do?currentPage=1&topicid=<s:property value='topicid'/>" class="txt-disabd">首页</a><a href="TopicManagePageTiles.do?currentPage=<s:property value='#previous'/>&topicid=<s:property value='topicid'/>" class="txt-disabd">上页</a><a href="TopicManagePageTiles.do?currentPage=<s:property value='#next'/>&topicid=<s:property value='topicid'/>" onclick="MM.inbox.goPage(2)">下页</a><a href="TopicManagePageTiles.do?currentPage=<s:property value='#total'/>&topicid=<s:property value='topicid'/>" onclick="MM.inbox.goPage(7)">末页</a>
	    <select onchange="var url='admin.IWorkModify.do.do?currentPage='+this.value;  javascript:window.location.href=url;"> 
   	<s:set name="current"> <s:property value="currentPage"/> </s:set>
    <s:iterator value="pageCount" id="mark">
   		<s:set name="markValue"><s:property value="mark"/> </s:set>
    	
    	<s:if test="#current==#markValue">
    	<option value="<s:property value="mark"/>&topicid=<s:property value='topicid'/>" selected="selected"><s:property value="mark"/>/<s:property value="totalpages"/></option>
    	</s:if>
    	<s:else>
    	<option value="<s:property value="mark"/>&topicid=<s:property value='topicid'/>" ><s:property value="mark"/>/<s:property value="totalpages"/></option>
    	</s:else>
    </s:iterator>
  </select> 
	  </div>
	</div>
</s:form>
</div>
