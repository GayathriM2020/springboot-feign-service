package com.example.discovery_client_feign_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DiscoveryClientFeignServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryClientFeignServiceApplication.class, args);
	}

}
