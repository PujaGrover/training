package com.hcsc.spring.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String args[]){
	ApplicationContext beans=new ClassPathXmlApplicationContext("/com/hcsc/spring/di/constructor/constructor.xml");
	Person p=(Person)beans.getBean("consper");
	System.out.println(p);
//	Person p1=(Person)beans.getBean("consper");
//	System.out.println(p1);
//	Person p2=(Person)beans.getBean("consper");
//	System.out.println(p2);
	
}
}
