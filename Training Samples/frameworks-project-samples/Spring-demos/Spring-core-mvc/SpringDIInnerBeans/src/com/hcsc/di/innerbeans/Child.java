package com.hcsc.di.innerbeans;

public class Child {
	private String name;
	private int classID;
	private int age;
	private String schoolName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassID() {
		return classID;
	}

	public void setClassID(int classID) {
		this.classID = classID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String toString() {
		return "Child Name : " + name + "\nClass : " + classID + "\nAge : "
				+ age + "\nSchool Name : " + schoolName;
	}
}
