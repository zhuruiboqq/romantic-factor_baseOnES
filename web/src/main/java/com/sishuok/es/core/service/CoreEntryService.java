/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.core.service;

import com.sishuok.es.core.entity.CoreEntryInfo;
import com.sishuok.es.core.repository.CoreEntryRepository;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-2-4 下午3:01
 * <p>Version: 1.0
 */
public class CoreEntryService<M extends CoreEntryInfo> extends CoreService<M> {

    public CoreEntryRepository<M> getCoreRepository() {
        return (CoreEntryRepository<M>) baseRepository;
    }
}