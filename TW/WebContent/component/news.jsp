<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<table border="0">
<tr>
<td colspan="1">
课程号
</td>
<td colspan="1">
课程名
</td>
<td colspan="1">
学分
</td>
<td colspan="1">
上课地点
</td>
</tr>
<s:iterator value="courseList">
 <tr align="left">
 
 <td align="left">
 <s:property value="id"/>
 </td>
 <td align="left">
 <s:property value="name"/>
 </td>
 <td align="left">
 <s:property value="course_credit"/>
 </td>
 <td align="left">
 <s:property value="course_address"/>
 </td>
<td align="left">
 <a href='<s:url action="DelCourseSelected"><s:param name="id"><s:property value="id"/></s:param></s:url>'>退选</a>
 </td>
 </tr>
</s:iterator>
</table>