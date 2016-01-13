/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.core.common;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-2-4 下午2:48
 * <p>Version: 1.0
 */
public enum DataStatusEnum {
    enable("启用"), disable("禁用");

    private final String info;

    private DataStatusEnum(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
