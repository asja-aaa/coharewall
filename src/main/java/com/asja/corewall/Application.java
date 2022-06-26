package com.asja.corewall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author ASJA
 * @Create 2022-06-24 22:33
 */

@SpringBootApplication
@MapperScan(value = "com.asja.corewall.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
