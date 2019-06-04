package com.afei.shardingsphere.multitenancy.service.impl;

import com.afei.shardingsphere.multitenancy.mapper.ConfigMapper;
import com.afei.shardingsphere.multitenancy.model.Config;
import com.afei.shardingsphere.multitenancy.service.ConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ConfigServiceImpl implements ConfigService {

    @Resource
    private ConfigMapper configMapper;


    @Override
    public Config selectByPrimaryKey(Long id) {
        return configMapper.selectByPrimaryKey(id);
    }
}
