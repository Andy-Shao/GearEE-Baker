package com.github.andyshao.baker.packager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
public class PackagerService {
    public static void main(String[] args) {
        SpringApplication.run(PackagerService.class , args);
    }
}
