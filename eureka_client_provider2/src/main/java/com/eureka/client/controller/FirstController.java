package com.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author neutron
 * @version 1.0.0
 * @className: FirstController
 * @Description FirstController
 * @create 2019/12/13
 */
@RestController
@RequestMapping("/firstController")
public class FirstController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/query")
    public Object query() {
        return String.format("服务的端口:%s",port);
    }
}