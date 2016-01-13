package com.sishuok.es.core.entity;

import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial")
@MappedSuperclass
public class CoreEntryInfo extends CoreInfo {
	private int seq;//序号

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

}