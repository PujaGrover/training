package com.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.veritis.spring.beanlife.Student;

public class CustomClient {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("custom_lifecycle.xml");
		ctx.registerShutdownHook();
		Student emp=(Student)ctx.getBean("std");
		System.out.println("Main exiting......;");
		System.out.println(emp);
	}

}
