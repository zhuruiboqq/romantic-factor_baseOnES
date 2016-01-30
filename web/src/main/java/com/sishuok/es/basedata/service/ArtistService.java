/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.basedata.service;

import org.springframework.stereotype.Service;

import com.sishuok.es.basedata.entity.ArtistInfo;
import com.sishuok.es.basedata.repository.ArtistRepository;
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
public class ArtistService<M extends ArtistInfo> extends BaseDataService<M> {

//	public ArtistRepository<M> getArtistRepository() {
//		return (ArtistRepository<M>) baseRepository;
//	}
}