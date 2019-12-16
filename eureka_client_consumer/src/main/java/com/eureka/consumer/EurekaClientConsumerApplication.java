package com.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author neutron
 * @version 1.0.0
 * @className: EurekaClientConsumerApplication
 * @Description EurekaClientConsumerApplication
 * @create 2019/12/12
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
