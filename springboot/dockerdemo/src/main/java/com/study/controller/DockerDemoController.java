package com.study.controller;


import com.study.dao.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class DockerDemoController {

    @Autowired
    RedisDao redisDao;
    @RequestMapping("helloDocker/{key}/{value}")
    public String helloDocker(@PathVariable String key , @PathVariable String value){

        redisDao.setKey(key , value);

        return redisDao.getKey(key);
    }

}
