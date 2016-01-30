/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.basedata.service;

import org.springframework.stereotype.Service;

import com.sishuok.es.basedata.entity.ArtistWorksInfo;
import com.sishuok.es.basedata.repository.ArtistWorksRepository;
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

//	public ArtistWorksRepository<M> getArtistWorksRepository() {
//		return (ArtistWorksRepository<M>) baseRepository;
//	}
}