/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.veritis.j2se.demos.newfeatures;

/**
 * 
 * @author RajithaVenkat
 */
public class Emp extends Person{
	int empno;
	
	String desig;

	public Emp() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Emp(int empno, String firstname,String lastName, String desig) {
		super(firstname,lastName);
		this.empno = empno;
		//this.ename = ename;
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

	/*public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
*/
	public String toString() {
		return empno + " " + firstName+" "+lastName + desig;
	}
	

}
