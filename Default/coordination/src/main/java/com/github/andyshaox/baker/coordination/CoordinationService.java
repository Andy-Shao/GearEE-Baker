package com.github.andyshaox.baker.coordination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CoordinationService {
    public static void main(String[] args) {
        SpringApplication.run(CoordinationService.class , args);
    }
}
