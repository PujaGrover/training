package com.veritis.hibernate.demos;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable

public class UserDetail implements Serializable {
	
	String firstName;
	String lastName;
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
}
