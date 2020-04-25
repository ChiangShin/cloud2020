package com.chiangshin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author jx
 * @Date 2020/4/26 0:35
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class DemoClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoClientApplication.class, args);
    }
}
