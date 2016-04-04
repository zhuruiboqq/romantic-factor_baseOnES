/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.basedata.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sishuok.es.basedata.entity.CommentInfo;
import com.sishuok.es.basedata.service.CommentService;
import com.sishuok.es.common.web.validate.ValidateResponse;
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
@RequestMapping(value = "/basedata/comment")
public class CommentController<M extends CommentInfo> extends BaseDataController<M> {

	private CommentService<M> getArtistService() {
		return (CommentService<M>) baseService;
	}

	public CommentController() {
		setResourceIdentity("basedata:artist");
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
}