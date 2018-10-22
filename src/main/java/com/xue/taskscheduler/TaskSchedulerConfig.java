package com.xue.taskscheduler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.xue.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
