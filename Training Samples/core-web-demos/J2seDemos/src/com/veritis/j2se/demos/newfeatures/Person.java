/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.newfeatures;

/**
 * 
 * @author vsaranu
 */
public class Person {
	String firstName;
	String lastName;

	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	public String toString(){
		return firstName+" "+lastName;
	}

}
