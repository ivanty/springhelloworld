package com.xue.event;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext applicationContext;//1.注入ApplicationContext用来发布事件

    public void publish(String msg){
          applicationContext.publishEvent(new DemoEvent(this,msg));//2.使用ApplicationContext的publishEvent方法来发布
    }






}
