/**
 * Copyright (c) 2005-2012 https://github.com/zhuruiboqq
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.sishuok.es.showcase.sample.repository;

import com.sishuok.es.common.repository.BaseRepository;
import com.sishuok.es.showcase.sample.entity.Sample;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 13-2-4 下午3:00
 * <p>Version: 1.0
 */
public interface SampleRepository extends BaseRepository<Sample, Long> {

    Sample findByName(String name);

}
