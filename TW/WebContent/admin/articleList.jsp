<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/adminList.css" type="text/css"
	media="screen" rel="stylesheet" />
	
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/articleList.js"></script>

	
<div id="dvTitleinbox">
  <div class="g-title-1">
    <div class="fn-fle">
      <h2>所有文章</h2>
      <span class="txt-info">(共 <strong><s:property value="totalnumber"/></strong> 篇)</span></div>
  </div>
</div>
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

<s:form name="deleteForm" theme="simple">
<div class="g-toolbar g-toolbar-top" id="dvToolbar_inbox">
  <div class="btngrp">
    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="deleteForm.action='admin.DeleteArticle.do';deleteForm.submit();" id="inbox__delete"><span>删 除</span></div>
  </div>
  
  <span class="msg-info">(若要修改，请直接点击文章)</span>
  <s:set name="current"> <s:property value="currentPage"/> </s:set>
  
  <div class="btngrp btngrp-ext"><a href="admin.ArticlePage.do?currentPage=1">首页</a><a 
  	<s:if test="#current==1">
  	class="txt-disabd"
  	</s:if>
  	<s:else>
  	href="admin.ArticlePage.do?currentPage=<s:property value='#previous'/>" 
  	</s:else>>上页</a><a 
  	<s:if test="#current==#totalOver-1">
  	class="txt-disabd"
  	</s:if>
  	<s:else>
  	href="admin.ArticlePage.do?currentPage=<s:property value='#next'/>"
  	</s:else>>下页</a><a href="admin.ArticlePage.do?currentPage=<s:property value='#total'/>">末页</a>
  
  <select onchange="var url='admin.ArticlePage.do?currentPage='+this.value;  javascript:window.location.href=url;"> 
    <s:iterator value="pageCount" id="mark">
   		<s:set name="markValue"><s:property value="mark"/> </s:set>
    	
    	<s:if test="#current==#markValue">
    	<option value="<s:property value="mark"/>" selected="selected"><s:property value="mark"/>/ <s:property value="totalpages"/></option>
    	</s:if>
    	<s:else>
    	<option value="<s:property value="mark"/>" ><s:property value="mark"/>/ <s:property value="totalpages"/></option>
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
        <th style="width:400px;">文章标题</th>
        <th style="width:80px;">文章类型</th>
        <th style="width:40px;">作者</th>
        <th style="width:80px;">时间</th>
        <th style="width:84px;">操作</th>
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
            <td class="wd1 ckb"><input title="选择/不选" value="<s:property value="id"/>" name="checkId" id="checkbox_inbox_<s:property value="#stat.index"/>" type="checkbox"></td>
            <td style="width:400px;"><a href="<s:url action="ShowModifyArticle.do"> <s:param name="id"><s:property value="id"/></s:param> </s:url>"><s:property value="title"/></a></td>
            <td style="width:80px;"><s:property value="category"/></td>
            <td style="width:40px;"><s:property value="owner"/></td>
            <td style="width:80px;"><s:property value="date"/></td>
            <td style="width:84px;" class="action">  <a href='#' onclick="javascript:window.location.href='<s:url action="Top.do"> <s:param name="articleId"><s:property value="id"/></s:param> </s:url>'">置顶</a> 
            	&nbsp;
            	<s:if test="istop==0">
            		尚未置顶
            	</s:if>
            	<s:else>
            		<a href='#' onclick="javascript:window.location.href='<s:url action="RemoveTop.do"> <s:param name="articleId"><s:property value="id"/></s:param> </s:url>'">移除置顶</a>
            	</s:else>
            </td>
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
    <div class="btn btn-dft txt-b" onmouseover="this.className='btn btn-dft btn-dft-hover txt-b'" onmouseout="this.className='btn btn-dft txt-b'" onmousedown="this.className='btn btn-dft btn-dft-active txt-b'" onmouseup="this.className='btn btn-dft btn-dft-hover txt-b'" onclick="deleteForm.action='DeleteArticle.do';deleteForm.submit();" id="inbox__delete"><span>删 除</span></div>
  </div>

	<span class="msg-info">(若要修改，请直接点击文章)</span>

  <div class="btngrp btngrp-ext"><a href="admin.ArticlePage.do?currentPage=1">首页</a><a 
  	<s:if test="#current==1">
  	class="txt-disabd"
  	</s:if>
  	<s:else>
  	href="admin.ArticlePage.do?currentPage=<s:property value='#previous'/>" 
  	</s:else>>上页</a><a 
  	<s:if test="#current==#totalOver-1">
  	class="txt-disabd"
  	</s:if>
  	<s:else>
  	href="admin.ArticlePage.do?currentPage=<s:property value='#next'/>"
  	</s:else>>下页</a><a href="admin.ArticlePage.do?currentPage=<s:property value='#total'/>">末页</a>
  
  <select onchange="var url='admin.ArticlePage.do?currentPage='+this.value;  javascript:window.location.href=url;"> 
    <s:iterator value="pageCount" id="mark">
   		<s:set name="markValue"><s:property value="mark"/> </s:set>
    	
    	<s:if test="#current==#markValue">
    	<option value="<s:property value="mark"/>" selected="selected"><s:property value="mark"/>/ <s:property value="totalpages"/></option>
    	</s:if>
    	<s:else>
    	<option value="<s:property value="mark"/>" ><s:property value="mark"/>/ <s:property value="totalpages"/></option>
    	</s:else>
    </s:iterator>
  </select> 
    
   
  </div>
</div>
</s:form>

