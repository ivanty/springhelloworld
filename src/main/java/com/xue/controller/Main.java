package com.xue.controller;

import com.xue.aop.AopConfig;
import com.xue.aop.DemoAnnotationService;
import com.xue.aop.DemoMethodService;
import com.xue.el.ElConfig;
import com.xue.event.DemoPublisher;
import com.xue.event.EventConfig;
import com.xue.prepost.BeanWayService;
import com.xue.prepost.JSR250WayService;
import com.xue.prepost.PrePostConfig;
import com.xue.profile.DemoBean;
import com.xue.profile.ProfileConfig;
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
       /* AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1=context.getBean(DemoSingletonService.class);
        DemoSingletonService s2=context.getBean(DemoSingletonService.class);
        DemoPrototypeService p1=context.getBean( DemoPrototypeService.class);
        DemoPrototypeService p2=context.getBean( DemoPrototypeService.class);

        System.out.println("s1与s2是否相等"+s1.equals(s2));
        System.out.println("p1与p2是否相等"+p1.equals(p2));
*/
       //测试Spring El和资源调用



        //测试Bean的初始化和销毁
      /*  AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService=context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService=context.getBean(JSR250WayService.class);
        context.close();*/
      //测试profile
       /* AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();
        DemoBean demoBean=context.getBean(DemoBean.class);
        System.out.println(demoBean.getContext());
        context.close();*/

         //测试事件发布

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher=context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();









}
}
