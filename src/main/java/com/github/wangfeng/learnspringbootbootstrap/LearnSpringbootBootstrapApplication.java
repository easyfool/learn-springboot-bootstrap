package com.github.wangfeng.learnspringbootbootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LearnSpringbootBootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringbootBootstrapApplication.class, args);
    }

}
