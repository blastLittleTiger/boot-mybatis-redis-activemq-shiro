package com.zgy.learn.bootmybatisredisactivemq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 扫描Mapper包
@MapperScan(basePackages = {"com.zgy.learn.bootmybatisredisactivemq.mapper"})
@SpringBootApplication
public class BootMybatisRedisActivemqApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootMybatisRedisActivemqApplication.class, args);
    }

}
