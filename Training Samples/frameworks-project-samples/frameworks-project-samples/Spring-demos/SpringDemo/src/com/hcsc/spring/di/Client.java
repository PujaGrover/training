package com.hcsc.spring.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		BeanFactory beans=new XmlBeanFactory(new FileSystemResource("springs.xml"));
		Person person=(Person)beans.getBean("person");
		System.out.println(person);
		Person person1=(Person)beans.getBean("person");
		System.out.println(person1);
		

	}

}
