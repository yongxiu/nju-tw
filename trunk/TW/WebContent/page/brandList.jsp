<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/list.css" type="text/css"
	media="screen" rel="stylesheet" />

<div class="gIbx-lineinfo" id="inboxStatusDiv" style="display: none;"></div>
<div class="gIbx-tablayout" style="margin-left:15px;margin-top:12px;">
  <table class="g-table-comm" id="inboxTitleTable">
    <thead>
      <tr>
        <th class="wd0"></th>
        <th class="wd2" style="width:270px;">活动</th>
		<th class="wd3" style="width:450px;">活动名称</th>
      </tr>
    </thead>
  </table>
  <div id="MailListMaininbox" class="txt-12">
    <div id="period_div_inbox2">
      <table class="g-table-comm" id="period_table_inbox2" style="width:98%;">

      <s:iterator value="entities" id="files" status="stat">
          <tr style="" class="mark0" id="tr_inbox_<s:property value="#stat.index"/>">
          	<td class="wd0"></td>
          	<s:set name="id"><s:property value="id"/></s:set>
            <td class="wd2" style="width:200px;"><a href="<s:url action="BrandArticleList.do"><s:param name="brandid" value="#id"/></s:url>"><img src="<s:property value="path"/>" width="161" height="66"/></a></td>
            <td class="wd3" style="width:340px;"><a href="<s:url action="BrandArticleList.do"><s:param name="brandid" value="#id"/></s:url>"><s:property value="name"/></a></td>
          </tr>
      </s:iterator>

      </table>
    </div>
  </div>
</div>
<div style="clear:both;height:25px;"></div>
<!--  
<div id="articleNavi" style="clear:both;"><s:set name="currentPage"><s:property value="currentPage"/></s:set>
<s:set name="category"><s:property value="category"/></s:set>
<s:iterator value="pageCount" id="page">
		<a  href='<s:url action="Article.do" ><s:param name="currentPage" value="#page"/> <s:param name="category" value="#category"/></s:url>'>
			[<s:property value="page"/>]
		</a>
		
</s:iterator></div>
-->

