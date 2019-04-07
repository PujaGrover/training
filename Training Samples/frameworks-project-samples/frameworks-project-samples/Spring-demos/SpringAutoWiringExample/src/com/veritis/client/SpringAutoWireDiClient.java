package com.veritis.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.veritis.spring.di.Person;

public class SpringAutoWireDiClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext beans=new ClassPathXmlApplicationContext("person.xml");
		Person p=(Person)beans.getBean("person");
		
		//String job = (String)beans.getBean("job");
		System.out.println(p);
	}

}
