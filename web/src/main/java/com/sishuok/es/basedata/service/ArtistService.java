/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.basedata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sishuok.es.basedata.entity.ArtistInfo;
import com.sishuok.es.basedata.entity.ArtistTypeEnum;
import com.sishuok.es.basedata.entity.ArtistWorksInfo;
import com.sishuok.es.basedata.entity.AttachmentImageInfo;
import com.sishuok.es.common.exception.BaseException;
import com.sishuok.es.common.repository.Specification.CriteriaCustom;
import com.sishuok.es.common.repository.Specification.RestrictionUtil;
import com.sishuok.es.core.common.DataStatusEnum;
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
	@Autowired
	private ArtistWorksService<ArtistWorksInfo> artistWorksService;
	@Autowired
	private AttachmentImageService<AttachmentImageInfo> attachmentImageService;

	//	public ArtistRepository<M> getArtistRepository() {
	//		return (ArtistRepository<M>) baseRepository;
	//	}
	@Override
	public M save(M m) {
		AttachmentImageInfo oldImage = null;
		if (m.getId() != null && m.getId() != 0) {
			M mTemp = findOne(m.getId());
			oldImage = mTemp.getPersonImage();
		}

		M mResult = super.save(m);

		if (oldImage != null) {
			oldImage.setDataStatus(DataStatusEnum.disable);
			attachmentImageService.update(oldImage);
		}
		if (mResult.getPersonImage() != null && mResult.getPersonImage().getId() != null && mResult.getPersonImage().getId() != 0) {
			AttachmentImageInfo imageInfo = attachmentImageService.findOne(mResult.getPersonImage().getId());
			imageInfo.setDataStatus(DataStatusEnum.enable);
			attachmentImageService.update(imageInfo);
		}
		return mResult;
	}

	@Override
	public M update(M m) {
		AttachmentImageInfo oldImage = null;
		if (m.getId() != null && m.getId() != 0) {
			M mTemp = findOne(m.getId());
			oldImage = mTemp.getPersonImage();
		}

		M mResult = super.update(m);

		if (oldImage != null) {
			oldImage.setDataStatus(DataStatusEnum.disable);
			attachmentImageService.update(oldImage);
		}
		if (mResult.getPersonImage() != null && mResult.getPersonImage().getId() != null && mResult.getPersonImage().getId() != 0) {
			AttachmentImageInfo imageInfo = attachmentImageService.findOne(mResult.getPersonImage().getId());
			imageInfo.setDataStatus(DataStatusEnum.enable);
			attachmentImageService.update(imageInfo);
		}

		return mResult;
	}

	@Override
	public void delete(Long[] ids) {
		List<Long> idList = new ArrayList<Long>(ids.length);
		for (Long id : ids)
			idList.add(id);
		CriteriaCustom<ArtistWorksInfo> c = new CriteriaCustom<ArtistWorksInfo>();
		c.add(RestrictionUtil.eq("artist.dataStatus", DataStatusEnum.enable, true));
		c.add(RestrictionUtil.in("artist.id", idList, true));

		long count = artistWorksService.count(c);
		if (count > 0) {
			throw new BaseException("基础资料", "艺术家还存在未删除的作品，不允许删除艺术家信息！");
		}

		CriteriaCustom<M> c2 = new CriteriaCustom<M>();
		c2.add(RestrictionUtil.eq("artistType", ArtistTypeEnum.dress, true));
		c2.add(RestrictionUtil.in("id", idList, true));
		count = count(c2);
		if (count > 0) {
			throw new BaseException("基础资料", "婚纱摄影类的艺术家不允许删除！");
		}

		//获取个人图像ID
		CriteriaCustom<M> c3 = new CriteriaCustom<M>();
		c3.add(RestrictionUtil.in("id", idList, true));
		List<M> list = findAll(c3);
		List<Long> personImageIDList = new ArrayList<Long>(ids.length);
		for (M m : list) {
			if (m.getPersonImage() != null)
				personImageIDList.add(m.getPersonImage().getId());
		}
		super.delete(ids);

		attachmentImageService.delete(personImageIDList.toArray(new Long[] {}));
	}
}