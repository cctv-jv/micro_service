package com.eureka.consumer2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: ConsumerController
 * @Description ConsumerController
 * @create 2019/12/13
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getProvider")
    public String getProvider() {
        return this.restTemplate.getForObject("http://service-provider1/firstController/query", String.class);
    }
}