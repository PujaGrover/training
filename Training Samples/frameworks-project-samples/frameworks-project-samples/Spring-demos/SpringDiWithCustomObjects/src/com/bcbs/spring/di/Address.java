package com.bcbs.spring.di;

public class Address {
	private String streetName;
	private int unit;
	private String city;
	private String state;
	private int zip;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
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

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	public String toString(){
		return streetName+"\nfloor "+unit+"\n"+city+","+state+"\n"+zip;
	}
}
