<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/front/tpl/taglibs.jsp" %>
<rf:contentHeaderFront />
	<header>
	<div class="header_content header_content_two">
		<%@ include file="/WEB-INF/jsp/front/tpl/head_with_title_img.jsp"%>
	</div>
	</header>

	<jsp:include page="/WEB-INF/jsp/front/tpl/page_view_artist_works_list.jsp">
		<jsp:param name="currentPageTipCN" value="摄影师" />
		<jsp:param name="currentPageTipEN" value="PHOTOGRAPHY" />
		<jsp:param name="parentPageURL" value="photoer.do" />
		<jsp:param name="currentPageURL" value="photoerWorks.do" />
	</jsp:include>

	<%@ include file="/WEB-INF/jsp/front/tpl/footer_more.jsp"%>
	<%@ include file="/WEB-INF/jsp/front/tpl/pop_view_img.jsp"%>
</body>
<script type="text/javascript">
	function disp_confirm() {
		var r = confirm("建议使用Google，ie8以上，Firefox，360（极速模式）");
		if (r == true) {
			window.location.href = 'http://rj.baidu.com/soft/detail/14744.html?ald';
		} else {

		}
	}
	setTimeout(
			function() {
				$('body').get(0).style.cssText = $('body').get(0).style.cssText
						+ 'transition: width 1s;-moz-transition: width 1s; -webkit-transition: width 1s;   -o-transition: width 1s;';
				var csstext = $('body').get(0).style.cssText;
				if (csstext.indexOf('transition') + 1
						&& csstext.indexOf('webkit') + 1
						&& csstext.indexOf('moz') + 1 && csstext.indexOf('o')
						+ 1) {
					//disp_confirm();//如果当前浏览器不支持指定属性，弹出窗口提示
				} else {

				}
			}, 1000);
</script>

<rf:contentFooterFront />
