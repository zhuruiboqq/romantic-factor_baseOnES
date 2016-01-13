/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.core.web.controller;

import org.springframework.ui.Model;

import com.sishuok.es.core.common.DataStatusEnum;
import com.sishuok.es.core.entity.BaseDataInfo;

/**
 * <p>
 * User: Zhang Kaitao
 * <p>
 * Date: 13-1-28 下午4:29
 * <p>
 * Version: 1.0
 */
public abstract class BaseDataController<M extends BaseDataInfo> extends CoreController<M> {

	@Override
	protected void setCommonData(Model model) {
		super.setCommonData(model);
		model.addAttribute("dataStatusEnumList", DataStatusEnum.values());
	}
}
