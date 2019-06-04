package com.afei.shardingsphere.multitenancy.mapper;

import com.afei.shardingsphere.multitenancy.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    void save(Order order);

}
