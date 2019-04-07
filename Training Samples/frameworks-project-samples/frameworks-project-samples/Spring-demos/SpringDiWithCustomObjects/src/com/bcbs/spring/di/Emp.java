package com.bcbs.spring.di;

public class Emp {
	private int empno;
	private Address address;
	private String name;
	private String job;
	private double sal;
	
	
	public Emp(int empno, Address address, String name, String job, double sal) {
		super();
		this.empno = empno;
		this.address = address;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	public String toString(){
		return "Emp id "+empno+"\nName: "+name+"\nDesignation :"+job+"\n\nAddress :\n\n"+address+"\n\nSalary: $"+sal;
	}
}
