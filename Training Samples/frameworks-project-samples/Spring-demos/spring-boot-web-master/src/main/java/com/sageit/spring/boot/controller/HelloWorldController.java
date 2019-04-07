package com.sageit.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sageit.spring.boot.domain.Person;

@RestController
@RequestMapping("/sageitweb")
public class HelloWorldController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello(){
		return "Welcome to Sageit Spring Boot Sample";
	}
	
	@RequestMapping("/person")
	public @ResponseBody Person getPersonDetails(){
		Person person=new Person();
		person.setPeersonId(1234);
		person.setPersonName("Sgge IT");
		person.setAddress("Frisco TX");
		person.setSsn("123-45-6789");
		return person;
	}
}
