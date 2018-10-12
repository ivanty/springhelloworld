package com.xue.aop;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.xue.aop")
@EnableAspectJAutoProxy//使用@EnableAspectJAutoProxy注解开始Spring对AspectJ代理的支持
public class AopConfig {



}
