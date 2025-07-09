package com.example.discovery_client_feign_service.clent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "discovery-client-eureka")
public interface UserClient {
    @GetMapping("/hello")
    String getHello();
}
