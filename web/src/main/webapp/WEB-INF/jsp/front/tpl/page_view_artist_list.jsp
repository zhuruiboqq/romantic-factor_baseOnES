<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp" %>
<article class="">
	<div class="footer_name_content dress_not_footer">
		<div class="footer_top">
			<div class="line no_show left"></div>
			<img class="icon_left left" src="${ctx}/static/images/front/icon_left.png" />
			<div class="text left">
				<h1>
					<img src="${ctx}/static/images/front/foot_pic1.png" />
				</h1>
				<h2>罗 蔓 缘 素 婚 纱 摄 影</h2>
			</div>
			<div class="line no_show right"></div>
			<img class="icon_right right" src="${ctx}/static/images/front/icon_left.png" />
		</div>

	</div>
	<nav class="set_meal_content_nav makeup_makeer_nav">
		<ul>
			<li><a href="JavaScript:;">
					<div class="nav_link_text  text_this">${param.currentPageTipCN }</div>
					<div class="nav_link_line line_this"></div>
			</a></li>
		</ul>
	</nav>

	<ul class="artist_content_list fix">
		<c:forEach var="artistInfo" items="${pageHandler.curPageResultList}" varStatus="varStatus">
			<li ${varStatus.index%4==0?"class=\"dress_content_list_fri\"":"" }><a href="${param.childPageURL}?page=1&artistID=${artistInfo.id}"><img
					src="${ctx}/${artistInfo.personImage.displaySmallURL}" /></a> <span class="en">${artistInfo.name}</span><span>${artistInfo.degree}</span>
				<div>
					<a href="${param.childPageURL}?page=1&artistID=${artistInfo.id}">作品</a><a href="mealIntroduce.do">套餐</a>
				</div></li>
		</c:forEach>

	</ul>

	<div class="dress_btns">
		<c:if test="${pageHandler.curPageIndex ne 1}">
			<a class="fri_btn" href="${param.currentPageURL}?page=1">首頁</a>
			<a href="${param.currentPageURL}?page=${pageHandler.curPageIndex-1}">上一页</a>
		</c:if>
		<c:if test="${pageHandler.curPageIndex gt 2 }">
			<a class="pre_btn" href="${param.currentPageURL}?page=${pageHandler.curPageIndex-2}">${pageHandler.curPageIndex-2}</a>
		</c:if>
		<c:if test="${pageHandler.curPageIndex gt 1 }">
			<a class="pre_btn" href="${param.currentPageURL}?page=${pageHandler.curPageIndex-1}">${pageHandler.curPageIndex-1}</a>
		</c:if>
		<a class="this_btn" href="${param.currentPageURL}?page=${pageHandler.curPageIndex}">${pageHandler.curPageIndex}</a>
		<c:if test="${pageHandler.curPageIndex lt pageHandler.totalPageSize}">
			<a class="next_btn" href="${param.currentPageURL}?page=${pageHandler.curPageIndex+1}">${pageHandler.curPageIndex+1}</a>
		</c:if>
		<c:if test="${pageHandler.curPageIndex+1 lt pageHandler.totalPageSize}">
			<a class="next_btn" href="${param.currentPageURL}?page=${pageHandler.curPageIndex+2}">${pageHandler.curPageIndex+2}</a>
		</c:if>
		<c:if test="${pageHandler.curPageIndex ne pageHandler.totalPageSize}">
			<a href="${param.currentPageURL}?page=${pageHandler.curPageIndex+1}">下一页</a>
			<a class="fri_btn" href="${param.currentPageURL}?page=${pageHandler.totalPageSize}">尾頁</a>
		</c:if>
		<%--
第 ${pageHandler.curPageIndex } / ${pageHandler.totalPageSize } 页， 总记录：${pageHandler.totalRecordCount }，每页显示：${pageHandler.perPageSize}
 --%>
	</div>
</article>