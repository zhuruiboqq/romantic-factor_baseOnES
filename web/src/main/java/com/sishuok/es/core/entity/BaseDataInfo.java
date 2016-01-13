package com.sishuok.es.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import com.sishuok.es.core.common.DataStatusEnum;

@SuppressWarnings("serial")
@MappedSuperclass
public class BaseDataInfo extends CoreInfo {
	private String name;
	private String number;
	private String simpleName;//简称
	private Date createTime;
	@Column(name = "creatorID")
	private long creator;
	private Date lastUpdateTime;
	@Column(name = "lastUpdatorID")
	private long lastUpdator;
	@Enumerated(value = EnumType.STRING)
	private DataStatusEnum dataStatus;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSimpleName() {
		return simpleName;
	}

	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public long getCreator() {
		return creator;
	}

	public void setCreator(long creator) {
		this.creator = creator;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public long getLastUpdator() {
		return lastUpdator;
	}

	public void setLastUpdator(long lastUpdator) {
		this.lastUpdator = lastUpdator;
	}

	public DataStatusEnum getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(DataStatusEnum dataStatus) {
		this.dataStatus = dataStatus;
	}
}