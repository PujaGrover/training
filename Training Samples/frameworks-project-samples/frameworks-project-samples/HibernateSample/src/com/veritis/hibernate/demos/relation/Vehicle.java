package com.veritis.hibernate.demos.relation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vechicledetails")
public class Vehicle {
	@Id
	int vehicleid;
	String vechicleName;
	
	@OneToOne(mappedBy="vechicle")
	UserDetails userDetails;
	
	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getVechicleName() {
		return vechicleName;
	}
	public void setVechicleName(String vechicleName) {
		this.vechicleName = vechicleName;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	
	
}
