package com.hcsc.spring.di.collections.map;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("map.xml");
		EmpMap map = (EmpMap) ctx.getBean("employeeMap");
		
		System.out.println("Employees Details are: ");
		for (Entry<String,Emp> entry:map.getEmpMap().entrySet()) {
			System.out.println("\n");
			System.out.println(entry.getValue());
		}
	}
}
