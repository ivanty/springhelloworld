package com.xue.taskexecutor;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

    @Async
    public void  executeAsynTask(Integer i){
        System.out.println("执行异步任务"+i);
    }

    @Async
    public void  executeAsynTaskPlus(Integer i){
        System.out.println("执行异步任务+1"+(i+1));
    }

}
