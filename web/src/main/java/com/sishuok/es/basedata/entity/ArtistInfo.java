package com.sishuok.es.basedata.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.sishuok.es.common.repository.support.annotation.EnableQueryCache;
import com.sishuok.es.core.entity.BaseDataInfo;

@SuppressWarnings("serial")
@Entity
@Table(name = "bd_artist")
@EnableQueryCache
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ArtistInfo extends BaseDataInfo {
	@OneToOne
	@JoinColumn(name = "personImageID")
	private AttachmentImageInfo personImage = new AttachmentImageInfo();
	private String region;//所属区域
	private String organization;//所属机构
	private String weixin;//微信
	private String telephone;//联系方式
	private String qq;//联系方式
	private String degree;//学位、等级
	private String technical;//职称
	private String content;//个人简介
	@Enumerated(value = EnumType.STRING)
	private ArtistTypeEnum artistType;//艺术家类型：化妆师makeup、摄影师photographer、
	private String worksPath;
	private int priority;//优先级

	public AttachmentImageInfo getPersonImage() {
		return personImage;
	}

	public void setPersonImage(AttachmentImageInfo personImage) {
		this.personImage = personImage;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getWeixin() {
		return weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getTechnical() {
		return technical;
	}

	public void setTechnical(String technical) {
		this.technical = technical;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ArtistTypeEnum getArtistType() {
		return artistType;
	}

	public void setArtistType(ArtistTypeEnum artistType) {
		this.artistType = artistType;
	}

	public String getWorksPath() {
		return worksPath;
	}

	public void setWorksPath(String worksPath) {
		this.worksPath = worksPath;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

}