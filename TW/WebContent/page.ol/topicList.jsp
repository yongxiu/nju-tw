<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/css/list.css" type="text/css"
	media="screen" rel="stylesheet" />
<title></title>
</head>
<body>

<div class="gIbx-lineinfo" id="inboxStatusDiv" style="display: none;"></div>
<div class="gIbx-tablayout" style="margin-left:15px;margin-top:12px;">
  <table class="g-table-comm" id="inboxTitleTable">
    <thead>
      <tr>
        <th class="wd0"></th>
        <th class="wd2" style="width:610px;">标题</th>

        <th class="wd4" style="width:100px;">发布日期</th>
      </tr>
    </thead>
  </table>
  <div id="MailListMaininbox" class="txt-12">
    <div id="period_div_inbox2">
      <table class="g-table-comm" id="period_table_inbox2" style="width:98%;">

      <s:iterator value="articles">
        
          <tr style="" class="mark0" id="tr_inbox_<s:property value="#stat.index"/>">
          	<td class="wd0"></td>
            <td class="wd2" style="width:610px;"><a href='<s:url action="AticalDetail.do"><s:param name="id"><s:property value="id"/></s:param></s:url>'><s:property value="title"/></a></td>           
            <td class="wd4" style="width:100px;"><s:property value="date"/></td>
          </tr>
        
        </s:iterator>

      </table>
    </div>
  </div>
</div>
<div style="clear:both;height:25px;"></div>
<div id="articleNavi" style="clear:both;"><s:set name="currentPage"><s:property value="currentPage"/></s:set>
<s:set name="category"><s:property value="category"/></s:set>
<s:iterator value="pageCount" id="page">
		<a  href='<s:url action="Article.do" ><s:param name="currentPage" value="#page"/> <s:param name="category" value="#category"/></s:url>'>
			[<s:property value="page"/>]
		</a>
		
</s:iterator></div>
<br/>

</body></html>
