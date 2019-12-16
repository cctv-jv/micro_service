package com.eureka.consumer.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: ConsumerDao
 * @Description ConsumerDao
 * @create 2019/12/13
 */
@Repository
@FeignClient(name="service-provider1")
public interface ConsumerDao {


}