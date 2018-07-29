package com.websystique.spring.domain;

import com.websystique.spring.domain.HelloWorld;

public class HelloWorldImpl implements HelloWorld{
	
		
	 public HelloWorldImpl() {
		System.out.println("i am in constr");
	}
	
	 

	public void sayHello(String name) {
	        System.out.println("Hello "+name);
	    }
	
	
	
	
	
	
	
	
	
	
	/*public void myinit()
	{
		System.out.println("in init");
	}
	public void mydestroy()
	{
		System.out.println("in destroy");
	}*/

	
}

