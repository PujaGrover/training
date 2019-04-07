package com.hcsc.spring.di.collections.map;

public class Emp {
	private int empno;
	private String ename;
	private String desig;
	private double sal;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String toString() {
		return "Employee Number : " + empno + "\nEmploye Name : " + ename
				+ "\nDesignation : " + desig + "\nSalary : $" + sal;
	}

}
