package com.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author neutron
 * @version 1.0.0
 * @className: EurekaServerApplication
 * @Description ClientApplication
 * @create 2019/12/12
 */
@SpringBootApplication(scanBasePackages = "com.eureka.client")
@EnableEurekaClient
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
