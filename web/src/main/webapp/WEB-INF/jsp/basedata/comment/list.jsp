<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/jsp/common/taglibs.jspf"%>
<es:contentHeader/>
<div data-table="table" class="panel">

    <ul class="nav nav-tabs">
        <li ${empty param['search.dataStatus_eq'] ? 'class="active"' : ''}>
            <a href="${ctx}/basedata/comment">
                <i class="icon-table"></i>
                所有留言
            </a>
        </li>
        <li ${param['search.dataStatus_eq'] eq 'enable' ? 'class="active"' : ''}>
            <a href="${ctx}/basedata/comment?search.dataStatus_eq=enable">
                <i class="icon-table"></i>
                可显示的留言
            </a>
        </li>
        <li ${param['search.dataStatus_eq'] eq 'disable' ? 'class="active"' : ''}>
            <a href="${ctx}/basedata/comment?search.dataStatus_eq=disable">
                <i class="icon-table"></i>
                隐藏的留言
            </a>
        </li>
    </ul>

    <es:showMessage/>

    <div class="row-fluid tool ui-toolbar">
        <div class="span4">
            <div class="btn-group">
                <shiro:hasPermission name="basedata:comment:create">
                <a class="btn btn-create">
                    <i class="icon-file-alt"></i>
                    新增
                </a>
                </shiro:hasPermission>
                <shiro:hasPermission name="basedata:comment:update">
                <a id="update" class="btn btn-update">
                    <i class="icon-edit"></i>
                    修改
                </a>
                </shiro:hasPermission>
                <shiro:hasPermission name="basedata:comment:delete">
                <a class="btn btn-delete">
                    <i class="icon-trash"></i>
                    删除
                </a>
                </shiro:hasPermission>
            </div>
        </div>
        <div class="span8">
            <%@include file="searchForm.jsp"%>
        </div>
    </div>
    <%@include file="listTable.jsp"%>

</div>

<es:contentFooter/>