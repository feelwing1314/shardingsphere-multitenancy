package com.afei.shardingsphere.multitenancy.service;

import com.afei.shardingsphere.multitenancy.model.Config;

public interface ConfigService {

    Config selectByPrimaryKey(Long id);

}

