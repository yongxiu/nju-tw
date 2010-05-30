<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/css/list.css" type="text/css"
	media="screen" rel="stylesheet" />
<title>download</title>
</head>
<body>

<div class="gIbx-lineinfo" id="inboxStatusDiv" style="display: none;"></div>
<div class="gIbx-tablayout" style="margin-left:15px;margin-top:12px;">
  <table class="g-table-comm" id="inboxTitleTable">
    <thead>
      <tr>
        <th class="wd0"></th>
        <th class="wd2" style="width:510px;">标题</th>
        <th class="wd3" style="width:100px;">版块</th>
        <th class="wd4" style="width:100px;">发布日期</th>
      </tr>
    </thead>
  </table>
  <div id="MailListMaininbox" class="txt-12">
    <div id="period_div_inbox2">
      <table class="g-table-comm" id="period_table_inbox2" style="width:98%;">

      <s:iterator value="files" id="file">
        
          <tr style="" class="mark0" id="tr_inbox_<s:property value="#stat.index"/>">
          	<td class="wd0"></td>
            <td class="wd2" style="width:510px;"><s:set name="id"><s:property value="id"/></s:set><a href=" <s:property value="#file.path"/>"><s:property value="#file.filename"/></a></td>
            <td class="wd3" style="width:100px;padding:0;text-align:left;">下载专区
		<!--  
			<s:if test="category==5">校外报道
	 		</s:if>
	 		<s:if test="category==6">南大新闻网
	 		</s:if>
	 		<s:if test="category==7">南京大学报
	 		</s:if>
	 		<s:if test="category==8">南大青年报
	 		</s:if>
	 		<s:if test="category==9">校园广播台
 			</s:if>
		-->
 			</td>
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

<!--  
<div id="downloadPage">
<s:iterator value="files" id="file">
	<a href=" <s:property value="#file.path"/>">
	 	<s:property value="#file.filename"/>
	</a>
	<br>
	</s:iterator>
	</div>
-->
</body>
</html>