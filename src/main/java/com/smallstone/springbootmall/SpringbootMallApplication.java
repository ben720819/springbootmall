package com.smallstone.springbootmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan({"com.smallstone.springbootmall.controller"})
public class SpringbootMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMallApplication.class, args);
    }

}
