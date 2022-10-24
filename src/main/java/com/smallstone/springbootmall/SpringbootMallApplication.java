package com.smallstone.springbootmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ComponentScan(basePackages={"com.spring.*"})
@SpringBootApplication
public class SpringbootMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMallApplication.class, args);
    }

}
