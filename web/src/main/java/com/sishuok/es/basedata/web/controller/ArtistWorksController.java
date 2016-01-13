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
import org.springframework.web.bind.annotation.RequestMapping;

import com.sishuok.es.basedata.entity.ArtistWorksInfo;
import com.sishuok.es.basedata.service.ArtistWorksService;
import com.sishuok.es.common.entity.enums.BooleanEnum;
import com.sishuok.es.core.web.controller.CoreEntryController;
import com.sishuok.es.showcase.sample.entity.Sex;

/**
 * <p>
 * User: Zhang Kaitao
 * <p>
 * Date: 13-1-28 下午4:29
 * <p>
 * Version: 1.0
 */
@Controller
@RequestMapping(value = "/basedata/artist/works")
public class ArtistWorksController<M extends ArtistWorksInfo> extends CoreEntryController<M> {

	private ArtistWorksService<M> getBizService() {
		return (ArtistWorksService<M>) baseService;
	}

	public ArtistWorksController() {
		setResourceIdentity("basedata:artist");
	}

	@Override
	protected void setCommonData(Model model) {
		model.addAttribute("sexList", Sex.values());
		model.addAttribute("booleanList", BooleanEnum.values());
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
}