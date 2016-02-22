/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.basedata.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import com.sishuok.es.basedata.entity.ArtistTypeEnum;
import com.sishuok.es.basedata.entity.ArtistWorksInfo;
import com.sishuok.es.core.repository.CoreEntryRepository;

/**
 * <p>
 * User: Zhang Kaitao
 * <p>
 * Date: 13-2-4 下午3:00
 * <p>
 * Version: 1.0
 */
public interface ArtistWorksRepository extends CoreEntryRepository<ArtistWorksInfo> {

	@Query("from ArtistWorksInfo artistWorks inner join artistWorks.artist artist inner join artistWorks.work work "
			+ "where 1=1 and artist.id=?1 and artist.artistType=?2 and artist.dataStatus='enable' order by artistWorks.seq ")
	public Page<ArtistWorksInfo> findAllByArtist(Long artistID, ArtistTypeEnum artistType, Pageable pageable) ;
}