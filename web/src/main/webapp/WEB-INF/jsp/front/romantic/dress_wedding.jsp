<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp"%>
<rf:contentHeaderFront />
<header>
	<div class="header_content header_content_two">

		<%@ include file="/WEB-INF/jsp/front/tpl/head_with_title_img.jsp"%>
	</div>
</header>
<article class="">
	<div class="footer_name_content dress_not_footer" id="subNav">
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
	<nav class="set_meal_content_nav dress_content_nav">
		<ul>
			<li><a href="dress.do?page=1&type=1&tagname=subNav"> <span class='nav_link_text   ${type == 1?"text_this":""}'>婚纱</span> <span
					class='nav_link_line ${type == 1?"line_this":""}'></span>

			</a></li>
			<li><span>/</span></li>
			<li><a href="dress.do?page=1&type=2&tagname=subNav"> <span class='nav_link_text  ${type == 2?"text_this":""}'>晚礼服</span> <span
					class='nav_link_line ${type == 2?"line_this":""}'></span>
			</a></li>
			<li><span>/</span></li>
			<li><a href="dress.do?page=1&type=3&tagname=subNav"> <span class='nav_link_text  ${type == 3?"text_this":""}'>其他</span> <span
					class='nav_link_line ${type == 3?"line_this":""}'></span>
			</a></li>
		</ul>

	</nav>
	<jsp:include page="/WEB-INF/jsp/front/tpl/page_view_only_works_list.jsp">
		<jsp:param name="currentPageURL" value="dress.do" />
		<jsp:param name="detailURLParams" value="type=${type}&tagname=subNav" />
	</jsp:include>
</article>

<%@ include file="/WEB-INF/jsp/front/tpl/footer_more.jsp"%>
<%@ include file="/WEB-INF/jsp/front/tpl/pop_view_img.jsp"%>

<script>
	var tagname = '${request.getAttribute("tagname")}';
	var indexTag = location.href.indexOf("tagname");
	if ((tagname != null && tagname != "") || indexTag > 0) {
		document.getElementById("subNav").scrollIntoView();
	}
</script>
<rf:contentFooterFront />