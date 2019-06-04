package com.afei.shardingsphere.multitenancy.service.impl;

import com.afei.shardingsphere.multitenancy.mapper.OrderMapper;
import com.afei.shardingsphere.multitenancy.model.Order;
import com.afei.shardingsphere.multitenancy.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public void save(Order order) {
        orderMapper.save(order);
    }
}
