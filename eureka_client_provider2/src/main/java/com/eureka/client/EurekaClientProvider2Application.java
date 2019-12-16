package com.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author neutron
 * @version 1.0.0
 * @className: FirstController
 * @Description FirstController
 * @create 2019/12/13
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProvider2Application.class, args);
    }

}
