package com.afei.shardingsphere.multitenancy.mapper;

import com.afei.shardingsphere.multitenancy.model.Config;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ConfigMapper {

    Config selectByPrimaryKey(Long id);

}
