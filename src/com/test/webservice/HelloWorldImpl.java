package com.test.webservice;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface="com.test.webservice.HelloWorld",serviceName="HelloWorldImpl")
public class HelloWorldImpl implements HelloWorld{
	
	@Override
	public String sayHi(String name){
		
		return name+"您好！现在时间是："+new Date();
	}

}
