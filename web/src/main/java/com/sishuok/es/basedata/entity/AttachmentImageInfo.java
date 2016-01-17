package com.sishuok.es.basedata.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.sishuok.es.common.repository.support.annotation.EnableQueryCache;
import com.sishuok.es.core.entity.BaseDataInfo;

/**
 * name用于保存文件原来名称，number用来保存UUID，作为另存为的文件名
 * @author zrb
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "bas_AttachmentImage")
@EnableQueryCache
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class AttachmentImageInfo extends BaseDataInfo {
	private String storePath;//原图服务器保存路径
	private String storeSmallPath;//小图片服务器保存路径
	private String storeMidPath;//中图片服务器保存路径
	private String displayURL;//原图页面显示路径
	private String displaySmallURL;//小图片页面显示路径
	private String displayMidURL;//中图片页面显示路径，一般不用
	private String permission;//权限
	private long sizeInByte;//字节大小
	private String size;//人为识别大小
	private String extName;//文件扩展名
	private int width;//图片宽度
	private int height;//图片高度

	public String getStorePath() {
		return storePath;
	}

	public void setStorePath(String storePath) {
		this.storePath = storePath;
	}

	public String getStoreSmallPath() {
		return storeSmallPath;
	}

	public void setStoreSmallPath(String storeSmallPath) {
		this.storeSmallPath = storeSmallPath;
	}

	public String getStoreMidPath() {
		return storeMidPath;
	}

	public void setStoreMidPath(String storeMidPath) {
		this.storeMidPath = storeMidPath;
	}

	public String getDisplaySmallURL() {
		return displaySmallURL;
	}

	public void setDisplaySmallURL(String displaySmallURL) {
		this.displaySmallURL = displaySmallURL;
	}

	public String getDisplayMidURL() {
		return displayMidURL;
	}

	public void setDisplayMidURL(String displayMidURL) {
		this.displayMidURL = displayMidURL;
	}

	public String getDisplayURL() {
		return displayURL;
	}

	public void setDisplayURL(String displayURL) {
		this.displayURL = displayURL;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public long getSizeInByte() {
		return sizeInByte;
	}

	public void setSizeInByte(long sizeInByte) {
		this.sizeInByte = sizeInByte;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getExtName() {
		return extName;
	}

	public void setExtName(String extName) {
		this.extName = extName;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}