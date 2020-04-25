package com.chiangshin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author jx
 * @Date 2020/4/25 23:27
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DemoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServerApplication.class, args);
    }
}
