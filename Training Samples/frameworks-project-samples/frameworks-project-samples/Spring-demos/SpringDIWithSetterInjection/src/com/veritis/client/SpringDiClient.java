package com.veritis.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.veritis.spring.di.Person;

public class SpringDiClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory beans=new XmlBeanFactory(new FileSystemResource("person.xml"));
		Person p=(Person)beans.getBean("person");
		System.out.println(p);
	}

}
