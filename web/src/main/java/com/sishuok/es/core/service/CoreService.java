/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.core.service;

import com.sishuok.es.common.service.BaseService;
import com.sishuok.es.core.entity.CoreInfo;
import com.sishuok.es.core.repository.CoreRepository;

/**
 * <p>
 * User: Zhang Kaitao
 * <p>
 * Date: 13-2-4 下午3:01
 * <p>
 * Version: 1.0
 */
public class CoreService<M extends CoreInfo> extends BaseService<M, Long> {

	public CoreRepository<M> getCoreRepository() {
		return (CoreRepository<M>) baseRepository;
	}
}