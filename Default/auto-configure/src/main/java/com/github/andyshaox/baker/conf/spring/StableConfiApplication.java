package com.github.andyshaox.baker.conf.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

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
@EnableConfigServer
public class StableConfiApplication {
    public static void main(String[] args) {
        SpringApplication.run(StableConfiApplication.class , args);
    }
}
