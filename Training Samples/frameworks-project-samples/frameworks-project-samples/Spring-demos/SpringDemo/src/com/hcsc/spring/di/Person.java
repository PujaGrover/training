package com.hcsc.spring.di;

public class Person {
	private String firstName;
	private String lastName;
	private String ssn;
	private String city;

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

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/*public String toString() {
		return firstName + " " + lastName + "\nCity " + " " + city + "\nSSN "
				+ " " + ssn;
	}
*/
}
