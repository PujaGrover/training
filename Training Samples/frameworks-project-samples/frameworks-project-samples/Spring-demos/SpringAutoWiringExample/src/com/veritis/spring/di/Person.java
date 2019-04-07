package com.veritis.spring.di;

public class Person {
	private Name name;
	private Address address;
	private Education education;
	private String job;

	public Person() {
		
		name=new Name();
	
	}
	public Person(Name name, Address address, Education education,String job) {
		super();
		System.out.println("We are using AutoWire By Constructor");
		this.name = name;
		this.address = address;
		this.education = education;
		this.job=job;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Education getEducation() {
		return education;
	}
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		System.out.println("Calling set Job");
		this.job = job;
	}
	public String toString(){
		return name+"\n"+address+"\n"+education+"\n Job: "+job;
	}
	public void setEducation(Education education) {
		this.education = education;
	}

}
