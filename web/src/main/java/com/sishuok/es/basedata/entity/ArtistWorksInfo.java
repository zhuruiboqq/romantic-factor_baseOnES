package com.sishuok.es.basedata.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	@OneToOne
	@JoinColumn(name = "artistID")
	private ArtistInfo artist;
	@OneToOne
	@JoinColumn(name = "workID")
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