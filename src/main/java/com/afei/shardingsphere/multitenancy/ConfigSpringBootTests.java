package com.afei.shardingsphere.multitenancy;

import com.afei.shardingsphere.multitenancy.model.Config;
import com.afei.shardingsphere.multitenancy.service.ConfigService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 分表模式下，可以执行这个测试用例，前提是需要在afei这个数据库中有创建表tb_config<br/>
 * 这个用例的目的是验证：访问tb_order表时才涉及分表，访问tb_config表就是普通访问模式
 * @author afei
 * @date 2018-08-08
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ConfigSpringBootTests.class)
@SpringBootApplication
@ActiveProfiles("sharding")
public class ConfigSpringBootTests {

    @Resource
    private ConfigService configService;

    @Test
    public void selectByPrimaryKey(){
        long id = 1L;
        Config config = configService.selectByPrimaryKey(id);
        Assert.assertEquals(config.getId(), id);
    }

}
