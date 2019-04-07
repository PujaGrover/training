package com.veritis.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.veritis.spring.di.annnotations.Person;

public class Client {

	public static void main(String args[]){
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("person.xml");
		Person p=(Person)ctx.getBean("person");
		ctx.registerShutdownHook();
		System.out.println(p.getName());
		System.out.println(p.getAddress().getStreet());
	}
	
}
