package com.xue.controller;

import com.xue.aop.AopConfig;
import com.xue.aop.DemoAnnotationService;
import com.xue.aop.DemoMethodService;
import com.xue.scope.DemoPrototypeService;
import com.xue.scope.DemoSingletonService;
import com.xue.scope.ScopeConfig;
import com.xue.service.DiConfig;
import com.xue.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
       /* AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService= context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.sayHello("di"));
        context.close();*/
/*
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService=context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService=context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();*/
//测试Scope,singleton与prototype的范围
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1=context.getBean(DemoSingletonService.class);
        DemoSingletonService s2=context.getBean(DemoSingletonService.class);
        DemoPrototypeService p1=context.getBean( DemoPrototypeService.class);
        DemoPrototypeService p2=context.getBean( DemoPrototypeService.class);

        System.out.println("s1与s2是否相等"+s1.equals(s2));
        System.out.println("p1与p2是否相等"+p1.equals(p2));








}
}
