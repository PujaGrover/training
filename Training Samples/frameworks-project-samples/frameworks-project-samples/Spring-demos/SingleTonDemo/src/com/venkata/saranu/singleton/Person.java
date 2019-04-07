package com.venkata.saranu.singleton;

public class Person {
	private Integer pid;
	private String name;
	private  String city;
	private String ssn;
	private static Person person;
	
	private Person(){
		
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public static Person getPerson(){
		if(person==null)
			person=new Person();
		
		return person;
	}
	
	
}
