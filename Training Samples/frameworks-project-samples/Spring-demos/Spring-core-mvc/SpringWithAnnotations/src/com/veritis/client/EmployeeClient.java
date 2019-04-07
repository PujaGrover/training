package com.veritis.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.veritis.spring.di.annnotations.Person;
import com.veritis.spring.di.service.EmployeService;

public class EmployeeClient {
	public static void main(String args[]){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("person.xml");
		EmployeService p=(EmployeService)ctx.getBean("employee");
		p.setSalAdjustment(50000);
		System.out.println(p.getSalary());
	}

}
