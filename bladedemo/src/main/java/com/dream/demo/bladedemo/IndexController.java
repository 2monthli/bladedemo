package com.dream.demo.bladedemo;

import com.blade.ioc.annotation.Inject;
import com.blade.mvc.annotation.CookieParam;
import com.blade.mvc.annotation.DeleteRoute;
import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.HeaderParam;
import com.blade.mvc.annotation.Param;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.PathParam;
import com.blade.mvc.annotation.PostRoute;
import com.blade.mvc.annotation.PutRoute;
import com.blade.mvc.annotation.Route;
import com.blade.mvc.http.HttpMethod;
import com.blade.mvc.http.Response;

@Path
public class IndexController {
    @Inject
    private UserService userService;
	
    @GetRoute("/")
    public String index(){
        return "index.html";
    }

    @PostRoute("/save")
    public void saveUser(@Param String username){
        System.out.println("username:" + username);
    }

    @PutRoute("/update")
    public void updateUser(@Param String username){
        System.out.println("username:" + username);
    }

    @DeleteRoute("/delete/:uid")
    public void updateUser(@PathParam Integer uid){
        System.out.println("delete user:" + uid);
    }
    
    @GetRoute("/header")
    public void husers(@HeaderParam String Referer){
        System.out.println("Referer: " + Referer);
    }
    
    
    @GetRoute("/cookie")
    public void cusers(@CookieParam String uid){
        System.out.println("uid: " + uid);
    }
    
    @Route(value="/hello",method=HttpMethod.GET)
    public void responseHTML(Response response){
        response.html("<h1>Hello World</h1>");
    }
    
    @Route(value="/hello2",method=HttpMethod.GET)
    public void responseJSON(Response response){
        response.json("{\"status\": 200}");
    }
    
    @Route(value="/hello3",method=HttpMethod.GET)
    public void responseHello(Response response){
    	userService.saveUser();
        response.json("{\"status\": \"save success\"}");
    }


}