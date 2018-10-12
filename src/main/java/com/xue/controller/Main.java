package com.xue.controller;

import com.xue.service.DiConfig;
import com.xue.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService= context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("di"));
        context.close();
}

}
