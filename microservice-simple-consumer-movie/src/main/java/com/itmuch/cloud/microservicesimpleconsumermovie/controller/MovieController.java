package com.itmuch.cloud.microservicesimpleconsumermovie.controller;

import com.itmuch.cloud.microservicesimpleconsumermovie.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: XBlue
 * @Date: Create in 2018/6/1310:19
 * @Description:
 * @Modified By:
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/movie/{id}")
    public User findById(@PathVariable Long id){
        //如果这个地方没有指定协议 http还是什么就会失败
        return this.restTemplate.getForObject("http://localhost:7900/simple/"+id,User.class);
    }
}
