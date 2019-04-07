package com.veritis.spring.di;

public class Address {
	private String street;
	private String apt;
	private String city;
	private String state;
	private Integer zip;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getApt() {
		return apt;
	}

	public void setApt(String apt) {
		this.apt = apt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}
	public String toString(){
		return street+" Apt #"+apt+"\n"+city+"\n"+state+"\n"+zip+"\n";
	}
}
