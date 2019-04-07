package com.veritis.hibernate.demos;

import javax.persistence.Embeddable;

@Embeddable
public class Vehicle {
	int vehicleid;
	String vehiclename;

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getVehiclename() {
		return vehiclename;
	}

	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleid=" + vehicleid + ", vehiclename="
				+ vehiclename + "]";
	}
	
	

}
