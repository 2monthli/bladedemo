package com.dream.demo.bladedemo;

import com.blade.Blade;

/**

 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Blade.of().get("/", ctx -> ctx.text("Hello World!")).start(App.class, args);
    
    	Blade.of().get("/", ctx -> {
            ctx.attribute("name", "aaa");
            ctx.render("index.html");
        }).start(App.class, args);
    }
}
