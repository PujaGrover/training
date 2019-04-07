package com.veritis.hibernate.demos.relation.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="vechicledetails")
public class Vehicle {
	@Id
	int vehicleid;
	String vechicleName;
	@ManyToOne
	//While Getting Vechicle Object if user is not assigned then it will throw exception to avoid that we have the following
	//@NotFound(action=NotFoundAction.IGNORE)
	@JoinColumn(name="userid")
	UserDetails userdetail;
	
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
	public UserDetails getUserdetail() {
		return userdetail;
	}
	public void setUserdetail(UserDetails userdetail) {
		this.userdetail = userdetail;
	}
	
}
