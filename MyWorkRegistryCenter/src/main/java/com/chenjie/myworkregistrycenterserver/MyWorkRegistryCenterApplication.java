package com.chenjie.myworkregistrycenterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyWorkRegistryCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyWorkRegistryCenterApplication.class, args);
    }

}
