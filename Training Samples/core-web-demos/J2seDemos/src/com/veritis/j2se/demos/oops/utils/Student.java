package com.veritis.j2se.demos.oops.utils;

public class Student {
	private final int studentNo;
	private final String name;
	private final String classID;
	
	public Student(int studentNo, String name, String classID) {
		this.studentNo = studentNo;
		this.name = name;
		this.classID = classID;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public String getName() {
		return name;
	}

	public String getClassID() {
		return classID;
	}
	
	
	
}
