<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/jsp/common/taglibs.jspf"%>
<table id="table" class="sort-table table table-bordered table-hover" data-async="true">
    <thead>
    <tr>
        <th style="width: 80px">
            <a class="check-all" href="javascript:;">全选</a>
            |
            <a class="reverse-all" href="javascript:;">反选</a>
        </th>
        <th style="width: 100px" sort="id">编号</th>
        <th style="width: 150px" sort="name">姓名</th>
        <th>昵称</th>
        <th>类型</th>
        <th>所属机构</th>
        <th>优先级</th>
        <th>状态</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${page.content}" var="m">
        <tr>
            <td class="check"><input type="checkbox" name="ids" value="${m.id}"></td>
            <td>
                <a class="btn btn-link btn-edit" href="${ctx}/basedata/comment/${m.id}">${m.id}</a>
            </td>
            <td>${m.name}</td>
            <td>${m.simpleName}</td>
            <td>${m.commentType.info }</td>
            <td>${m.organization}</td>
            <td>${m.priority}</td>
            <td>${m.dataStatus.info}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<es:page page="${page}"/>
