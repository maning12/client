package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
public class EurekaClient3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient3Application.class, args);
    }

}
