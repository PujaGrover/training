package com.veritis.spring.di.demo;

public class Person {
	int pid;
	String firstName;
	String lastName;
	String location;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
//	public String toString(){
//		return "Person id "+pid+"\nPerson Name "+firstName+" "+lastName+"\n Location : "+location;
//	}

}
