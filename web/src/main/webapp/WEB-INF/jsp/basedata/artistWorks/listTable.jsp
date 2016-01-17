<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/jsp/common/taglibs.jspf"%>
<table id="table" class="sort-table table table-bordered table-hover" data-async="true">
	<thead>
		<tr>
			<th style="width: 60px"><a class="check-all" href="javascript:;">全选</a> | <a class="reverse-all" href="javascript:;">反选</a></th>
			<th sort="seq">序号</th>
			<th >姓名</th>
			<th>昵称</th>
			<th>类型</th>
			<th>所属机构</th>
			<th>图片名称</th>
			<th  style="width: 150px">图片</th>
			<th>状态</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${page.content}" var="m">
			<tr>
				<td class="check"><input type="checkbox" name="ids" value="${m.id}"></td>
				<td><a class="btn btn-link btn-edit" href="${ctx}/basedata/artistWorks/${m.id}">${m.id}</a></td>
				<td>${m.artist.name}</td>
				<td>${m.artist.simpleName}</td>
				<td>${m.artist.artistType.info }</td>
				<td>${m.artist.organization}</td>
				<td>${m.work.name}</td>
				<td><img src="${ctx}/${m.work.displaySmallURL}" style="max-width:150px" /></td>
				<td>${m.work.dataStatus.info}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<es:page page="${page}" />
