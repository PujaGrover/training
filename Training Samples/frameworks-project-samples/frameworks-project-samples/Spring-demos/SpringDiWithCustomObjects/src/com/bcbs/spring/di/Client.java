package com.bcbs.spring.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		AbstractApplicationContext  beans=new ClassPathXmlApplicationContext("empbeans.xml");
		Emp emp=(Emp)beans.getBean("emp");
		System.out.println(emp);
		beans.registerShutdownHook();

	}

}
