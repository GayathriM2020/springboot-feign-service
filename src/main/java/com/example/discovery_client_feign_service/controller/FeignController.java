package com.example.discovery_client_feign_service.controller;

import com.example.discovery_client_feign_service.clent.UserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    public UserClient userClient;

    public FeignController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/user/data")
    public String getUserServiceDate() {
        return userClient.getHello();
    }
}
