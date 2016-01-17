/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.basedata.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sishuok.es.basedata.entity.ArtistInfo;
import com.sishuok.es.basedata.entity.ArtistTypeEnum;
import com.sishuok.es.basedata.service.ArtistService;
import com.sishuok.es.common.entity.search.SearchRequest;
import com.sishuok.es.common.entity.search.Searchable;
import com.sishuok.es.common.web.bind.annotation.PageableDefaults;
import com.sishuok.es.common.web.validate.ValidateResponse;
import com.sishuok.es.core.common.DataStatusEnum;
import com.sishuok.es.core.web.controller.BaseDataController;

/**
 * <p>
 * User: Zhang Kaitao
 * <p>
 * Date: 13-1-28 下午4:29
 * <p>
 * Version: 1.0
 */
@Controller
@RequestMapping(value = "/basedata/artist")
public class ArtistController<M extends ArtistInfo> extends BaseDataController<M> {

	private ArtistService<M> getArtistService() {
		return (ArtistService<M>) baseService;
	}

	public ArtistController() {
		setResourceIdentity("basedata:artist");
	}

	@Override
	protected void setCommonData(Model model) {
		super.setCommonData(model);
		model.addAttribute("artistTypeEnumList", ArtistTypeEnum.values());
	}

	/**
	 * 验证失败返回true
	 *
	 * @param m
	 * @param result
	 * @return
	 */
	@Override
	protected boolean hasError(M m, BindingResult result) {
		Assert.notNull(m);

		//        //字段错误 前台使用<es:showFieldError commandName="showcase/sample"/> 显示
		//        if (m.getBirthday() != null && m.getBirthday().after(new Date())) {
		//            //前台字段名（前台使用[name=字段名]取得dom对象） 错误消息键。。
		//            result.rejectValue("birthday", "birthday.past");
		//        }
		//
		//        //全局错误 前台使用<es:showGlobalError commandName="showcase/sample"/> 显示
		//        if (m.getName().contains("admin")) {
		//            result.reject("name.must.not.admin");
		//        }

		return result.hasErrors();
	}

	/**
	 * 验证返回格式 单个：[fieldId, 1|0, msg] 多个：[[fieldId, 1|0, msg],[fieldId, 1|0, msg]]
	 *
	 * @param fieldId
	 * @param fieldValue
	 * @return
	 */
	@RequestMapping(value = "validate", method = RequestMethod.GET)
	@ResponseBody
	public Object validate(@RequestParam("fieldId") String fieldId, @RequestParam("fieldValue") String fieldValue,
			@RequestParam(value = "id", required = false) Long id) {
		ValidateResponse response = ValidateResponse.newInstance();

		if ("name".equals(fieldId)) {
			M sample = getArtistService().findByNumber(fieldValue);
			if (sample == null || (sample.getId().equals(id) && sample.getName().equals(fieldValue))) {
				//如果msg 不为空 将弹出提示框
				response.validateSuccess(fieldId, "");
			} else {
				response.validateFail(fieldId, "该名称已被其他人使用");
			}
		}
		return response.result();
	}

	//selectType  multiple single
	@RequestMapping(value = { "select/{selectType}", "select" }, method = RequestMethod.GET)
	@PageableDefaults(sort = "name=desc")
	public String select(Searchable searchable, Model model, @PathVariable(value = "selectType") String selectType,
			@MatrixVariable(value = "domId", pathVar = "selectType") String domId,
			@MatrixVariable(value = "domName", pathVar = "selectType", required = false) String domName) {

		this.permissionList.assertHasViewPermission();

		model.addAttribute("selectType", selectType);
		model.addAttribute("domId", domId);
		model.addAttribute("domName", domName);
		if (searchable == null || !searchable.hasSearchFilter()) {//如果没有过滤条件，默认添加
			if (searchable == null) {
				searchable = new SearchRequest();
			}
			searchable.addSearchParam("dataStatus_eq", DataStatusEnum.enable.name());
		}
		super.list(searchable, model);
		return "basedata/artist/select";
	}
}