/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.core.service;

import java.util.Date;

import com.sishuok.es.core.entity.BaseDataInfo;
import com.sishuok.es.core.repository.BaseDataRepository;

/**
 * <p>
 * User: Zhang Kaitao
 * <p>
 * Date: 13-2-4 下午3:01
 * <p>
 * Version: 1.0
 */
public class BaseDataService<M extends BaseDataInfo> extends CoreService<M> {

	public BaseDataRepository<M> getCoreRepository() {
		return (BaseDataRepository<M>) baseRepository;
	}

	@Override
	public M update(M m) {
		//TODO 设置最后更新人
		m.setLastUpdateTime(new Date());
		return super.update(m);
	}

	public M findByNumber(String number) {
		return getCoreRepository().findByNumber(number);
	}
}