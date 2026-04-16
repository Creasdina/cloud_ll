package com.example.cloud.pms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @GetMapping("/order/info")
    public String getOrder() {
        return "Order Info from port 8081";
    }
}
