package com.jackie.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer3Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer3Application.class, args);
    }

}
