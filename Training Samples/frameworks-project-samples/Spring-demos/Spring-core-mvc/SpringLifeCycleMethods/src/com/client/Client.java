package com.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.veritis.spring.beanlife.Emp;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("lifecycle.xml");
		ctx.registerShutdownHook();
		Emp emp=(Emp)ctx.getBean("emp");
		System.out.println("Main Exited...");
	}

}
