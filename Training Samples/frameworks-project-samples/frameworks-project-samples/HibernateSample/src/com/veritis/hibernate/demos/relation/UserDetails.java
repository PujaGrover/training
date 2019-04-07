package com.veritis.hibernate.demos.relation;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="userdetail")
public class UserDetails {
	@Id
	int userid;
	String userName;
	
	@OneToOne(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	@JoinColumn(name="vehicleid")
	Vehicle vechicle;
	
	public Vehicle getVechicle() {
		return vechicle;
	}

	public void setVechicle(Vehicle vechicle) {
		this.vechicle = vechicle;
	}

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
}
