package com.guli.shop.guliuser;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.guli.shop.guliuser.mapper")
public class GuliUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliUserApplication.class, args);
    }

}
