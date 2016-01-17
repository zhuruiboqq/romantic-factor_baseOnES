/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.common.web.entity;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * jquery File Upload 文件上传响应
 * <p>User: Zhang Kaitao
 * <p>Date: 13-2-13 下午4:37
 * <p>Version: 1.0
 */
public class AjaxUploadResponse {

    private List<FileMeta> files = Lists.newArrayList();

    public void add(String name, long size, String error) {
        files.add(new FileMeta(name, size, error));
    }

    public void add(String name, long size, String url, String delete_url) {
        files.add(new FileMeta(name, size, url, delete_url));
    }

    public void add(String name, long size, String url, String thumbnail_url, String delete_url) {
        files.add(new FileMeta(name, size, url, thumbnail_url, delete_url));
    }

    public List<FileMeta> getFiles() {
        return files;
    }

    public void setFiles(List<FileMeta> files) {
        this.files = files;
    }
}
