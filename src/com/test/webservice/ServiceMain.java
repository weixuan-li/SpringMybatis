package com.test.webservice;

import javax.xml.ws.Endpoint;

//@WebService
public class ServiceMain {
	/*public String getValue(String name){
		
		return "我叫："+name;
	}*/
	
	public static void main (String args[]){
		HelloWorld hw = new HelloWorldImpl();
		
		/*String address = "http://127.0.0.1:9999/SpringMybatis/ServiceMain";
		Endpoint.publish(address, new ServiceMain());*/
		Endpoint.publish("http://127.0.0.1:9999/SpringMybatis/HelloWorldImpl",hw);
		System.out.println("Web Service success！");
	}

}
