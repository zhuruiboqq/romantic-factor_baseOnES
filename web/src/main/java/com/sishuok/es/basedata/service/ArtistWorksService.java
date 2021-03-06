/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.basedata.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.google.common.collect.Maps;
import com.sishuok.es.basedata.entity.ArtistTypeEnum;
import com.sishuok.es.basedata.entity.ArtistWorksInfo;
import com.sishuok.es.basedata.entity.AttachmentImageInfo;
import com.sishuok.es.basedata.repository.ArtistWorksRepository;
import com.sishuok.es.common.entity.search.Searchable;
import com.sishuok.es.core.service.CoreEntryService;

/**
 * <p>
 * User: Zhang Kaitao
 * <p>
 * Date: 13-2-4 下午3:01
 * <p>
 * Version: 1.0
 */
@Service
public class ArtistWorksService<M extends ArtistWorksInfo> extends CoreEntryService<M> {

	@Autowired
	private AttachmentImageService<AttachmentImageInfo> attachmentImageService;

	public Page<ArtistWorksInfo> findAllByArtist(Long artistID, ArtistTypeEnum artistType, Pageable pageable) {
		return ((ArtistWorksRepository) getCoreRepository()).findAllByArtist(artistID, artistType, pageable);
	}

	@Override
	public void delete(Long[] ids) {
		Map<String, Object> searchParams = Maps.newHashMap();
		searchParams.put("id_in", ids);
		Searchable searchable = Searchable.newSearchable(searchParams);
		Page<M> page = getCoreRepository().findAll(searchable);
		for (M m : page.getContent()) {
			attachmentImageService.delete(m.getWork().getId());
		}
		super.delete(ids);
	}
}