package com.pl.pleurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PlEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlEurekaClientApplication.class, args);
    }

}
