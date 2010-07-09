<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<link href="<%=request.getContextPath()%>/css/list.css" type="text/css"
	media="screen" rel="stylesheet" />

<div style="text-align:center;margin-top:20px;margin-bottom:20px;">
<s:set name="number"><s:property value="number"/></s:set>
<!-- no result -->
<s:if test="#number==0">
<br><br>
	抱歉,没有您要的搜索结果，请重新输入搜索条件！
</s:if>

</div>
<s:set name="search"><s:property value="search" escape="false"/></s:set>
<s:else>
关键词&nbsp;"<s:property value="#search" />"&nbsp;&nbsp;搜索的结果共有："<s:property value="number"/>"  条</>&nbsp;&nbsp;
<s:if test="time==0">搜索耗时忽略不计</s:if>
<s:else>
搜索耗时 ：" <s:property value="time"/>"ms   
</s:else>
<br>


<div class="gIbx-lineinfo" id="inboxStatusDiv" style="display: none;"></div>
<div class="gIbx-tablayout" style="margin-left:15px;">
  <table class="g-table-comm" id="inboxTitleTable">
    <thead>
      <tr>
        <th class="wd0"></th>
        <th class="wd2">标题</th>
        <th class="wd3">版块</th>
        <th class="wd4">发布日期</th>
      </tr>
    </thead>
  </table>
  <div id="MailListMaininbox" class="txt-12">
    <div id="period_div_inbox2">
      <table class="g-table-comm" id="period_table_inbox2" style="width:98%;">

      <s:iterator value="articles" id="article" status="stat">
        
          <tr style="" class="mark0" id="tr_inbox_<s:property value="#stat.index"/>">
          	<td class="wd0"></td>
            <td class="wd2"><s:set name="id"> <s:property value="id"/> </s:set>
			 <a href='<s:url action="SearchDetail.do" ><s:param name="id" value="#id"/></s:url>'><s:property value="title"/> </a></td>
            <td class="wd3"><s:property value="category"/></td>
            <td class="wd4"><s:property value="date"/></td>
          </tr>
        
        </s:iterator>

      </table>
    </div>
  </div>
</div>


<s:set name="search"><s:property value="search" escape="false"/></s:set>
<s:set name="current"><s:property value="currentPage"/> </s:set>
<s:set name="pages"><s:property value="pages"/> </s:set>
<s:set name="previous"><s:property value="currentPage-1"/></s:set>
<s:set name="next"><s:property value="currentPage+1"/></s:set>

<div id="searchPage" style="margin-left:325px;">
<!-- one page -->
<s:if test="#pages==1">
	<!-- nothing to do -->
</s:if>
<!-- more than one page -->
<s:else>
  <s:if test="#current==1"/>
		<s:else>
			<a href='<s:url action="SearchPage.do" ><s:param name="pp"> <s:property value="#previous"/></s:param> <s:param name="search" value="%{#search}"> </s:param></s:url>'>
				上一页
			</a>
		</s:else>
		

  <s:iterator value="pageCount" id="p">
		<s:set name="pValue"><s:property value="p"/></s:set>
		
		<s:if test="#current==#pValue">
			<s:property value="#pValue"/>
		</s:if>
		<s:else>
		[<a href='<s:url action="SearchPage.do" ><s:param name="pp"> <s:property value="#pValue"/></s:param> <s:param name="search" value="%{#search}"> </s:param></s:url>'>
		 <s:property value="p"/> 
		</a>]
		</s:else>
  </s:iterator>

	<s:if test="#current==#pages"/>
			<s:else>
			<a href='<s:url action="SearchPage.do" ><s:param name="pp" value="#next"/> <s:param name="search" value="%{#search}"> </s:param></s:url>'>
				下一页
			</a>
		</s:else>
</s:else>
</div>
</s:else>
