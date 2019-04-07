/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.spring.jdbc.demo.domain;

/**
 *
 * @author vsaranu
 */
public class Emp {
	int empno;
	String ename;
	String job;
	double sal;

	public Emp() {
	}

	public Emp(int empno, String ename, String job, double sal) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}

	public Emp(int empno, String ename, String job) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	}

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

	public String toString() {
		return "Empno " + empno + "\n" + "Ename " + ename + "\n" + "Job   " + job + "\n" + "Salary " + sal;
	}
}
