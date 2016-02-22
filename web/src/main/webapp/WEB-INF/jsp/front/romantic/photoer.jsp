<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp" %>
<rf:contentHeaderFront />
	<header>
	<div class="header_content header_content_two">

		<%@ include file="/WEB-INF/jsp/front/tpl/head_with_title_img.jsp"%>
	</div>
	</header>
	
	<jsp:include page="/WEB-INF/jsp/front/tpl/page_view_artist_list.jsp">
		<jsp:param name="currentPageTipCN" value="摄影师" />
		<jsp:param name="currentPageTipEN" value="PHOTOGRAPHY" />
		<jsp:param name="parentPageURL" value="makeupMakeer.do" />
		<jsp:param name="currentPageURL" value="photoer.do" />
		<jsp:param name="childPageURL" value="photoerWorks.do" />
	</jsp:include>

	<%@ include file="/WEB-INF/jsp/front/tpl/footer_more.jsp"%>

<rf:contentFooterFront />