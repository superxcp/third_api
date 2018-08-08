package com.superxcp.theThird.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by xcp on 2017/11/26.
 */
@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate redisTemplate;

    //字符串操作
    public void setString(String key,String value){
        redisTemplate.opsForValue().set(key,value);

    }

    public String getString(String key){
        return (String)redisTemplate.opsForValue().get(key);
    }

    //操作hash
    public void setHash(String key,Map map){
        redisTemplate.opsForHash().putAll(key,map);

    }

    public Map getHash(String key){
        return redisTemplate.opsForHash().entries(key);
    }

    //操作List
    public void setRightList(String key,String value){
        redisTemplate.opsForList().rightPush(key,value);

    }

    public List getList(String key, int start, int end){
        return redisTemplate.opsForList().range(key,start,end);
    }

    //操作set
    public void setSet(String key,String value){
        redisTemplate.opsForSet().add(key,value);
    }

    public Set getSet(String key){
        return redisTemplate.opsForSet().members(key);
    }

    //操作zset
    public void setZSet(String key,String value,int position){
        redisTemplate.opsForZSet().add(key,value,position);
    }

    public Set getZSet(String key,int start,int end){
        return redisTemplate.opsForZSet().rangeByScore(key,start,end);
    }
}
