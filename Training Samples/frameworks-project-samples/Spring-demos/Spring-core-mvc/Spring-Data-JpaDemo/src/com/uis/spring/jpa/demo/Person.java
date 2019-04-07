package com.uis.spring.jpa.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	int pid;
	@Column
	String name;
	@Column
	String city;

	@Column
	String ssn;
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
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

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", city=" + city
				+ ", ssn=" + ssn + "]";
	}


}
