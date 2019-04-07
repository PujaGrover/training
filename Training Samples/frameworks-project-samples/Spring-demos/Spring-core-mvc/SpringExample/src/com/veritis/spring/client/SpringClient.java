package com.veritis.spring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.veritis.spring.di.demo.Person;

public class SpringClient {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		Person p = (Person) factory.getBean("veritisBean");
		System.out.println(p);

		// Person p1=(Person)factory.getBean("veritisBean1");
		// System.out.println(p1);
		//

		Person p1 = (Person) factory.getBean("sageitbean");
		System.out.println(p1);
		//
		Person p2 = (Person) factory.getBean("visambean");
		System.out.println(p2);
		//
		Person p3 = (Person) factory.getBean("veritisBean");
		System.out.println(p3);
	}

}
