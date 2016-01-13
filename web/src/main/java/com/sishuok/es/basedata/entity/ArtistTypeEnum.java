package com.sishuok.es.basedata.entity;

public enum ArtistTypeEnum {
	makeup("化妆师"), photographer("摄影师");

	private final String info;

	private ArtistTypeEnum(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}
}