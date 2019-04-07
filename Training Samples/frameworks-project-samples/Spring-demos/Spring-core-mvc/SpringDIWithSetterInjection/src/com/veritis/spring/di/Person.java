package com.veritis.spring.di;

public class Person {
	private Name name;
	private Address address;
	private Education education;

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
	public String toString(){
		return name+"\n"+address+"\n"+education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}

}
