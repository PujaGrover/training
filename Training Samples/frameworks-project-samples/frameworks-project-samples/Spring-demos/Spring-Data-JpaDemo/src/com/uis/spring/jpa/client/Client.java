package com.uis.spring.jpa.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uis.spring.jpa.demo.Person;
import com.uis.spring.jpa.service.PersonService;

public class Client {

	private static ApplicationContext ctx;
    static {
        ctx = new ClassPathXmlApplicationContext("com/uis/spring/jpa/demo/spring-jpa.xml");
    }
    public static void main(String[] args) {
    	PersonService serviceBean=(PersonService)ctx.getBean("personService");
    	Person person=new Person();
    	person.setPid(1204);
    	person.setName("Bhanu");
    	person.setCity("Plano");
    	person.setSsn("165-25-9452");
    	serviceBean.create(person);
    	List<Person> persons = serviceBean.findPersonByCity("Irving");
    	for(Person person1:persons){
    	System.out.println(person1);
    	}
    	
    	persons = serviceBean.findByPersonsGPid(1202);
    	
    	for(Person person2:persons){
        	System.out.println(person2);
        }
    	
	}

}
