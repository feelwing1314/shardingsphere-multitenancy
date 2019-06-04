package com.afei.shardingsphere.multitenancy;

import com.afei.shardingsphere.multitenancy.model.Order;
import com.afei.shardingsphere.multitenancy.service.OrderService;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author afei
 * @date 2018-08-08
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = OrderSpringBootTests.class)
@SpringBootApplication
@ActiveProfiles("sharding")
public class OrderSpringBootTests {

    @Resource
    private OrderService orderService;

    @Test
    public void save(){
        List<String> merchantList = Lists.newArrayList("aliyun", "taobao", "tmall");

        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setUserId(i);
            order.setOrderNo(System.currentTimeMillis() + String.format("%06d", i));
            order.setOrderTime(new Date());
            order.setMerchant(merchantList.get(new Random().nextInt(merchantList.size())));
            orderService.save(order);

        }
    }

}
