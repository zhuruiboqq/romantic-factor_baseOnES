<%@ page import="net.sf.ehcache.CacheManager"%>
<%@ page import="net.sf.ehcache.Statistics"%>
<%@ page import="java.util.Arrays"%>
<%@ page import="java.util.Comparator"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/jsp/common/taglibs.jspf"%>
<es:contentHeader />
<div data-table="table" class="panel">
	<h1>Endpoints list</h1>
	<c:forEach items="${handlerMethods}" var="entry">
		<div>
			<hr>
			<p>
				<strong>${entry.value}</strong>
			</p>
		</div>
		<div class="span-3 colborder">
			<p>
				<span class="alt">Patterns:</span><br>
				<c:if test="${not empty entry.key.patternsCondition.patterns}">
               ${entry.key.patternsCondition.patterns}
            </c:if>
				<c:if test="${not empty entry.key.methodsCondition.methods}">
               ${entry.key.methodsCondition.methods}
            </c:if>
			</p>
		</div>
		<br />
	</c:forEach>
</div>
<es:contentFooter />
