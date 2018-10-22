package com.xue.controller;

import com.xue.annotation.DemoConfig;
import com.xue.annotation.DemoService;
import com.xue.aop.AopConfig;
import com.xue.aop.DemoAnnotationService;
import com.xue.aop.DemoMethodService;
import com.xue.aware.AwareConfig;
import com.xue.aware.TestService;
import com.xue.conditional.ConditionConfig;
import com.xue.conditional.ListService;
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
import com.xue.taskexecutor.AsyncTaskService;
import com.xue.taskexecutor.TaskExecutorConfig;
import com.xue.taskscheduler.TaskSchedulerConfig;
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

       /* AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher=context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();
*/
       //测试Spring aware
       /* AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AwareConfig.class);
                TestService awareService=context.getBean(TestService.class);
                awareService.outputResult();
                context.close();*/
      /* //测试多线程
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService=context.getBean(AsyncTaskService.class);
        for (int i=0;i<10;i++){
            asyncTaskService.executeAsynTask(i);
            asyncTaskService.executeAsynTaskPlus(i);
        }
        context.close();*/
      //测试计划任务
/*
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);*/

       //测试@Contional的条件
        /*AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService=context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的列表命令为:"+listService.showListCmd());*/
        //组合注解
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService=context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();



 }
}
