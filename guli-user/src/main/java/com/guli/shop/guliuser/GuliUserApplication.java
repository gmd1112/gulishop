package com.guli.shop.guliuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.guli.shop.guliuser.mapper")
public class GuliUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliUserApplication.class, args);
    }

}
