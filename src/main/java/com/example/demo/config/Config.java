package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {


    public One getOne() {
        return new One();
    }

    @Bean(name = "two1")
    public Two getTwo() {
        Two two = new Two();
        two.setOne(getOne());
        return two;
    }

    @Bean(name = "two2")
    public Two getTwo2() {
        Two two = new Two();
        two.setOne(getOne());
        return two;
    }
}
