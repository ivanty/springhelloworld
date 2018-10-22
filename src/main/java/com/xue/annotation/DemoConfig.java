package com.xue.annotation;

import org.springframework.context.annotation.Bean;

@WiselyConfiguration("com.xue.annotation")
public class DemoConfig {

    @Bean
    public DemoService demoService(){
        return new DemoService();

    }

}
