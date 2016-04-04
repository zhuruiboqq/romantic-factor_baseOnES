<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form id="searchForm" class="form-inline search-form" data-change-search="true">

     <esform:label path="search.id_in">编号</esform:label>
    <esform:input path="search.id_in" cssClass="input-small" placeholder="多个使用空格分隔"/>
    &nbsp;&nbsp;

    <esform:label path="search.name_like">姓名</esform:label>
    <esform:input path="search.name_like" cssClass="input-small" placeholder="模糊匹配"/>
    &nbsp;&nbsp;
  <esform:label path="search.simpleName_like">昵称</esform:label>
    <esform:input path="search.simpleName_like" cssClass="input-small" placeholder="模糊匹配"/>
    &nbsp;&nbsp;

    <esform:label path="search.dataStatus_eq">状态</esform:label>
    <esform:select path="search.dataStatus_eq" cssClass="input-small">
        <esform:option label="所有" value=""/>
        <esform:options items="${dataStatusEnumList}" itemLabel="info"/>
    </esform:select>
    &nbsp;&nbsp;
    <input type="submit" class="btn " value="查询"/>
    <a class="btn btn-link accordion-toggle" data-toggle="collapse" href="#searchMore">高级查询</a>
    <a class="btn btn-link btn-clear-search">清空</a>

    <%--more--%>
    <div id="searchMore" class="accordion-body collapse">
        <div class="accordion-inner">

            <esform:label path="search.createTime_gte">创建日期从</esform:label>
            <div class="input-append date">
                <esform:input path="search.createTime_gte" cssClass="input-medium"
                                data-format="yyyy-MM-dd hh:mm:ss"
                                data-position="bottom-left"
                                placeholder="大于等于"/>
                <span class="add-on"><i data-time-icon="icon-time" data-date-icon="icon-calendar"></i></span>
            </div>
            <esform:label path="search.createTime_lte">到</esform:label>
            <div class="input-append date">
                <esform:input path="search.createTime_lte" cssClass="input-medium"
                                data-format="yyyy-MM-dd hh:mm:ss"
                                data-position="bottom-left"
                                placeholder="小于等于"/>
                <span class="add-on"><i data-time-icon="icon-time" data-date-icon="icon-calendar"></i></span>
            </div>
        </div>
    </div>
</form>
