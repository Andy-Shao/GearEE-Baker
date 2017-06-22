package com.github.andyshaox.baker.coordination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class CoordinationService {
    public static void main(String[] args) {
        SpringApplication.run(CoordinationService.class , args);
    }
}
