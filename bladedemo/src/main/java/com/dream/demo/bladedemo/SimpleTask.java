package com.dream.demo.bladedemo;

import com.blade.ioc.annotation.Bean;
import com.blade.task.annotation.Schedule;

@Bean
public class SimpleTask {

   //@Schedule(cron = "* * * * * ?")
    public void syncRelate() {
        System.out.println("执行一次");
    }

}