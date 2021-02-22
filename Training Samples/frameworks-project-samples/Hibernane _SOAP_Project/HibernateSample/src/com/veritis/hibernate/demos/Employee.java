package com.veritis.hibernate.demos;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name="emp")
public class Employee {
	@Id
	
	int empno;
	@Basic(optional=false)
	@Column(length=20,name="name")
	String empName;
	@Basic(optional=false)
	@Column(length=20,name="job")
	String desig;
	@Basic(optional=false)
	Double sal;
	@Column(name="birth_date")
	@Temporal(TemporalType.DATE)
	Date dob;
	@Transient
	private String ssn;
	
	
	@ElementCollection(fetch=FetchType.LAZY)
	@JoinTable(name="vehicles",joinColumns=@JoinColumn(name="empno"))
	private Set<Vehicle> vehicles=new HashSet<Vehicle>();
	
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Set<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

//	@Override
//	public String toString() {
//		return "Employee  Details are \nempno=" + empno + ",\n empName=" + empName + ",\n desig="
//				+ desig + ", \n sal=" + sal + ",\n dob=" + dob;
//				
//	}
	
	

}
