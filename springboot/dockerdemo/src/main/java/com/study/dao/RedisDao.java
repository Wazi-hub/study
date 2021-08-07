package com.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class RedisDao {

    @Autowired
    private RedisTemplate redisTemplate;

    public  void setKey(String Key, String Value){
        redisTemplate.opsForValue().set(Key,Value);
    }

    public  String getKey(String Key){
      return  (String) redisTemplate.opsForValue().get(Key);
    }
}
