package com.veritis.hibernate.demos;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Type;

@Entity
@Table(name="PersonDetails")
public class Person {
	
	@Id
	@Column(name="pid")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	String pid;
	
	@Embedded
	UserDetail username;  
	
	@Embedded
	Address location;
	@Transient
	String ssn;
	@Temporal(value=TemporalType.DATE)
	@Column(name="dob")
	Date dob;
	@Basic(optional=false)
	@Column(name="gender")
	String gender;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@JoinTable (name="vehicles",joinColumns=@JoinColumn(name="userid"))
	
	Set<Vehicle> vehicles=new HashSet<Vehicle>();

	/*public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}*/

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}*/

	
	public Address getLocation() {
		return location;
	}

	public UserDetail getUsername() {
		return username;
	}

	public void setUsername(UserDetail username) {
		this.username = username;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPid() {
		
		return pid;
	}

	public void setPid(String pid) {
		String temp=username.firstName.substring(0, 1)+username.lastName.substring(0,2)+ssn.substring(ssn.lastIndexOf("-"));
		this.pid = temp;
	}

	public Set<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	




}
