package com.xue.controller;

import com.xue.aop.AopConfig;
import com.xue.aop.DemoAnnotationService;
import com.xue.aop.DemoMethodService;
import com.xue.service.DiConfig;
import com.xue.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
       /* AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService= context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("di"));
        context.close();*/

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService=context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService=context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();


}

}
