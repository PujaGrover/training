/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.oops.utils;

/**
 * 
 * @author RajithaVenkat
 */
public class Emp implements Comparable{
	int empno;
	String ename;
	String desig;

	public Emp() {
	}

	public Emp(int empno, String ename, String desig) {
		this.empno = empno;
		this.ename = ename;
		this.desig = desig;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desig == null) ? 0 : desig.hashCode());
		result = prime * result + empno;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		return result;
	}
//
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp e2 = (Emp) obj;
		if (desig == null) {
			if (e2.desig != null)
				return false;
		} else if (!desig.equals(e2.desig))
			return false;
		if (empno != e2.empno)
			return false;
		if (ename == null) {
			if (e2.ename != null)
				return false;
		} else if (!ename.equals(e2.ename))
			return false;
		return true;
	}

//	@Override
//	public String toString() {
//		return "Emp [empno=" + empno + ", ename=" + ename + ", desig=" + desig
//				+ "]";
//	}

	@Override
	public int compareTo(Object o) {
		Emp e=(Emp)o;
		return this.empno-e.getEmpno();
		//return e.getEname().compareTo(this.ename);
	}
	
	
}
