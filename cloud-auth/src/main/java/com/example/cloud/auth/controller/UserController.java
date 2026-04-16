package com.example.cloud.auth.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 支持配置动态刷新
public class UserController {

    @Value("${user.info:default-info}")
    private String userInfo;

    @GetMapping("/user/info")
    public String getInfo() {
        return "Nacos Config: " + userInfo;
    }
}