package com.veritis.hibernate.demos.relation.onetomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Table(name="userdetail")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)

public class UserDetails {
	@Id
	int userid;
	String userName;
	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	@JoinTable(name="uservehicles",joinColumns=@JoinColumn(name="userid"),inverseJoinColumns=@JoinColumn(name="vehicleid"))
	Collection<Vehicle> listOfVechicles=new ArrayList<Vehicle>();
	

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Collection<Vehicle> getListOfVechicles() {
		return listOfVechicles;
	}

	public void setListOfVechicles(Collection<Vehicle> listOfVechicles) {
		this.listOfVechicles = listOfVechicles;
	}
}
