package com.dream.demo.bladedemo;

import com.blade.ioc.annotation.Bean;

@Bean
public class UserService {
	public void saveUser(){
		User u=new User();
		u.setId("1");
		u.setName("黄杰");
		System.out.println("save user");
	}
}

class User{
	private String id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
