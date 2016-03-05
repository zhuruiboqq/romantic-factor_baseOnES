<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp"%>
<ul class="dress_content_list fix">
	<c:forEach var="worksItem" items="${pageHandler.curPageResultList}" varStatus="varStatus">
		<li ${varStatus.index%4==0?"class=\"dress_content_list_fri\"":"" }><a href="JavaScript:;"><img
				src="${ctx}/${worksItem.work.displaySmallURL}" name="${ctx}/${worksItem.work.displayURL}" /></a> <%-- <span>${worksItem.type}</span>
		 <span>${worksItem.day}</span> --%></li>
	</c:forEach>

</ul>
<!-- <div id='img_src' value=''></div> -->

<div class="dress_btns">
	<c:if test="${param.parentPageURL ne null}">
		<a class="fri_btn" href="${param.parentPageURL }?page=1">返回</a>
	</c:if>
	<c:if test="${pageHandler.curPageIndex ne 1}">
		<a class="fri_btn" href="${param.currentPageURL}?page=1&${param.detailURLParams}">首頁</a>
		<a href="${param.currentPageURL}?page=${pageHandler.curPageIndex-1}&${param.detailURLParams}">上一页</a>
	</c:if>
	<c:if test="${pageHandler.curPageIndex gt 2 }">
		<a class="pre_btn" href="${param.currentPageURL}?page=${pageHandler.curPageIndex-2}&${param.detailURLParams}">${pageHandler.curPageIndex-2}</a>
	</c:if>
	<c:if test="${pageHandler.curPageIndex gt 1 }">
		<a class="pre_btn" href="${param.currentPageURL}?page=${pageHandler.curPageIndex-1}&${param.detailURLParams}">${pageHandler.curPageIndex-1}</a>
	</c:if>

	<a class="this_btn" href="#">${pageHandler.totalPageSize==0 ? "  没 有 数 据  " : pageHandler.curPageIndex}</a>

	<c:if test="${pageHandler.curPageIndex lt pageHandler.totalPageSize}">
		<a class="next_btn" href="${param.currentPageURL}?page=${pageHandler.curPageIndex+1}&${param.detailURLParams}">${pageHandler.curPageIndex+1}</a>
	</c:if>
	<c:if test="${pageHandler.curPageIndex+1 lt pageHandler.totalPageSize}">
		<a class="next_btn" href="${param.currentPageURL}?page=${pageHandler.curPageIndex+2}&${param.detailURLParams}">${pageHandler.curPageIndex+2}</a>
	</c:if>
	<c:if test="${pageHandler.curPageIndex ne pageHandler.totalPageSize and pageHandler.totalPageSize ne 0}">
		<a href="${param.currentPageURL}?page=${pageHandler.curPageIndex+1}&${param.detailURLParams}">下一页</a>
		<a class="fri_btn" href="${param.currentPageURL}?page=${pageHandler.totalPageSize}&${param.detailURLParams}">尾頁</a>
	</c:if>
	<%--
	第 ${pageHandler.curPageIndex } / ${pageHandler.totalPageSize } 页， 总记录：${pageHandler.totalRecordCount }，每页显示：${pageHandler.perPageSize}
	--%>
</div>