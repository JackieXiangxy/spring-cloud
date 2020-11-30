package com.jackie.springcloud03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Cloud03Application {

    public static void main(String[] args) {
        SpringApplication.run(Cloud03Application.class, args);
    }

}
