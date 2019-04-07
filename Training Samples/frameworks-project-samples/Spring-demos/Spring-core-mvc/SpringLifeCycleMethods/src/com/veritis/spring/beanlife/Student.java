package com.veritis.spring.beanlife;

public class Student {
	int rollno;
	String name;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		System.out.println("Entered into setRollno() ");
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Entered into setName() ");
		this.name = name;
	}

	public void callmeFirst() {
		System.out.println("Entered into callmeFirst() ");
	}

	public void killmeFirst() {
		System.out.println("Entered into killmeFirst() ");
	}

}
