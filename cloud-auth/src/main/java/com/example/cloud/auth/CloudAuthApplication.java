package com.example.cloud.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 开启服务注册发现
public class CloudAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAuthApplication.class, args);
    }

}
