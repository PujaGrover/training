package com.sageit.spring.boot.domain;

public class Person {
	private int peersonId;
	private String personName;
	private String address;
	private String ssn;

	public int getPeersonId() {
		return peersonId;
	}

	public void setPeersonId(int peersonId) {
		this.peersonId = peersonId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

}
