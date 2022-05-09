package com.monkey.snail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan("com.monkey.snail.modules")
public class SnailApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnailApplication.class, args);
    }

}
