package com.dream.demo.bladedemo;

import com.blade.ioc.annotation.Bean;
import com.blade.mvc.RouteContext;
import com.blade.mvc.hook.WebHook;

//aop
@Bean
public class Hook1 implements WebHook {

    @Override
    public boolean before(RouteContext ctx) {
        System.out.println("进入web hook1");
        return true;
    }

}