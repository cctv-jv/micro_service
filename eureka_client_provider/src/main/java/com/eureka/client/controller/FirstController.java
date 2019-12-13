package com.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author neutron
 * @version 1.0.0
 * @className: FirstController
 * @Description FirstController
 * @create 2019/12/12
 */
@RestController
@RequestMapping("/firstController")
public class FirstController {

    @RequestMapping("/query")
    public Object query() {
        return "firstQuery";
    }
}