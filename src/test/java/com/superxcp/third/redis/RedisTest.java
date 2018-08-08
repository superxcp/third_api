package com.superxcp.third.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xcp on 2017/11/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/*.xml"})
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void get() {
        System.out.println(redisTemplate.opsForHash().get("lpMap","age"));
    }


}