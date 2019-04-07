package com.hcsc.spring.di.constructor;

public class Person {
	private int personID;
	private String personName;
	private String city;
	private String ssn;

	public Person(int personID, String personName, String city, String ssn) {
		super();
		this.personID = personID;
		this.personName = personName;
		this.city = city;
		this.ssn = ssn;
	}

	public String toString() {
		return "Person Id: " + personID + "\nPerson Name: " + personName
				+ "\nCity Name: " + city + "\nSocial Security Number: " + ssn;
	}
}
