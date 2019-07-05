package com.wangyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.wangyi.cms.dao")
public class WyServiceCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WyServiceCmsApplication.class, args);
    }

}
