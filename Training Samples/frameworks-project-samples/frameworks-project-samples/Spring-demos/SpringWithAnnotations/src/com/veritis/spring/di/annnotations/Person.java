package com.veritis.spring.di.annnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("${pers.name}")
	String name;
	
	@Autowired
	Address address;

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		System.out.println("Entered into setName()");
		this.name = name;
	}

	public Address getAddress() {
		
		return address;
	}
	
	
	public void setAddress(Address address) {
		System.out.println("Entered into setAddress() ");
		this.address = address;
	}
	
	@PostConstruct
	public void callmeFirt(){
		System.out.println("Entered Callme First");
	}
	@PreDestroy
	public void killmeFirst(){
		System.out.println("Entered Killme First");
	}
}
