/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.basedata.service;

import org.springframework.stereotype.Service;

import com.sishuok.es.basedata.entity.AttachmentImageInfo;
import com.sishuok.es.basedata.repository.AttachmentImageRepository;
import com.sishuok.es.core.service.BaseDataService;

/**
 * <p>
 * User: Zhang Kaitao
 * <p>
 * Date: 13-2-4 下午3:01
 * <p>
 * Version: 1.0
 */
@Service
public class AttachmentImageService<M extends AttachmentImageInfo> extends BaseDataService<M> {

//	public AttachmentImageRepository<M> getAttachmentImageRepository() {
//		return (AttachmentImageRepository<M>) baseRepository;
//	}
	//TODO 更新状态，并按一定的规则排序
}