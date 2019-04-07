package com.hcsc.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXMLClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(factory.getBean("person"));

	}

}
