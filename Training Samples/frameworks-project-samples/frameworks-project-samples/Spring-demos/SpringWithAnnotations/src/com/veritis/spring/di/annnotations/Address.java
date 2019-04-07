package com.veritis.spring.di.annnotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component

public class Address {

	String street;
	@Value("${address.city}")
	String city;
	@Value("${address.state}")
	String state;

	public String getStreet() {
		return street;
	}
	@Value("${address.street}")
	public void setStreet(String street) {
		System.out.println("setStree() Autowired with value "+street);
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	
	public void setCity(String city) {
		System.out.println("Entere into setCityAutoWiring ");
		this.city = city;
	}

	public String getState() {
		return state;
	}

	
	public void setState(String state) {
		System.out.println("Entered into setState()");
		this.state = state;
	}

}
