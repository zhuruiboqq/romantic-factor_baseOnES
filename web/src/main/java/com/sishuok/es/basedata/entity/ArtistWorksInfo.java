package com.sishuok.es.basedata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.sishuok.es.common.repository.support.annotation.EnableQueryCache;
import com.sishuok.es.core.entity.CoreEntryInfo;

@SuppressWarnings("serial")
@Entity
@Table(name = "bd_artistworks")
@EnableQueryCache
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ArtistWorksInfo extends CoreEntryInfo {
	@Column(name="artistID")
	private ArtistInfo artist;
	@Column(name="workID")
	private AttachmentImageInfo work;

	public ArtistInfo getArtist() {
		return artist;
	}

	public void setArtist(ArtistInfo artist) {
		this.artist = artist;
	}

	public AttachmentImageInfo getWork() {
		return work;
	}

	public void setWork(AttachmentImageInfo work) {
		this.work = work;
	}

}