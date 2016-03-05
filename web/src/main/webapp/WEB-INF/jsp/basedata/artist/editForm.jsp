<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/WEB-INF/jsp/common/taglibs.jspf"%>
<es:contentHeader />
<div class="panel">

	<ul class="nav nav-tabs">
		<shiro:hasPermission name="basedata:artist:create">
			<c:if test="${op eq '新增'}">
				<li ${op eq '新增' ? 'class="active"' : ''}><a href="${ctx}/basedata/artist/create?BackURL=<es:BackURL/>"> <i class="icon-file-alt"></i> 新增
				</a></li>
			</c:if>
		</shiro:hasPermission>


		<c:if test="${not empty m.id}">
			<li ${op eq '查看' ? 'class="active"' : ''}><a href="${ctx}/basedata/artist/${m.id}?BackURL=<es:BackURL/>"> <i class="icon-eye-open"></i> 查看
			</a></li>
			<shiro:hasPermission name="basedata:artist:update">
				<li ${op eq '修改' ? 'class="active"' : ''}><a href="${ctx}/basedata/artist/${m.id}/update?BackURL=<es:BackURL/>"> <i class="icon-edit"></i>
						修改
				</a></li>
			</shiro:hasPermission>

			<shiro:hasPermission name="basedata:artist:delete">
				<li ${op eq '删除' ? 'class="active"' : ''}><a href="${ctx}/basedata/artist/${m.id}/delete?BackURL=<es:BackURL/>"> <i class="icon-trash"></i>
						删除
				</a></li>
			</shiro:hasPermission>
		</c:if>
		<li><a href="<es:BackURL/>" class="btn btn-link"> <i class="icon-reply"></i> 返回
		</a></li>
	</ul>

	<form:form id="editForm" method="post" modelAttribute="m" cssClass="form-horizontal">
		<!--上一个地址 如果提交方式是get 需要加上-->
		<%--<es:BackURL hiddenInput="true"/>--%>

		<es:showGlobalError commandName="m" />

		<form:hidden path="id" />

		<div class="control-group" style="margin-bottom: 0px;<c:if test="${empty m.personImage.id}">display: none</c:if>">
			<label for="files" class="control-label"></label>
			<div class="controls">
				<div class="ajax-upload-view">
					<div class='alert alert-success'>
						<c:if test="${not empty m.personImage.id}">
							<a href='${ctx}/${m.personImage.displayURL }' target='_blank'><img src='${ctx}/${m.personImage.displaySmallURL}' title='${m.personImage.name }'
								height='120px' /></a>
						</c:if>
					</div>
				</div>
				<form:hidden path="personImage.id" />
			</div>
		</div>

		<div class="control-group">
			<label for="files" class="control-label">个人相片</label>
			<div class="controls">
				<label for="files" class="btn btn-success fileinput-button"> <i class="icon-plus icon-white"></i> <span>添加文件...</span> <input type="file"
					id="files" name="files[]" data-url="${ctx}/basedata/attachmentImage/ajaxUpload?uploadType=personImage" multiple>
				</label>
			</div>
		</div>

		<div class="control-group">
			<form:label path="name" cssClass="control-label">名称</form:label>
			<div class="controls">
				<form:input path="name" cssClass="validate[required]" placeholder="中文姓名" />
			</div>
		</div>
		<div class="control-group">
			<form:label path="simpleName" cssClass="control-label">昵称</form:label>
			<div class="controls">
				<form:input path="simpleName" cssClass="validate[required]" placeholder="英文名" />
			</div>
		</div>
		<div class="control-group">
			<form:label path="region" cssClass="control-label">所属区域</form:label>
			<div class="controls">
				<form:input path="region" placeholder="所属区域" />
			</div>
		</div>
		<div class="control-group">
			<form:label path="organization" cssClass="control-label">所属机构</form:label>
			<div class="controls">
				<form:input path="organization" placeholder="所属机构" />
			</div>
		</div>
		<div class="control-group">
			<form:label path="weixin" cssClass="control-label">微信</form:label>
			<div class="controls">
				<form:input path="weixin" placeholder="" />
			</div>
		</div>
		<div class="control-group">
			<form:label path="telephone" cssClass="control-label">手机号</form:label>
			<div class="controls">
				<form:input path="telephone" cssClass="validate[required,custom[mobilePhoneNumber]]" placeholder="如13512345678" />
			</div>
		</div>
		<div class="control-group">
			<form:label path="qq" cssClass="control-label">QQ</form:label>
			<div class="controls">
				<form:input path="qq" placeholder="" />
			</div>
		</div>
		<div class="control-group">
			<form:label path="degree" cssClass="control-label">等级</form:label>
			<div class="controls">
				<form:input path="degree" placeholder="如高级化妆师、高级摄影师" />
			</div>
		</div>
		<div class="control-group">
			<form:label path="content" cssClass="control-label">简介</form:label>
			<div class="controls">
				<c:choose>
					<c:when test="${op ne '查看'}">
						<form:textarea path="content" placeholder="如个人获奖情况、参加过哪些有名活动" cssStyle="width: 550px;height: 300px;" />
					</c:when>
					<c:otherwise>
                        ${m.content}
                    </c:otherwise>
				</c:choose>
			</div>
		</div>
		<div class="control-group">
			<form:label path="priority" cssClass="control-label">优先级</form:label>
			<div class="controls">
				<form:input path="priority" cssClass="validate[required,custom[integer]]" placeholder="如999" />
			</div>
		</div>

		<div class="control-group">
			<form:label path="artistType" cssClass="control-label">类型</form:label>
			<div class="controls">
				<form:select path="artistType" cssClass="validate[required]">
					<form:option label="请选择" value="" />
					<form:options items="${artistTypeEnumList}" itemLabel="info"></form:options>
				</form:select>
			</div>
		</div>
		<div class="control-group">
			<form:label path="dataStatus" cssClass="control-label">状态</form:label>
			<div class="controls">
				<form:select path="dataStatus" cssClass="validate[required]">
					<form:options items="${dataStatusEnumList}" itemLabel="info"></form:options>
				</form:select>
			</div>
		</div>

		<c:if test="${op eq '新增'}">
			<c:set var="icon" value="icon-file-alt" />
		</c:if>
		<c:if test="${op eq '修改'}">
			<c:set var="icon" value="icon-edit" />
		</c:if>
		<c:if test="${op eq '删除'}">
			<c:set var="icon" value="icon-trash" />
		</c:if>

		<div class="control-group">
			<div class="controls">
				<button type="submit" class="btn btn-primary">
					<i class="${icon}"></i> ${op}
				</button>
				<a href="<es:BackURL/>" class="btn"> <i class="icon-reply"></i> 返回
				</a>
			</div>
		</div>
	</form:form>
</div>
<es:contentFooter />
<%@include file="/WEB-INF/jsp/common/import-upload-simple-js.jspf"%>

<script type="text/javascript">
	$(function() {
		<c:choose>
		<c:when test="${op eq '删除'}">
		//删除时不验证 并把表单readonly
		$.app.readonlyForm($("#editForm"), false);
		</c:when>
		<c:when test="${op eq '查看'}">
		$.app.readonlyForm($("#editForm"), true);
		</c:when>
		<c:otherwise>
		$.validationEngineLanguage.allRules.mobilePhoneNumber = {
			"regex" : /^0{0,1}(13[0-9]|15[7-9]|153|156|18[7-9])[0-9]{8}$/,
			"alertText" : "* 手机号错误"
		};
		$.validationEngineLanguage.allRules.username = {
			"regex" : /^\w{5,10}$/,
			"alertText" : "* 5到10个字母、数字、下划线"
		};
		var validationEngine = $("#editForm").validationEngine();
		<es:showFieldError commandName="m"/>
		</c:otherwise>
		</c:choose>

		$('.fileinput-button input[type="file"]').fileupload({
			dataType : "json"
		});
		$('.fileinput-button input[type="file"]').fileupload("option", {
			progressall : function(e, data) {
				var view = $(".ajax-upload-view");
				view.parent().parent().show();
				var progressBar = view.find(".progress");
				if (progressBar.size() == 0) {
					var progressBarTemplate = '<div class="progress progress-striped">' + '<div class="bar"></div>' + '</div>';
					progressBar = view.append(progressBarTemplate);
				}
				var progress = parseInt(data.loaded / data.total * 100, 10);
				progressBar.find(".bar").css("width", progress + "%");
			},
			start : function(e) {
				$(".ajax-upload-view").html("");
				var submitBtn = $(this).closest("form").find(":submit");
				submitBtn.data("value", submitBtn.val()).val("上传文件中...").prop("disabled", true);
			},
			//上传完成
			done : function(e, data) {
				$.each(data.result.files, function(index, file) {
					if (file.error) {
						$(".ajax-upload-view").html("<div class='alert alert-error'>" + file.error + "</div>");
					} else {
						$("[name='personImage\.id']").val(file.id);
						var msg = "<div class='alert alert-success'><strong>上传成功！</strong><br/>{preview}</div>";
						var preview = "";
						var url = "${ctx}" + "/" + file.url;
						var thumbnail_url = ctx + "/" + file.thumbnail_url;
						if ($.app.isImage(file.name)) {
							preview = "<a href='{url}' target='_blank'><img src='{thumbnail_url}' title='{name}' height='120px'/></a>"
						} else {
							preview = "<a href='{url}' target='_blank'>{name}</a>"
						}
						preview = preview.replace("{url}", url).replace("{thumbnail_url}", thumbnail_url).replace("{name}", file.name);
						msg = msg.replace("{preview}", preview);
						$(".ajax-upload-view").html(msg);

					}
				});
				var submitBtn = $(this).closest("form").find(":submit");
				submitBtn.val(submitBtn.data("value")).prop("disabled", false);
			}
		});
		var validationEngine = $("#editForm").validationEngine();
		<es:showFieldError commandName="upload"/>
	});
</script>