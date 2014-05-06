<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"%>
<SCRIPT language="javaScript">
	function pageNoChange(pageNo) {
		location.href = "pagination?page_action=SPECIAL_PAGE&page_no=" + pageNo.value;
	}
</SCRIPT>
<c:if test="${session_page.firstPage}">
        首页
</c:if>
<c:if test="${!session_page.firstPage}">
	<a href="pagination?page_action=FIRST_PAGE">首页</a>
</c:if>
<c:if test="${!session_page.hashPreviousPage}">
        上一页
</c:if>
<c:if test="${session_page.hashPreviousPage}">
	<a href="pagination?page_action=PREVIOUS_PAGE">上一页</a>
</c:if>

<c:if test="${!session_page.hashNextPage}">
        下一页
</c:if>

<c:if test="${session_page.hashNextPage}">
	<a href="pagination?page_action=NEXT_PAGE">下一页</a>
</c:if>

<c:if test="${session_page.lastPage}">
   尾页
</c:if>
<c:if test="${!session_page.lastPage}">
   <a href="pagination?page_action=LAST_PAGE">尾页</a>
</c:if>
共有<c:out value="${session_page.pageCount}" />页,第
<select name = "pageNo" onChange = "javaScript:pageNoChange(this);">
  <c:forEach begin="1" end = "${session_page.pageCount}" var = "pageIndex">
           <option value="<c:out value='${pageIndex}'/>" <c:if test = "${pageIndex ==session_page.pageIndex }">selected</c:if>>
              <c:out value="${pageIndex}"/>
           </option>
  </c:forEach>
</select>
页