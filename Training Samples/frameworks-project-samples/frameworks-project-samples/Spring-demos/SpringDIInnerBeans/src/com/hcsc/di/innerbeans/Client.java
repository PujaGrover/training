package com.hcsc.di.innerbeans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("innerbeans.xml"));
		Parent prnt=(Parent)factory.getBean("parent");
		System.out.println(prnt);
		
		Parent prnt1=(Parent)factory.getBean("parent1");
		System.out.println(prnt1);
		
	}

}
