/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.basedata.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sishuok.es.basedata.entity.AttachmentImageInfo;
import com.sishuok.es.common.web.upload.FileUtil;
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

	@Override
	public void delete(Long id) {
		M m = findOne(id);
		if (!StringUtils.isEmpty(m.getStoreSmallPath())) {
			FileUtil.deleteFile(m.getStoreSmallPath());//小图
		}
		FileUtil.deleteFile(m.getStorePath());//大图
		super.delete(id);
	}

	@Override
	public void delete(Long[] ids) {
		for (Long id : ids) {
			super.delete(id);
		}
	}
}