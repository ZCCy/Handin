package com.zccy.handin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zccy.handin.mapper")
@SpringBootApplication
public class HandinApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandinApplication.class, args);
    }

}
