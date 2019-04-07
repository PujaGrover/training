package com.hcsc.spring.di.collections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("collections.xml"));
		Student std=(Student)factory.getBean("student");
		System.out.println("Student Details Are :");
		System.out.println("Roll Number : "+std.getRollNo());
		System.out.println("Student Name : "+std.getStdname());
		for(Subject sub:std.getSubjects()){
			System.out.println(sub);
		}
		
	}

}
