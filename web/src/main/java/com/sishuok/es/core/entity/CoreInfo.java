package com.sishuok.es.core.entity;

import javax.persistence.MappedSuperclass;

import com.kingdee.util.ObjectUtils;
import com.sishuok.es.common.entity.BaseEntity;

@SuppressWarnings("serial")
@MappedSuperclass
public class CoreInfo extends BaseEntity<Long> {

	public Object createCopy() throws CloneNotSupportedException {
		return ObjectUtils.createCopy(this);
	}
}
