package com.pl.pleurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PlEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlEurekaServerApplication.class, args);
    }

}
