package com.github.andyshaox.baker.register.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * Title:<br>
 * Descript:<br>
 * Copyright: Copryright(c) 20 Jun 2017<br>
 * Encoding:UNIX UTF-8
 * @author Andy.Shao
 *
 */
@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration
public class EurekaService {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService.class , args);
    }
}
