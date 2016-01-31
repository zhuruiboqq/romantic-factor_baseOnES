/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.core.service;

import java.util.Date;
import java.util.Map;

import org.springframework.data.domain.Page;

import com.google.common.collect.Maps;
import com.sishuok.es.common.entity.search.Searchable;
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
		Map<String, Object> searchParams = Maps.newHashMap();
		searchParams.put("number_eq", number);
		Searchable searchable = Searchable.newSearchable(searchParams);
		Page<M> page = getCoreRepository().findAll(searchable);
		if (page.getSize() == 0) {
			return null;
		}
		return page.getContent().get(0);
	}
}