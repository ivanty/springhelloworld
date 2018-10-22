package com.xue.annotation;


import org.springframework.stereotype.Service;

public class DemoService {
    public void outputResult(){

        System.out.println("从组合注解配置照样获得的Bean");
    }
}
